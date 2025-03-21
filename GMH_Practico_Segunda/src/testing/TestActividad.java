package testing;

import java.util.List;

import javabean.Familia;
import javabean.Producto;
import javabean.Proveedor;
import negocio.CatalogoProductosImpl;
import negocio.ICatalogo;



public class TestActividad {
	
	private static ICatalogo iCatalog = new CatalogoProductosImpl();

	public static void main(String[] args) {	
		buscarTodos();
		buscarUno(1);
		buscarPorFamilia(1);
		buscarPorPrecioMayorQue(50.0);
		buscarPorDescripcion("mujer");
		buscarPorProovedor("101");
		
	}
	
	public static void buscarTodos() {
		System.out.println("\nListado de Productos");
		
		List<Producto> listaProductos = iCatalog.buscarTodos();
		
		for(Producto ele : listaProductos)
			System.out.println(ele);
		
		
	}
	
	public static void buscarUno(long idProducto) {
		System.out.println("\nBuscando Un Producto");
		
		Producto producto = iCatalog.buscarUno(idProducto);
		
		

			System.out.println("Hemos encontrado este producto: " + producto);
		
		
	}
	
	public static void buscarPorFamilia(int idFamilia) {
		System.out.println("\nListado de Productos por familia");
		
		List<Producto> listaProductos = iCatalog.productosPorFamilia(idFamilia);
		
		for(Producto ele : listaProductos)
			System.out.println(ele);
		
		
	}
	
	public static void buscarPorPrecioMayorQue(double precio) {
		System.out.println("\nListado de Productos por precio mayor que");
		
		List<Producto> listaProductos = iCatalog.productosPorPrecioMayorQue(precio);
		
		for(Producto ele : listaProductos)
			System.out.println(ele);
		
		
	}
	
	
	public static void buscarPorDescripcion(String subcadena) {
		System.out.println("\nListado de Productos por descripcion larga");
		
		List<Producto> listaProductos = iCatalog.productosPorDescripcionLarga(subcadena);
		
		for(Producto ele : listaProductos)
			System.out.println(ele);
		
		
	}
	
	public static void buscarPorProovedor(String cif) {
		System.out.println("\nListado de Productos por proovedor");
		
		List<Producto> listaProductos = iCatalog.productosPorProveedor(cif);
		
		for(Producto ele : listaProductos)
			System.out.println(ele);
		
		
	}
	
	
	
}
