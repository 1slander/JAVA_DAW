package testing.dao;

import modelo.dao.IRegionDao;
import modelo.dao.RegionDaoImplMy8Jdbc;
import modelo.javabean.Region;

public class TestRegionDao {

	public static void main(String[] args) {
	
		IRegionDao rdao = new RegionDaoImplMy8Jdbc();
		
		for (Region ele:rdao.finadAll())
			System.out.println(ele);

	}

}
