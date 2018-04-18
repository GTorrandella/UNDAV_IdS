package atm_Example;

public class ConsultaSaldo extends Transaccion {
	double saldo;


	public ConsultaSaldo(String idCaj, String idOP, String numCuenta, double saldo){
		super(idCaj, 2, idOP,numCuenta);
		this.saldo = saldo;
	}

}