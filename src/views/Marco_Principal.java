package views;

import javax.swing.JFrame;

public class Marco_Principal extends JFrame {
	
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
