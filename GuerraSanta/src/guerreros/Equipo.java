package guerreros;

import java.util.List;
import java.util.Random;

public class Equipo implements UnidadGuerrera {

	private Guerrero _lider;
	
	private List<Guerrero> _integrantes;
	
	private Random randomizer = new Random();
	
	private List<Guerrero> autorizacionesPendientes;
	
	public static Equipo crearEquipo(Guerrero lider){
		Equipo Equipo = new Equipo();
		Equipo.setLider(lider);
		return Equipo;
	}
	
	public void setLider(Guerrero lider){
		_lider = lider;
	}
	
	public void atacar(UnidadGuerrera unidad) {
		_integrantes.forEach((guerrero) -> guerrero.atacar(unidad));
	}

	public void recibirAtaque(int poderAtaque) {
		_integrantes.get(randomizer.nextInt(_integrantes.size())).recibirAtaque(poderAtaque);
	}

	public int CosmosDeLider() {
		return _lider.obtenerCosmos();
	}
	
	public Guerrero QuienEsLider(){
		return _lider;
	}
	
	public void requestAuth(Guerrero guerrero){
		autorizacionesPendientes.add(guerrero);
		_lider.revisarAuth(autorizacionesPendientes);	//TODO No estoy seguro sobre la mutabilidad de la lista al pasarla por parametro
	}
	
	public void limpiarAutorizaciones(){
		autorizacionesPendientes.clear();
	}

}
