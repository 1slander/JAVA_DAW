package test.dao;

import java.time.LocalDate;

import modelo.dao.EmpleadoDaoImplJpa;
import modelo.dao.IEmpleadoDao;
import modelo.entities.Departamento;
import modelo.entities.Empleado;
import modelo.entities.Perfil;

public class TestEmpleadoDao {
	
	private static IEmpleadoDao edao;
	private static Empleado emp1;
	private static Perfil per1;
	private static Departamento dep1;
	
	static {
		edao=new EmpleadoDaoImplJpa();
		emp1=new Empleado();
		emp1.setNombre("Hector");
		emp1.setApellidos("Gonzalez");
		emp1.setGenero("H");
		emp1.setEmail("hgmendez@tt.com");
		emp1.setPassword("123456");
		emp1.setSalario(9000000);
		emp1.setFechaNacimiento(LocalDate.of(1991, 05, 25));
		emp1.setPerfil(new Perfil(2, "Jefe de Proyector", 220.00));
		emp1.setDepartamento(new Departamento(20, "Software", "Madrid"));
		per1=new Perfil(2, "Jefe de Proyector", 220.00);
		dep1=new Departamento(20, "Software", "Madrid");
	}

	public static void main(String[] args) {
		
		//encontrarUno();
		//todos();
		//insertarUno();
		//modificar();
		//borrar();
		buscarPorDept();
		//buscarPorGenero();
		//buscarPorApellido();
		//buscarPorPerfil();
		//salario();
		//salarioDept();
		
		//System.out.println(emp1.salarioMensual(12));

		//System.out.println(emp1.literalGenero());
		
		//System.out.println(emp1.nombreCompleto());
		
		
		
		
	}
	
	public static void encontrarUno() {
		System.out.println(edao.findById(100));
	}
	
	public static void todos() {
		for(Empleado ele : edao.findAll())
			System.out.println(ele);
	}
	
	public static void insertarUno() {
	
		
		System.out.println(edao.insert(emp1));
	}
	
	public static void modificar() {
		
		Empleado emp2 = edao.findById(121);
		emp2.setFechaIngreso(LocalDate.of(2025, 03, 30));
		emp2.setSalario(9999999.00);
		
		System.out.println(edao.update(emp2));
	}
public static void borrar() {
				
		System.out.println(edao.deletebyId(121));
	}

public static void buscarPorDept() {
	for(Empleado ele : edao.empleadosByDepartamento(dep1.getIdDepar()) )
		System.out.println(ele);
}

public static void buscarPorGenero() {
	for(Empleado ele : edao.empleadosByGenero('M') )
		System.out.println(ele);
}

public static void buscarPorApellido() {
	for(Empleado ele : edao.empleadosByApellido("ia") )
		System.out.println(ele);
}

public static void buscarPorPerfil() {
	for(Empleado ele : edao.empleadosByIdPerfil(4) )
		System.out.println(ele);
}

public static void salario() {
	System.out.println(edao.salarioTotal());
}

public static void salarioDept() {
	System.out.println(edao.salarioTotal(20));
}

}
