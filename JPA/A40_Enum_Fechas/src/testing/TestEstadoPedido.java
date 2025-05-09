package testing;

import java.time.LocalDate;

import modelo.javabean.EEstadoPedido;
import modelo.javabean.Pedido;

public class TestEstadoPedido {

	public static void main(String[] args) {
		Pedido pedido = new Pedido(1, LocalDate.now(), EEstadoPedido.CARRITO);
		
		pedido.setEstado(EEstadoPedido.TERMINADO);
		
		System.out.println(pedido);

	}

}
