package views;

import java.awt.HeadlessException;
import java.awt.Image; 
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import controller.Controlador;


public class Marco_Principal extends JFrame {
	
	
	private static final long serialVersionUID = 1L;
	private Vista_Clientes vistaC;
	private Vista_Facturacion vistaF;
	private Vista_Login vistaL;
	private Vista_Marketing vistaMar;
	private Vista_Modulos vistaM;
	private Vista_Planificacion vistaP;
	
	public Marco_Principal() throws HeadlessException {
		super();
	}

	public Marco_Principal(Vista_Clientes vistaC, Vista_Facturacion vistaF, Vista_Login vistaL, Vista_Marketing vistaMar,
			Vista_Modulos vistaM, Vista_Planificacion vistaP) {
		this.vistaC = vistaC;
		this.vistaF = vistaF;
		this.vistaL = vistaL;
		this.vistaMar = vistaMar;
		this.vistaM = vistaM;
		this.vistaP = vistaP;
		setTitle("CRM Masa Madre");
		setExtendedState(MAXIMIZED_BOTH);
		this.setSize(1920, 1080);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		Image icon = Toolkit.getDefaultToolkit().getImage(".\\images\\logo.jpg");
		setIconImage(icon);
		cargaPaneles(vistaC,vistaF,vistaL,vistaMar,vistaM,vistaP);
	}
	
	private void cargaPaneles(Vista_Clientes vistaC, Vista_Facturacion vistaF, Vista_Login vistaL, Vista_Marketing vistaMar,
			Vista_Modulos vistaM, Vista_Planificacion vistaP) {
		
		this.add(vistaC);
		this.vistaC.setVisible(false);
		this.add(vistaF);
		this.vistaF.setVisible(false);
		this.add(vistaMar);
		this.vistaMar.setVisible(false);
		this.add(vistaP);
		this.vistaP.setVisible(false);
		this.add(vistaM);
		this.vistaM.setVisible(false);
		this.add(vistaL);
		this.vistaL.setVisible(false);
	}

	public void cargarPanel(JPanel panel) {
		panel.setVisible(true);
		this.repaint();
		this.validate();
	}
	
	public void quitarPanel(JPanel panel) {
		panel.setVisible(false);
	}
	
	public void hacerVisible() {
		setVisible(true);
	}

	/*
	 * public int salir() { int opcion = JOptionPane.showConfirmDialog( this,
	 * "¿Desea salir de la aplicación?", "confirmación", JOptionPane.YES_NO_OPTION,
	 * JOptionPane.WARNING_MESSAGE);
	 * 
	 * if (opcion == JOptionPane.YES_OPTION) { System.exit(0); } return opcion; }
	 */

}
