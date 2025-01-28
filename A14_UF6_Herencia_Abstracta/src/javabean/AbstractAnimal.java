package javabean;

import java.util.Objects;

public abstract class AbstractAnimal {
	/*
	 * 1 de una clase abstracta no se puede hacer new, pero si se pueden crear variables
	 * 2 puede declarar una serie de metodos abstractos (el que no tiene implementacion)
	 * 3 un metodo abstracto obliga a la clase que hereda de el a reescribir ese metodo.
	 */
	protected int matricula;
	protected String nombreCientifico;
	protected int numeroPatas;
	
	public AbstractAnimal() {
		super();
	}
	
	
	public AbstractAnimal(int matricula, String nombreCientifico, int numeroPatas) {
		super();
		this.matricula = matricula;
		this.nombreCientifico = nombreCientifico;
		this.numeroPatas = numeroPatas;
	}


	public String getNombreCientifico() {
		return nombreCientifico;
	}
	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}
	public int getNumeroPatas() {
		return numeroPatas;
	}
	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}
	
	
	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	
	
	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof AbstractAnimal))
			return false;
		AbstractAnimal other = (AbstractAnimal) obj;
		return matricula == other.matricula;
	}

	

	@Override
	public String toString() {
		return "Animal [matricula=" + matricula + ", nombreCientifico=" + nombreCientifico + ", numeroPatas="
				+ numeroPatas + "]";
	}


	public abstract void saludar();
	
	
	public abstract void sonido();
	
}
