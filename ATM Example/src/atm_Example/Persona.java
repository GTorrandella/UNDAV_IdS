package atm_Example;

import java.util.LinkedList;

public class Persona {
	LinkedList<Tarjeta> tarjetas;

	public LinkedList<Tarjeta> getTarjetas() {
		return tarjetas;
	}

	public void setTarjetas(LinkedList<Tarjeta> tarjetas) {
		this.tarjetas = tarjetas;
	}
}
