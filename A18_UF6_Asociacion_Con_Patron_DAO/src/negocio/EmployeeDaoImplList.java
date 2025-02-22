package negocio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javabean.Employee;

public class EmployeeDaoImplList implements IEmployeeDao {
	
	private List<Employee> lista;
	private IDepartmentDao iDepartmentDao;
	private IJobDao iJobDao;
	
	public EmployeeDaoImplList() {
		lista = new ArrayList<Employee>();
		
		iDepartmentDao=new DepartmentDaoImplList();
		iJobDao = new IJobDaoImplList();
		cargarDatos();
	}
	
	private void cargarDatos() {
		lista.add(new Employee(114, "Esteban", "Raphaelly", "est@fp.com", "678678678", LocalDate.of(1996, 07, 07),
				iJobDao.findById("IT_PROG"), 25_000, 0.20, iDepartmentDao.findById(30)));
		
		lista.add(new Employee(115, "Carlos", "Astro", "car@fp.com", "678678678", LocalDate.of(1996, 07, 07),
				iJobDao.findById("IT_PROG"), 25_000, 0.20, iDepartmentDao.findById(30)));
		
		lista.add(new Employee(116, "Tomas", "Stephen", "est@fp.com", "678678678", LocalDate.of(1996, 07, 07),
				iJobDao.findById("AD_PRES"), 25_000, 0.20, iDepartmentDao.findById(20)));
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
	public int insertOne(Employee object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateOne(Employee object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(Integer atributoPK) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteObj(Employee object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return lista;
	}

	

	

}
