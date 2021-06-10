package views;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controller.Controlador;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Vista_Modulos extends JPanel {

	private JLabel lblUsuario;
	private JButton btnLogout;
	private JLabel lblTitulo;
	private JLabel lblClientes;
	private JLabel lblMarketing;
	private JLabel lblFacturas;
	private JLabel lblProgramar;
	private JButton btnClientes;
	private JButton btnMarketing;
	private JButton btnFacturas;
	private JButton btnProgramar;

	public Vista_Modulos() {

		setLayout(new BorderLayout(0, 0));
		setSize(1920, 1080);
		JPanel panel_login = new JPanel();
		panel_login.setBackground(new Color(255, 204, 153));
		FlowLayout fl_panel_login = (FlowLayout) panel_login.getLayout();
		fl_panel_login.setHgap(10);
		fl_panel_login.setAlignment(FlowLayout.RIGHT);
		add(panel_login, BorderLayout.NORTH);
		
		lblUsuario = new JLabel("New label");
		lblUsuario.setBorder(new EmptyBorder(20,0,20,0));
		panel_login.add(lblUsuario);
		
		btnLogout = new JButton("");
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
		
		lblTitulo = new JLabel("M O D U L O S");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(0, 39, 1920, 104);
		lblTitulo.setFont(new Font("NSimSun", Font.PLAIN, 90));
		panel_modulos.add(lblTitulo);
		
		lblClientes = new JLabel("Clientes");
		lblClientes.setFont(new Font("Sitka Small", Font.BOLD, 16));
		lblClientes.setHorizontalAlignment(SwingConstants.CENTER);
		lblClientes.setBounds(575, 491, 260, 52);
		panel_modulos.add(lblClientes);
		
		lblMarketing = new JLabel("Marketing");
		lblMarketing.setFont(new Font("Sitka Small", Font.BOLD, 16));
		lblMarketing.setHorizontalAlignment(SwingConstants.CENTER);
		lblMarketing.setBounds(1086, 491, 260, 52);
		panel_modulos.add(lblMarketing);
		
		lblFacturas = new JLabel("Facturas");
		lblFacturas.setFont(new Font("Sitka Small", Font.BOLD, 16));
		lblFacturas.setHorizontalAlignment(SwingConstants.CENTER);
		lblFacturas.setBounds(575, 882, 260, 52);
		panel_modulos.add(lblFacturas);
		
		lblProgramar = new JLabel("Programar");
		lblProgramar.setFont(new Font("Sitka Small", Font.BOLD, 16));
		lblProgramar.setHorizontalAlignment(SwingConstants.CENTER);
		lblProgramar.setBounds(1086, 882, 260, 52);
		panel_modulos.add(lblProgramar);
		
		btnClientes = new JButton("");
		btnClientes.setIcon(new ImageIcon(".\\images\\clientes.png"));
		btnClientes.setBounds(575, 220, 260, 260);
		btnClientes.setBorder(null);
		btnClientes.setBackground(null);
		panel_modulos.add(btnClientes);
		
		btnMarketing = new JButton("");
		btnMarketing.setIcon(new ImageIcon(".\\images\\marketing.png"));
		btnMarketing.setBounds(1086, 220, 260, 260);
		btnMarketing.setBorder(null);
		btnMarketing.setBackground(null);
		panel_modulos.add(btnMarketing);
		
		btnFacturas = new JButton("");
		btnFacturas.setIcon(new ImageIcon(".\\images\\facturas.png"));
		btnFacturas.setBounds(575, 611, 260, 260);
		btnFacturas.setBorder(null);
		btnFacturas.setBackground(null);
		panel_modulos.add(btnFacturas);
		
		btnProgramar = new JButton("");
		btnProgramar.setIcon(new ImageIcon(".\\images\\programar.png"));
		btnProgramar.setBounds(1086, 611, 260, 260);
		btnProgramar.setBorder(null);
		btnProgramar.setBackground(null);
		panel_modulos.add(btnProgramar);

	}
	
	public Vista_Modulos(JButton btnLogout, JButton btnClientes, JButton btnMarketing, JButton btnFacturas,
			JButton btnProgramar) {
		super();
		this.btnLogout = btnLogout;
		this.btnClientes = btnClientes;
		this.btnMarketing = btnMarketing;
		this.btnFacturas = btnFacturas;
		this.btnProgramar = btnProgramar;
	}
	
	public void setControlador(Controlador controlador) {
		btnLogout.addActionListener(controlador);
		btnClientes.addActionListener(controlador);
		btnMarketing.addActionListener(controlador);
		btnFacturas.addActionListener(controlador);
		btnProgramar.addActionListener(controlador);
		
	}
	
	public JButton getBtnLogout() {
		return btnLogout;
	}

	public JButton getBtnClientes() {
		return btnClientes;
	}

	public JButton getBtnMarketing() {
		return btnMarketing;
	}

	public JButton getBtnFacturas() {
		return btnFacturas;
	}

	public JButton getBtnProgramar() {
		return btnProgramar;
	}

	
}
