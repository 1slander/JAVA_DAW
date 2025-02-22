package negocio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javabean.Department;
import javabean.Employee;
import javabean.Location;

public class EmployeeDaoImplList implements IEmployeeDao{
	
	private List<Employee> lista;
	private IDepartmentDao iDepartmentDao;
	private IJobDao  iJobDao;
	
	public EmployeeDaoImplList() {
		lista = new ArrayList<Employee>();
		iDepartmentDao = new DepartmentDaoImplList();
		iJobDao = new JobDaoImplList();
		
		cargarDatos();
		
		
	}
	
	private void cargarDatos() {
		lista.add(new Employee(114, "Esteban", "Raphaelly", "est@fp.com", "678678678", LocalDate.of(1996, 7, 7),
								iJobDao.findById("IT_PROG"), 35_000, 0.2,  iDepartmentDao.findById(30)));
		lista.add(new  Employee(115, "Ana", "Koo", "ana@fp.com", "678678678", LocalDate.of(1996, 7, 7), 
				iJobDao.findById("IT_PROG"), 35_000, 0.2,  iDepartmentDao.findById(30)));
		lista.add(new  Employee(116, "carlos", "Colmenares", "carlos@fp.com", "678678678", LocalDate.of(1996, 7, 7), 
				iJobDao.findById("AD_PRESS"), 135_000, 0.2,  iDepartmentDao.findById(20)));
		 
	}

	@Override
	public Employee findById(Integer atributoPk) {
		for (Employee ele: lista) {
			if (ele.getEmployeeId() == atributoPk)
				return ele;
		}
		
		return null;
	}

	@Override
	public int insertOne(Employee objeto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateOne(Employee objeto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(Integer atributoPk) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteObj(Employee objeto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return lista;
	}

	/* METODOS IMPLEMENTADOS */
		
	@Override
	public List<Employee> porDepartamento(int departmentId) {
		List<Employee> aux = new ArrayList<Employee>();
		for (Employee ele : lista) {
			if(ele.getDepartment().getDepartmentId()==departmentId){
				aux.add(ele);
			} 
			
		}
		if(aux.isEmpty())
			System.out.println("No se encontraron trabajadores en ese departamento");
		return aux;
	}

	@Override
	public List<Employee> porTrabajo(String jobId) {
		List<Employee> aux = new ArrayList<Employee>();
		for (Employee ele : lista) {
			if(ele.getJob().getJobId().equals(jobId)){
				aux.add(ele);
			} 
			
		}
		if(aux.isEmpty())
			System.out.println("No se encontraron trabajadores en ese departamento");
		return aux;
	}

	@Override
	public double calcularMasaSalarial() {
		double acumulador=0.0;
			for(Employee ele : lista)
				acumulador+=ele.getSalary();
		return acumulador;
	}

	@Override
	public double masaSalarialPorDep(int departmentId) {
		double acumulador=0.0;
		for(Employee ele : lista)
			if(ele.getDepartment().getDepartmentId()== departmentId) {
			acumulador+=ele.getSalary();
			}
		return acumulador;
		
	}

	@Override
	public List<Employee> fueraSalario() {
		// TODO Auto-generated method stub
		return null;
	}

}
