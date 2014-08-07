package tiposGuerrero;

import guerreros.Guerrero;

public class Platino implements TipoGuerrero {

	private int _infinito = 1500;
	
	public void PedirAutorizacion(Guerrero guerrero) {
		// Already Authorized
	}

	public int PoderDeAtaque(Guerrero guerrero) {
		return (_infinito * guerrero.Ego);
	}

	public void atacando(Guerrero atacante) {
		atacante.modificarSalud((a, b) -> a - b, 10);
		atacante.finalizarSeptimoSentido();
	}

}
