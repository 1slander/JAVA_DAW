package testing;

import javabean.Producto;
import modelo.CatalogoProductos;

public class TestCatalogo {

	public static void main(String[] args) {
		CatalogoProductos ofertas = new CatalogoProductos();
		Producto prueba= new Producto(1005,"falda",123,30,"XS","blanco");
		
		System.out.println(ofertas.size());
		ofertas.add(new Producto(1001,"camisa",123,30,"XS","blanco"));
		ofertas.add(new Producto(1002,"pantalon",123,30,"XL","negro"));
		
		for (Producto ele: ofertas.findAll())
			System.out.println(ele);
		
		Producto prod3 = ofertas.get(1);
		prod3.setTalla("M");
		prod3.setColor("Azul");
		ofertas.set(1, prod3);
		

		for (Producto ele: ofertas.findAll())
			System.out.println(ele);
		
		System.out.println(ofertas.indexOf(prod3));
		

	}

}
