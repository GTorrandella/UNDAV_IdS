package atm_Example;

import java.util.LinkedList;

public class Registro {
	LinkedList<Operacion> operaciones;

	public void aniadirOperacion(Operacion op) {
	    operaciones.add(op);
	}

    public LinkedList<Operacion> getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(LinkedList<Operacion> operaciones) {
        this.operaciones = operaciones;
    }
}
