package views;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;

import javax.swing.JTextField;

import controller.Controlador;

import javax.swing.JTable;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class Vista_Clientes extends JPanel {
	
	private JButton btnAniadirCli;
	private JButton btnModificar;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table_1;
	
	public Vista_Clientes() {
		
		setLayout(null);
		
		this.setSize(1920, 1080);
		
		btnAniadirCli = new JButton("A\u00D1ADIR");
		btnAniadirCli.setBackground(UIManager.getColor("Button.background"));
		btnAniadirCli.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		btnAniadirCli.setBounds(21, 160, 175, 28);
		add(btnAniadirCli);
		
		btnModificar = new JButton("RESUMEN");
		btnModificar.setBackground(UIManager.getColor("Button.background"));
		btnModificar.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		btnModificar.setBounds(21, 199, 175, 28);
		add(btnModificar);
		
		JLabel lblTituloModulo = new JLabel("Clientes ...");
		lblTituloModulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblTituloModulo.setBounds(39, 362, 140, 28);
		add(lblTituloModulo);
		
		JPanel panelAñadir = new JPanel();
		panelAñadir.setBounds(214, 21, 526, 348);
		add(panelAñadir);
		panelAñadir.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NOMBRE:");
		lblNewLabel.setFont(new Font("Cambria Math", Font.PLAIN, 14));
		lblNewLabel.setToolTipText("");
		lblNewLabel.setBounds(30, 61, 82, 28);
		panelAñadir.add(lblNewLabel);
		
		JLabel lblApellido = new JLabel("APELLIDO:");
		lblApellido.setToolTipText("");
		lblApellido.setFont(new Font("Cambria Math", Font.PLAIN, 14));
		lblApellido.setBounds(30, 99, 82, 28);
		panelAñadir.add(lblApellido);
		
		JLabel lblEmail = new JLabel("EMAIL:");
		lblEmail.setToolTipText("");
		lblEmail.setFont(new Font("Cambria Math", Font.PLAIN, 14));
		lblEmail.setBounds(40, 137, 73, 28);
		panelAñadir.add(lblEmail);
		
		JLabel lblFechaNacimiento = new JLabel("F.NACIMIENTO:");
		lblFechaNacimiento.setToolTipText("");
		lblFechaNacimiento.setFont(new Font("Cambria Math", Font.PLAIN, 14));
		lblFechaNacimiento.setBounds(20, 175, 153, 28);
		panelAñadir.add(lblFechaNacimiento);
		
		JLabel lblDireccion = new JLabel("DIRECCION:");
		lblDireccion.setToolTipText("");
		lblDireccion.setFont(new Font("Cambria Math", Font.PLAIN, 14));
		lblDireccion.setBounds(30, 213, 92, 28);
		panelAñadir.add(lblDireccion);
		
		JLabel lblTelefono = new JLabel("TELEFONO:");
		lblTelefono.setToolTipText("");
		lblTelefono.setFont(new Font("Cambria Math", Font.PLAIN, 14));
		lblTelefono.setBounds(30, 250, 92, 28);
		panelAñadir.add(lblTelefono);
		
		JLabel lblNewLabel_1 = new JLabel("DATOS CLIENTE");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(196, 10, 182, 28);
		panelAñadir.add(lblNewLabel_1);
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnGuardar.setBackground(UIManager.getColor("Button.background"));
		btnGuardar.setBounds(89, 310, 158, 28);
		panelAñadir.add(btnGuardar);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCancelar.setBackground(UIManager.getColor("Button.background"));
		btnCancelar.setBounds(289, 310, 158, 28);
		panelAñadir.add(btnCancelar);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(123, 211, 376, 26);
		panelAñadir.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(123, 251, 376, 26);
		panelAñadir.add(textField_5);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(123, 175, 376, 26);
		panelAñadir.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(123, 137, 376, 26);
		panelAñadir.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(123, 99, 376, 26);
		panelAñadir.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(123, 61, 376, 26);
		panelAñadir.add(textField_3);
		
		JPanel panelResumen = new JPanel();
		panelResumen.setBounds(214, 21, 526, 348);
		add(panelResumen);
		
		table_1 = new JTable();
		panelResumen.add(table_1);
	}
	
	public void setControlador(Controlador controlador) {
		btnAniadirCli.addActionListener(controlador);
		btnModificar.addActionListener(controlador);
		textField_4.addActionListener(controlador);
		textField_5.addActionListener(controlador);
		textField.addActionListener(controlador);
		textField_1.addActionListener(controlador);
		textField_2.addActionListener(controlador);
		textField_3.addActionListener(controlador);
		
	}
}


