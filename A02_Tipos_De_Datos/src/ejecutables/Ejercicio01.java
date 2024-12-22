package ejecutables;

public class Ejercicio01 {

	public static void main(String[] args) {
		//tipo nombre = literal;
		//tipo nombre = lit, otro = lit;
		
		byte edad = 12;
		//para los numeros 1k puedes poner un guion bajo para distinguir
		short numeroShort = 32_000;
		// utilizaremos int la mayoria de veces cuando sea mas que 2kmillons sera long
		int numberInt = 2_000_000_000;
		// casting implicito anadimos la L al final
		long numberLong = 2_400_000_000L;
		long numberLong2 = 1L;
		
		//REALES
		float numberFloat = 12;
		//casting implicito F
		float numberFloat2 = 12.4F;
		double numberDouble = 23e43;
		
		//1 CARACTER
		char letra = 'c', letra2 = '*';
		
		//BOOLEANO
		boolean exist = false;
		
		//CADENAS DE CARACTERES
		//String es un objeto
		// las clases en java pueden tener un monton de atributos y metodos -> name.
		String name = "hector";
				
		name.toUpperCase();
		
		//Cast (tipo) nombre
		numberInt = (int) numberDouble;
		System.out.println(numberInt);
		
		int i,j,k;
		double num1,num2;
		char letra3 = 's';
		String letraString = "s";
		boolean answer = true;
		
	}

}
