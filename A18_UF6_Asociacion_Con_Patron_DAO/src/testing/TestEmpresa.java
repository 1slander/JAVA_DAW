package testing;

import java.time.LocalDate;

import javabean.Country;
import javabean.Department;
import javabean.Employee;
import javabean.Job;
import javabean.Location;
import javabean.Region;

public class TestEmpresa {

	public static void main(String[] args) {
		

		Region region1 = new Region(1, "Europa");
		Country esp = new Country("SP", "Espana", region1);
		// Country arg = new Country("AR", "Argentina", new Region(2,"Sur America"));
		
		Location loc1500=new Location(1500, "Pez 3", "28007", "Madrid", "28", esp);
		
		Job job1 = new Job("IT_PROG", "Analista programador", 19000, 35000);
		
		Department dep30 =new Department(30, "Ventas", null, loc1500);
		
		Employee empleado114 = new Employee(114, "Esteban", "Raphaelly", "est@fp.com", "678678678", LocalDate.of(1996, 07, 07), job1, 25_000, 0.20, null, dep30);
		Employee empleado115 = new Employee(115, "Ana", "Koo", "ana@fp.com", "679678678", LocalDate.of(1995, 05, 05), job1, 35_000, 0.1, empleado114, dep30);
		Employee empleado116 = new Employee(114, "Eva", "Baida", "eva@fp.com", "677679678", LocalDate.of(1995, 03, 15), job1, 30_000, 0.30, empleado114, dep30);

		dep30.setManager(empleado114);
		
		System.out.println("Desde empleado 116 : mi apellido, mi trabajo y mi departamento");
		
		System.out.println(empleado116.getLastName());
		System.out.println(empleado116.getJob().getJobTitle());
		System.out.println(empleado116.getDeparment().getDepartmentName());
		
		
		System.out.println("Desde empleado 116 : mi apellido, el apellido de mi jefe y el apellido de mi manager");
		
		System.out.println(empleado116.getLastName());
		System.out.println(empleado116.getMyBoss().getLastName());
		System.out.println(empleado116.getDeparment().getManager().getLastName());
		
		System.out.println("Desde empleado 116 : mi nombre de region");
		System.out.println(empleado116.getDeparment().getLocation().getCountry().getRegion().getRegionName());
		
		System.out.println("Desde empleado 116 : La region de mi jefe");
		System.out.println(empleado116.getMyBoss().getDeparment().getLocation().getCountry().getRegion().getRegionName());
		
		System.out.println("Desde empleado 114 : el apellido de su jefe");
		if(empleado114.getMyBoss() != null)
			System.out.println(empleado114.getMyBoss().getLastName());
		else
			System.out.println("Este empleado no tiene jefe");
		
		System.out.println(job1);
		System.out.println(loc1500); 
		System.out.println(empleado116);
	}

}
