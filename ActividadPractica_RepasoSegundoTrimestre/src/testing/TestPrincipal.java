package testing;

import javabean.Administrativo;
import javabean.Alumno;
import javabean.Profesor;

public class TestPrincipal {

	public static void main(String[] args) {
		
		Profesor prof1 = new Profesor("54545454F", "Tomas Gonzalez", "Calle Rosas 7 4B", "677888999", "Matematicas");
		Profesor prof2 = new Profesor("54545458V", "Maria Mendez", "Calle vientos 27 1A", "677888888", "Lengua");
		
		Alumno alu1 = new Alumno("45454545J", "Daniel Lopez", "Av. Felo Monzon 125 5C", "626888999", "1 Bachillerato Ciencias");
		Alumno alu2 = new Alumno("45454547M", "Ana Martin", "calle ancla 12 1 bajo derecha", "626888888", "2 Bachillerato Tecnologico");
		Alumno alu3 = new Alumno("45454577R", "Miguel Casillas", "calle capricho 121 11D", "626888777", "2 Bachillerato Sociales");
		
		Administrativo adm1=new Administrativo("44741111A", "Guacimara Gomez", "calle bentejui 18", "626626626", "controlar asistencia, hacer horarios, llamar a educacion");
		Administrativo adm2=new Administrativo("44741112C", "Yaiza Hormiga", "calle tanasu 28 3C", "626626627", "organizar reunion, hacer fotocopias");
		
		System.out.println("PROFESORES");

		System.out.println(prof1.toString());
		System.out.println(prof1.trabajar());
		System.out.println(prof1.llamar(alu2));
		System.out.println(prof1.ponerNotas());


		System.out.println("FIN PROFESORES");
		System.out.println("--------------");
		
		System.out.println("ALUMNO");

		System.out.println(alu1.toString());
		System.out.println(alu2.trabajar());
		System.out.println(alu3.llamar(adm2));
		System.out.println(alu1.hacerExamen());


		System.out.println("FIN ALUMNO");
System.out.println("--------------");
		
		System.out.println("ADMINISTRATIVO");

		System.out.println(adm1.toString());
		System.out.println(adm2.trabajar());
		System.out.println(adm1.gestionarMatriculas());
		
		
		


		System.out.println("FIN ADMINISTRATIVO");
		
		
	}

}
