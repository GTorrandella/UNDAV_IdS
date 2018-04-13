package atm_Example;

import java.io.InputStream;
import java.util.LinkedList;
import java.util.Scanner;

public class Cajero {
	Registro registro;
	LinkedList<Banco> bancos;
	Tarjeta tarjetaIngresada;
	String idCajero;
	double dineroDisponible;
	String pinIngresado;
	
	private void menu() {
		
	}
	
	public void leerTarjeta(Tarjeta tarjeta){
		
	}
	
	private void expulsarTarjeta() {
		
	}
	
	private void retenerTarjeta(){
		
	}
	
	private void menuDeposito() {
		
	}
	
	private void menuExtraccion() {
		System.out.println("Seleccione su cuenta:");
		tarjetaIngresada.listaDeCuentas();
		System.out.print("    :");
		
		Scanner sc = new Scanner(System.in);
		Cuenta cuenta = tarjetaIngresada.seleccionarCuenta(sc.nextInt());
		double dinero = sc.nextDouble();
		sc.close();
		
		if(bancos.get(1).validarOperacion(tarjetaIngresada, cuenta, 1)) {
			
		}
		
	}

	private void menuConsultaSaldo() {
		
	}
	
	private void cancelarOperación() {
		
	}
	
	private void imprimirTicket(Operacion operacion) {
		
	}
	
	public void iniciarSoftware() {
		
	}
	
	public void apagarSoftware() {
		
	}
	
	private void expenderDinero(double dinero) {
		
	}
	
	public void terminarOperaciones() {
		
	}
}
