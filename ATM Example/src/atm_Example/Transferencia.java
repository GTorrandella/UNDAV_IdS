package atm_Example;

public class Transferencia extends Transaccion {
	String numeroCuentaDestino;
	double cantidadDineroTransferido;
	double balanceOriginalCuantaDestino;
	double finalOriginalCuantaDestino;
	double balanceOriginalCuantaOrigen;
	double finalOriginalCuantaOrigen;

	public String getNumeroCuentaDestino() {
		return numeroCuentaDestino;
	}

	public void setNumeroCuentaDestino(String numeroCuentaDestino) {
		this.numeroCuentaDestino = numeroCuentaDestino;
	}

	public double getCantidadDineroTransferido() {
		return cantidadDineroTransferido;
	}

	public void setCantidadDineroTransferido(double cantidadDineroTransferido) {
		this.cantidadDineroTransferido = cantidadDineroTransferido;
	}

	public double getBalanceOriginalCuantaDestino() {
		return balanceOriginalCuantaDestino;
	}

	public void setBalanceOriginalCuantaDestino(double balanceOriginalCuantaDestino) {
		this.balanceOriginalCuantaDestino = balanceOriginalCuantaDestino;
	}

	public double getFinalOriginalCuantaDestino() {
		return finalOriginalCuantaDestino;
	}

	public void setFinalOriginalCuantaDestino(double finalOriginalCuantaDestino) {
		this.finalOriginalCuantaDestino = finalOriginalCuantaDestino;
	}

	public double getBalanceOriginalCuantaOrigen() {
		return balanceOriginalCuantaOrigen;
	}

	public void setBalanceOriginalCuantaOrigen(double balanceOriginalCuantaOrigen) {
		this.balanceOriginalCuantaOrigen = balanceOriginalCuantaOrigen;
	}

	public double getFinalOriginalCuantaOrigen() {
		return finalOriginalCuantaOrigen;
	}

	public void setFinalOriginalCuantaOrigen(double finalOriginalCuantaOrigen) {
		this.finalOriginalCuantaOrigen = finalOriginalCuantaOrigen;
	}
	
	public Transferencia(String idCaj, int tipoOP, String idOP,String numCuenta) {
		super(idCaj, tipoOP, idOP, numCuenta);
	}
}
