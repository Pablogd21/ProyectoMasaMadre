package vistas;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Component;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.SwingConstants;

public class Vista_Modulos extends JPanel {
	public Vista_Modulos() {
		
		this.setSize(750, 430);
		setLayout(null);
		
		JLabel lblUsuario = new JLabel("Nombre Usuario");
		lblUsuario.setBounds(607, 11, 98, 25);
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblUsuario);
		
		
		JButton btnCerrarSesion = new JButton();
		btnCerrarSesion.setBounds(715, 11, 25, 25);
		btnCerrarSesion.setSelectedIcon(new ImageIcon(Vista_Modulos.class.getResource("/imagenes/flecha.png")));
		btnCerrarSesion.setIcon(new ImageIcon(Vista_Modulos.class.getResource("/imagenes/flecha.png")));
		btnCerrarSesion.setBorder(null);
		add(btnCerrarSesion);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(317, 91, 100, 100);
		add(btnNewButton_1);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(317, 252, 100, 100);
		add(btnNewButton_4);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(468, 91, 100, 100);
		add(btnNewButton_2);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setBounds(468, 252, 100, 100);
		add(btnNewButton_5);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(164, 252, 100, 100);
		add(btnNewButton_3);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(164, 91, 100, 100);
		add(btnNewButton);
		
		
	}
}
