package exec;

public class Ejercicio08AlternativasMultiplesSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Cuando una variable, de tipo entero, char o String
		 * tiene una serie de valores especificos (==) con 
		 * distinto tratamiento usaremos la alternativa Segun -> Switch
		 */
		
		int diaDeLaSemana = 6;
		
		switch (diaDeLaSemana) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		default:
			System.out.println("Fin de semana");
		}
		
		System.out.println("FIN DE PROGRAMA");

	}

}
