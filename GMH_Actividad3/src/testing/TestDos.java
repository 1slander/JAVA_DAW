package testing;

import java.time.LocalDate;
import java.util.ArrayList;

import javabean.Banco;
import javabean.Cliente2;
import javabean.DireccionCliente;
import javabean.Factura;
import javabean.Pais;
import javabean.Pedido;
import javabean.TarjetaBancaria;

/**
 * Clase donde realizaremos los siguientes test con ArrayList.
 * @author Hector Gonzalez
 * @version 1.0
 */

public class TestDos {

	public static void main(String[] args) {
		Pais esp = new Pais(123,"España");
		Pais uk = new Pais(145, "Reino Unido");
		
		Banco banco1 = new Banco(1001,"BBVA", esp);
		Banco banco2 = new Banco(1230, "Lloyds", uk);
		
		TarjetaBancaria tarjeta1=new TarjetaBancaria(5444544454445444L,2027,05,444,"John Freeman",banco2);
		TarjetaBancaria tarjeta2=new TarjetaBancaria(4444444444444444L, 2030, 07, 333, "John Freeman", banco1);
		
		DireccionCliente dir1 = new DireccionCliente("123 London road","Ipswich","Suffolk",uk);
		
		Cliente2 cliente1 = new Cliente2("4541","John","jfreeman@gmail.com",LocalDate.of(2020, 06, 23),dir1,new ArrayList<TarjetaBancaria>());
		
		cliente1.getTarjeta().add(tarjeta1);
		cliente1.getTarjeta().add(tarjeta2);
		
		System.out.println(cliente1.getTarjeta());
		
		System.out.println("Tarjetas del cliente: " + cliente1.getNombre());
		for (TarjetaBancaria tarjeta : cliente1.getTarjeta()) {
			System.out.println("Banco de la tarjeta: " + tarjeta.getBanco().getNombre());
			System.out.println("Pais del banco de la tarjeta: " + tarjeta.getBanco().getPaisOpera().getNombre());
			
		}
	}

}
