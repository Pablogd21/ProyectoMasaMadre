package vistas;

import javax.swing.JFrame;

public class IniciarPanel {

	public static void main(String[] args) {
		
		Marco_Principal panelillo = new Marco_Principal();
		panelillo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Marco_Principal extends JFrame {
	
	public Marco_Principal() {
		setTitle("hola");
		setExtendedState(MAXIMIZED_BOTH);
		setResizable(false);
		Vista_Modulos vistaM = new Vista_Modulos();
		//vistaM.setAlignmentX(CENTER_ALIGNMENT);
		//vistaM.setAlignmentY(CENTER_ALIGNMENT);
		add(vistaM);
		setVisible(true);
		
	}
	
}
