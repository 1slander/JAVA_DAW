package testing;

import javabean.Automovil;

public class TesteEjercicio1Automovil {

	public static void main(String[] args) {
		
		Automovil car1 = new Automovil("Renault", "2023", 85, "gasolina", "ciudad",3, 4, 140, Automovil.Color.NEGRO, 100);
		
		System.out.println(car1.toString());
		
		System.out.println(car1.tiempoEstimadoDeLlegada(500));
		
		car1.acelerar(20); //velocidadActual 120
		System.out.println("1 La velocidad actual: " + car1.getVelocidadActual());
		car1.desacelerar(50); //velocidadActual 70
		System.out.println("2 La velocidad actual: " + car1.getVelocidadActual());
		car1.frenar(); // parado
		System.out.println("3 La velocidad actual: " + car1.getVelocidadActual());
		System.out.println(car1.tiempoEstimadoDeLlegada(500));
		
		car1.mostrarAtributos();
		

	}
	
	

}
