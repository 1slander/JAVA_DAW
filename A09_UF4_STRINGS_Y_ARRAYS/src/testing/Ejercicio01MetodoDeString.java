package testing;

public class Ejercicio01MetodoDeString {

	public static void main(String[] args) {
		String saludo = "Hola me llamo Hector y soy tu estudiante";
		String nombre = "hector";
		String nombre2 = new String("hector");
		
		System.out.println(saludo.length());
		System.out.println(saludo.charAt(0));
		System.out.println(saludo.toUpperCase());
		System.out.println(saludo.toLowerCase());
		
		//MANERA ERRORNEA
		
		if (nombre == "hector")
			System.out.println("iguales");
		else
			System.out.println("distintos");
		
		if (nombre == nombre2)
			System.out.println("iguales");
		else
			System.out.println("distintos");
		
		//MANERA CORRECTA
		
		if(nombre.equals("hector"))
			System.out.println("iguales por equals");
		else
			System.out.println("distintos por equals");
		
		if(nombre.equals(nombre2))
			System.out.println("iguales por equals");
		else
			System.out.println("distintos por equals");
		
		
		//contiene,comienza y termina
		System.out.println(saludo.contains("e"));
		System.out.println(saludo.startsWith("hello"));
		System.out.println(saludo.endsWith("estudiante"));
		
		System.out.println(saludo.indexOf("llamo"));
		
		
		/*
		 * 
		 * espacio en blanco
		 * numeros
		 * mayusculas
		 * minusculas
		 * 
		 */
		System.out.println(nombre.compareTo("Hector"));
		System.out.println(nombre.compareToIgnoreCase("Hector"));
		
		String [] palabras = saludo.split(" ");
		
		for (String palabra : palabras)
			System.out.println(palabra);
		
		String numero = String.valueOf(12);
		
		
	}

	
}
