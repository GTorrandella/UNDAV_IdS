package atm_Example;

public class Banco {

	String idBanco;
	
	public Banco(String id) {
		this.idBanco = id;
	}
	
	public boolean tarjetaEsValida(Tarjeta tarjeta, String pin) {
		return true;
	}
	
	public boolean validarOperacion(Tarjeta tarjeta, Cuenta cuenta, int tipoOperacion) {
		return true;
	}
	
	public boolean confirmarDeposito(Tarjeta tarjeta, Cuenta cuenta) {
		return true;
	}

	public String getIdBanco() {
		return idBanco;
	}

	public void setIdBanco(String idBanco) {
		this.idBanco = idBanco;
	}
}
