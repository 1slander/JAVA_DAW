package testing;

import javabean.Planeta;

public class TestPlaneta {

	public static void main(String[] args) {
		
		Planeta planeta1=new Planeta("Marte", 0, 2350.23, 5343.23, 25432, 258_932_123, Planeta.TipoDePlaneta.TERRESTRE, true);
		Planeta planeta2=new Planeta("X-541Y", 30, 28350.23, 45343.23, 425432, 858_932_123, Planeta.TipoDePlaneta.GASEOSO, false);
		
		planeta1.mostrarDatos();
		planeta2.mostrarDatos();
		 
		System.out.println("La densidad del planeta 1 es " + planeta1.densidad());
		System.out.println("La densidad del planeta 2 es " + planeta2.densidad());
		
		System.out.println("el planeta 1 es " + planeta1.planetaExterno());
		System.out.println("el planeta 2 es " + planeta2.planetaExterno());
	}

}
