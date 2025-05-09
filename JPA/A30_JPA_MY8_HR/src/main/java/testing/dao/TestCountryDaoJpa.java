package testing.dao;

import modelo.dao.CountryDaoImplJpaMy8;
import modelo.dao.ICountryDao;
import modelo.dao.IRegionDao;
import modelo.dao.RegionDaoImplJpaMy8;
import modelo.entities.Country;

public class TestCountryDaoJpa {
	
	private static ICountryDao cdao;
	private static IRegionDao rdao;
	
	static {
		cdao = new CountryDaoImplJpaMy8();
		rdao=new RegionDaoImplJpaMy8();
	}

	public static void main(String[] args) {
		
		findOne();
		//findAll();
		//findByRegion();
		//insertOne();
		
		
		

	}
	
	public static void findOne() {
		System.out.println(cdao.findById("AR"));
	}
	
	public static void findAll() {
		for(Country ele: cdao.finadAll())
			System.out.println(ele);
		
	}
	public static void findByRegion() {
		for(Country ele: cdao.findByRegion(2))
			System.out.println(ele);
		
	}
	public static void insertOne() {
		
		Country spain = new Country("SP", "España", rdao.findById(1));
		System.out.println(cdao.insertOne(spain));
		
	}

}
