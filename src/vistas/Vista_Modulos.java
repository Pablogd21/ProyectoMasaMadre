package vistas;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class Vista_Modulos extends JPanel {
	public Vista_Modulos() {
		setBorder(null);
		
		this.setSize(750, 430);
		setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario.setBounds(642, 11, 63, 25);
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblUsuario);
		
		
		JButton btnCerrarSesion = new JButton();
		btnCerrarSesion.setBounds(715, 11, 25, 25);
		btnCerrarSesion.setIcon(new ImageIcon(Vista_Modulos.class.getResource("/imagenes/logout.png")));
		btnCerrarSesion.setBorder(null);
		add(btnCerrarSesion);
		
		JButton btnFacturacion = new JButton();
		btnFacturacion.setIcon(new ImageIcon(Vista_Modulos.class.getResource("/imagenes/factura.png")));
		btnFacturacion.setBounds(431, 73, 100, 100);
		add(btnFacturacion);
		
		JButton btnMarketing = new JButton("");
		btnMarketing.setIcon(new ImageIcon(Vista_Modulos.class.getResource("/imagenes/marketing.png")));
		btnMarketing.setBounds(431, 251, 100, 100);
		add(btnMarketing);
		
		JButton btnPlanificacion = new JButton("");
		btnPlanificacion.setIcon(new ImageIcon(Vista_Modulos.class.getResource("/imagenes/programar.png")));
		btnPlanificacion.setBounds(193, 251, 100, 100);
		add(btnPlanificacion);
		
		JButton btnClientes = new JButton("");
		btnClientes.setIcon(new ImageIcon(Vista_Modulos.class.getResource("/imagenes/clientes.png")));
		btnClientes.setBounds(193, 73, 100, 100);
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
		lblNewLabel.setBounds(193, 184, 100, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Planificaci\u00F3n");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(193, 362, 100, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Facturas");
		lblNewLabel_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(431, 184, 100, 14);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Marketing");
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(431, 360, 100, 25);
		add(lblNewLabel_3);
		
		
	}
}
