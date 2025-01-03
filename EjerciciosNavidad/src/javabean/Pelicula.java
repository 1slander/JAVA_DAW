package javabean;

import java.util.Objects;

public class Pelicula {

	private String name;
	private String director;
	private Genero genero;
	private int duration;
	private int year;
	private double score;
	
	public enum Genero {
		ACCION,COMEDIA,DRAMA,SUSPENSE
	}

	public Pelicula(String name, String director, Genero genero, int duration, int year, double score) {
		super();
		this.name = name;
		this.director = director;
		this.genero = genero;
		this.duration = duration;
		this.year = year;
		this.score = score;
	}

	public Pelicula() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Pelicula [name=" + name + ", director=" + director + ", genero=" + genero + ", duration=" + duration
				+ ", year=" + year + ", score=" + score + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Pelicula))
			return false;
		Pelicula other = (Pelicula) obj;
		return Objects.equals(name, other.name);
	}
	
	
	/*
	 * METODOS PROPIOS
	 */
	
	public boolean esPeliculaEpica() {
		if(duration >= 180) return true;
		return false;
	}
	
	public String calcularValoracion() {
		
		if(score<=2)
			return "Muy Mala";
		else if(score>2 && score<=5)
			return "Mala";
		else if(score>5 && score<=7)
			return "Regular";
		else if(score>7 && score <=8)
			return "Buena";
		else
			return "excelente";
					
	}
	
	public boolean esSimilar(Pelicula otra) {
		if(this.score == otra.score && this.genero.equals(otra.genero))
			return true;
		return false;
	}
	
	
	
}
