package modelo.dao;

import java.util.List;

import modelo.javabeans.Cliente;

public interface IClienteDao {
	int altaCliente(Cliente cliente);
	List<Cliente> mostrarTodos();
	Cliente buscarUno(String cif);
	int eliminarUnCliente(String cif);
	String exportarFichero();
	String importarFichero();
	

}
