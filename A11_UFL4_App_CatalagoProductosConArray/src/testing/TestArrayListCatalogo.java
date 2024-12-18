package testing;

import javabean.Producto;
import modelo.CatalogoProductosConArrayList;

public class TestArrayListCatalogo {

	public static void main(String[] args) {
		CatalogoProductosConArrayList milista = new CatalogoProductosConArrayList();
		
		milista.addProducto(new Producto(1005,"falda",123,30,"XS","blanco"));
		
		System.out.println(milista.buscarTodos());

	}

}
