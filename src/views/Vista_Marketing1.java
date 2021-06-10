package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Vista_Marketing1 extends JPanel {
	
	public Vista_Marketing1() {
		
		JButton btnEliminar;
		JButton btnResumen;
		
		setLayout(new BorderLayout(0, 0));
		
		JPanel panelBotones = new JPanel();
		add(panelBotones, BorderLayout.CENTER);
		panelBotones.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 150));
		
		JButton btnNewButton = new JButton("New button");
		panelBotones.add(btnNewButton);
		
		
	
	}

}
