package model.data;

public class Pedido {
	
	private int idPedido;
	private int idCliente;
	private String descripcionPedido;
	private String importePedido1;
	private double importePedido;
	private String fechaPedido;
	
	public Pedido(int idPedido, String descripcionPedido, String fechaPedido, int idCliente, double precioPedido) {
		this.idPedido = idPedido;
		this.idCliente = idCliente;
		this.descripcionPedido = descripcionPedido;
		this.importePedido = precioPedido;
		this.fechaPedido = fechaPedido;
	}
	
	public Pedido(int idCliente, String descripcionPedido, double precioPedido, String fechaPedido) {
		this.idCliente = idCliente;
		this.descripcionPedido = descripcionPedido;
		this.importePedido = precioPedido;
		this.fechaPedido = fechaPedido;
	}
	
	public Pedido() {
		// TODO
	}

	public Pedido(int idPedido, String descripcionPedido, String fechaPedido, int idCliente, String precioPedido1) {
		this.idPedido = idPedido;
		this.idCliente = idCliente;
		this.descripcionPedido = descripcionPedido;
		this.importePedido1 = precioPedido1;
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

	public String getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(String fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public String getImportePedido1() {
		return importePedido1;
	}

	@Override
	public String toString() {
		return "Código Pedido: " + idPedido + "\n Código Cliente: " + idCliente + "\n Descripción Pedido: " + descripcionPedido
				+ "\n Importe: " + importePedido + "\n Fecha Pedido: " + fechaPedido;
	}
	
	

}
