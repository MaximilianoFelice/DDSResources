package estadoSalud;

import exceptions.NotHurtException;


public class Sano implements EstadoSalud {

	public double usoCosmos() {
		return 1;
	}

	public void atacando() {
		// No Action
	}

	public void PedirAutorizacion() {
		throw new NotHurtException("No esta Herido");
	}
}
