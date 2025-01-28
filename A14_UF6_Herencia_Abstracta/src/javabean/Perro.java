package javabean;

import java.util.Objects;

public class Perro extends AbstractAnimal {
	private String raza;

	public Perro(int matricula, String nombreCientifico, int numeroPatas, String raza) {
		super(matricula, nombreCientifico, numeroPatas);
		this.raza = raza;
	}

	public Perro() {
		super();
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", matricula=" + matricula + ", nombreCientifico=" + nombreCientifico
				+ ", numeroPatas=" + numeroPatas + "]";
	}

	@Override
	public void saludar() {
		System.out.println("Hola soy perro de raza : " + raza);
	}

	@Override
	public void sonido() {
		System.out.println("Soy perro y digo GUAU!");
	}

	
	
	
}
