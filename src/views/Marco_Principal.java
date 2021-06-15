
package views;

import java.awt.HeadlessException;
import java.awt.Image; 
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Marco_Principal extends JFrame {
	 
	
	private static final long serialVersionUID = 1L;
	private Vista_Clientes vistaC;
	private Vista_Facturacion vistaF;
	private Vista_Login vistaL;
	private Vista_Marketing vistaMar;
	private Vista_Modulos vistaM;
	private Vista_Pedidos vistaP;
	
	public Marco_Principal() throws HeadlessException {
		super();
		
	}

	public Marco_Principal(Vista_Clientes vistaC, Vista_Facturacion vistaF, Vista_Login vistaL, Vista_Marketing vistaMar,
			Vista_Modulos vistaM, Vista_Pedidos vistaP) {
		this.vistaC = vistaC;
		this.vistaF = vistaF;
		this.vistaL = vistaL;
		this.vistaMar = vistaMar;
		this.vistaM = vistaM;
		this.vistaP = vistaP;
		setTitle("CRM Masa Madre");
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Marco_Principal.class.getResource("/imagenes/logo.jpg")));
		setResizable(false);
		cargaPaneles(vistaC,vistaF,vistaL,vistaMar,vistaM,vistaP);
	}
	
	private void cargaPaneles(Vista_Clientes vistaC, Vista_Facturacion vistaF, Vista_Login vistaL, Vista_Marketing vistaMar,
			Vista_Modulos vistaM, Vista_Pedidos vistaP) {
		
		getContentPane().add(vistaC);
		this.vistaC.setVisible(false);
		getContentPane().add(vistaF);
		this.vistaF.setVisible(false);
		getContentPane().add(vistaMar);
		this.vistaMar.setVisible(false);
		getContentPane().add(vistaP);
		this.vistaP.setVisible(false);
		getContentPane().add(vistaM);
		this.vistaM.setVisible(false);
		getContentPane().add(vistaL);
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

}
