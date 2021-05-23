package views;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Vista_Modulos extends JPanel {

	public Vista_Modulos() {

		BorderLayout layout = new BorderLayout();
		setLayout(layout);

		// PANEL SUPERIOR PARA BOTON Y USUARIO
		JPanel panel_login = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario.setBounds(835, 186, 63, 25);
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblUsuario);
		panel_login.add(lblUsuario);

		JButton btnCerrarSesion = new JButton();
		btnCerrarSesion.setBounds(908, 186, 25, 25);
		btnCerrarSesion.setIcon(new ImageIcon(".\\images\\logout.png"));
		btnCerrarSesion.setBorder(null);
		add(btnCerrarSesion);
		panel_login.add(btnCerrarSesion);
		panel_login.setAlignmentX(RIGHT_ALIGNMENT);
		add(panel_login, BorderLayout.NORTH);

		
		
		// PANEL CENTRAL CON BOTONES
		JPanel panel_botones = new JPanel(new FlowLayout(FlowLayout.RIGHT, 80, 0));
		JButton btnFacturacion = new JButton();
		btnFacturacion.setIcon(new ImageIcon(".\\images\\factura.png"));
		btnFacturacion.setBounds(getWidth()/2, getHeight()/2, 100, 100);
		panel_botones.add(btnFacturacion);
		
		JButton btnMarketing = new JButton("");
		btnMarketing.setIcon(new ImageIcon(".\\images\\marketing.png"));
		btnMarketing.setBounds(624, 426, 100, 100);
		panel_botones.add(btnMarketing);
		
		JButton btnPlanificacion = new JButton("");
		btnPlanificacion.setIcon(new ImageIcon(".\\images\\programar.png"));
		btnPlanificacion.setBounds(386, 426, 100, 100);
		panel_botones.add(btnPlanificacion);
		
		JButton btnClientes = new JButton("");
		btnClientes.setIcon(new ImageIcon(".\\images\\clientes.png"));
		btnClientes.setBounds(386, 248, 100, 100);
		panel_botones.add(btnClientes);
		add(panel_botones, BorderLayout.CENTER);
		
// btnClientes.addMouseListener(new MouseAdapter() {
// @Override
// public void mouseEntered(MouseEvent e) {
// btnClientes.setIcon(new ImageIcon(Vista_Modulos.class.getResource("/imagenes/cliente_grande.png")));
// }
// });

		/*
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
		*/
	}
}
