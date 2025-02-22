package negocio;

import java.util.ArrayList;
import java.util.List;

import javabean.Department;

public class DepartmentDaoImplList implements IDepartmentDao {
	
	private List<Department> lista;
	private ILocationDao iLocationDao;
	
	public DepartmentDaoImplList() {
		 
		lista=new ArrayList<Department>();
		iLocationDao=new LocationDaoImplList();
		cargarDatos();
	}
	
	public void cargarDatos() {
		lista.add(new Department(10, "Ventas", 100, iLocationDao.findById(1500)));
		lista.add(new Department(20, "Financiero", 201, iLocationDao.findById(1600)));
		lista.add(new Department(30, "Informatica", 114, iLocationDao.findById(1700)));
	}

	@Override
	public Department findById(Integer atributoPK) {
		for(Department department : lista) {
			if(department.getDepartmentid()== atributoPK) 
				return department;
		}
		return null;
	}

	@Override
	public int insertOne(Department object) {
		if(lista.contains(object))
			return 0;
		else {
			lista.add(object);
			return 1;
		}
	}

	@Override
	public int updateOne(Department object) {
		int position = lista.indexOf(object);
		if(position != -1) {
		lista.set(position, object);
		return 1;
		}
		
		return 0;
	}

	@Override
	public int deleteById(Integer atributoPK) {
		Department department = findById(atributoPK);
		return deleteObj(department);
		
	}

	@Override
	public int deleteObj(Department object) {
		return lista.remove(object) ? 1 : 0;
	}

	@Override
	public List<Department> findAll() {
		
		return lista;
	}

}
