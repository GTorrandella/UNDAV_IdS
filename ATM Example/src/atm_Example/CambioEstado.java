package atm_Example;

public abstract class CambioEstado extends Operacion {
	double dineroDisponible;
	
	public CambioEstado(String idCaj, int numOP, String idOP, double dinDisp) {
		super(idCaj, numOP, idOP);
		this.dineroDisponible = dinDisp;
	}
}
