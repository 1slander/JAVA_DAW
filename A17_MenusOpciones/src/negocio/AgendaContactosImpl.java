package negocio;

import java.util.ArrayList;
import java.util.List;

import javabean.Contacto;

public class AgendaContactosImpl implements IAgendaContacto {
	
	private List<Contacto> lista;
	
	//ARRANCAMOS LA LISTA VACIA
	
	public AgendaContactosImpl() {
		lista = new ArrayList<Contacto>();
		cargardatos();
		
	}
	
	private void cargardatos() {
		lista.add(new Contacto("Eva", "678678678"));
		lista.add(new Contacto("Carlos", "678678679"));
		lista.add(new Contacto("Marta", "678678688"));
	}

	@Override
	public List<Contacto> buscarTodos() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public Contacto buscarUno(String nombre) {
		for(Contacto contacto : lista) {
			if(contacto.getNombre().equals(nombre))
				return contacto;
		}
		return null;
	}

	@Override
	public boolean alta(Contacto contacto) {
		if(contacto==null)
			return false;
		if(lista.contains(contacto))
			return false;
		else
			return lista.add(contacto);
	}

	@Override
	public int modificarContacto(Contacto contacto) {
		int position = lista.indexOf(contacto);
		if(position != -1) {
			lista.set(position, contacto);
			return 1;
		} else
			return 0;
	}

	@Override
	public int eliminarContacto(String nombre) {
			Contacto contacto = buscarUno(nombre);
			if(contacto != null) {
				lista.remove(contacto);
				return 1;
			} else
				return 0;
	}

	@Override
	public List<Contacto> buscarPorTelefono(String telefono) {
		List<Contacto> resultado = new ArrayList<Contacto>();
		
		for(Contacto contacto : lista) {
			if(contacto.getTelefono().equals(telefono)) {
				resultado.add(contacto);
					
			}
			
		}
		return resultado;
	}

	@Override
	public List<Contacto> buscarPorSubCadenaNombre(String subcadena) {
		List<Contacto> aux = new ArrayList<Contacto>();
		for(Contacto contacto : lista) {
			if(contacto.getNombre().contains(subcadena)) {
				aux.add(contacto);
			}
			
		}
		return aux;
	}
	

}
