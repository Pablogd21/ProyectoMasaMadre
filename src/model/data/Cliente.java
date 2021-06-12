package model.data;

import java.util.Date;

public class Cliente {
	
	private int idCliente;
	private String nombreCliente;
	private String apellidoCliente;
	private String emailCliente;
	private String telefonoCliente;
	private Date fechaNaCliente;
	private String direccionCliente;
	
	public Cliente(int idCliente, String nombreCliente, String apellidoCliente, String emailCliente,
			String telefonoCliente, Date fechaNaCliente, String direccionCliente) {
		this.idCliente = idCliente;
		this.nombreCliente = nombreCliente;
		this.apellidoCliente = apellidoCliente;
		this.emailCliente = emailCliente;
		this.telefonoCliente = telefonoCliente;
		this.fechaNaCliente = fechaNaCliente;
		this.direccionCliente = direccionCliente;
	}

	

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getApellidoCliente() {
		return apellidoCliente;
	}

	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	public String getTelefonoCliente() {
		return telefonoCliente;
	}

	public void setTelefonoCliente(String telefonoCliente) {
		this.telefonoCliente = telefonoCliente;
	}

	public Date getFechaNaCliente() {
		return fechaNaCliente;
	}

	public void setFechaNaCliente(Date fechaNaCliente) {
		this.fechaNaCliente = fechaNaCliente;
	}

	public String getDireccionCliente() {
		return direccionCliente;
	}

	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}

	@Override
	public String toString() {
		return "Código Cliente: " + idCliente + "\n Nombre: " + nombreCliente + "\n Apellido: "
				+ apellidoCliente + "\n Email: " + emailCliente + "\n Telefono: " + telefonoCliente
				+ "\n Fecha Nacimiento: " + fechaNaCliente + "\n Dirección: " + direccionCliente;
	}
	
	
}
