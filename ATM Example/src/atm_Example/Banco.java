package atm_Example;

public class Banco {
	String idBanco;
	
	public boolean tarjetaEsValida(Tarjeta tarjeta, String pin) {
		return true;
	}
	
	public boolean validarOperacion(Tarjeta tarjeta, Cuenta cuenta, int tipoOperacion) {
		return true;
	}
	
	public boolean confirmarDeposito(Tarjeta tarjeta, Cuenta cuenta) {
		return true;
	}
}
