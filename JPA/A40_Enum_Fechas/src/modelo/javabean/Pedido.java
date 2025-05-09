package modelo.javabean;

import java.time.LocalDate;

public class Pedido {
	
	private int idPedido;
	private LocalDate fechaAlta;
	private EEstadoPedido estado;
	
	
	public Pedido(int idPedido, LocalDate fechaAlta, EEstadoPedido estado) {
		super();
		this.idPedido = idPedido;
		this.fechaAlta = fechaAlta;
		this.estado = estado;
	}
	
	public Pedido() {
		super();
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public EEstadoPedido getEstado() {
		return estado;
	}

	public void setEstado(EEstadoPedido estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", fechaAlta=" + fechaAlta + ", estado=" + estado + "]";
	}
	
	

}
