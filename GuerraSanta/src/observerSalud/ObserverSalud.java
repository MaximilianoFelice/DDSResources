package observerSalud;

import guerreros.*;

public interface ObserverSalud {
	
	public Guerrero observedWarrior = null;
	
	public void ModificacionSalud(int promedio);

}
