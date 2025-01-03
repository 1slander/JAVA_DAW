package javabean;

import java.util.Objects;

public class Planeta {

		
	private String name;
	private int cantSatelites;
	private double masa;
	private double volumen;
	private int diametro;
	private int distanciaMediaAlSol;
	private  TipoDePlaneta tipo=TipoDePlaneta.GASEOSO;
	private boolean observable;
	
	public enum TipoDePlaneta {
		GASEOSO,
		TERRESTRE,
		ENANO
	}

	public Planeta(String name, int cantSatelites, double masa, double volumen, int diametro, int distanciaMediaAlSol,
			TipoDePlaneta tipo, boolean observable) {
		super();
		this.name = name;
		this.cantSatelites = cantSatelites;
		this.masa = masa;
		this.volumen = volumen;
		this.diametro = diametro;
		this.distanciaMediaAlSol = distanciaMediaAlSol;
		this.tipo = tipo;
		this.observable = observable;
	}

	public Planeta() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCantSatelites() {
		return cantSatelites;
	}

	public void setCantSatelites(int cantSatelites) {
		this.cantSatelites = cantSatelites;
	}

	public double getMasa() {
		return masa;
	}

	public void setMasa(double masa) {
		this.masa = masa;
	}

	public double getVolumen() {
		return volumen;
	}

	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}

	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public int getDistanciaMediaAlSol() {
		return distanciaMediaAlSol;
	}

	public void setDistanciaMediaAlSol(int distanciaMediaAlSol) {
		this.distanciaMediaAlSol = distanciaMediaAlSol;
	}

	public TipoDePlaneta getTipo() {
		return tipo;
	}

	public void setTipo(TipoDePlaneta tipo) {
		this.tipo = tipo;
	}

	public boolean isObservable() {
		return observable;
	}

	public void setObservable(boolean observable) {
		this.observable = observable;
	}

	@Override
	public String toString() {
		return "Planeta [name=" + name + ", cantSatelites=" + cantSatelites + ", masa=" + masa + ", volumen=" + volumen
				+ ", diametro=" + diametro + ", distanciaMediaAlSol=" + distanciaMediaAlSol + ", tipo=" + tipo
				+ ", observable=" + observable + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Planeta))
			return false;
		Planeta other = (Planeta) obj;
		return Objects.equals(name, other.name);
	}
	
	/*
	 * METODOS PROPIOS
	 */
	
	
	public double densidad() {
		return masa/volumen;
	}
	
	public String planetaExterno() {
		double distanciaUA = distanciaMediaAlSol / 149_597_870;
		if(distanciaUA > 3.4) return "Es un planeta exterior";
		return "Es un planeta interior";
		
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre: " + name);
		System.out.println("Satelites: " + cantSatelites);
		System.out.println("Masa: " + masa);
		System.out.println("Volumen: " + volumen);
		System.out.println("Diametro: " + diametro);
		System.out.println("Distancia del Sol: " + distanciaMediaAlSol);
		System.out.println("Tipo de Planeta: " + tipo);
		System.out.println("Es observable?: " + observable);
		
	}
	
	
	
}
