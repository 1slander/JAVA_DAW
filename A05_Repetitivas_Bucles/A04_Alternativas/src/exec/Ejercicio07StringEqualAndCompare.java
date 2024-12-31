package exec;

public class Ejercicio07StringEqualAndCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String cadena1 = "Tomas", cadena2 = "tomas";
			
			if(cadena1.equalsIgnoreCase(cadena2)) {
				System.out.println("iguales");
			} else {
				System.out.println("diferentes");
			}
			
			System.out.println(cadena1.compareTo(cadena2));
			System.out.println(cadena1.compareToIgnoreCase(cadena2));
	}

}
