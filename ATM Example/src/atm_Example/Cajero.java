package atm_Example;

import java.io.InputStream;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.Scanner;

public class Cajero {
	Registro registro;
	LinkedList<Banco> bancos;
	Tarjeta tarjetaIngresada;
	String idCajero;
	double dineroDisponible;
	String pinIngresado;
	
	public void identificacion() {
	    //El usuario ingresa tarjeta y el cajero la lee
		Tarjeta tarjeta = leerTarjeta();
		setTarjetaIngresada(tarjeta);

		int contador = 0;
		boolean tarjetaEsValida = false;
		while(contador < 3 & !tarjetaEsValida) {
            //Se le pide el PIN al usuario
            //El usuario ingresa el pin
            String pin = "1234";
            setPinIngresado(pin);
            //El cajero se fija de que banco es la tarjeta
            Banco banco = tarjeta.getBanco();
            //El cajero busca en su base de datos interna la forma de comunicarse con dicho banco
            //El cajero le pregunta al banco si la tarjeta y el pin ingresados son validos
            if (banco.tarjetaEsValida(tarjeta, pin)) {
                tarjetaEsValida = true;
            }
            else {
                contador++;
            }
        }

        if(contador == 3){
		    retenerTarjeta();
        }
        else if (tarjetaEsValida){
		    //Mostrar menues para que el usuario pueda realizar transacciones
            menu();
        }

    }

    private void menu(){
    	System.out.println("¿Qué quiere hacer?");
    	System.out.println("   1: Extraer dinero");
    	Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		switch (input) {
			case 1:
				menuExtraccion();
		}
		sc.close();
    }
	
	private Tarjeta leerTarjeta(){
		Tarjeta tarjeta = new Tarjeta();
		return tarjeta;
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
		String input = sc.next();
		if (input != "X" || input != "x") {
			Cuenta cuenta = tarjetaIngresada.seleccionarCuenta(Integer.parseInt(input));
			input = sc.next();
			if (input != "X" || input != "x") {
				double dinero = Double.parseDouble(input);
				if(bancos.get(1).validarOperacion(tarjetaIngresada, cuenta, 1) && cuenta.getSaldo() - dinero >= 0) {
					Extraccion extrac = new Extraccion(idCajero, cuenta.numeroCuenta, dinero, cuenta.getSaldo(), cuenta.getSaldo() - dinero);
					imprimirTicket(extrac);
					cuenta.restarSaldo(dinero);
					expenderDinero(dinero);
					registro.aniadirOperacion(extrac);
				}
			}
		}
		
		sc.close();
	}

	private void menuConsultaSaldo() {
		System.out.println("Seleccione su cuenta:");
		tarjetaIngresada.listaDeCuentas();
		System.out.print("    :");
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		if (input != "X" || input != "x") {
			Cuenta cuenta = tarjetaIngresada.seleccionarCuenta(Integer.parseInt(input));
			if(bancos.get(1).validarOperacion(tarjetaIngresada, cuenta, 2)){
				ConsultaSaldo consulta = new ConsultaSaldo(idCajero, cuenta.numeroCuenta, cuenta.getSaldo());
				imprimirTicket(consulta);
				registro.aniadirOperacion(consulta);
				}
			}
		
		sc.close();	
		}
		

	
	private void cancelarOperacion() {
		
	}
	
	private void imprimirTicket(Operacion operacion) {
		
	}
	
	public void iniciarSoftware() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese dinero disponible:");
		this.dineroDisponible = sc.nextDouble();
		sc.close();
		
		registro.aniadirOperacion(new Encendido(idCajero, "ini"+Calendar.getInstance().toString(), dineroDisponible));
	
	}
	
	public void apagarSoftware() {
		
	}
	
	private void expenderDinero(double dinero) {
		
	}
	
	public void terminarOperaciones() {
		
	}

    public Registro getRegistro() {
        return registro;
    }

    public void setRegistro(Registro registro) {
        this.registro = registro;
    }

    public LinkedList<Banco> getBancos() {
        return bancos;
    }

    public void setBancos(LinkedList<Banco> bancos) {
        this.bancos = bancos;
    }

    public Tarjeta getTarjetaIngresada() {
        return tarjetaIngresada;
    }

    public void setTarjetaIngresada(Tarjeta tarjetaIngresada) {
        this.tarjetaIngresada = tarjetaIngresada;
    }

    public String getIdCajero() {
        return idCajero;
    }

    public void setIdCajero(String idCajero) {
        this.idCajero = idCajero;
    }

    public double getDineroDisponible() {
        return dineroDisponible;
    }

    public void setDineroDisponible(double dineroDisponible) {
        this.dineroDisponible = dineroDisponible;
    }

    public String getPinIngresado() {
        return pinIngresado;
    }

    public void setPinIngresado(String pinIngresado) {
        this.pinIngresado = pinIngresado;
    }
}
