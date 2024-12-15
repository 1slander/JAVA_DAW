package javabean;

public class Fuerza {
	
	private double masa;
	private double espacio;
	private double tiempo;
	
	public Fuerza(double masa, double espacio, double tiempo) {
		super();
		this.masa = masa;
		this.espacio = espacio;
		this.tiempo = tiempo;
	}
	
	public Fuerza() {
		super();
		
	}

	public double getMasa() {
		return masa;
	}

	public void setMasa(double masa) {
		this.masa = masa;
	}

	public double getEspacio() {
		return espacio;
	}

	public void setEspacio(double espacio) {
		this.espacio = espacio;
	}

	public double getTiempo() {
		return tiempo;
	}

	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}

	@Override
	public String toString() {
		return "Fuerza [masa=" + masa + ", espacio=" + espacio + ", tiempo=" + tiempo + "]";
	}
	
	/*
	 * METODOS PROPIOS
	 */
	
	public double aceleracion() {
		return espacio/Math.pow(tiempo, 2);
	}
	
	public double fuerzaEjercida() {
		return masa * aceleracion();
	}
	
	public double velocidad() {
		return espacio/tiempo;
	}

}
