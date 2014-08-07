package observerSalud;

public class ObserverSano implements ObserverSalud {

	public void ModificacionSalud(int promedio) {
		if (promedio > observedWarrior.salud) observedWarrior.Sanar();
	}

}
