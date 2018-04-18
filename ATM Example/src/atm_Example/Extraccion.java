package atm_Example;

public class Extraccion extends Transaccion {
	double cantidadDineroExtraido;
	double balanceOriginal;
	double balanceFinal;

	public double getCantidadDineroExtraido() {
		return cantidadDineroExtraido;
	}

	public void setCantidadDineroExtraido(double cantidadDineroExtraido) {
		this.cantidadDineroExtraido = cantidadDineroExtraido;
	}

	public double getBalanceOriginal() {
		return balanceOriginal;
	}

	public void setBalanceOriginal(double balanceOriginal) {
		this.balanceOriginal = balanceOriginal;
	}

	public double getBalanceFinal() {
		return balanceFinal;
	}

	public void setBalanceFinal(double balanceFinal) {
		this.balanceFinal = balanceFinal;
	}
	
	public Extraccion(String idCaj, String tipoOP, String numCuenta, double cantDiEx, double balOr, double balFn) {
		super(idCaj, 1, tipoOP,numCuenta);
		this.cantidadDineroExtraido = cantDiEx;
		this.balanceOriginal = balOr;
		this.balanceFinal = balFn;
	}
}
