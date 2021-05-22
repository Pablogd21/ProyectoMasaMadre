package views;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Marco_Principal extends JFrame {
	
	public Marco_Principal() {
		setTitle("CRM Masa Madre");
		setExtendedState(MAXIMIZED_BOTH);
		setResizable(false);
		Vista_Login login = new Vista_Login();
		add(login);
		
		
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
	
	public int salir() {	
		int opcion = JOptionPane.showConfirmDialog(
						this, "¿Desea salir de la aplicación?",
						"confirmación", 
						JOptionPane.YES_NO_OPTION,
						JOptionPane.WARNING_MESSAGE);
		
		if (opcion == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
		return opcion;
	}

}
