package vistas;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Vista_Modulos extends JPanel {
	public Vista_Modulos() {
		
		//setBorder(null);
		setLayout(null);
		
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		Dimension tamanyoPantalla = miPantalla.getScreenSize();	
		int altoPantalla = tamanyoPantalla.height;
		int anchoPantalla = tamanyoPantalla.width;
		
		setSize(1920, 1080);
		
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario.setBounds(835, 186, 63, 25);
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblUsuario);
		
		
		JButton btnCerrarSesion = new JButton();
		btnCerrarSesion.setBounds(908, 186, 25, 25);
		btnCerrarSesion.setIcon(new ImageIcon(Vista_Modulos.class.getResource("/imagenes/logout.png")));
		btnCerrarSesion.setBorder(null);
		add(btnCerrarSesion);
		
		JButton btnFacturacion = new JButton();
		btnFacturacion.setIcon(new ImageIcon(Vista_Modulos.class.getResource("/imagenes/factura.png")));
		btnFacturacion.setBounds(624, 248, 100, 100);
		add(btnFacturacion);
		
		JButton btnMarketing = new JButton("");
		btnMarketing.setIcon(new ImageIcon(Vista_Modulos.class.getResource("/imagenes/marketing.png")));
		btnMarketing.setBounds(624, 426, 100, 100);
		add(btnMarketing);
		
		JButton btnPlanificacion = new JButton("");
		btnPlanificacion.setIcon(new ImageIcon(Vista_Modulos.class.getResource("/imagenes/programar.png")));
		btnPlanificacion.setBounds(386, 426, 100, 100);
		add(btnPlanificacion);
		
		JButton btnClientes = new JButton("");
		btnClientes.setIcon(new ImageIcon(Vista_Modulos.class.getResource("/imagenes/clientes.png")));
		btnClientes.setBounds(386, 248, 100, 100);
		add(btnClientes);
//		btnClientes.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				btnClientes.setIcon(new ImageIcon(Vista_Modulos.class.getResource("/imagenes/cliente_grande.png")));
//			}
//		});
		
		
		JLabel lblNewLabel = new JLabel("Clientes");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		lblNewLabel.setBounds(386, 359, 100, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Planificaci\u00F3n");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(386, 537, 100, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Facturas");
		lblNewLabel_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(624, 359, 100, 14);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Marketing");
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(624, 535, 100, 25);
		add(lblNewLabel_3);
		
		
	}
}
