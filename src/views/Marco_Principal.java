package views;

import javax.swing.JFrame;

public class Marco_Principal extends JFrame {
	
	public Marco_Principal() {
		setTitle("hola");
		setExtendedState(MAXIMIZED_BOTH);
		Vista_Modulos vistaM = new Vista_Modulos();
		add(vistaM);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
		setVisible(true);
		
	}

}
