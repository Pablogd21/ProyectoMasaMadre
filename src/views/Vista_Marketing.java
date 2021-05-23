package views;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Vista_Marketing extends JPanel {
	
	private JButton btnAniadirUsu;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnResumen;
	
	public Vista_Marketing() {
		setLayout(null);
		
		this.setSize(750, 430 );
		
		btnAniadirUsu = new JButton("Nueva Comunicación");
		btnAniadirUsu.setBackground(Color.BLACK);
		btnAniadirUsu.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnAniadirUsu.setBounds(23, 64, 175, 28);
		add(btnAniadirUsu);
		
		btnModificar = new JButton("Encuestas");
		btnModificar.setBackground(Color.BLACK);
		btnModificar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnModificar.setBounds(23, 103, 175, 28);
		add(btnModificar);
		
		JLabel lblTituloModulo = new JLabel("Marketing ...");
		lblTituloModulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblTituloModulo.setBounds(23, 359, 140, 28);
		add(lblTituloModulo);
		
	
	}
	
	

}
