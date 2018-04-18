package atm_Example;

public class ConsultaSaldo extends Transaccion {
	double saldo;


	public ConsultaSaldo(String idCaj, String numCuenta, double saldo){
		super(idCaj, 2, numCuenta);
		this.saldo = saldo;
	}

}