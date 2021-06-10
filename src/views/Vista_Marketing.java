
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
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vista_Marketing extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtFieldTitulo;
	private JTextField txtFieldContenido;
	private JTextField textField_4;
	
	public Vista_Marketing() {
		
		this.setSize(1920, 1080);
		setLayout(null);
		
		JPanel panelComunicacion = new JPanel();
		panelComunicacion.setLayout(null);
		panelComunicacion.setBounds(385, 55, 1124, 740);
		add(panelComunicacion);
		
		JLabel lblComunicacin = new JLabel("COMUNICACI\u00D3N");
		lblComunicacin.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblComunicacin.setBounds(494, 21, 288, 50);
		panelComunicacion.add(lblComunicacin);
		
		JLabel lblTitulo = new JLabel("TITULO:");
		lblTitulo.setToolTipText("");
		lblTitulo.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblTitulo.setBounds(99, 120, 135, 35);
		panelComunicacion.add(lblTitulo);
		
		JLabel lblContenido = new JLabel("CONTENIDO:");
		lblContenido.setToolTipText("");
		lblContenido.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblContenido.setBounds(78, 337, 135, 35);
		panelComunicacion.add(lblContenido);
		
		JLabel lblDestinatario = new JLabel("DESTINATARIO:");
		lblDestinatario.setToolTipText("");
		lblDestinatario.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblDestinatario.setBounds(73, 554, 161, 35);
		panelComunicacion.add(lblDestinatario);
		
		txtFieldTitulo = new JTextField();
		txtFieldTitulo.setColumns(10);
		txtFieldTitulo.setBounds(244, 113, 835, 50);
		panelComunicacion.add(txtFieldTitulo);
		
		txtFieldContenido = new JTextField();
		txtFieldContenido.setColumns(10);
		txtFieldContenido.setBounds(244, 183, 835, 343);
		panelComunicacion.add(txtFieldContenido);
		
		JButton btnEnviar = new JButton("ENVIAR");
		btnEnviar.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnEnviar.setBackground(SystemColor.controlHighlight);
		btnEnviar.setBounds(345, 660, 251, 43);
		panelComunicacion.add(btnEnviar);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnCancelar.setBackground(SystemColor.controlHighlight);
		btnCancelar.setBounds(671, 660, 251, 43);
		panelComunicacion.add(btnCancelar);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(244, 547, 835, 50);
		panelComunicacion.add(textField_4);
		
		JPanel panelFelicitacion = new JPanel();
		panelFelicitacion.setLayout(null);
		panelFelicitacion.setBounds(385, 55, 1124, 740);
		add(panelFelicitacion);
		
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
		
		JButton btnNuevaComunicacion = new JButton("NUEVA COMUNICACI\u00D3N");
		btnNuevaComunicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNuevaComunicacion.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNuevaComunicacion.setBackground(SystemColor.controlHighlight);
		btnNuevaComunicacion.setBounds(45, 314, 330, 69);
		add(btnNuevaComunicacion);
		
		JButton btnFelicitaciones = new JButton("FELICITACIONES");
		btnFelicitaciones.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnFelicitaciones.setBackground(SystemColor.controlHighlight);
		btnFelicitaciones.setBounds(45, 393, 330, 56);
		add(btnFelicitaciones);
		
		JButton btnEncuestas = new JButton("ENCUESTAS");
		btnEncuestas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEncuestas.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnEncuestas.setBackground(SystemColor.controlHighlight);
		btnEncuestas.setBounds(45, 459, 330, 56);
		add(btnEncuestas);
		
		JLabel lblModuloMarketing = new JLabel("Marketing ...");
		lblModuloMarketing.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		lblModuloMarketing.setBounds(71, 726, 213, 69);
		add(lblModuloMarketing);
	
	}
	
	public void setControlador(Controlador controlador) {
		textField.addActionListener(controlador);
		textField_1.addActionListener(controlador);
		txtFieldTitulo.addActionListener(controlador);
		txtFieldContenido.addActionListener(controlador);
		textField_4.addActionListener(controlador);
		
	}
}

