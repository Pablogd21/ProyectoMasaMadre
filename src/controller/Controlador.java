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
	private Marco_Principal appPrincipal = new Marco_Principal();

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
		
		if (e.getSource().equals(vistaL.getBtnIngresar())) {
			String contra = null;
			if (vistaL.getTxtUsuario().getText().equals("")) {
				vistaL.loginVacio();
			} else {
				contra = datos.getCredentials(vistaL.getTxtUsuario().getText());
				if (contra == null) {
					contra = " ";
				}
				if (contra.equals(vistaL.getTxtPassword().getText())) {
					appPrincipal.quitarPanel(vistaL);
					appPrincipal.cargarPanel(vistaM);
				} else {
					vistaL.loginIncorrecto();
				}
			}
		} else if (e.getSource().equals(vistaM.getBtnClientes())) {
			appPrincipal.quitarPanel(vistaM);
			appPrincipal.cargarPanel(vistaC);
		} else if (e.getSource().equals(vistaM.getBtnFacturas())) {
			appPrincipal.quitarPanel(vistaM);
			appPrincipal.cargarPanel(vistaF);
		} else if (e.getSource().equals(vistaM.getBtnMarketing())) {
			appPrincipal.quitarPanel(vistaM);
			appPrincipal.cargarPanel(vistaMar);
		} else if (e.getSource().equals(vistaM.getBtnProgramar())) {
			appPrincipal.quitarPanel(vistaM);
			appPrincipal.cargarPanel(vistaP);
		} else if (e.getSource().equals(vistaM.getBtnLogout())) {
			appPrincipal.quitarPanel(vistaM);
			appPrincipal.cargarPanel(vistaL);
			vistaL.vaciarCampos();
		} else if (e.getSource().equals(vistaC.getBtnHome())) {
			appPrincipal.quitarPanel(vistaC);
			appPrincipal.cargarPanel(vistaM);
		}

	}


}
