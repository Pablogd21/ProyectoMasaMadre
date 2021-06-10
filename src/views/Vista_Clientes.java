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
import javax.swing.border.BevelBorder;

public class Vista_Clientes extends JPanel {
	private JTextField txtFieldNombre;
	private JTextField txtFieldApellido;
	private JTextField txtFieldEmail;
	private JTextField txtFieldNacimiento;
	private JTextField textFieldDireccion;
	private JTextField txtFieldTelefono;
	private JTable table;
	private JButton btnAnadir, btnResumen, btnModificar,btnEliminar;
	
	
	public Vista_Clientes() {
		
		setLayout(null);
		
		this.setSize(1920, 1080);
		
		JLabel lblTituloModulo = new JLabel("Clientes ...");
		lblTituloModulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		lblTituloModulo.setBounds(79, 736, 213, 69);
		add(lblTituloModulo);
		
		JPanel panelResumen = new JPanel();
		panelResumen.setBounds(385, 55, 1124, 740);
		add(panelResumen);
		panelResumen.setLayout(null);
		
		JLabel lblResumenCliente = new JLabel("Resumen Cliente:");
		lblResumenCliente.setBounds(453, 10, 286, 39);
		lblResumenCliente.setFont(new Font("Tahoma", Font.BOLD, 32));
		panelResumen.add(lblResumenCliente);
		
		table = new JTable();
		table.setBounds(10, 80, 1104, 543);
		panelResumen.add(table);
		
		btnModificar = new JButton("MODIFICAR");
		btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnModificar.setBackground(SystemColor.controlHighlight);
		btnModificar.setBounds(306, 670, 231, 34);
		panelResumen.add(btnModificar);
		
		btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEliminar.setBackground(SystemColor.controlHighlight);
		btnEliminar.setBounds(592, 670, 238, 36);
		panelResumen.add(btnEliminar);
		
		btnAnadir = new JButton("A\u00D1ADIR");
		btnAnadir.setBackground(SystemColor.controlHighlight);
		btnAnadir.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnAnadir.setBounds(25, 336, 330, 84);
		add(btnAnadir);
		
		btnResumen = new JButton("RESUMEN");
		btnResumen.setBackground(SystemColor.controlHighlight);
		btnResumen.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnResumen.setBounds(25, 445, 330, 84);
		add(btnResumen);
		
		JPanel panelAnadir = new JPanel();
		panelAnadir.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelAnadir.setBounds(385, 55, 1124, 740);
		add(panelAnadir);
		panelAnadir.setLayout(null);
		
		JLabel lblNombre = new JLabel("NOMBRE:");
		lblNombre.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblNombre.setToolTipText("");
		lblNombre.setBounds(76, 141, 135, 35);
		panelAnadir.add(lblNombre);
		
		JLabel lblApellido = new JLabel("APELLIDO:");
		lblApellido.setToolTipText("");
		lblApellido.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblApellido.setBounds(55, 230, 142, 35);
		panelAnadir.add(lblApellido);
		
		JLabel lblEmail = new JLabel("EMAIL:");
		lblEmail.setToolTipText("");
		lblEmail.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblEmail.setBounds(76, 320, 116, 37);
		panelAnadir.add(lblEmail);
		
		JLabel lblDatosCliente = new JLabel("DATOS CLIENTE");
		lblDatosCliente.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblDatosCliente.setBounds(491, 28, 288, 50);
		panelAnadir.add(lblDatosCliente);
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnGuardar.setBackground(SystemColor.controlHighlight);
		btnGuardar.setBounds(345, 676, 251, 43);
		panelAnadir.add(btnGuardar);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnCancelar.setBackground(SystemColor.controlHighlight);
		btnCancelar.setBounds(635, 676, 251, 43);
		panelAnadir.add(btnCancelar);
		
		txtFieldNombre = new JTextField();
		txtFieldNombre.setColumns(10);
		txtFieldNombre.setBounds(224, 127, 835, 50);
		panelAnadir.add(txtFieldNombre);
		
		JLabel lblFnacimiento = new JLabel("F.NACIMIENTO:");
		lblFnacimiento.setToolTipText("");
		lblFnacimiento.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblFnacimiento.setBounds(32, 407, 171, 35);
		panelAnadir.add(lblFnacimiento);
		
		JLabel lblDireccion = new JLabel("DIRECCION:");
		lblDireccion.setToolTipText("");
		lblDireccion.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblDireccion.setBounds(48, 496, 171, 35);
		panelAnadir.add(lblDireccion);
		
		JLabel lblTelefono = new JLabel("TELEFONO:");
		lblTelefono.setToolTipText("");
		lblTelefono.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblTelefono.setBounds(55, 580, 171, 35);
		panelAnadir.add(lblTelefono);
		
		txtFieldApellido = new JTextField();
		txtFieldApellido.setColumns(10);
		txtFieldApellido.setBounds(224, 212, 835, 50);
		panelAnadir.add(txtFieldApellido);
		
		txtFieldEmail = new JTextField();
		txtFieldEmail.setColumns(10);
		txtFieldEmail.setBounds(224, 307, 835, 50);
		panelAnadir.add(txtFieldEmail);
		
		txtFieldNacimiento = new JTextField();
		txtFieldNacimiento.setColumns(10);
		txtFieldNacimiento.setBounds(224, 392, 835, 50);
		panelAnadir.add(txtFieldNacimiento);
		
		textFieldDireccion = new JTextField();
		textFieldDireccion.setColumns(10);
		textFieldDireccion.setBounds(224, 481, 835, 50);
		panelAnadir.add(textFieldDireccion);
		
		txtFieldTelefono = new JTextField();
		txtFieldTelefono.setColumns(10);
		txtFieldTelefono.setBounds(224, 574, 835, 50);
		panelAnadir.add(txtFieldTelefono);
	}
	
	public void setControlador(Controlador controlador) {
		btnAnadir.addActionListener(controlador);
		btnResumen.addActionListener(controlador);
		textFieldDireccion.addActionListener(controlador);
		txtFieldTelefono.addActionListener(controlador);
		txtFieldApellido.addActionListener(controlador);
		txtFieldEmail.addActionListener(controlador);
		txtFieldNacimiento.addActionListener(controlador);
		txtFieldNombre.addActionListener(controlador);
		btnModificar.addActionListener(controlador);
		btnEliminar.addActionListener(controlador);
		
	}
}


