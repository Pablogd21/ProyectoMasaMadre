package views;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import controller.Controlador;

import javax.swing.JButton;

public class Vista_Login extends JPanel{
	
	private JButton btnIngresar;
	private JTextField txtPassword;
	private JTextField txtUsuario;
	
	public Vista_Login() {
		setLayout(null);
		
		this.setSize(750, 430 );
		
		JLabel lblUsuario = new JLabel("Usuario: ");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblUsuario.setBounds(418, 106, 196, 22);
		add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(418, 139, 241, 22);
		add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblPassword = new JLabel("Contrase\u00F1a: ");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblPassword.setBounds(418, 196, 196, 22);
		add(lblPassword);
		
		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(418, 229, 241, 22);
		add(txtPassword);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnIngresar.setBounds(445, 276, 196, 34);
		add(btnIngresar);
	}
	
	public void setControlador(Controlador controlador) {
		btnIngresar.addActionListener(controlador);
		txtPassword.addActionListener(controlador);
		txtUsuario.addActionListener(controlador);
		
	}

	public JButton getBtnIngresar() {
		return btnIngresar;
	}

	public JTextField getTxtPassword() {
		return txtPassword;
	}

	public JTextField getTxtUsuario() {
		return txtUsuario;
	}
	
	
}
