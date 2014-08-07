package observerSalud;

public class ObserverMuerte implements ObserverSalud {

	@Override
	public void ModificacionSalud(int promedio) {
		if (0 >= observedWarrior.salud) observedWarrior.Morir();
	}

}
