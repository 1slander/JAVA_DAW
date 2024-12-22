package exec;

public class Ejercicio01ArrayUnidimensional {

	public static void main(String[] args) {
		
		int [] numeros = {2,3,4,5,8,343,21};
		
		for(int i =0; i<numeros.length;i++) { 
			System.out.println("en posicion " + i + " hay " + numeros[i]);
		}
		
		
		// Necesita que todos los elementos del array
		// tengan contenido, que el array este lleno.
		
		for (int numero: numeros) {
			System.out.println("el numero contiene: " + numero);
		}

	}

}
