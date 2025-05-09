package testing.dao;

import modelo.dao.IRegionDao;
import modelo.dao.RegionDaoImplJpaMy8;
import modelo.entities.Region;

public class TestRegionDaoJpa {
	
	private static IRegionDao rdao;
	
	static {
		rdao=new RegionDaoImplJpaMy8();
	}

	public static void main(String[] args) {
		//uno();
		todos();
		//insertar();
		//modificar();
		//delete();
	}
	
	public static void uno() {
		System.out.println("leer region 1 : " + rdao.findById(1));
	}
	public static void todos() {
		for(Region ele:rdao.finadAll()) {
		System.out.println(ele);
		}
	}
	public static void insertar() {
		Region reg = new Region(90, "Mogollon central");
		
		System.out.println(rdao.insertOne(reg));
	}
	public static void modificar() {
		Region reg = new Region(90, "Mogollon oriental");
		
		System.out.println(rdao.updateOne(reg));
	}
	public static void delete() {
	
		
		System.out.println(rdao.deleteOne(1));
		System.out.println(rdao.deleteOne(90));
		System.out.println(rdao.deleteOne(100));
	}
}
