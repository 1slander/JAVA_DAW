package ejercicios;

public class Ejercicio03 {

	public static void main(String[] args) {
		/*
		 * Escribir todos los números del 100 al 0 de 7 en 7.
		 *  Al final mostrar las siguientes Estadísticas.
		 *  - Cuantos números has escrito
		 *  - Cuanto suman los números escritos
		 *  - Cuantos de estos números son pares.
		 */

		
		int totalNumbers = 0, totalSum=0, totalEven=0;
		
		for(int i=100; i>=0; i-=7) {
			System.out.println(i);
			totalNumbers+=1;
			totalSum+=i;
			
			if(i%2==0) {
				totalEven+=1;
			}
			
		}
		
		System.out.println("Total de numeros: " + totalNumbers);
		System.out.println("Total suma de los numeros: " + totalSum);
		System.out.println("Total suma numeros pares: " + totalEven);
		System.out.println("FIN DE ALGORITMO");
	}

}
