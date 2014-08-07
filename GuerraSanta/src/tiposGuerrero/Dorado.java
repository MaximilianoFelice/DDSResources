package tiposGuerrero;

import guerreros.Guerrero;

public class Dorado implements TipoGuerrero {

	public void PedirAutorizacion(Guerrero guerrero) {
		// Do Nothing
	}

	public int PoderDeAtaque(Guerrero guerrero) {
		return (guerrero.obtenerCosmos() * guerrero.Ego);
	}

	public void atacando(Guerrero atacante) {
		atacante.modificarSalud((a,b) -> a + b, 20);
	}

}
