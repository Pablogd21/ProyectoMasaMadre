package model.data;

public class DatosFactura {
	private String nombreCliente;
	private String apellidoCliente;
	private String emailCliente;
	private String telefonoCliente;
	private String direccionCliente;
	private String descripcionPedido;
	private int idPedido;
	private double importePedido;
	
	public DatosFactura(String nombreCliente, String apellidoCliente, String emailCliente, String telefonoCliente,
			String direccionCliente, String descripcionPedido, int idPedido, double importePedido) {
		super();
		this.nombreCliente = nombreCliente;
		this.apellidoCliente = apellidoCliente;
		this.emailCliente = emailCliente;
		this.telefonoCliente = telefonoCliente;
		this.direccionCliente = direccionCliente;
		this.descripcionPedido = descripcionPedido;
		this.idPedido = idPedido;
		this.importePedido = importePedido;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public String getApellidoCliente() {
		return apellidoCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public String getTelefonoCliente() {
		return telefonoCliente;
	}

	public String getDireccionCliente() {
		return direccionCliente;
	}

	public String getDescripcionPedido() {
		return descripcionPedido;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public double getImportePedido() {
		return importePedido;
	}
	
}
