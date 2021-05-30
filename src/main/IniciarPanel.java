package main;

import java.awt.*;

import javax.swing.JFrame;

import views.Marco_Principal;


public class IniciarPanel extends JFrame{

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				Marco_Principal appPrincipal = new Marco_Principal();
				appPrincipal.hacerVisible();
			
			}
		});
		
	}

}


