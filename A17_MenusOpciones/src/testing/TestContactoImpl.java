package testing;

import javabean.Contacto;
import negocio.AgendaContactosImpl;
import negocio.IAgendaContacto;

public class TestContactoImpl {

	public static void main(String[] args) {
		
		IAgendaContacto miAgenda = new AgendaContactosImpl();
		
		int count =0;
		
		System.out.println("Listado por telefono");
		
		for(Contacto contacto : miAgenda.buscarPorTelefono("678678679")) {
			System.out.println(contacto.getNombre().toUpperCase());
			count++;
		}
		if(count == 0)
			System.out.println("De este telefono no hay contactos");
		
		System.out.println("\nListado por subcadena");
		count =0;
		
		for(Contacto contacto : miAgenda.buscarPorSubCadenaNombre("ar")) {
			System.out.println(contacto.getNombre());
			count++;
		}
		if(count == 0)
			System.out.println("De esta busqueda no hay contactos");
		
		System.out.println("\n PROCESO TERMINADO");
	}

}
