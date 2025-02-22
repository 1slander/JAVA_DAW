package testingdao;

import javabean.Country;
import javabean.Region;
import negocio.CountryDaoImpleList;
import negocio.ICountryDao;
import negocio.IRegionDao;
import negocio.RegionDaoImplList;

public class TestCountryDao {
	
	private static ICountryDao iCountryDao = new CountryDaoImpleList();
	private static IRegionDao iRegionDao = new RegionDaoImplList();
	private static int count=0;

	public static void main(String[] args) {
		
		//todos();
		
		//empiezaPor();
		
		//porRegion();		
		
		alta();
		
		
		
		
	
		

	}
	
	
		
	public static void todos()
	{
		System.out.println("\n LISTADO DE FIND ALL");
		/**
		for(Country country : iCountryDao.findAll()) {
			System.out.println(country);
			
		}
		**/
		
		iCountryDao.findAll().forEach(System.out::println);
	}
	
	public static void alta() {
		Country pais = new Country("IR", "Irlanda", iRegionDao.findById(1) );
		
		iCountryDao.insertOne(pais);
		todos();
	}
	
	public static void empiezaPor() {
System.out.println("\n LISTADO DE EMPIEZAN EN");
		
		for(Country country : iCountryDao.buscarPorEmpiezaEnName("E")) {
			
			System.out.println(country);
			count++;
		}
			if(count == 0)
				System.out.println("No hay paises para esta seleccion.");
		
		
	}
	
	public static void porRegion() {
		System.out.println("\n LISTADO DE UNA REGION");
		
		count =0;
		int regiondId = 7;
		
		Region region = iRegionDao.findById(regiondId);
		if(region == null ) {
			System.out.println("Region no exiate");
		} else {
		for(Country country : iCountryDao.buscarPorRegion(1)) {
			System.out.println(country);
			count++;
		}
			if(count == 0)
				System.out.println("No hay regiones para esta seleccion.");
		}
	}
}
	
	


