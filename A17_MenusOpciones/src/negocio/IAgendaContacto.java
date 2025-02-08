package negocio;

import java.util.List;

import javabean.Contacto;

public interface IAgendaContacto {
	
	
	
	Contacto buscarUno(String nombre); //Read
	
	boolean alta(Contacto contacto); // Create
	
	int modificarContacto(Contacto contacto); // Update
	
	int eliminarContacto(String nombre); // Delete
	
	List<Contacto> buscarTodos(); // All con precaucion
	
	// Busquedas propias
	
	List<Contacto> buscarPorTelefono(String telefono);
	List<Contacto> buscarPorSubCadenaNombre(String subcadena);
	
	
	
	}
