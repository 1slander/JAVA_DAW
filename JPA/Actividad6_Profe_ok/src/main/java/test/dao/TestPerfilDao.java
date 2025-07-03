package test.dao;

import modelo.dao.IPerfilDao;
import modelo.dao.PerfilDaoImpJpa;
import modelo.entities.Perfil;

public class TestPerfilDao {
	
	private static IPerfilDao pdao;
	private static Perfil per1;
	
	static {
		pdao=new PerfilDaoImpJpa();
		per1=new Perfil();
		per1.setNombre("Becario");
		per1.setTasaStandard(80.00);
	}

	public static void main(String[] args) {
		//todos();
		//uno();
		//insertar();
		//actualizar();
		//borrar();
	}
	
	public static void todos() {
		for(Perfil ele : pdao.findAll())
			System.out.println(ele);
		
	}
	public static void uno() {
		
		System.out.println(pdao.findById(2));
		
	}
	public static void insertar() {
		
		
		System.out.println(pdao.insert(per1));
		
		
	}
	public static void actualizar() {
		
		Perfil per2 = pdao.findById(7);
		per2.setTasaStandard(85.00);
		
		
		System.out.println(pdao.update(per2));
		
	}
	public static void borrar() {
		System.out.println(pdao.deletebyId(7));
	}

}
