package testing;

import javabean.Cuenta;

public class TestCuentaVersion2 {
	
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_RESET = "\u001B[0m";
	
	private static Cuenta cuenta1 = new Cuenta(1000,"AHORRO","Eva Goma",1500);
	private static Cuenta cuenta2 = new Cuenta(2000,"NOMINA","Carlos Lopez",1000);

	public static void main(String[] args) {
		abono();
		extractoCorrecta();
		extractoFallida();
		transferenciaCorrecta();
		transferenciaFallida();
	}
	
		public static String print(String frase) {
			return ANSI_RED  + frase + ANSI_RESET;
		}

		public static void abono() {
			cuenta1.abono(1000);//Saldo= 2500
			System.out.println(cuenta1);
		}
		
		public static void extractoCorrecta() {
			System.out.println(print("EXTRACTO DE 300"));
			System.out.println(cuenta1.extraer(300)); // saldo = 2200;
			System.out.println("mi saldo ahora es 2.200: " + cuenta1.getSaldo()); //saldo = 2200
		}
		
		public static void extractoFallida() {
			System.out.println(print("EXTRACTO DE 5000"));
			System.out.println(cuenta1.extraer(5000)); // false
			System.out.println("mi saldo ahora es 2.200: " + cuenta1.getSaldo()); //saldo = 2200
		}
		
		public static void transferenciaCorrecta() {
			System.out.println(print("TRANSFERENCIA DE  1000"));
			
			System.out.println(cuenta1.transferir(cuenta2, 1000)); //true
			System.out.println(cuenta1);//1200
			System.out.println(cuenta2);//2000
		}
		
		public static void transferenciaFallida() {
			System.out.println(print("TRANSFERENCIA FALLIDA"));
			
			System.out.println(cuenta1.transferir(cuenta2, 5000)); //false
			System.out.println(cuenta1);//1200
			System.out.println(cuenta2);//2000
		}

	
	
		
	}


