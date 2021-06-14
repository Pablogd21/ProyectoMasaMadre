package model.data;

import java.util.Date;

public class Pedido {
	
	private int idPedido;
	private int idCliente;
	private String descripcionPedido;
	private double importePedido;
	private Date fechaPedido;
	
	public Pedido(int idPedido, int idCliente, String descripcionPedido, double precioPedido, Date fechaPedido) {
		super();
		this.idPedido = idPedido;
		this.idCliente = idCliente;
		this.descripcionPedido = descripcionPedido;
		this.importePedido = precioPedido;
		this.fechaPedido = fechaPedido;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getDescripcionPedido() {
		return descripcionPedido;
	}

	public void setDescripcionPedido(String descripcionPedido) {
		this.descripcionPedido = descripcionPedido;
	}

	public double getPrecioPedido() {
		return importePedido;
	}

	public void setPrecioPedido(double precioPedido) {
		this.importePedido = precioPedido;
	}

	public Date getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	@Override
	public String toString() {
		return "Código Pedido: " + idPedido + "\n Código Cliente: " + idCliente + "\n Descripción Pedido: " + descripcionPedido
				+ "\n Importe: " + importePedido + "\n Fecha Pedido: " + fechaPedido;
	}
	
	

}
