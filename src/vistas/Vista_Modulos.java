package vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class Vista_Modulos extends JPanel {
	public Vista_Modulos() {
		setLayout(null);
		
		this.setSize(750, 430 );
		
		JLabel lblUsuario = new JLabel("Nombre Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsuario.setBounds(535, 0, 107, 34);
		add(lblUsuario);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(661, 8, 89, 23);
		add(btnNewButton);
	}
}
