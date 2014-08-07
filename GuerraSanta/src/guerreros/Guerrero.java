package guerreros;

import java.util.List;
import java.util.function.IntBinaryOperator;

import observerSalud.*;
import exceptions.*;
import tiposGuerrero.*;
import estadoSalud.*;

public class Guerrero implements UnidadGuerrera {

	private TipoGuerrero tipo;
	EstadoSalud EstadoSalud;
	int nivelCosmos;
	public int salud;
	List<ObserverSalud> ObserversSalud;
	public int Ego;
	public Equipo team;
	public int promedioSalud;
	
	public void atacar(UnidadGuerrera unidad) {
		try {
			tipo.atacando(this);
			EstadoSalud.atacando();
			unidad.recibirAtaque(poderAtaque());
		} catch (DeadCannotAttackException e){
			
		}
	}

	public void recibirAtaque(int poderAtaque) {
		modificarSalud((a,b) -> a - b, poderAtaque);
	}
	
	public int poderAtaque(){
		return tipo.PoderDeAtaque(this);
	}
	
	public int obtenerCosmos() {
		return (int) (nivelCosmos * EstadoSalud.usoCosmos());
	}
	
	public void activarSeptimoSentido(){
		tipo = new Platino();
	}

	public void finalizarSeptimoSentido(){
		tipo = new Bronce();
	}

	
	
	/* Acciones de/con Lider */
	
	public int cosmosDeLider(){
		return team.CosmosDeLider();
	}
	
	// Existiria la posibilidad de hacer un CPS aca, revisar...
	public void pedirAutorizacion() {
		try{
			EstadoSalud.PedirAutorizacion();
			tipo.PedirAutorizacion(this);			
		} catch (NotHurtException e){
			
		}
	}
	
	public void autorizar(Guerrero unidad){
		unidad.activarSeptimoSentido();
	}
	
	public void revisarAuth(List<Guerrero> autorizacionesPendientes) {
		autorizacionesPendientes.forEach((auth) -> autorizar(auth)); // TODO Verificar que este herido
	}
	
	/* ------------------------------------ */
	
	
	
	/* Cambios de Estado de Salud */
	
	public void modificarSalud(IntBinaryOperator oper, int secondParam){
		salud = oper.applyAsInt(salud, secondParam);
		ObserversSalud.forEach((obs) -> obs.ModificacionSalud(promedioSalud));
	}
	
	public void Sanar(){
		EstadoSalud = new Sano();
	}
	
	public void Morir(){
		EstadoSalud = new Muerto();
	}
	
	public void Herir(){
		EstadoSalud = new Herido();
	}
	
	/* ------------------------------------ */
}
