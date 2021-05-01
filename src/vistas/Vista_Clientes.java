package vistas;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Vista_Clientes extends JPanel {
	
	private JButton btnAniadirCli;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnResumen;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	public Vista_Clientes() {
		setLayout(null);
		
		this.setSize(750, 430 );
		
		btnAniadirCli = new JButton("A\u00D1ADIR");
		btnAniadirCli.setBackground(Color.BLACK);
		btnAniadirCli.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		btnAniadirCli.setBounds(23, 64, 175, 28);
		add(btnAniadirCli);
		
		btnModificar = new JButton("MODIFICAR");
		btnModificar.setBackground(Color.BLACK);
		btnModificar.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		btnModificar.setBounds(23, 103, 175, 28);
		add(btnModificar);
		
		btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setBackground(Color.BLACK);
		btnEliminar.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		btnEliminar.setBounds(23, 142, 175, 28);
		add(btnEliminar);
		
		btnResumen = new JButton("RESUMEN");
		btnResumen.setBackground(Color.BLACK);
		btnResumen.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		btnResumen.setBounds(23, 181, 175, 28);
		add(btnResumen);
		
		JLabel lblTituloModulo = new JLabel("Clientes ...");
		lblTituloModulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblTituloModulo.setBounds(39, 362, 140, 28);
		add(lblTituloModulo);
		
		JPanel panel = new JPanel();
		panel.setBounds(214, 21, 526, 348);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NOMBRE:");
		lblNewLabel.setFont(new Font("Cambria Math", Font.PLAIN, 14));
		lblNewLabel.setToolTipText("");
		lblNewLabel.setBounds(30, 61, 82, 28);
		panel.add(lblNewLabel);
		
		JLabel lblApellido = new JLabel("APELLIDO:");
		lblApellido.setToolTipText("");
		lblApellido.setFont(new Font("Cambria Math", Font.PLAIN, 14));
		lblApellido.setBounds(30, 99, 82, 28);
		panel.add(lblApellido);
		
		JLabel lblEmail = new JLabel("EMAIL:");
		lblEmail.setToolTipText("");
		lblEmail.setFont(new Font("Cambria Math", Font.PLAIN, 14));
		lblEmail.setBounds(40, 137, 73, 28);
		panel.add(lblEmail);
		
		JLabel lblFechaNacimiento = new JLabel("F.NACIMIENTO:");
		lblFechaNacimiento.setToolTipText("");
		lblFechaNacimiento.setFont(new Font("Cambria Math", Font.PLAIN, 14));
		lblFechaNacimiento.setBounds(20, 175, 153, 28);
		panel.add(lblFechaNacimiento);
		
		JLabel lblDireccion = new JLabel("DIRECCION:");
		lblDireccion.setToolTipText("");
		lblDireccion.setFont(new Font("Cambria Math", Font.PLAIN, 14));
		lblDireccion.setBounds(30, 213, 92, 28);
		panel.add(lblDireccion);
		
		JLabel lblTelefono = new JLabel("TELEFONO:");
		lblTelefono.setToolTipText("");
		lblTelefono.setFont(new Font("Cambria Math", Font.PLAIN, 14));
		lblTelefono.setBounds(30, 250, 92, 28);
		panel.add(lblTelefono);
		
		JLabel lblNewLabel_1 = new JLabel("DATOS CLIENTE");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(177, 10, 182, 28);
		panel.add(lblNewLabel_1);
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnGuardar.setBackground(Color.BLACK);
		btnGuardar.setBounds(89, 310, 158, 28);
		panel.add(btnGuardar);
		
		JButton btnCanccelar = new JButton("CANCELAR");
		btnCanccelar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCanccelar.setBackground(Color.BLACK);
		btnCanccelar.setBounds(289, 310, 158, 28);
		panel.add(btnCanccelar);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(123, 211, 376, 26);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(123, 251, 376, 26);
		panel.add(textField_5);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(123, 175, 376, 26);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(123, 137, 376, 26);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(123, 99, 376, 26);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(123, 61, 376, 26);
		panel.add(textField_3);
	}
}
