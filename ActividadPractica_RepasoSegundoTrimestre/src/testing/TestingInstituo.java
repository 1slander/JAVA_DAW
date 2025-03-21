package testing;

import java.util.List;

import javabean.Alumno;
import javabean.PersonaAbstract;
import javabean.Profesor;
import negocio.IInstitutoDao;
import negocio.InstitutoDaoImpl;

public class TestingInstituo {
	
	private static IInstitutoDao iInstitutoDao = new InstitutoDaoImpl();

	public static void main(String[] args) {
		
		todos();
		
		
	
//		
//		Alumno alu = new Alumno("45454577A", "Hector Gonzalez", "calle capricho 121 11D", "626888777", "2 Bachillerato Sociales");
//		Alumno alu2 = new Alumno("45454547M", "Ana Martin", "calle ancla 12 1 bajo derecha", "626888888", "2 Bachillerato Tecnologico");
//		
//		System.out.println(iInstitutoDao.buscarTodas());
//		
//		
//		System.out.println(iInstitutoDao.altaPersona(new Profesor("54545454F", "Tomas Gonzalez", "Calle Rosas 7 4B", "677888999", "Matematicas")));
//		System.out.println(iInstitutoDao.altaPersona(new Profesor("54545454T", "Paco Gonzalez", "Calle Rosas 7 4B", "677888999", "Deporte")));
//		
//		System.out.println(iInstitutoDao.buscarPersona("45454577R"));
//		
//		System.out.println(iInstitutoDao.eliminarPersona(alu));
//		System.out.println(iInstitutoDao.eliminarPersona(alu2));
//		
//		System.out.println(iInstitutoDao.buscarPersonasPorTipo("Profesor"));

	}
	
	public static void todos() {
		System.out.println("\nLISTADO DE TODAS PERSONAS\n");
		
		List<PersonaAbstract> listaPersonas = iInstitutoDao.buscarTodas();
		
		for(PersonaAbstract persona :  listaPersonas) {
			System.out.println(persona);
		}
		
	}
	public static void alta() {
		
	}

	public static void eliminar() {

	}
	public static void porNif() {

	}

}
