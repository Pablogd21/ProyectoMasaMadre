package views;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Vista_Login extends JPanel{
	
	private JButton btnIngresar;
	private JTextField txtPassword;
	private JTextField txtUsuario;
	
	public Vista_Login() {
		
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		Dimension tamanyoPantalla = miPantalla.getScreenSize();
		int altoPantalla = tamanyoPantalla.height;
		int anchoPantalla = tamanyoPantalla.width;
		setSize(1920, 1080);
		setLayout(null);
		
		JLabel logo = new JLabel();
		logo.setIcon(new ImageIcon(".\\images\\Logo.jpg"));
		logo.setBounds(192, 70, 743, 632);
		add(logo);
		
		JLabel lblUsuario = new JLabel("Usuario: ");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblUsuario.setBounds(945, 138, 81, 22);
		add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(955, 181, 268, 20);
		add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblPassword = new JLabel("Contrase\u00F1a: ");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblPassword.setBounds(945, 252, 116, 22);
		add(lblPassword);
		
		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(955, 299, 268, 20);
		add(txtPassword);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnIngresar.setBounds(996, 379, 197, 29);
		add(btnIngresar);
		
		
	}
}
