package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.db.PersistenciaMasaMadre;
import views.Vista_Clientes;
import views.Vista_Facturacion;
import views.Vista_Login;
import views.Vista_Marketing;
import views.Vista_Modulos;
import views.Vista_Planificacion;

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
		super();
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
			
			
			String contra = datos.getCredentials(vistaL.getTxtUsuario().toString());
			
			if (contra.equals(vistaL.getTxtPassword().toString())) {
				System.out.println("hola");
				vistaM.setVisible(true);
			} else {
				System.out.println("adios");
			}
			
		}
		
		
		
	}


}
