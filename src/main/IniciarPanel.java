package main;

import java.awt.EventQueue;

import controller.Controlador;
import views.Marco_Principal;
import views.Vista_Clientes;
import views.Vista_Facturacion;
import views.Vista_Login;
import views.Vista_Marketing;
import views.Vista_Modulos;
import views.Vista_Planificacion;

public class IniciarPanel {

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				
				// Instanciar vistas
				Vista_Clientes vistaC = new Vista_Clientes();
				Vista_Facturacion vistaF = new Vista_Facturacion();
				Vista_Login vistaL = new Vista_Login();
				Vista_Marketing vistaMar = new Vista_Marketing();
				Vista_Modulos vistaM = new Vista_Modulos();
				Vista_Planificacion vistaP = new Vista_Planificacion();
				
				Marco_Principal appPrincipal = new Marco_Principal(vistaC,vistaF,vistaL,vistaMar,vistaM,vistaP);

				Controlador controlador = new Controlador(vistaC, vistaF, vistaL, vistaMar, vistaM, vistaP);

				// Añadir controlador a las vistas
				vistaC.setControlador(controlador);
				vistaF.setControlador(controlador);
				vistaL.setControlador(controlador);
				vistaMar.setControlador(controlador);
				vistaM.setControlador(controlador);
				vistaP.setControlador(controlador);
				
				appPrincipal.add(vistaM);

				vistaC.setControlador(controlador);
				vistaF.setControlador(controlador);
				vistaL.setControlador(controlador);
				vistaMar.setControlador(controlador);
				vistaM.setControlador(controlador);
				vistaP.setControlador(controlador);
				
				appPrincipal.cargarPanel(vistaL);
				appPrincipal.hacerVisible();
				
			}
		});

	}

}
