package main;

import java.awt.EventQueue;

import javax.swing.JFrame;

import views.Marco_Principal;


public class IniciarPanel {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				Marco_Principal panelillo = new Marco_Principal();
				panelillo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
			}
		});
		
		
	}

}


