package atm_Example;

import java.util.LinkedList;

public class Cajero {
	Registro registro;
	LinkedList<Banco> bancos;
	Tarjeta tarjetaIngresada;
	String idCajero;
	double dineroDisponible;
	String pinIngresado;
	
	private void menu() {
	    //El usuario ingresa tarjeta y el cajero la lee
		Tarjeta tarjeta = leerTarjeta();
		setTarjetaIngresada(tarjeta);
		//Se le pide el PIN al usuario
        //El usuario ingresa el pin
        String pin= "1234";
        setPinIngresado(pin);
        //El cajero se fija de que banco es la tarjeta
        Banco banco= tarjeta.getBanco();
        //El cajero le pregunta al banco si la tarjeta y el pin ingresados son validos
        if (banco.tarjetaEsValida(tarjeta, pin)){
            //Mostrar opciones por pantalla para que el usuario acceda a los servicios del cajero
        }
        else{
            //Error
        }


    }
	
	public Tarjeta leerTarjeta(){
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
		
	}
	
	private void menuConsultaSaldo() {
		
	}
	
	private void cancelarOperacion() {
		
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
