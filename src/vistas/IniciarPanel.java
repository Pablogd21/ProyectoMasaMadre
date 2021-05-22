package vistas;

import javax.swing.JFrame;

public class IniciarPanel {

	public static void main(String[] args) {
		
		
		Framesito panelillo = new Framesito();
		panelillo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Framesito extends JFrame {
	
	public Framesito() {
		setTitle("hola");
		setSize(760, 450);
		Vista_Modulos marquito = new Vista_Modulos();
		add(marquito);
		marquito.setAlignmentX(CENTER_ALIGNMENT);
		marquito.setAlignmentY(CENTER_ALIGNMENT);
		setVisible(true);
	}
	
}
