package atm_Example;

public class Cuenta {
	double saldo;
	String numeroCuenta;
	
	public void sumarSaldo(double dinero) {
		this.saldo = saldo + dinero;
	}
	
	public void restarSaldo(double dinero) {
		this.saldo = saldo - dinero;
	}
}
