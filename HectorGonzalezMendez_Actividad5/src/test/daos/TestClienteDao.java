package test.daos;

import modelo.dao.ClienteDaoImplMy8Jdbc;
import modelo.dao.IClienteDao;
import modelo.javabeans.Cliente;

public class TestClienteDao {
	
	private static IClienteDao clDao;
	
	static {
		clDao=new ClienteDaoImplMy8Jdbc();
	}

	public static void main(String[] args) {
		//findAll();
		//findOne();
		//insertOne();
		//deleteOne();
	}
	
	public static void findAll() {
		System.out.println("Todos:");
		for(Cliente ele: clDao.mostrarTodos())
			System.out.println(ele);
	}
	
	public static void findOne() {
		System.out.println("Encontrar uno por cif:");
		System.out.println("El cliente con cif A11111111 existe: " + clDao.buscarUno("A11111111"));//Eva
		System.out.println("El cliente con cif A11111119  NO existe: " + clDao.buscarUno("A11111119"));// Null
		
	}
	
	public static void insertOne() {
		System.out.println("Insertar un cliente: ");
		
		Cliente cliente = new Cliente("H9999999", "Hector", "Gonzalez Mendez", "Lanzarote", 20000000.99, 50);
		System.out.println("Cliente insertado me espero un 1: " + clDao.altaCliente(cliente));
		
		Cliente cliente2 = new Cliente("A11111111", "Hector", "Gonzalez Mendez", "Lanzarote", 20000000.99, 50);
		System.out.println("Cliente Duplicado me espero un 0: " + clDao.altaCliente(cliente2));
		
		
	}
	
	public static void deleteOne() {
		
		switch(clDao.eliminarUnCliente("H9999999")) {
		case 1:
			System.out.println("Borrado");
			break;
		case 0:
			System.out.println("No existe");
			break;
		default:
			System.out.println("No se puede borrar porque hay clientes asociados a proyectos");
		}
		
	}

}
