package vistas;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;

public class Vista_Clientes extends JPanel {
	
	private JButton btnAniadirCli;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnResumen;
	
	public Vista_Clientes() {
		setLayout(null);
		
		this.setSize(750, 430 );
		
		btnAniadirCli = new JButton("A\u00F1adir");
		btnAniadirCli.setBackground(Color.BLACK);
		btnAniadirCli.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnAniadirCli.setBounds(23, 64, 175, 28);
		add(btnAniadirCli);
		
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
		
		btnResumen = new JButton("Resumen Clientes");
		btnResumen.setBackground(Color.BLACK);
		btnResumen.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnResumen.setBounds(23, 181, 175, 28);
		add(btnResumen);
		
		JLabel lblTituloModulo = new JLabel("Clientes ...");
		lblTituloModulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblTituloModulo.setBounds(23, 359, 140, 28);
		add(lblTituloModulo);
	}
	
	

}
