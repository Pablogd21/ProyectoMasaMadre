package views;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Marco_Principal extends JFrame {
	
	public Marco_Principal() {
		setTitle("hola");
		setExtendedState(MAXIMIZED_BOTH);
		Vista_Modulos1 vistaM = new Vista_Modulos1();
		add(vistaM);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
		Image icon = Toolkit.getDefaultToolkit().getImage(".\\images\\logo.jpg");
		setIconImage(icon);
		setVisible(true);
		
	}

}
