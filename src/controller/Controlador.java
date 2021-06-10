package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.db.PersistenciaMasaMadre;
import views.*;

public class Controlador implements ActionListener {

	private Vista_Clientes vistaC;
	private Vista_Facturacion vistaF;
	private Vista_Login vistaL;
	private Vista_Marketing vistaMar;
	private Vista_Modulos vistaM;
	private Vista_Planificacion vistaP;
	private PersistenciaMasaMadre datos;

	public Controlador(Vista_Clientes vistaC, Vista_Facturacion vistaF, Vista_Login vistaL, Vista_Marketing vistaMar,
			Vista_Modulos vistaM, Vista_Planificacion vistaP) {
		this.vistaC = vistaC;
		this.vistaF = vistaF;
		this.vistaL = vistaL;
		this.vistaMar = vistaMar;
		this.vistaM = vistaM;
		this.vistaP = vistaP;
		datos = new PersistenciaMasaMadre();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(vistaL.getBtnIngresar())) {
			
			String contra = datos.getCredentials(vistaL.getTxtUsuario().getText());
			
			if (contra.equals(vistaL.getTxtPassword().getText())) {
				System.out.println("hola");
				//vistaL.setVisible(false);
				//appPrincipal.removeAll();
				//appPrincipal.add(vistaM);
				vistaL.setVisible(false);
				
			} else {
				System.out.println("adios");
			}
			
		}

	}

}
