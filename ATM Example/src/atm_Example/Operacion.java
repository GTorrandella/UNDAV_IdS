package atm_Example;

import java.util.Calendar;

public abstract class Operacion {
	Calendar fecha;
	String idCajero;
	int tipoOperacion;
	String idOperacion;

	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public String getIdCajero() {
		return idCajero;
	}

	public void setIdCajero(String idCajero) {
		this.idCajero = idCajero;
	}

	public int getTipoOperacion() {
		return tipoOperacion;
	}

	public void setTipoOperacion(int tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
	}

	public String getIdOperacion() {
		return idOperacion;
	}

	public void setIdOperacion(String idOperacion) {
		this.idOperacion = idOperacion;
	}
}
