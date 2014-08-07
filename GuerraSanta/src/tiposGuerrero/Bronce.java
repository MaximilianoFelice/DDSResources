package tiposGuerrero;

import guerreros.Guerrero;

public class Bronce implements TipoGuerrero {

	public void PedirAutorizacion(Guerrero guerrero) {
		guerrero.team.QuienEsLider().autorizar(guerrero);
	}

	public int PoderDeAtaque(Guerrero guerrero) {
		return guerrero.obtenerCosmos() + guerrero.cosmosDeLider();
	}

	public void atacando(Guerrero atacante) {
		// Do Nothing
	}

}
