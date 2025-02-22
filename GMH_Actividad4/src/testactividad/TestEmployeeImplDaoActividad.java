package testactividad;

import javabean.Employee;
import negocio.EmployeeDaoImplList;
import negocio.IEmployeeDao;

public class TestEmployeeImplDaoActividad {

	public static void main(String[] args) {
		
		IEmployeeDao iEmployeeDao = new EmployeeDaoImplList();
		
		System.out.println("Busqueda por departamento");
		
		for (Employee ele : iEmployeeDao.porDepartamento(30))
			System.out.println(ele);
		
		System.out.println("Busqueda por trabajo");
		
		for (Employee ele : iEmployeeDao.porTrabajo("IT_PROG"))
			System.out.println(ele);
		
		System.out.println("Calcular masa salarial");
		
		System.out.println(iEmployeeDao.calcularMasaSalarial());
		
		System.out.println("Calcular masa salarial por departamento");
		
		System.out.println(iEmployeeDao.masaSalarialPorDep(30));

	}

	}
	
	
