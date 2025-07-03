package test.dao;

import modelo.dao.DepartamentoDaoImpJpa;
import modelo.dao.IDepartamentoDao;
import modelo.entities.Departamento;

public class TestDepartamentoDao {
	
	private static IDepartamentoDao ddao;
	
	static {
		ddao = new DepartamentoDaoImpJpa();
	}

	public static void main(String[] args) {
		//uno();
		//todos();
		//insertar();
		//actualizar();
		borrar();

	}
	
	public static void uno() {
	System.out.println(ddao.findById(10));
	}
	public static void todos() {
		for(Departamento ele : ddao.findAll())
			System.out.println(ele);
			
		}
	public static void insertar() {
		Departamento dep1 = new Departamento();
		dep1.setIdDepar(50);
		dep1.setNombre("Atencion Cliente");
		dep1.setDireccion("Valencia");
		
		System.out.println(ddao.insert(dep1));
			
		}
	public static void actualizar() {
		Departamento dep1 = ddao.findById(50);
		dep1.setNombre("Marketing");
		dep1.setDireccion("Barcelona");
		
		System.out.println(ddao.update(dep1));
			
		}
	
	public static void borrar() {
		
		System.out.println(ddao.deletebyId(50));
			
		}

}
