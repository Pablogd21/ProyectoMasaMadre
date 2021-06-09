package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.Controlador;

public class Vista_Marketing extends JPanel {
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	public Vista_Marketing() {
		
		this.setSize(1920, 1080);
		setLayout(new BorderLayout(0, 0));
		
		JPanel panelBotones = new JPanel();
		add(panelBotones, BorderLayout.WEST);
		panelBotones.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 150));
		
		JPanel panel = new JPanel();
		panelBotones.add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 5));
		
		JButton btnAniadirUsu = new JButton("Nueva Comunicaci\u00F3n");
		btnAniadirUsu.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnAniadirUsu.setBackground(Color.BLACK);
		panel.add(btnAniadirUsu);
		
		JButton btnModificar = new JButton("Felicitaciones");
		btnModificar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnModificar.setBackground(Color.BLACK);
		panel.add(btnModificar);
		
		JButton btnModificar_1 = new JButton("Encuestas");
		btnModificar_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnModificar_1.setBackground(Color.BLACK);
		panel.add(btnModificar_1);
		
		JPanel panelCambiante = new JPanel();
		add(panelCambiante);
		panelCambiante.setLayout(new BorderLayout(0, 0));
		
		JPanel panelFelicitacion = new JPanel();
		panelFelicitacion.setLayout(null);
		panelCambiante.add(panelFelicitacion);
		
		JLabel lblFelicitacion = new JLabel("FELICITACION:");
		lblFelicitacion.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblFelicitacion.setBounds(190, 10, 142, 22);
		panelFelicitacion.add(lblFelicitacion);
		
		JLabel lblTitulo_1 = new JLabel("TITULO:");
		lblTitulo_1.setToolTipText("");
		lblTitulo_1.setFont(new Font("Cambria Math", Font.PLAIN, 14));
		lblTitulo_1.setBounds(20, 55, 82, 28);
		panelFelicitacion.add(lblTitulo_1);
		
		JLabel lblContenido_1 = new JLabel("CONTENIDO:");
		lblContenido_1.setToolTipText("");
		lblContenido_1.setFont(new Font("Cambria Math", Font.PLAIN, 14));
		lblContenido_1.setBounds(10, 104, 82, 28);
		panelFelicitacion.add(lblContenido_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(95, 55, 404, 28);
		panelFelicitacion.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(95, 93, 404, 203);
		panelFelicitacion.add(textField_1);
		
		JButton btnGuardar_2 = new JButton("GUARDAR");
		btnGuardar_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnGuardar_2.setBackground(Color.BLACK);
		btnGuardar_2.setBounds(95, 311, 158, 28);
		panelFelicitacion.add(btnGuardar_2);
		
		JButton btnCancelar_1 = new JButton("BORRAR");
		btnCancelar_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCancelar_1.setBackground(Color.BLACK);
		btnCancelar_1.setBounds(295, 311, 158, 28);
		panelFelicitacion.add(btnCancelar_1);
		
		JPanel panelComunicacion = new JPanel();
		panelComunicacion.setLayout(null);
		panelCambiante.add(panelComunicacion);
		
		JLabel lblTitulo = new JLabel("TITULO:");
		lblTitulo.setToolTipText("");
		lblTitulo.setFont(new Font("Cambria Math", Font.PLAIN, 14));
		lblTitulo.setBounds(30, 81, 82, 28);
		panelComunicacion.add(lblTitulo);
		
		JLabel lblContenido = new JLabel("CONTENIDO:");
		lblContenido.setToolTipText("");
		lblContenido.setFont(new Font("Cambria Math", Font.PLAIN, 14));
		lblContenido.setBounds(20, 198, 82, 28);
		panelComunicacion.add(lblContenido);
		
		JLabel lblDestinatarios = new JLabel("DESTINO:");
		lblDestinatarios.setToolTipText("");
		lblDestinatarios.setFont(new Font("Cambria Math", Font.PLAIN, 14));
		lblDestinatarios.setBounds(29, 313, 73, 28);
		panelComunicacion.add(lblDestinatarios);
		
		JLabel lblNewLabel_1 = new JLabel("COMUNICACI\u00D3N");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(225, 31, 182, 28);
		panelComunicacion.add(lblNewLabel_1);
		
		JButton btnGuardar = new JButton("ENVIAR");
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnGuardar.setBackground(Color.BLACK);
		btnGuardar.setBounds(129, 370, 158, 28);
		panelComunicacion.add(btnGuardar);
		
		JButton btnCancelar = new JButton("BORRAR");
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCancelar.setBackground(Color.BLACK);
		btnCancelar.setBounds(329, 370, 158, 28);
		panelComunicacion.add(btnCancelar);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(122, 313, 376, 26);
		panelComunicacion.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(122, 120, 376, 183);
		panelComunicacion.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(122, 82, 376, 26);
		panelComunicacion.add(textField_4);
	
	}
	
	public void setControlador(Controlador controlador) {
		textField.addActionListener(controlador);
		textField_1.addActionListener(controlador);
		textField_2.addActionListener(controlador);
		textField_3.addActionListener(controlador);
		textField_4.addActionListener(controlador);
		
	}
}
