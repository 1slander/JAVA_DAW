package testing;

import javabean.Cuenta;

public class TestCuenta {
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_RESET = "\u001B[0m";
	
	public static void main(String[] args) {
		
	
	

		Cuenta cuenta1 = new Cuenta(1000,"AHORRO","Eva Goma",1500);
		Cuenta cuenta2 = new Cuenta(2000,"NOMINA","Carlos Lopez",1000);
		
		System.out.println("ABONO DE 1000");
		
		cuenta1.abono(1000);//Saldo= 2500
		System.out.println(cuenta1);
		
		System.out.println("EXTRACTO DE 300");
		System.out.println(cuenta1.extraer(300)); // saldo = 2200;
		
		System.out.println("EXTRACTO DE 5000");
		System.out.println(cuenta1.extraer(5000)); // false
		
		System.out.println("mi saldo ahora es 2.200: " + cuenta1.getSaldo()); //saldo = 2200
		
		System.out.println("TRANSFERENCIA DE  1000");
		
		System.out.println(cuenta1.transferir(cuenta2, 1000)); //true
		System.out.println(cuenta1);//1200
		System.out.println(cuenta2);//2000

System.out.println(ANSI_RED + "TRANSFERENCIA FALLIDA" + ANSI_RESET);
		
		System.out.println(cuenta1.transferir(cuenta2, 5000)); //false
		System.out.println(cuenta1);//1200
		System.out.println(cuenta2);//2000
	
		
		
		
	}
	
	

}
