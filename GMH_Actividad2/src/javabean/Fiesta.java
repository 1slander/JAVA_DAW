package javabean;

import java.time.LocalDate;
import java.time.LocalTime;

public class Fiesta {
	
	public static final int PRECIO_INVITADO = 5;
	public static int PRECIO_BEBIDA=2;
	public static int PRECIO_BOCADILLO = 3;
	
	private String tipoFiesta;
	private String direccion;
	private int bocadillos;
	private int bebidas;
	private int invitados;
	private LocalDate fecha;
	private LocalTime hora;
	//private final int PRECIO_INVITADO = 5;
	//private final int PRECIO_BEBIDA=2;
	//private final int PRECIO_BOCADILLO = 3;
	
	//Constructors
	
	public Fiesta(String tipoFiesta, String direccion, int bocadillos, int bebidas, int invitados, LocalDate fecha,
			LocalTime hora) {
		super();
		this.tipoFiesta = tipoFiesta;
		this.direccion = direccion;
		this.bocadillos = bocadillos;
		this.bebidas = bebidas;
		this.invitados = invitados;
		this.fecha = fecha;
		this.hora = hora;
	}
	
	public Fiesta() {
		super();
	}
	
	// Getters & Setters
	
	public String getTipoFiesta() {
		return tipoFiesta;
	}
	public void setTipoFiesta(String tipoFiesta) {
		this.tipoFiesta = tipoFiesta;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public int getBocadillos() {
		return bocadillos;
	}
	
	public void setBocadillos(int bocadillos) {
		this.bocadillos = bocadillos;
	}
	
	public int getBebidas() {
		return bebidas;
	}
	public void setBebidas(int bebidas) {
		this.bebidas = bebidas;
	}
	public int getInvitados() {
		return invitados;
	}
	public void setInvitados(int invitados) {
		this.invitados = invitados;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public LocalTime getHora() {
		return hora;
	}
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	// toString()
	
	@Override
	public String toString() {
		return "Fiesta [tipoFiesta=" + tipoFiesta + ", direccion=" + direccion + ", bocadillos=" + bocadillos
				+ ", bebidas=" + bebidas + ", invitados=" + invitados + ", fecha=" + fecha + ", hora=" + hora + "]";
	}
	
	// Metodos propios
	
	// añade 1 invitado
	public void invitar() {
		this.invitados++;
	}
	
	// añade X cantidad de invitado
	public void invitar(int cantidad) {
		this.invitados+=cantidad;
	}
	
	// elimina 1 invitado
	public void cancelarInvitacion() {
		if(this.invitados > 0) {
			this.invitados--;
			} else {this.invitados = 0; }
		
	}
	
	// elimina X cantidad de invitado
	public void cancelarInvitacion(int cantidad) {
		this.invitados-=cantidad;
		if(this.invitados <= 0) this.invitados = 0;
		
		
	}
	
	// calcula el precio final y nos devuelve la informacion del precio total.
	public String precioFinal() {
		
		if (this.invitados == 0)return "Se ha cancelado la fiesta por falta de invitados";
		int totalInvitados = PRECIO_INVITADO*this.invitados;
		
		int totalBebida = PRECIO_BEBIDA * this.bebidas;
		int totalBocadillos = PRECIO_BOCADILLO * this.bocadillos;
		
		System.out.println("Precio total de invitados: " + totalInvitados +"$ " + " Precio total de bebidas: " + totalBebida +"$ " + " Precio total de Bocadillos: " + totalBocadillos +"$");
		
		int total = totalInvitados + totalBebida + totalBocadillos;
		
		return "El precio total de la fiesta es de " + total + "$";
		
	}
	
	
	
	

}
