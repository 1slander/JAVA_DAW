package negocio;

import java.util.ArrayList;
import java.util.List;

import javabean.Administrativo;
import javabean.Alumno;
import javabean.PersonaAbstract;
import javabean.Profesor;

public class InstitutoDaoImpl implements IInstitutoDao<PersonaAbstract> {
	
	private List<PersonaAbstract> personas;
	
	public InstitutoDaoImpl() {
		personas=new ArrayList<PersonaAbstract>();
		cargarDatos();
	}
	public void cargarDatos() {
		Profesor prof1 = new Profesor("54545454F", "Tomas Gonzalez", "Calle Rosas 7 4B", "677888999", "Matematicas");
		Profesor prof2 = new Profesor("54545458V", "Maria Mendez", "Calle vientos 27 1A", "677888888", "Lengua");
	
		Alumno alu1 = new Alumno("45454545J", "Daniel Lopez", "Av. Felo Monzon 125 5C", "626888999", "1 Bachillerato Ciencias");
		Alumno alu2 = new Alumno("45454547M", "Ana Martin", "calle ancla 12 1 bajo derecha", "626888888", "2 Bachillerato Tecnologico");
		Alumno alu3 = new Alumno("45454577R", "Miguel Casillas", "calle capricho 121 11D", "626888777", "2 Bachillerato Sociales");
	
		Administrativo adm1=new Administrativo("44741111A", "Guacimara Gomez", "calle bentejui 18", "626626626", "controlar asistencia, hacer horarios, llamar a educacion");
		Administrativo adm2=new Administrativo("44741112C", "Yaiza Hormiga", "calle tanasu 28 3C", "626626627", "organizar reunion, hacer fotocopias");
	
	
		personas.add(prof1);
		personas.add(prof2);
		personas.add(alu1);
		personas.add(alu2);
		personas.add(alu3);
		personas.add(adm1);
		personas.add(adm2);
	}
	@Override
	public boolean altaPersona(PersonaAbstract persona) {
		if(personas.contains(persona)) {
			
			return false;
		} else
			
		return personas.add(persona);
	}

	@Override
	public PersonaAbstract buscarPersona(String nif) {
		for(PersonaAbstract ele : personas) {
			if(ele.getNif().equals(nif))
				return ele;
		}
		return null;
	}

	@Override
	public List<PersonaAbstract> buscarTodas() {
		
		return personas;
	}

	@Override
	public boolean eliminarPersona(PersonaAbstract persona) {
		
		
		return personas.remove(persona);
	}

	@Override
	public List<PersonaAbstract> buscarPersonasPorTipo(String tipoPersona) {
		
		List<PersonaAbstract> aux = new ArrayList<PersonaAbstract>();
		
		switch(tipoPersona) {
		case "Alumno":

			for(PersonaAbstract persona : personas) {
				if(persona instanceof Alumno)
					aux.add(persona);
			}
			break;
		case "Profesor":

			for(PersonaAbstract persona : personas) {
				if(persona instanceof Profesor)
					aux.add(persona);
			}
			break;
		case "Administrativo":

			for(PersonaAbstract persona : personas) {
				if(persona instanceof Administrativo)
					aux.add(persona);
			}
			break;
		default:
			return null;
		}
		
		
		
		
		return aux;
	} 
	

}
