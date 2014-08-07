package estadoSalud;

import exceptions.*;

public class Muerto implements EstadoSalud {

	public double usoCosmos() {
		return 0;
	}

	public void atacando() {
		throw new DeadCannotAttackException("El jugador esta muerto y no puede atacar");
	}

	public void PedirAutorizacion() {
		throw new NotHurtException("No esta Herido");
	}

}
