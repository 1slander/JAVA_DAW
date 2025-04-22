package testing.dao;

import modelo.dao.IRegionDao;
import modelo.dao.RegionDaoImplMy8Jdbc;
import modelo.javabean.Region;

public class TestRegionDao {
	
	private static IRegionDao rdao;
	
	static {
		rdao= new RegionDaoImplMy8Jdbc();
	}

	public static void main(String[] args) {
	
		//findAll();
		//findOne();
		//insertOne();
		//updateOne();
		deleteOne();
		
		
		

	}
	
	public static void findAll() {
		System.out.println("Todos");
		for (Region ele:rdao.finadAll())
			System.out.println(ele);
		
	}
	
	public static void findOne() {
		System.out.println("Find One by ID");
		System.out.println("La region 1 existe: " + rdao.findById(1));
		System.out.println("La region 12 no existe sale null: " + rdao.findById(12));
		
	}
	public static void insertOne() {
		System.out.println("Insert One");
		Region region = new Region(5, "Atantida");
		System.out.println("Region insertada, me espero un 1 : " + rdao.insertOne(region));
		
		Region region2 = new Region(1, "Europa"); 
		System.out.println("Region insertada, me espero un 0 : " + rdao.insertOne(region2));
		
		
	}
	
	public static void updateOne() {
		
		System.out.println("Update One");
		Region region = rdao.findById(5);
		
		if(region != null) {
		region.setRegionName("Castilla la nueva");
		System.out.println("REGION 5 MODIFICADA ESPERO UN 1 : " + rdao.updateOne(region));
		findAll();
		} else {
			System.out.println("La region buscado no existe");
		}
		
	}
	
public static void deleteOne() {
	
	switch (rdao.deleteOne(1)) {
	case 1: System.out.println("Borrado");
	break;
	case 0: System.out.println("No existe");
	break;
	default: System.out.println("No se puede eliminar, porque hay paises con esta region");
	}
		
	
		
	}
	


}
