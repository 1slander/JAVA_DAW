package testingdao;

import javabean.Employee;
import negocio.EmployeeDaoImplList;
import negocio.IEmployeeDao;

public class TestEmployeeDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IEmployeeDao iEmployeeDao = new EmployeeDaoImplList();
		
		for(Employee ele:iEmployeeDao.findAll()) {
			System.out.println(ele);
		}
	}

}
