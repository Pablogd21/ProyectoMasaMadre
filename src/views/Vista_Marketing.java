package views;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Vista_Marketing extends JPanel {
	
	private JButton btnAniadirUsu;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnResumen;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	
	public Vista_Marketing() {
		setLayout(null);
		
		this.setSize(750, 430 );
		
		btnAniadirUsu = new JButton("Nueva Comunicación");
		btnAniadirUsu.setBackground(Color.BLACK);
		btnAniadirUsu.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnAniadirUsu.setBounds(23, 147, 175, 28);
		add(btnAniadirUsu);
		
		btnModificar = new JButton("Felicitaciones");
		btnModificar.setBackground(Color.BLACK);
		btnModificar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnModificar.setBounds(23, 186, 175, 28);
		add(btnModificar);
		
		JLabel lblTituloModulo = new JLabel("Marketing ...");
		lblTituloModulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblTituloModulo.setBounds(23, 359, 140, 28);
		add(lblTituloModulo);
		
		JButton btnModificar_1 = new JButton("Encuestas");
		btnModificar_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnModificar_1.setBackground(Color.BLACK);
		btnModificar_1.setBounds(23, 224, 175, 28);
		add(btnModificar_1);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(208, 25, 526, 348);
		add(panel);
		
		JLabel lblTitulo = new JLabel("TITULO:");
		lblTitulo.setToolTipText("");
		lblTitulo.setFont(new Font("Cambria Math", Font.PLAIN, 14));
		lblTitulo.setBounds(30, 61, 82, 28);
		panel.add(lblTitulo);
		
		JLabel lblContenido = new JLabel("CONTENIDO:");
		lblContenido.setToolTipText("");
		lblContenido.setFont(new Font("Cambria Math", Font.PLAIN, 14));
		lblContenido.setBounds(10, 155, 82, 28);
		panel.add(lblContenido);
		
		JLabel lblDestinatarios = new JLabel("DESTINO:");
		lblDestinatarios.setToolTipText("");
		lblDestinatarios.setFont(new Font("Cambria Math", Font.PLAIN, 14));
		lblDestinatarios.setBounds(30, 249, 73, 28);
		panel.add(lblDestinatarios);
		
		JLabel lblNewLabel_1 = new JLabel("COMUNICACI\u00D3N");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(177, 10, 182, 28);
		panel.add(lblNewLabel_1);
		
		JButton btnGuardar = new JButton("ENVIAR");
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnGuardar.setBackground(Color.BLACK);
		btnGuardar.setBounds(89, 310, 158, 28);
		panel.add(btnGuardar);
		
		JButton btnCanccelar = new JButton("BORRAR");
		btnCanccelar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCanccelar.setBackground(Color.BLACK);
		btnCanccelar.setBounds(289, 310, 158, 28);
		panel.add(btnCanccelar);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(123, 249, 376, 26);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(123, 99, 376, 140);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(123, 61, 376, 26);
		panel.add(textField_5);
		
	
	}
}
