package views;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.Controlador;

public class Vista_Facturacion extends JPanel {
	
	private JButton btnAniadirUsu;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnResumen;
	private JButton btnHome;
	
	public Vista_Facturacion() {
		setLayout(null);
		
		this.setSize(1920, 1080);
		
		btnAniadirUsu = new JButton("A\u00F1adir");
		btnAniadirUsu.setBackground(Color.BLACK);
		btnAniadirUsu.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnAniadirUsu.setBounds(23, 64, 175, 28);
		add(btnAniadirUsu);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setBackground(Color.BLACK);
		btnModificar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnModificar.setBounds(23, 103, 175, 28);
		add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBackground(Color.BLACK);
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnEliminar.setBounds(23, 142, 175, 28);
		add(btnEliminar);
		
		btnResumen = new JButton("Balance Mensual");
		btnResumen.setBackground(Color.BLACK);
		btnResumen.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnResumen.setBounds(23, 181, 175, 28);
		add(btnResumen);
		
		JLabel lblTituloModulo = new JLabel("Facturación ...");
		lblTituloModulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblTituloModulo.setBounds(23, 359, 140, 28);
		add(lblTituloModulo);
		
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
	}
	
	
	
	public JButton getBtnHome() {
		return btnHome;
	}



	public void setControlador(Controlador controlador) {
		btnHome.addActionListener(controlador);
		btnAniadirUsu.addActionListener(controlador);
		btnModificar.addActionListener(controlador);
		btnEliminar.addActionListener(controlador);
		btnResumen.addActionListener(controlador);
	}
	

}
