package javabean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import negocio.IFiguras;


@AllArgsConstructor
@NoArgsConstructor
@Data


public class Cuadrado implements IFiguras, Comparable<Cuadrado> {
	
	private double lado;

	@Override
	public double area() {
		
		return lado * lado;
	}

	@Override
	public double perimetro() {
	
		return lado * 4;
	}

	@Override
	public double volumen() {
		
		return lado + lado;
	}

	@Override
	public int compareTo(Cuadrado o) {
		
		if(this.lado == o.lado)
			return 0;
		if(this.lado < o.lado)
			return -1;
		else
			return 1;
	}
	

}
