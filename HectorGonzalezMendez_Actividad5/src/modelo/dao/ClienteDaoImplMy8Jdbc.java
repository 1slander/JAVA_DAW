package modelo.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.javabeans.Cliente;

public class ClienteDaoImplMy8Jdbc extends AbsGenericoDaoImpl implements IClienteDao {
	
	public ClienteDaoImplMy8Jdbc() {
		
	}

	@Override
	public int altaCliente(Cliente cliente) {
		sql="INSERT INTO clientes(cif,nombre,apellidos,domicilio,facturacion_anual,numero_empleados) VALUES (?,?,?,?,?,?)";
		filas=0;
		
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, cliente.getCif());
			ps.setString(2, cliente.getNombre());
			ps.setString(3, cliente.getApellidos());
			ps.setString(4, cliente.getDomicilio());
			ps.setDouble(5, cliente.getFacturacionAnual());
			ps.setInt(6, cliente.getNumeroEmpleados());
			
			filas=ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			filas=0;
		}
		
		return filas;
	}

	@Override
	public List<Cliente> mostrarTodos() {
		 sql="SELECT * FROM clientes";
		 List<Cliente> aux = new ArrayList<Cliente>();
		 
		 try {
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				Cliente cliente = new Cliente();
				
				cliente.setCif(rs.getString("cif"));
				cliente.setNombre(rs.getString("nombre"));
				cliente.setApellidos(rs.getString("apellidos"));
				cliente.setDomicilio(rs.getString("domicilio"));
				cliente.setFacturacionAnual(rs.getDouble("facturacion_anual"));
				cliente.setNumeroEmpleados(rs.getInt("numero_empleados"));
				
				aux.add(cliente);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aux;
	}

	@Override
	public Cliente buscarUno(String cif) {
		sql="SELECT * FROM clientes WHERE cif=?";
		Cliente cliente=null;
		
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, cif);
			rs=ps.executeQuery();
			
			if(rs.next()) {
				cliente=new Cliente();
				cliente.setCif(rs.getString("cif"));
				cliente.setNombre(rs.getString("nombre"));
				cliente.setApellidos(rs.getString("apellidos"));
				cliente.setDomicilio(rs.getString("domicilio"));
				cliente.setFacturacionAnual(rs.getDouble("facturacion_anual"));
				cliente.setNumeroEmpleados(rs.getInt("numero_empleados"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cliente;
	}

	@Override
	public int eliminarUnCliente(String cif) {
		sql="DELETE FROM clientes WHERE cif=?";
		filas=0;
		
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, cif);
			filas=ps.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			filas=-1;
		}
		
		return filas;
	}

	@Override
	public String exportarFichero() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String importarFichero() {
		// TODO Auto-generated method stub
		return null;
	}

}
