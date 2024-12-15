package ejercicios;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		/*
		 * Leer números hasta que se introduzca un cero. 
		 * Para cada uno indicar si es par o impar.
		 * Al final mostrar las siguientes Estadísticas:
		 *  - cuantos son pares e impares
		 *  - cuanto suman los pares y cuanto los impares.
		 */
		
		
		// Declaro variables y el objeto scanner para poder leer un numero.
		
		Scanner scanner = new Scanner(System.in);
		int totalEvenNumbers =0, totalOddNumbers =0, totalSumEven = 0, totalSumOdd =0 ,number=0;
		
		// Aqui le pido al usuario que introduzca un numero
		
		System.out.println("Introduzca un numero: ");
		
		number = scanner.nextInt();
		
		// Uso un while ya que si el usuario registran el numero 0, el bucle no se haria.
		
		while (number != 0) {
		
			// Si el numero es par se realiza el if sino damos por hecho que el numero es impar.
			
			if(number % 2 == 0) {
				totalEvenNumbers += 1;
				totalSumEven += number;
				} else {
				totalOddNumbers +=1;
				totalSumOdd += number;
				}
			// Aqui volvemos a preguntar al usuario por un numero y vemos si la condicion del bucle se cumple
			System.out.println("Introduzca un numero: ");
			
			number = scanner.nextInt();
			} 
		
		System.out.println("Total de pares " + totalEvenNumbers );
		System.out.println("Total de impares " + totalOddNumbers );
		System.out.println("Total de suma de pares " + totalSumEven );
		System.out.println("Total de suma de impares " + totalSumOdd );
		scanner.close();
		System.out.println("FIN DE ALGORITMO" );

	}

}
