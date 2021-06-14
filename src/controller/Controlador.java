package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import model.data.Cliente;
import model.db.PersistenciaMasaMadre;
import views.*;

public class Controlador implements ActionListener {

	private Vista_Clientes vistaC;
	private Vista_Facturacion vistaF;
	private Vista_Login vistaL;
	private Vista_Marketing vistaMar;
	private Vista_Modulos vistaM;
	private Vista_Pedidos vistaP;
	private PersistenciaMasaMadre datos;
	private Marco_Principal appPrincipal = new Marco_Principal();

	public Controlador(Vista_Clientes vistaC, Vista_Facturacion vistaF, Vista_Login vistaL, Vista_Marketing vistaMar,
			Vista_Modulos vistaM, Vista_Pedidos vistaP) {
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
			int opcion = vistaM.salir();
			if (opcion == JOptionPane.YES_OPTION) { 
				appPrincipal.quitarPanel(vistaM);
				appPrincipal.cargarPanel(vistaL);
				vistaL.vaciarCampos();
			}
		} else if (e.getSource().equals(vistaC.getBtnHome())) {
			int opcionSalirCli = vistaC.salir();
			if (opcionSalirCli == JOptionPane.YES_OPTION) {
				vistaC.vaciarCampos();
				vistaC.cambioModificarHome();
				vistaC.cargarPanelAnadir();
				appPrincipal.quitarPanel(vistaC);
				appPrincipal.cargarPanel(vistaM);
			}
		} else if (e.getSource().equals(vistaP.getBtnHome())) {
			appPrincipal.quitarPanel(vistaP);
			appPrincipal.cargarPanel(vistaM);
		} else if (e.getSource().equals(vistaMar.getBtnHome())) {
			appPrincipal.quitarPanel(vistaMar);
			appPrincipal.cargarPanel(vistaM);
		} else if (e.getSource().equals(vistaF.getBtnHome())) {
			appPrincipal.quitarPanel(vistaF);
			appPrincipal.cargarPanel(vistaM);
		} else if (e.getSource().equals(vistaC.getBtnBorrar())) {
			vistaC.vaciarCampos();
		}  else if (e.getSource().equals(vistaC.getBtnAnadir())) {
			vistaC.cargarPanelAnadir();
		} else if (e.getSource().equals(vistaC.getBtnResumen())) {
			vistaC.cargarPanelResumen();
			vistaC.cargarTabla(datos.selectClientes());
		} else if (e.getSource().equals(vistaC.getBtnGuardar())) {
			Cliente cli = vistaC.generarCliente();
			if (!(cli == null)) {
				int res = datos.insertCliente(cli);
				if (res == 1) {
					JOptionPane.showMessageDialog(vistaC, "Cliente añadido con éxito", "Añadido",
							JOptionPane.INFORMATION_MESSAGE);
					vistaC.vaciarCampos();
				}else {
					JOptionPane.showMessageDialog(vistaC, "Fallo al añadir el cliente", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
			
		} else if (e.getSource().equals(vistaC.getBtnModificar())) {
			int filaMod = vistaC.getTable().getSelectedRow();
			
			if (filaMod != -1) {
				vistaC.cargarPanelAnadir();
				vistaC.cambioModificar();
				int num = (int) vistaC.getTblModel().getValueAt(filaMod, 0);
				Cliente cliente = datos.selectClienteId(num);
				vistaC.cargarCliente(cliente);
				
			} else {
				JOptionPane.showMessageDialog(vistaC, 
						"Debe seleccionar el cliente que desea modificar",
						"Error de selección", JOptionPane.ERROR_MESSAGE);
			}
		} else if (e.getSource().equals(vistaC.getBtnEliminar())) {
			int filaEl = vistaC.getTable().getSelectedRow();
			
			if (filaEl != -1) {
				int confirmado = vistaC.confirmaEliminar();
				if (confirmado == JOptionPane.YES_OPTION) {
					int num = (int) vistaC.getTblModel().getValueAt(filaEl, 0);
					int resEl = datos.deleteCliente(num);
					if (resEl == 1) {
						JOptionPane.showMessageDialog(vistaC, "Cliente eliminado con éxito", "Añadido",
								JOptionPane.INFORMATION_MESSAGE);
						vistaC.cargarTabla(datos.selectClientes());
						
					}else {
						JOptionPane.showMessageDialog(vistaC, "Fallo al eliminar el cliente", "Error",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			} else {
				JOptionPane.showMessageDialog(vistaC, 
						"Debe seleccionar el cliente que desea eliminar",
						"Error de selección", JOptionPane.ERROR_MESSAGE);
			}
		} else if (e.getSource().equals(vistaC.getBtnMod())) {
			int confirmadoMod = vistaC.confirmaModificar();
			if (confirmadoMod == JOptionPane.YES_OPTION) {
				Cliente cliMod = vistaC.generarClienteMod();
				if (!(cliMod == null)) {
					int resMod = datos.updateCliente(cliMod);
					if (resMod == 1) {
						JOptionPane.showMessageDialog(vistaC, "Cliente modificado con éxito", "Modificado",
								JOptionPane.INFORMATION_MESSAGE);
						vistaC.cargarTabla(datos.selectClientes());
						vistaC.cambioModificar();
					}else {
						JOptionPane.showMessageDialog(vistaC, "Fallo al modificar el cliente", "Error",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}else {
				vistaC.cambioModificar();
				vistaC.cargarPanelResumen();
			}
		}
		


	}

}
