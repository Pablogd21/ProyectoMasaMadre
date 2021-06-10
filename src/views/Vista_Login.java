package views;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

import com.sun.xml.internal.ws.api.message.Message;

import controller.Controlador;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Vista_Login extends JPanel{
	
	private JButton btnIngresar;
	private JPasswordField txtPassword;
	private JTextField txtUsuario;
	
	public Vista_Login() {
		setLayout(null);
		
		this.setSize(1920, 1080);
		setBackground(new Color(255,255,255));
		
		JLabel logo = new JLabel();
		logo.setIcon(new ImageIcon(".\\images\\logo.jpg"));
		logo.setBounds(150, 11, 684, 517);
		add(logo);
		
		JLabel curvas = new JLabel();
		curvas.setIcon(new ImageIcon(".\\images\\curvas.png"));
		curvas.setBounds(-12, 367, 1382, 418);
		add(curvas);
		
		
		JLabel lblUsuario = new JLabel("Usuario: ");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		lblUsuario.setBounds(875, 232, 196, 34);
		add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(875, 277, 307, 34);
		add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblPassword = new JLabel("Contrase\u00F1a: ");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		lblPassword.setBounds(875, 322, 196, 34);
		add(lblPassword);
		
		txtPassword = new JPasswordField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(875, 367, 307, 34);
		add(txtPassword);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnIngresar.setBounds(921, 447, 214, 34);
		add(btnIngresar);
	}
	
	public void setControlador(Controlador controlador) {
		btnIngresar.addActionListener(controlador);
		
	}
	
	public void loginIncorrecto() {
		JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos","Fallo de inicio de sesión",JOptionPane.ERROR_MESSAGE);
		vaciarCampos();
	}
	
	public void loginVacio() {
		JOptionPane.showMessageDialog(this, "Introduzca datos para iniciar sesión","Fallo de inicio de sesión",JOptionPane.ERROR_MESSAGE);
		vaciarCampos();
	}
	
	public void vaciarCampos() {
		txtUsuario.setText("");
		txtPassword.setText("");
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
