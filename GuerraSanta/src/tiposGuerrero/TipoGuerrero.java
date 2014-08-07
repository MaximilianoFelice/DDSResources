package tiposGuerrero;

import guerreros.*;

public interface TipoGuerrero {

	public void PedirAutorizacion(Guerrero guerrero);
	
	public int PoderDeAtaque(Guerrero guerrero);

	public void atacando(Guerrero atacante);
}
