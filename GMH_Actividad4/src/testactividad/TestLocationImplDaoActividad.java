package testactividad;

import javabean.Location;
import negocio.ILocationDao;
import negocio.LocationDaoImplList;

public class TestLocationImplDaoActividad {

	public static void main(String[] args) {
		
		ILocationDao iLocationDao = new LocationDaoImplList();
		
		
			
			System.out.println(" BUSCAR POR CITY");
			for (Location ele: iLocationDao.buscarPorCity("Madrid")) {
				System.out.println(ele);
			}
			
			
			
			System.out.println(" BUSCAR POR POSTAL CODE");
			
			for (Location ele: iLocationDao.buscarPorPostalCode("19002")) {
				System.out.println(ele);
			}
			
			
			
			
			System.out.println(" BUSCAR POR COUNTRY");
			
			for (Location ele: iLocationDao.buscarPorPais("Argentina")) {
				System.out.println(ele);
			}
			
			

	}

}
