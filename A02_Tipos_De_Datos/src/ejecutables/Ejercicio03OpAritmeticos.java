package ejecutables;

public class Ejercicio03OpAritmeticos {

	public static void main(String[] args) {
			int a = 4, b = 5, resultado = 0;
			
			//a++;
			//++a;
			//System.out.println("La variable a: " + a);
			//b--;
			//--b;
			//System.out.println("La variable b: " + b);
			//primero se iguala y luego se suma
			resultado = a++;
			System.out.println("resultado: " + resultado);
			System.out.println("La variable a: " + a);
			
			//primero se suma y luego se iguala
			resultado = ++b;
			System.out.println("resultado: " + resultado);
			System.out.println("La variable b: " + b);
			
		
	}

}
