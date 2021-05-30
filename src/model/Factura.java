package model;

import java.util.Date;

public class Factura {
	
	private int idFactura;
	private int idPedido;
	private int idCliente;
	private double importeFactura;
	private Date fechaFactura;
	
	public Factura(int idFactura, int idPedido, int idCliente, double importeFactura, Date fechaFactura) {
		super();
		this.idFactura = idFactura;
		this.idPedido = idPedido;
		this.idCliente = idCliente;
		this.importeFactura = importeFactura;
		this.fechaFactura = fechaFactura;
	}

	public int getIdFactura() {
		return idFactura;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public double getImporteFactura() {
		return importeFactura;
	}

	public Date getFechaFactura() {
		return fechaFactura;
	}

	@Override
	public String toString() {
		return "Código Factura: " + idFactura + "\n Código Pedido: " + idPedido + "\n Código Cliente: " + idCliente
				+ "\n Importe: " + importeFactura + "\n Fecha Facturación: " + fechaFactura;
	}
	
	

}
