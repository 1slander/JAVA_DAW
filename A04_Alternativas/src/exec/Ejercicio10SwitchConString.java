package exec;

public class Ejercicio10SwitchConString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String opcion = "ver";
		
		switch(opcion) {
		case "editar":
			System.out.println("Estamos editando");
			break;
		case "ver":
			System.out.println("Estamos viendo");
			break;
		case "alta":
			System.out.println("Estamos dando de alta");
			break;
			default:
				System.out.println("opcion erroneo");
		}
	}

}
