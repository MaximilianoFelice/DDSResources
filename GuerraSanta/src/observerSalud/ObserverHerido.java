package observerSalud;

public class ObserverHerido implements ObserverSalud {

	@Override
	public void ModificacionSalud(int promedio) {
		if (promedio <= observedWarrior.salud) observedWarrior.Herir();
	}

}
