package testing;
import java.time.LocalDate;
import java.time.LocalTime;

import javabean.Fiesta;


public class Principal {

	public static void main(String[] args) {
		
		LocalDate fecha = LocalDate.of(2025,3,02);
		LocalTime hora = LocalTime.of(14, 45);
		
		System.out.println();
		
		// Fiesta 1: 
		
		Fiesta fiesta1 = new Fiesta("boda","Catedral de Santa Ana, Las Palmas de Gran Canaria",500,1000,50,fecha,hora);
		
		System.out.println("------- Comienza la Fiesta 1 -------");
		System.out.println(fiesta1.toString());
		System.out.println(fiesta1.precioFinal());
		
		System.out.println("------- Cancelan 49 invitados -------");
		fiesta1.cancelarInvitacion(49);
	
		System.out.println("Numero de invitados: " + fiesta1.getInvitados());
		System.out.println(fiesta1.precioFinal());
		
		
		System.out.println("------- Se invita a 1 -------");
		
		fiesta1.invitar();
		
		System.out.println("Numero de invitados: " + fiesta1.getInvitados());
		System.out.println(fiesta1.precioFinal());
	
		
		System.out.println("------- Se invita a 98 -------");
		
		fiesta1.invitar(98);
		
		System.out.println("Numero de invitados: " + fiesta1.getInvitados());
		System.out.println(fiesta1.precioFinal());
		
		
		System.out.println("------- Cancela 1 invitado -------");
		
		fiesta1.cancelarInvitacion();
		
		System.out.println("Numero de invitados: " + fiesta1.getInvitados());
		System.out.println(fiesta1.precioFinal());
		
		
		System.out.println("------- Fin de la Fiesta 1 -------");
		
		// Fiesta 2:
		
		Fiesta fiesta2 = new Fiesta();
		
		// Usamos los setters para definir las variables
		
		fiesta2.setTipoFiesta("cumpleaños");
		fiesta2.setDireccion("La laguna de Valleseco");
		fiesta2.setInvitados(30);
		fiesta2.setBebidas(200);
		fiesta2.setBocadillos(350);
		fiesta2.setFecha(LocalDate.of(2025, 5, 25));
		fiesta2.setHora(LocalTime.of(10, 30));
		
		System.out.println("------- Comienza la Fiesta 2 -------");
		
		System.out.println(fiesta2.toString());
		System.out.println(fiesta2.precioFinal());
		
		// Cancelamos mas invitaciones que numero de invitados para comprobar
		// que el numero no baja de 0
		
		System.out.println("------- Cancelan 40 invitados -------");
		
		fiesta2.cancelarInvitacion(40);
		
		System.out.println("Numero de invitados: " + fiesta2.getInvitados());
		System.out.println(fiesta2.precioFinal());
		
		
		
		System.out.println("------- Se invitan 30  -------");
		
		fiesta2.invitar(30);
		
		System.out.println("Numero de invitados: " + fiesta2.getInvitados());
		System.out.println(fiesta2.precioFinal());
		
		System.out.println("------- Cancelan 1 invitado -------");
		
		fiesta2.cancelarInvitacion();
		
		System.out.println("Numero de invitados: " + fiesta2.getInvitados());
		System.out.println(fiesta2.precioFinal());
		
		System.out.println("------- Se invitan a 1 -------");
		
		fiesta2.invitar();
		
		System.out.println("Numero de invitados: " + fiesta2.getInvitados());
		System.out.println(fiesta2.precioFinal());
		
		System.out.println("------- Fin de la Fiesta 2 -------");
		
	}

}
