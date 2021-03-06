package views;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
		setSize(1366, 768);
		setLayout(new BorderLayout(0, 0));
		JPanel panel_login = new JPanel();
		panel_login.setBackground(new Color(197, 224, 180)); 
		add(panel_login, BorderLayout.NORTH);
		panel_login.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));

		lblUsuario = new JLabel("Salir");
		lblUsuario.setBorder(new EmptyBorder(20, 0, 20, 10));
		panel_login.add(lblUsuario);

		btnLogout = new JButton("");
		btnLogout.setIcon(new ImageIcon(Vista_Modulos.class.getResource("/imagenes/logout.png")));
		btnLogout.setBackground(null);
		btnLogout.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnLogout.setContentAreaFilled(false);
		btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				btnLogout.setIcon(new ImageIcon(Vista_Modulos.class.getResource("/imagenes/logout_grande.png")));
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				btnLogout.setIcon(new ImageIcon(Vista_Modulos.class.getResource("/imagenes/logout.png")));
			}
		});
		panel_login.add(btnLogout);

		JPanel panel_modulos = new JPanel();
		panel_modulos.setBackground(new Color(197, 224, 180));
		add(panel_modulos);
		panel_modulos.setLayout(null);

		lblTitulo = new JLabel("M \u00D3 D U L O S");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(0, 10, 1370, 104);
		lblTitulo.setFont(new Font("Impact", Font.PLAIN, 80));
		panel_modulos.add(lblTitulo);

		lblClientes = new JLabel("Clientes");
		lblClientes.setFont(new Font("Sitka Small", Font.BOLD, 16));
		lblClientes.setHorizontalAlignment(SwingConstants.CENTER);
		lblClientes.setBounds(465, 279, 128, 50);
		panel_modulos.add(lblClientes);

		lblMarketing = new JLabel("Marketing");
		lblMarketing.setFont(new Font("Sitka Small", Font.BOLD, 16));
		lblMarketing.setHorizontalAlignment(SwingConstants.CENTER);
		lblMarketing.setBounds(760, 279, 128, 52);
		panel_modulos.add(lblMarketing);

		lblFacturas = new JLabel("Facturas");
		lblFacturas.setFont(new Font("Sitka Small", Font.BOLD, 16));
		lblFacturas.setHorizontalAlignment(SwingConstants.CENTER);
		lblFacturas.setBounds(465, 554, 128, 50);
		panel_modulos.add(lblFacturas);

		lblProgramar = new JLabel("Pedidos");
		lblProgramar.setFont(new Font("Sitka Small", Font.BOLD, 16));
		lblProgramar.setHorizontalAlignment(SwingConstants.CENTER);
		lblProgramar.setBounds(760, 554, 128, 52);
		panel_modulos.add(lblProgramar);

		btnClientes = new JButton("");
		btnClientes.setHorizontalAlignment(SwingConstants.RIGHT);
		btnClientes.setIcon(new ImageIcon(Vista_Modulos.class.getResource("/imagenes/clientes.png")));
		btnClientes.setBounds(465, 140, 128, 128);
		btnClientes.setBorder(null);
		btnClientes.setBackground(null);
		btnClientes.setContentAreaFilled(false);
		panel_modulos.add(btnClientes);

		btnMarketing = new JButton("");
		btnMarketing.setHorizontalAlignment(SwingConstants.LEFT);
		btnMarketing.setIcon(new ImageIcon(Vista_Modulos.class.getResource("/imagenes/marketing.png")));
		btnMarketing.setBounds(760, 140, 128, 128);
		btnMarketing.setBorder(null);
		btnMarketing.setBackground(null);
		btnMarketing.setContentAreaFilled(false);
		panel_modulos.add(btnMarketing);

		btnFacturas = new JButton("");
		btnFacturas.setHorizontalAlignment(SwingConstants.RIGHT);
		btnFacturas.setIcon(new ImageIcon(Vista_Modulos.class.getResource("/imagenes/facturas.png")));
		btnFacturas.setBounds(465, 415, 128, 128);
		btnFacturas.setBorder(null);
		btnFacturas.setBackground(null);
		btnFacturas.setContentAreaFilled(false);
		panel_modulos.add(btnFacturas);

		btnProgramar = new JButton("");
		btnProgramar.setHorizontalAlignment(SwingConstants.LEFT);
		btnProgramar.setIcon(new ImageIcon(Vista_Modulos.class.getResource("/imagenes/programar.png")));
		btnProgramar.setBounds(760, 415, 128, 128);
		btnProgramar.setBorder(null);
		btnProgramar.setBackground(null);
		btnProgramar.setContentAreaFilled(false);
		panel_modulos.add(btnProgramar);

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

	public int salir() {
		int opcion = JOptionPane.showConfirmDialog(this, "?Desea cambiar de usuario?", "Salida",
				JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
		return opcion;
	}

}
