package testing;

import javabean.Pelicula;

public class TestePelicula {

	public static void main(String[] args) {
		Pelicula pelicula1 = new Pelicula("Harry Potter", "Mel Gibson", Pelicula.Genero.ACCION, 190, 2025, 8.5);
		Pelicula pelicula2 = new Pelicula("Superman", "Cohen Brothers", Pelicula.Genero.ACCION, 120, 2025, 6.5);
		
		System.out.println(pelicula1.esPeliculaEpica());
		System.out.println(pelicula2.esPeliculaEpica());
		
		System.out.println(pelicula1.calcularValoracion());
		System.out.println(pelicula2.calcularValoracion());
		
		System.out.println(pelicula1.esSimilar(pelicula2));

	}

}
