package ejercicios;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		/*
		 * Pedimos por pantalla un nombre y una contraseña:
		 * 
		 * - si el nombre coincide con “sara”, preguntamos por la contraseña y si
		 * coincide con “sarita”, escribimos el mensaje “usuario y contraseña correctas,
		 * bienvenido a la aplicación”
		 * 
		 * 
		 * - Si el nombre NO es “sara” Escribimos usuario incorrecto”
		 * 
		 *
		 * - Si el nombre es correcto y la contraseña NO, Escribimos “contraseña
		 * incorrecta”
		 * 
		 * 
		 */

		// Usando el objeto Scanner, preguntamos por usuario.

		Scanner leer = new Scanner(System.in);
		String user = "", password = "";

		System.out.println("Introduzca usuario");

		user = leer.next();

		// Como tenemos que comparar Strings hay que usar el metodo equals.

		// si el usuario es correcto preguntamos por la contraseña y si esta es correcta
		// mostramos el mensaje

		// Si el Usuario no es correcto, cerramos programa

		// Lo mismo sucede con la contraseña

		if (user.equals("sara")) {
			System.out.println("Introduzca su contraseña");
			password = leer.next();
			if (password.equals("sarita")) {
				System.out.println("usuario y contraseña correctas, bienvenido a la aplicación");
			} else {
				System.out.println("Contraseña incorrecta");
			}
		} else {
			System.out.println("Usuario incorrecto");
		}

		leer.close();
		System.out.println("FIN DE ALGORITMO");

	}

}
