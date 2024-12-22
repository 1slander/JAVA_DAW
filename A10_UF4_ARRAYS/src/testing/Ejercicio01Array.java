package testing;

public class Ejercicio01Array {

	public static void main(String[] args) {
		String [] nombres = {"sara", "eva", "carlos"};
		
		for (int i=0; i<nombres.length; i++)
			System.out.println(nombres[i]);
		
		//Para poder usar este el array no tiene que tener huecos
		for (String nombre : nombres)
			System.out.println(nombre);
		
		String [] palabras = new String [4];
		palabras[0]="Hola";
		palabras[1]="Adios";
		
		for (String palabra : palabras) {
			if(palabra == null)
				break;
			System.out.println(palabra.toUpperCase());
		}
	}

}
