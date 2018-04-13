package atm_Example;

public class Cuenta {
	double saldo;
	String numeroCuenta;
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public void sumarSaldo(double dinero) {
		this.saldo = saldo + dinero;
	}
	
	public void restarSaldo(double dinero) {
		this.saldo = saldo - dinero;
	}
}
