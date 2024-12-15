package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		/*
		 * Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente,
		 * Bien, Notable y sobresaliente. Si la nota introducida no está en el rango
		 * mostrar el mensaje “Nota errónea”.
		 */

		// Para este ejercicio podemos usar el objeto Scanner para leer una nota.
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce una nota del 0 - 10: ");

		// Aqui guardo y transformo a Int
		int grade = leer.nextInt();

		// IMPORTANTE: He dejado declarada esta variable por si acaso Tomas quiere ir
		// mas al grano.
		// -----
		// int grade = 6;

		// He elegido hacer un switch ya que en este caso, me parece mucho mas limpio y
		// correcto
		// que usar un If, IfElse.

		switch (grade) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Insuficiente");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7:
		case 8:
			System.out.println("Notable");
			break;
		case 9:
		case 10:
			System.out.println("Sobresaliente");
			break;
		default:
			System.out.println("Nota erronea");
		}

		leer.close();
		System.out.println("FIN DEL ALGORITMO");

	}

}
