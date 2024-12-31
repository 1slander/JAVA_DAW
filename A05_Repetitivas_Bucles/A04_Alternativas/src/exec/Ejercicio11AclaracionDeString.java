package exec;

public class Ejercicio11AclaracionDeString {

	public static void main(String[] args) {
		
		/*
		 *  dos tipos de variable por su contenido en Java
		 *  - Las que contienen el valor asignado: Los 8 tipos primitivos.
		 *  - Las variables de tipo clase: Contienen una referencia al contenido del objeto
		 *  Por lo tanto , tienen una direccion de memoria.
		 */
		
		/*
		 *  Scanner leer = new Scanner(System.in);
		 *  
		 *  Para crear un objeto de una clase, se hace asi:
		 *  
		 *  Clase Variable = new Clase(argumento)// construir un objeto
		 *  
		 *  String, para construir un objeto de la clase String, generalmente
		 *  no se hace como los demas, por lo tanto tiene una forma especial
		 *  
		 *  String nombre = "valor" // propia de String y de alguna clase mas que veremos (Clases envolventes)
		 *  
		 *  
		 */
		
		/*
		 * Los operadores de relacion: == != <= > >=, en java siempre comparan el contenido de las variables
		 * 
		 * - variables de tipo primitivo, comparamos los valores reales
		 * - variables de tipo clase, como su contenido es una direccion de memoria, estamos
		 * comparando si dos objetos apuntan al mismo String.
		 * 
		 * Para ello tenemos que usar un metodo de objeto de String llamado equals.
		 */
		
		String cad1 = "andres", cad2 ="andres";
		
		
		if(cad1.equals(cad2)) {
			System.out.println("son iguales");
		} else {
			System.out.println("son diferentes");
		}
		

	}

}
