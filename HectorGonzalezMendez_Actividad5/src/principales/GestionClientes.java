package principales;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.dao.ClienteDaoImplMy8Jdbc;
import modelo.dao.IClienteDao;
import modelo.javabeans.Cliente;

public class GestionClientes {
	
	private static Scanner leer=new Scanner(System.in);
	private static IClienteDao clDao = new ClienteDaoImplMy8Jdbc();

	public static void main(String[] args) {
		int opcion=0;
		
		do {
			opcion=pintarMenu();
			switch(opcion) {
			case 1: 
				
				System.out.println("Alta de cliente: H9999999 ");
				insertOne();
				break;
			case 2:
				
				System.out.println("Buscar cliente: A11111111 ");
				findOne();
				break;
			case 3:
				
				System.out.println("Mostrar Todos");
				findAll();
				break;
			case 4: 
				
				System.out.println("Eliminar cliente: H9999999");
				deleteOne();
				break;
			case 5:
				
				System.out.println("Exportar a fichero");
				System.out.println(exportar("/Users/hector/repos/exportar.txt"));
				break;
			case 6:
				
				System.out.println("Importar a fichero");
				System.out.println(importar("/Users/hector/repos/exportar.txt"));
				break;

			}
			
		}while(opcion!=7);
			System.out.println("FIN DE LA APLICACION");
		leer.close();

	}
	
public static int pintarMenu() {
		
		int opcion = 0;
		
		System.out.println("1.- Alta");
		System.out.println("2.- Buscar");
		System.out.println("3.- Mostrar todos");
		System.out.println("4.- Eliminar");
		System.out.println("5.- Exportar a fichero");
		System.out.println("6.- Imporar a fichero");
		System.out.println("7.- Salir");
		
		System.out.println("\nTeclea una opcion, 7 para salir");
		opcion = leer.nextInt();
		
		while(opcion <1 || opcion > 7) {
			System.out.println("Opcion incorrecta, validos del 1-4");
			opcion=leer.nextInt();
		}
		
		return opcion;
		
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
	
		//Cliente cliente2 = new Cliente("A11111111", "Hector", "Gonzalez Mendez", "Lanzarote", 20000000.99, 50);
		//System.out.println("Cliente Duplicado me espero un 0: " + clDao.altaCliente(cliente2));
	
	
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

	public static String exportar(String nombreFichero) {
		File fichero = new File(nombreFichero);
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
	
	
		try {
			fos=new FileOutputStream(fichero);
			oos=new ObjectOutputStream(fos);

			List<Cliente> clientes = clDao.mostrarTodos();
			oos.writeObject(clientes);
				return "Clientes bien exportados";
			
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return "Error al exportar";
	} finally {
		try {
			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
			
		}
	}
	
}

	public static List<Cliente> importar(String nombreFichero){
	    File fichero = new File(nombreFichero);
	    List<Cliente> aux = new ArrayList<>();

	    try (FileInputStream fis = new FileInputStream(fichero);
	         ObjectInputStream ois = new ObjectInputStream(fis)) {

	        aux = (List<Cliente>) ois.readObject();  

	    } catch (IOException | ClassNotFoundException e) {
	        e.printStackTrace();
	    }

	    return aux;
	}
}
