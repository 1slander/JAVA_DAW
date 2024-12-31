package exec;

public class Ejercicio06IfConString {

	public static void main(String[] args) {
		// las distintas opciones de un algoritmo declarado como String
		
		String opcion = "editar"; // editar, ver, alta
		
		if(opcion.equals("editar")) {
			System.out.println("Han tecleado editar");
		} else
			if (opcion.equals("ver")){
				System.out.println("Han tecleado ver");
			} else 
				{
					System.out.println("Han tecleado alta");
				}
		// nunca crear string asi por que consume mucha memoria
		String opcion2 = new String("Editar");
		// .equals compara el contenido
		if (opcion.equalsIgnoreCase(opcion2))
			System.out.println("los dos contienen lo mismo");
		else
			System.out.println("contien cadenas diferentes");

		System.out.println("Fin de programa");
	}

}
