package views;

import java.awt.Image; 
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Marco_Principal extends JFrame {
	
	public Marco_Principal() {
		setTitle("CRM Masa Madre");
		setExtendedState(MAXIMIZED_BOTH);
		this.setSize(1920, 1080);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
		Image icon = Toolkit.getDefaultToolkit().getImage(".\\images\\logo.jpg");
		setIconImage(icon);
		setVisible(true);
	}
	
	
	
	
	/*
	 * public int salir() { int opcion = JOptionPane.showConfirmDialog( this,
	 * "�Desea salir de la aplicaci�n?", "confirmaci�n", JOptionPane.YES_NO_OPTION,
	 * JOptionPane.WARNING_MESSAGE);
	 * 
	 * if (opcion == JOptionPane.YES_OPTION) { System.exit(0); } return opcion; }
	 */

}
