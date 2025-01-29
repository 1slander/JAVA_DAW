package testing;

import javabean.Cuadrado;
import javabean.Rectangulo;

public class TestFiguras {

	public static void main(String[] args) {
		
		Cuadrado cua1 = new Cuadrado(8);
		Rectangulo rec1=new Rectangulo(6,3);
		
		System.out.println("Perimetro: ");
		System.out.println(cua1.perimetro());
		System.out.println(rec1.perimetro());
		
		String nombre = "tomas";
		String nombre2 = "Tomas";
		
		System.out.println(nombre.compareTo(nombre2));
		
		Integer num1 = 7;
		Integer num2=3;
		
		System.out.println(num1.compareTo(num2));
	}

}
