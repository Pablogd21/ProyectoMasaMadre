package views;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Vista_Modulos extends JPanel {

	public Vista_Modulos() {

		setLayout(new BorderLayout(0, 0));
		setSize(1920, 1080);
		JPanel panel_login = new JPanel();
		panel_login.setBackground(new Color(255, 204, 153));
		FlowLayout fl_panel_login = (FlowLayout) panel_login.getLayout();
		fl_panel_login.setHgap(10);
		fl_panel_login.setAlignment(FlowLayout.RIGHT);
		add(panel_login, BorderLayout.NORTH);
		
		JLabel lblUsuario = new JLabel("New label");
		lblUsuario.setBorder(new EmptyBorder(20,0,20,0));
		panel_login.add(lblUsuario);
		
		JButton btnLogout = new JButton("");
		btnLogout.setIcon(new ImageIcon(".\\images\\logout.png"));
		btnLogout.setBackground(null);
		btnLogout.setBorder(new EmptyBorder(0,0,0,0));
		btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		        btnLogout.setIcon(new ImageIcon(".\\images\\logout_grande.png"));
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		        btnLogout.setIcon(new ImageIcon(".\\images\\logout.png"));
		    }
		});
		panel_login.add(btnLogout);
		
		JPanel panel_modulos = new JPanel();
		panel_modulos.setBackground(new Color(255, 204, 153));
		add(panel_modulos, BorderLayout.CENTER);
		panel_modulos.setLayout(null);
		
		JLabel lblTitulo = new JLabel("M O D U L O S");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(0, 39, 1920, 104);
		lblTitulo.setFont(new Font("NSimSun", Font.PLAIN, 90));
		panel_modulos.add(lblTitulo);
		
		JLabel lblClientes = new JLabel("Clientes");
		lblClientes.setFont(new Font("Sitka Small", Font.BOLD, 16));
		lblClientes.setHorizontalAlignment(SwingConstants.CENTER);
		lblClientes.setBounds(575, 491, 260, 52);
		panel_modulos.add(lblClientes);
		
		JLabel lblMarketing = new JLabel("Marketing");
		lblMarketing.setFont(new Font("Sitka Small", Font.BOLD, 16));
		lblMarketing.setHorizontalAlignment(SwingConstants.CENTER);
		lblMarketing.setBounds(1086, 491, 260, 52);
		panel_modulos.add(lblMarketing);
		
		JLabel lblFacturas = new JLabel("Facturas");
		lblFacturas.setFont(new Font("Sitka Small", Font.BOLD, 16));
		lblFacturas.setHorizontalAlignment(SwingConstants.CENTER);
		lblFacturas.setBounds(575, 882, 260, 52);
		panel_modulos.add(lblFacturas);
		
		JLabel lblProgramar = new JLabel("Programar");
		lblProgramar.setFont(new Font("Sitka Small", Font.BOLD, 16));
		lblProgramar.setHorizontalAlignment(SwingConstants.CENTER);
		lblProgramar.setBounds(1086, 882, 260, 52);
		panel_modulos.add(lblProgramar);
		
		JButton btnClientes = new JButton("");
		btnClientes.setIcon(new ImageIcon(".\\images\\clientes.png"));
		btnClientes.setBounds(575, 220, 260, 260);
		btnClientes.setBorder(null);
		btnClientes.setBackground(null);
		panel_modulos.add(btnClientes);
		
		JButton btnMarketing = new JButton("");
		btnMarketing.setIcon(new ImageIcon(".\\images\\marketing.png"));
		btnMarketing.setBounds(1086, 220, 260, 260);
		btnMarketing.setBorder(null);
		btnMarketing.setBackground(null);
		panel_modulos.add(btnMarketing);
		
		JButton btnFacturas = new JButton("");
		btnFacturas.setIcon(new ImageIcon(".\\images\\facturas.png"));
		btnFacturas.setBounds(575, 611, 260, 260);
		btnFacturas.setBorder(null);
		btnFacturas.setBackground(null);
		panel_modulos.add(btnFacturas);
		
		JButton btnProgramar = new JButton("");
		btnProgramar.setIcon(new ImageIcon(".\\images\\programar.png"));
		btnProgramar.setBounds(1086, 611, 260, 260);
		btnProgramar.setBorder(null);
		btnProgramar.setBackground(null);
		panel_modulos.add(btnProgramar);

	}
}
