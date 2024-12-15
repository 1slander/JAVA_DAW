package ejercicios;

public class Ejercicio02 {

	public static void main(String[] args) {
		/*
		 * Diseñar un programa que muestre el producto y la suma de los 10 primeros
		 * números impares.
		 * 
		 */
		
		//Declaro las variables que voy a utilizar
		
		int count=0, number=1, sum=0, multi=1;
		
		// Para este ejercicio habia que usar un bucle si o si
		// Decidi usar el bucle do-while ya que en este caso, aunque sabia que necesitaba los 10
		// primeros impares, "no sabiamos" cuantos numeros iba a tener que correr el bucle.
		
		do {
			// Dentro del bucle cree un if para averiguar si un numero no es par
			// en el caso de que no fuera par, lo imprimo en consola y hago los calculos necesarios
			// aumentando la variable count
			
			if (number % 2 != 0) {
			System.out.println("Impar " + number);
			sum+=number;
			multi*=number;
			
			count++;
			}
			// si el numero es par saltamos a esta linea y aumentamos el numero.
			number++;
			} while(count < 10);
		
		
		

		System.out.println("El producto total de los 10 primeros impares es: " + multi);
		System.out.println("La suma total de los 10 primeros impares es: " + sum);
		System.out.println("FIN DE ALGORITMO");
	}

}
