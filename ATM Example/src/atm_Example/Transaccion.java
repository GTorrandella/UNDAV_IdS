package atm_Example;

public abstract class Transaccion extends Operacion {
	String numeroCuenta;

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	public Transaccion(String idCaj, int tipoOP, String idOP, String numCuenta) {
		super(idCaj, tipoOP, idOP);
		this.numeroCuenta = numCuenta;
	}
}
