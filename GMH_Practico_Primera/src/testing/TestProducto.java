package testing;

import javabean.Producto;

public class TestProducto {
	
	private static Producto producto1 = new Producto();
	private static Producto producto2 = new Producto(234231,"camiseta pico", 12.50, 20, "S", "blanca");
	private static Producto producto3 = new Producto(234230,"camiseta manga larga", 15.50, 20, "XXL", "azul");
	private static Producto producto4 = new Producto(234229,"polo", 11.50, 20, "XS", "azul marino");
	
	public static void main(String[] args) {
		
		
		
		producto1.setCantidadStock(20);
		producto1.setCodigoDeBarra(234232);
		producto1.setColor("negro");
		producto1.setDescripcion("camiseta slim");
		producto1.setPrecioUnitario(7.99);
		producto1.setTalla("XL");
		
		System.out.println("Producto 1: " + producto1);
		
		//Producto producto2 = new Producto(234231,"camiseta pico", 12.50, 20, "S", "blanca");
		System.out.println("Producto 2: " + producto2);
		//Producto producto3 = new Producto(234230,"camiseta manga larga", 15.50, 20, "XXL", "azul");
		System.out.println("Producto 3: " + producto3);
		//Producto producto4 = new Producto(234229,"polo", 11.50, 20, "XS", "azul marino");
		System.out.println("Producto 4: " + producto4);
		
		
		System.out.println("METODOS CON IVA");
		calcularIva(producto1,4);
		calcularIva(producto2,8);
		calcularIva(producto3,12);
		
		//System.out.println(producto1.precioConIva(4));
		//System.out.println(producto3.precioConIva(8));
		System.out.println("FIN METODOS CON IVA");
		
		System.out.println("METODOS CON AUMENTAR STOCK");
		aumento(producto2,20);
		aumento(producto3,40);
		//System.out.println("Producto 2 : " + producto2);
		//producto2.aumentarStock(20);
		//System.out.println("Producto 2 : " + producto2);
		//System.out.println("Producto 4 : " + producto4);
		//producto4.aumentarStock(15);
		//System.out.println("Producto 4 : " + producto4);
		System.out.println("FIN METODOS CON AUMENTAR STOCK");
		
		System.out.println("METODOS CON DISMINUIR STOCK");
		disminuir(producto2,10);
		disminuir(producto3,61);
		disminuir(producto1,15);
		//System.out.println("Producto 2 : " + producto2);
		//producto2.disminuirStock(30);
		//System.out.println("Producto 2 : " + producto2);
		//System.out.println("Producto 1 : " + producto1);
		//producto1.disminuirStock(25); // false cantidadStock = 20
		//System.out.println("Producto 1 : " + producto1);
		System.out.println("FIN METODOS CON DISMINUIR STOCK");
		
		String [] tallas = {"XL","S","L","XXL","XS","XXL","M"};
		
		for (String talla : tallas) {
			producto3.setTalla(talla);
			System.out.println("El precio previo a precio aplicado es: " + producto3.getPrecioUnitario());
			System.out.println("El precio aplicada para la talla " + talla + " es " + producto3.precioAplicado());
			
		}
		
	
		

	}
	
	public static void calcularIva(Producto producto,int iva) {
		System.out.println(producto.precioConIva(iva));
	}
	
	public static void aumento(Producto producto, int cantidad) {
		System.out.println("Producto: " + producto.getCantidadStock());
		producto.aumentarStock(cantidad);
		System.out.println("Producto aumentado: " + producto.getCantidadStock() );
	}
	
	public static void disminuir(Producto producto,int cantidad) {
		System.out.println("Producto: " + producto.getCantidadStock());
		producto.disminuirStock(cantidad);
		System.out.println("Producto disminuido: " + producto.getCantidadStock() );
		
	}
	


}
