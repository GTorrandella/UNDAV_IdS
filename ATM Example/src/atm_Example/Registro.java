package atm_Example;

import java.util.LinkedList;

public class Registro {
	LinkedList<Operacion> operaciones;
	public void aniadirOperacion(Operacion op) {
		operaciones.add(op);
	}
}
