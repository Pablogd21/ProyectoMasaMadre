package views;

import java.awt.Image; 
import java.awt.Toolkit;

import javax.swing.JFrame;

import controller.Controlador;

public class Marco_Principal extends JFrame {
	
	public Marco_Principal() {
		setTitle("hola");
		setExtendedState(MAXIMIZED_BOTH);
		Vista_Modulos vistaM = new Vista_Modulos();
		add(vistaM);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
		Image icon = Toolkit.getDefaultToolkit().getImage(".\\images\\logo.jpg");
		setIconImage(icon);
		
		Controlador al = new Controlador();
		
		setVisible(true);
		
	}
	
	

}
