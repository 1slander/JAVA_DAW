package testing;

import javabean.ConversorMetros;

public class TestConversor {

	public static void main(String[] args) {
		ConversorMetros test1 = new ConversorMetros(250.0);
		
		System.out.println(test1.mToCm());
		System.out.println(test1.mToMm());
		System.out.println(test1.mToFoot());
		System.out.println(test1.mToInch());
		System.out.println(test1.mToYards());
		
		System.out.println(test1.convertir());

	}

}
