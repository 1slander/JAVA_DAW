package testing;

import javabean.Contacto;

public class TestContacto {

	public static void main(String[] args) {
		Contacto con1 = new Contacto("Hector","test@mail.com");
		System.out.println(con1.getName());
	}

}
