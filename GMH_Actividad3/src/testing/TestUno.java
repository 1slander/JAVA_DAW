package testing;

import java.time.LocalDate;

import javabean.Banco;
import javabean.Cliente;
import javabean.DireccionCliente;
import javabean.Factura;
import javabean.Pais;
import javabean.Pedido;
import javabean.TarjetaBancaria;

public class TestUno {

	public static void main(String[] args) {
		
		Pais esp = new Pais(123,"España");
		Pais uk = new Pais(145, "Reino Unido");
		
		Banco banco1 = new Banco(1001,"BBVA", esp);
		Banco banco2 = new Banco(1230, "Lloyds", uk);
		
		TarjetaBancaria tarjeta1=new TarjetaBancaria(5444544454445444L,2027,05,444,"John Freeman",banco2);
		TarjetaBancaria tarjeta2=new TarjetaBancaria(4444444444444444L, 2030, 07, 333, "Pedro Gomez Gomez", banco1);
		
		DireccionCliente dir1 = new DireccionCliente("123 London road","Ipswich","Suffolk",uk);
		
		Cliente cliente1 = new Cliente("4541","John","jfreeman@gmail.com",LocalDate.of(2020, 06, 23),dir1,tarjeta1);
		
		Pedido pedido1 = new Pedido(100, LocalDate.of(2025, 01, 22), "En proceso", cliente1);
		
		Factura factura1 = new Factura("100ES", "Lote de quesos y jamones", LocalDate.of(2025, 01, 22), pedido1);
		
		System.out.println("Obtener: ");
		
		System.out.println("La descripción de la Factura");
		System.out.println(factura1.getDescripcion());
		
		System.out.println("La fecha y el estado del pedido");
		System.out.println("La fecha: " + factura1.getPedido().getCreatedAt() + " Estado del pedido: " + factura1.getPedido().getEstado());

		System.out.println("El nombre del cliente de ese pedido de esa factura");
		System.out.println(factura1.getPedido().getCliente().getNombre());
		
		System.out.println("La dirección del cliente del pedido de la factura");
		System.out.println(factura1.getPedido().getCliente().getDireccion());
		
		System.out.println("El número de tarjeta del cliente del pedido de la factura");
		System.out.println(factura1.getPedido().getCliente().getTarjeta().getNumero());
		

		System.out.println("El nombre del titular de la tarjeta del cliente del pedido de la factura");
		System.out.println(factura1.getPedido().getCliente().getTarjeta().getTitularTarjeta());
		
		System.out.println("El nombre del banco de la tarjeta del cliente del pedido de la factura");
		System.out.println(factura1.getPedido().getCliente().getTarjeta().getBanco().getNombre());
		
		System.out.println("El país del banco de la tarjeta del cliente del pedido de la factura");
		System.out.println(factura1.getPedido().getCliente().getTarjeta().getBanco().getPaisOpera().getNombre());
		
		System.out.println("El país de la dirección del cliente del pedido de la factura");
		System.out.println(factura1.getPedido().getCliente().getDireccion().getPais().getNombre());
		
		
		
		
		
	
	}

}
