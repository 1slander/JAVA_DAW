package testingdao;

import javabean.Job;
import negocio.IJobDao;
import negocio.IJobDaoImplList;

public class TestingJobDao {

	public static void main(String[] args) {
		
		IJobDao iJobDao = new IJobDaoImplList();
		
		for(Job ele: iJobDao.findAll())
			System.out.println(ele);

	}

}
