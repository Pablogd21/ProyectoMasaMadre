package views;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.Controlador;
import javax.swing.border.LineBorder;

public class Vista_Planificacion extends JPanel {

	private JButton btnAniadirUsu;
	private JButton btnModificar;
	private JButton btnHome;
	private JPanel panel_resumen;

	public Vista_Planificacion() {
		setLayout(null);

		this.setSize(1366, 768);

		btnAniadirUsu = new JButton("A\u00F1adir Pedido");
		btnAniadirUsu.setBackground(Color.BLACK);
		btnAniadirUsu.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnAniadirUsu.setBounds(49, 203, 195, 65);
		add(btnAniadirUsu);

		btnModificar = new JButton("Resumen Pedido");
		btnModificar.setBackground(Color.BLACK);
		btnModificar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnModificar.setBounds(49, 292, 195, 65);
		add(btnModificar);
		
		JPanel panel_home = new JPanel();
		panel_home.setBounds(25, 11, 32, 32);
		add(panel_home);

		btnHome = new JButton("");
		btnHome.setIcon(new ImageIcon(".\\images\\home.png"));
		btnHome.setBorder(null);
		btnHome.setBackground(null); 
        btnHome.setContentAreaFilled(false);
		btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				btnHome.setIcon(new ImageIcon(".\\images\\home_grande.png"));
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				btnHome.setIcon(new ImageIcon(".\\images\\home.png"));
			}
		});
		panel_home.add(btnHome);
		
		JPanel panel_aniadir = new JPanel();
		panel_aniadir.setBounds(294, 31, 1000, 662);
		add(panel_aniadir);
		
		panel_resumen = new JPanel();
		panel_resumen.setBounds(294, 31, 1000, 662);
		add(panel_resumen);
	}
	

	public JButton getBtnHome() {
		return btnHome;
	}

	public void setControlador(Controlador controlador) {
		btnHome.addActionListener(controlador);
		btnAniadirUsu.addActionListener(controlador);
		btnModificar.addActionListener(controlador);

	}
}
