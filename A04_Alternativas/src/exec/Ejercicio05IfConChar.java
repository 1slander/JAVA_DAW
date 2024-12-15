package exec;

public class Ejercicio05IfConChar {

	public static void main(String[] args) {
		
		// En vez de leer que no sabemos de momento
		// Le asignamos un valor a genero y probamos con el
		// Una variable en un momento determinado solo puede tener un valor
		// and && or ||
		
		char genero = 'j';
		
		if(genero == 'H' || genero=='h') {
			System.out.println("Eres un hombre");
		} else
			if (genero == 'M' || genero=='m') {
			System.out.println("Eres una mujer");
		} else {
			System.out.println("Te has equivocado");
		}

	}

}
