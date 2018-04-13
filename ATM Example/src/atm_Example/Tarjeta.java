package atm_Example;

import java.util.LinkedList;

public class Tarjeta {
	LinkedList<Cuenta> cuentas;
	String numeroTarjeta;
	Banco banco;
	
	public LinkedList<Cuenta> getCuentas() {
		return cuentas;
	}
	public void setCuentas(LinkedList<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}
	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	public Banco getBanco() {
		return banco;
	}
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	
	public void listaDeCuentas() {
		Cuenta[] cuen = (Cuenta[]) cuentas.toArray();
		for (int x = 0; x < cuen.length; x++) {
			System.out.println("     * "+cuen[x].getNumeroCuenta());
		}
	}
}
