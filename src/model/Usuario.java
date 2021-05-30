package model;

public class Usuario {
	
	private String nombreUsuario;
	private String passwordUsuario;
	
	public Usuario(String nombreUsuario, String passwordUsuario) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.passwordUsuario = passwordUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPasswordUsuario() {
		return passwordUsuario;
	}

	public void setPasswordUsuario(String passwordUsuario) {
		this.passwordUsuario = passwordUsuario;
	}
	
}
