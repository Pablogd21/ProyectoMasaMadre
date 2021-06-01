package views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

public class Vista_Modulos1 extends JPanel {

	public Vista_Modulos1() {
		
		setLayout(new BorderLayout(0, 0));
		
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
		        btnLogout.setIcon(new ImageIcon(".\\images\\logout 1.png"));
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		        btnLogout.setIcon(new ImageIcon(".\\images\\logout.png"));
		    }
		});
		panel_login.add(btnLogout);
		
		JPanel panel_principal = new JPanel();
		panel_principal.setBackground(new Color(255, 204, 153));
		add(panel_principal, BorderLayout.CENTER);
		panel_principal.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_modulos = new JPanel();
		panel_modulos.setBackground(new Color(255, 204, 153));
		panel_principal.add(panel_modulos);
		GridBagLayout gbl_panel_modulos = new GridBagLayout();
		gbl_panel_modulos.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_modulos.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_modulos.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_modulos.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_modulos.setLayout(gbl_panel_modulos);
		
		
		JLabel lblTitulo = new JLabel("M O D U L O S");
		lblTitulo.setFont(new Font("NSimSun", Font.PLAIN, 90));
		GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
		gbc_lblTitulo.gridwidth = 2;
		gbc_lblTitulo.insets = new Insets(60, 0, 5, 5);
		gbc_lblTitulo.gridx = 0;
		gbc_lblTitulo.gridy = 0;
		panel_modulos.add(lblTitulo, gbc_lblTitulo);
		
		
		JButton btnClientes = new JButton("");
		btnClientes.setIcon(new ImageIcon(".\\images\\clientes.png"));
		GridBagConstraints gbc_btnClientes = new GridBagConstraints();
		gbc_btnClientes.insets = new Insets(50, 100, 5, 100);
		gbc_btnClientes.gridx = 0;
		gbc_btnClientes.gridy = 1;
		btnClientes.setBorder(null);
		btnClientes.setBackground(null);
		panel_modulos.add(btnClientes, gbc_btnClientes);
		
		
		JButton btnMarketing = new JButton("");
		btnMarketing.setIcon(new ImageIcon(".\\images\\marketing.png"));
		btnMarketing.setBorder(null);
		GridBagConstraints gbc_btnMarketing = new GridBagConstraints();
		gbc_btnMarketing.insets = new Insets(50, 100, 5, 100);
		gbc_btnMarketing.gridx = 1;
		gbc_btnMarketing.gridy = 1;
		btnMarketing.setBackground(null);
		panel_modulos.add(btnMarketing, gbc_btnMarketing);
		
		
		JLabel lblClientes = new JLabel("Clientes");
		GridBagConstraints gbc_lblClientes = new GridBagConstraints();
		gbc_lblClientes.insets = new Insets(0, 0, 100, 5);
		gbc_lblClientes.gridx = 0;
		gbc_lblClientes.gridy = 2;
		panel_modulos.add(lblClientes, gbc_lblClientes);
		
		
		JLabel lblMarketing = new JLabel("Marketing");
		GridBagConstraints gbc_lblMarketing = new GridBagConstraints();
		gbc_lblMarketing.insets = new Insets(0, 0, 100, 5);
		gbc_lblMarketing.gridx = 1;
		gbc_lblMarketing.gridy = 2;
		panel_modulos.add(lblMarketing, gbc_lblMarketing);
		
		
		JButton btnFacturas = new JButton("");
		btnFacturas.setIcon(new ImageIcon(".\\images\\factura.png"));
		GridBagConstraints gbc_btnFacturas = new GridBagConstraints();
		gbc_btnFacturas.insets = new Insets(0, 0, 5, 5);
		gbc_btnFacturas.gridx = 0;
		gbc_btnFacturas.gridy = 5;
		btnFacturas.setBorder(null);
		btnFacturas.setBackground(null);
		panel_modulos.add(btnFacturas, gbc_btnFacturas);
		
		
		JButton btnProgramar = new JButton("");
		btnProgramar.setIcon(new ImageIcon(".\\images\\programar.png"));
		GridBagConstraints gbc_btnProgramar = new GridBagConstraints();
		gbc_btnProgramar.insets = new Insets(0, 0, 5, 5);
		gbc_btnProgramar.gridx = 1;
		gbc_btnProgramar.gridy = 5;
		btnProgramar.setBorder(null);
		btnProgramar.setBackground(null);
		panel_modulos.add(btnProgramar, gbc_btnProgramar);
		
		JLabel lblFacturas = new JLabel("Facturas");
		GridBagConstraints gbc_lblFacturas = new GridBagConstraints();
		gbc_lblFacturas.insets = new Insets(0, 0, 5, 5);
		gbc_lblFacturas.gridx = 0;
		gbc_lblFacturas.gridy = 6;
		panel_modulos.add(lblFacturas, gbc_lblFacturas);
		
		JLabel lblProgramar = new JLabel("Programar");
		GridBagConstraints gbc_lblProgramar = new GridBagConstraints();
		gbc_lblProgramar.insets = new Insets(0, 0, 5, 5);
		gbc_lblProgramar.gridx = 1;
		gbc_lblProgramar.gridy = 6;
		panel_modulos.add(lblProgramar, gbc_lblProgramar);
	}
	
}
