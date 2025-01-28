package testing;

import java.util.ArrayList;

import javabean.AbstractAnimal;
import javabean.Caballo;
import javabean.Gato;

public class TestAnimal {

	public static void main(String[] args) {
		AbstractAnimal animal1 = new Caballo(1234,"Equinus", 4,120);
		AbstractAnimal animal2 = new Caballo(1235,"Equinus", 4,234);
		
		Gato gato1 = new Gato(1236, "Gato Felix", 4, 14);
		Gato gato2 = new Gato(1237, "Gato con Botas", 4, 7);
		
		//Puedo crear variables de tipo Animal instanciado objetos de tipo gato
		
		AbstractAnimal gato3 = new Gato(1238,"Gato montes",4,20);
		
		/*
		 * Momentos de la programacion de una aplicacion
		 * 
		 * Momento 1: Estoy tecleando 
		 * 		Cuando a gato3 le pongo un punto que metodos veo? los del tipo que tienes a la izquierda.
		 * 
		 * Momento 2: Estoy ejecutando
		 * 		que metodos se ejecuta, el de quien? En tiempo en ejecucion se ejecuta el den new
		 * 
		 * 
		 */
		
		System.out.println("DATOS ANIMAL 1");
		animal1.saludar();
		animal1.sonido();
		System.out.println(animal1);
		

		System.out.println("DATOS ANIMAL 2");
		animal2.saludar();
		animal2.sonido();
		System.out.println(animal2);
		
		System.out.println("DATOS GATO 1");
		gato1.saludar();
		gato1.sonido();
		gato1.aumentarVidas(3);
		System.out.println(gato1);
		
		System.out.println("DATOS GATO 3");
		gato2.saludar();
		gato2.sonido();
		
		System.out.println(gato3);
		// Casting
		((Gato)gato3).cancelarVidas(4);
		System.out.println(gato3);

		Gato gato4 = (Gato) gato3;
		System.out.println(gato4);
		
		System.out.println("COLECCION DE GATOS");
		
		ArrayList<Gato> censoGatos = new ArrayList<Gato>();
		censoGatos.add(gato1);
		censoGatos.add(gato2);
		censoGatos.add(new Gato(12,"Gato Siames",4,7));
		
		for(Gato gato : censoGatos) {
			System.out.println("Vidas: " + gato.getNumeroVidas());
		}
	}

}
