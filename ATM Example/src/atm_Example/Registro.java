package atm_Example;

import java.util.LinkedList;

public class Registro {
	LinkedList<Operacion> operaciones;
	public void añadirOperacion(Operacion op) {
		operaciones.add(op);
	}
}
