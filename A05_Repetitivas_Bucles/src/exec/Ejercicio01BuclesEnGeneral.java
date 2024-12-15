package exec;

import java.util.Scanner;

public class Ejercicio01BuclesEnGeneral {

	public static void main(String[] args) {
		/*
		 * En Java hay 3 tipos de bucles, todos mientras que:
		 * divididos en dos secciones
		 * 
		 * 1. No se el numero de veces que se repite
		 * 
		 * - Bucle de 0 a n: primero pregunta y si no se cumple se va.
		 * 		while (condition) {
		 * 			code
		 * }
		 * 
		 * - Bucle de 1 a n: primero se ejecuta y luego si se comple la condicion continua ejecutandose hasta que no se cumpla.
		 * 		do { 
		 * code 
		 * } while (condition)
		 * 
		 * 2. Se el numero veces que se itera
		 * 
		 * - Bucle for: 2 maneras distintas
		 * 
		 *  - original que itera numeros enteros.
		 *  
		 *		for(int i = 0; i<n; i++) {
		 *			code
		 *}
		 *
		 * - for para arrays y colecciones
		 */
		
		int number = 1;
		int number2 = 1;
		
		while (number <=10) {
			System.out.println("el numero es con while: " + number);
			number ++;
		}
		
		
		do {
			System.out.println("el numero es con doWhile: " + number2);
			number2 ++;	
		} while (number2 <= 10);

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dame un numero 1-10");
		int option = scanner.nextInt();
		
		
		
		for(int i=1; i<=option; i++) {
			System.out.println(i);
		}
		
		scanner.close();
		
	}

}
