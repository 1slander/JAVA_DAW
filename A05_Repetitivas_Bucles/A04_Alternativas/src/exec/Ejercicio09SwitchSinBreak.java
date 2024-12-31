package exec;

public class Ejercicio09SwitchSinBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Que meses son de 30 dias, que meses son de 31 y el de 28-29
		 */
		
		int month = 9;
		
		switch (month) {
		case 1:
		case 3:
			System.out.println("Empieza la primavera");
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Tienen 31 dias");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("es de 30 dias");
			break;
		case 2:
			System.out.println("de 28/29");
			break;
		default:
			System.out.println("mes incorrecto");
		}

	}

}
