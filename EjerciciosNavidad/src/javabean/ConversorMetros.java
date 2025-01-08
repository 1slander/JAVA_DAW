package javabean;

import java.util.Objects;
import java.util.Scanner;

public class ConversorMetros {
	
	public static final double CM = 100.0;
	public static final double MM=1000.0;
	public static final double INCH=39.37;
	public static final double FOOT=3.281;
	public static final double YARD=1.094;
	
	private double metros;
	
	

	public ConversorMetros() {
		super();
	}

	public ConversorMetros(double metros) {
		super();
		this.metros = metros;
	}

	public double getMetros() {
		return metros;
	}

	public void setMetros(double metros) {
		this.metros = metros;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(metros);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof ConversorMetros))
			return false;
		ConversorMetros other = (ConversorMetros) obj;
		return Double.doubleToLongBits(metros) == Double.doubleToLongBits(other.metros);
	}

	@Override
	public String toString() {
		return "ConversorMetros [metros=" + metros + "]";
	}
	
	
	/*
	 * METODOS PROPIOS
	 */
	
	public double mToCm() {
		System.out.println("convirtiendo de metros a cm");
		return metros * CM;
	}
	
	public double mToMm() {
		System.out.println("convirtiendo de metros a mm");
		return metros * MM;
	}
	
	public double mToInch() {
		System.out.println("convirtiendo de metros a pulgadas");
		return metros * INCH;
	}
	
	public double mToFoot() {
		System.out.println("convirtiendo de metros a pies");
		return metros * FOOT;
	}
	
	public double mToYards() {
		System.out.println("convirtiendo de metros a yardas");
		return metros * YARD;
	}
	
	
	public String convertir() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduzca --> cm para centimetros, mm para milimetros, inch para pulgadas, foot para pies o yard para yardas: ");
		String unidad = scanner.next().toUpperCase();
		double result;
		
		switch (unidad) {
		case "CM":
			
			result = mToCm();
			return "El resultado es: " + result + " cm.";
					
			
		case "MM":
			
			result = mToMm();
			return "El resultado es: " + result + " mm.";
			
			
		case "INCH":
			
			result = mToInch();
			return "El resultado es: " + result + " pulgadas.";
			
			
		case "FOOT":
			
			result = mToFoot();
			return "El resultado es: " + result + " pies.";
			
			
		case "YARD" :
			
			result = mToYards();
			return "El resultado es: " + result + " yardas.";
			
			
		default:
			return "Unidad no permitida";
		
		
		}
		
	}
	
	
	

}
