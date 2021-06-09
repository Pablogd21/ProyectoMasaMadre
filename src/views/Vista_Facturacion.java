package views;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.Controlador;

public class Vista_Facturacion extends JPanel {
	
	private JButton btnAniadirUsu;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnResumen;
	
	public Vista_Facturacion() {
		setLayout(null);
		
		this.setSize(750, 430 );
		
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
	}
	
	public void setControlador(Controlador controlador) {
		btnAniadirUsu.addActionListener(controlador);
		btnModificar.addActionListener(controlador);
		btnEliminar.addActionListener(controlador);
		btnResumen.addActionListener(controlador);
	}
	

}
