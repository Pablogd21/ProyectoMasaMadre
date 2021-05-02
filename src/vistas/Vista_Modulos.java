package vistas;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Vista_Modulos extends JPanel {
	public Vista_Modulos() {
		setLayout(null);
		
		this.setSize(750, 430 );
		
		JLabel lblUsuario = new JLabel("Nombre Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsuario.setBounds(601, 11, 98, 34);
		add(lblUsuario);
		
		
		JButton btnCerrarSesion = new JButton();
		btnCerrarSesion.setSelectedIcon(new ImageIcon(Vista_Modulos.class.getResource("/imagenes/flecha.png")));
		btnCerrarSesion.setBounds(695, 11, 45, 34);
		btnCerrarSesion.setIcon(new ImageIcon(Vista_Modulos.class.getResource("/imagenes/flecha.png")));
		btnCerrarSesion.setBorder(null);
		add(btnCerrarSesion);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(23, 82, 89, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(169, 82, 89, 23);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(313, 82, 89, 23);
		add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(462, 82, 89, 23);
		add(btnNewButton_3);
		
		
	}
}
