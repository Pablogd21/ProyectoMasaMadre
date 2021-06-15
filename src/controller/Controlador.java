package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import model.data.Cliente;
import model.data.Pedido;
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
			vistaF.cargarComboBox(datos.selectPedidos());
		} else if (e.getSource().equals(vistaM.getBtnMarketing())) {
			appPrincipal.quitarPanel(vistaM);
			appPrincipal.cargarPanel(vistaMar);
			vistaMar.cargarComboBox(datos.selectClientes());
		} else if (e.getSource().equals(vistaM.getBtnProgramar())) {
			appPrincipal.quitarPanel(vistaM);
			appPrincipal.cargarPanel(vistaP);
			vistaP.cargarComboBox(datos.selectClientes());
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
			int opcionSalirCli = vistaP.salir();
			if (opcionSalirCli == JOptionPane.YES_OPTION) {
				vistaP.vaciarCampos();
				vistaP.cambioModificarHome();
				vistaP.cargarPanelAnadir();
				appPrincipal.quitarPanel(vistaP);
				appPrincipal.cargarPanel(vistaM);
			}
		} else if (e.getSource().equals(vistaP.getBtnResumenPedido())) {
			vistaP.cargarPanelResumen();
			vistaP.cargarTabla(datos.selectPedidos());
		} else if (e.getSource().equals(vistaP.getBtnAniadirPedido())) {
			vistaP.cambioModificarHome();
			vistaP.cargarPanelAnadir();
		} else if (e.getSource().equals(vistaP.getBtnBorrar())) {
			int confirmadoPedido = vistaP.confirmaCancelar();
			if (confirmadoPedido == JOptionPane.YES_OPTION) {
				vistaP.vaciarCampos();
			}
		} else if (e.getSource().equals(vistaP.getBtnGuardar())) {
			Pedido ped = vistaP.generarPedido();
			if (!(ped == null)) {
				int res = datos.insertPedido(ped);
				if (res == 1) {
					JOptionPane.showMessageDialog(vistaP, "Pedido añadido con éxito", "Añadido",
							JOptionPane.INFORMATION_MESSAGE);
					vistaP.vaciarCampos();
				}else {
					JOptionPane.showMessageDialog(vistaP, "Fallo al añadir el pedido", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		} else if (e.getSource().equals(vistaP.getBtnModificar())) {
			int filaMod = vistaP.getTblPedidos().getSelectedRow();
			
			if (filaMod != -1) {
				vistaP.cargarPanelAnadir();
				vistaP.cambioModificarVisible();
				int num = (int) vistaP.getTblModel().getValueAt(filaMod, 0);
				Pedido pedido = datos.selectPedidoId(num);
				Cliente cliCb = datos.selectClienteId(pedido.getIdCliente());
				vistaP.cargarPedido(pedido, cliCb);
				
			} else {
				JOptionPane.showMessageDialog(vistaP, 
						"Debe seleccionar el pedido que desea modificar",
						"Error de selección", JOptionPane.ERROR_MESSAGE);
			}
		} else if (e.getSource().equals(vistaP.getBtnModificarP())) {
			int confirmadoMod = vistaP.confirmaModificar();
			if (confirmadoMod == JOptionPane.YES_OPTION) {
				Pedido PedidoMod = vistaP.generarPedidoMod();
				if (!(PedidoMod == null)) {
					int resMod = datos.updatePedido(PedidoMod);
					if (resMod == 1) {
						JOptionPane.showMessageDialog(vistaP, "Pedido modificado con éxito", "Modificado",
								JOptionPane.INFORMATION_MESSAGE);
						vistaP.cargarTabla(datos.selectPedidos());
						vistaP.cambioModificar();
					}else {
						JOptionPane.showMessageDialog(vistaP, "Fallo al modificar el Pedido", "Error",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			} else {
				vistaP.cambioModificar();
				vistaP.cargarPanelResumen();
			}
		} else if (e.getSource().equals(vistaP.getBtnEliminar())) {
			int filaEl = vistaP.getTblPedidos().getSelectedRow();
			if (filaEl != -1) {
				int confirmado = vistaP.confirmaEliminar();
				if (confirmado == JOptionPane.YES_OPTION) {
					int num = (int) vistaP.getTblModel().getValueAt(filaEl, 0);
					int resEl = datos.deletePedido(num);
					if (resEl == 1) {
						JOptionPane.showMessageDialog(vistaP, "Cliente eliminado con éxito", "Añadido",
								JOptionPane.INFORMATION_MESSAGE);
						vistaP.cargarTabla(datos.selectPedidos());
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
		}else if (e.getSource().equals(vistaMar.getBtnHome())) {
			int opcionSalirMar = vistaMar.salir();
			if (opcionSalirMar == JOptionPane.YES_OPTION) {
				appPrincipal.quitarPanel(vistaMar);
				appPrincipal.cargarPanel(vistaM);
				vistaMar.vaciarCamposCom();
				vistaMar.vaciarCamposEnc();
			}
		} else if (e.getSource().equals(vistaF.getBtnHome())) {
			int opcionSalirF = vistaF.salir();
			if (opcionSalirF == JOptionPane.YES_OPTION) {
				appPrincipal.quitarPanel(vistaF);
				appPrincipal.cargarPanel(vistaM);
				vistaF.vaciarCampos();
			}
		} else if (e.getSource().equals(vistaC.getBtnBorrar())) {
			int confirmadoCliente = vistaC.confirmaCancelar();
			if (confirmadoCliente == JOptionPane.YES_OPTION) {
				vistaC.vaciarCampos();
			}
		}  else if (e.getSource().equals(vistaC.getBtnAnadir())) {
			vistaC.cambioModificarHome();
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
				vistaC.cambioModificarVisible();
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
		} else if (e.getSource().equals(vistaMar.getBtnEnviarCom())) {
			String pass = JOptionPane.showInputDialog(appPrincipal, "Introduce la contraseña de tu cuenta de gmail", "Inicio de sesión", JOptionPane.INFORMATION_MESSAGE);
			Cliente c = (Cliente) vistaMar.getCbCliente().getSelectedItem();
			vistaMar.sendEmail(c.getEmailCliente(), vistaMar.getTxtFieldTituloCom().getText(), vistaMar.getTxtAreaCom().getText(), pass);
		} else if (e.getSource().equals(vistaMar.getBtnCancelarCom())) {
			int confirmadoCom = vistaMar.confirmaCancelar();
			if (confirmadoCom == JOptionPane.YES_OPTION) {
				vistaMar.vaciarCamposCom();
			}
		} else if (e.getSource().equals(vistaMar.getBtnEncuestas())) {
			vistaMar.cargarPanelEnc();
		} else if (e.getSource().equals(vistaMar.getBtnNuevaComunicacion())) {
			vistaMar.cargarPanelCom();
		} else if (e.getSource().equals(vistaMar.getBtnCancelarEncuesta())) {
			int confirmadoEnc = vistaMar.confirmaCancelar();
			if (confirmadoEnc == JOptionPane.YES_OPTION) {
				vistaMar.vaciarCamposEnc();
			}
		} else if (e.getSource().equals(vistaMar.getBtnEnviarEncuesta())) {
			String pass2 = JOptionPane.showInputDialog(appPrincipal, "Introduce la contraseña de tu cuenta de gmail", "Inicio de sesión", JOptionPane.INFORMATION_MESSAGE);
			ArrayList<String> dir = datos.selectEmails();
			vistaMar.sendEmailEncuesta(dir, vistaMar.getTxtFieldTituloEncuesta().getText(), vistaMar.getTxtAreaEncuesta().getText(), pass2);
		} else if (e.getSource().equals(vistaMar.getBtnCrearEnc())) {
			vistaMar.crearEncuesta();
		} else if (e.getSource().equals(vistaF.getBtnEliminarFac())){
			vistaF.cargarPanelEliminar();
			vistaF.cargarTabla(datos.selectFactura());
		} else if (e.getSource().equals(vistaF.getBtnGenerarFac())){
			vistaF.cargarPanelGenerar();
		} else if (e.getSource().equals(vistaF.getBtnBalanceMen())) {
			vistaF.cargarPanelBalance();
		} else if (e.getSource().equals(vistaF.getBtnEliminarFact())) {
			int filaElF = vistaF.getTableDescrip2().getSelectedRow();
			
			if(filaElF != -1) {
				int confirmado = vistaF.confirmaEliminar();
				if (confirmado == JOptionPane.YES_OPTION) {
					int numF = (int) vistaF.getTblModel().getValueAt(filaElF, 0);
					int resElF = datos.deleteFactura(numF);
					if (resElF == 1) {
						JOptionPane.showMessageDialog(vistaF, "Factura eliminada con éxito", "Añadido",
								JOptionPane.INFORMATION_MESSAGE);
						vistaF.cargarTabla(datos.selectFactura());
					}else {
						JOptionPane.showMessageDialog(vistaF, "Fallo al eliminar la factura", "Error",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			} else {
				JOptionPane.showMessageDialog(vistaF, 
						"Debe seleccionar la factura que desea eliminar",
						"Error de selección", JOptionPane.ERROR_MESSAGE);
			}
		} else if (e.getSource().equals(vistaF.getBtnCancelarFac())) {
			int confirmadoCanF = vistaF.confirmaCancelar();
			if (confirmadoCanF == JOptionPane.YES_OPTION) {
				vistaF.vaciarCampos();
			}
		}

	}

}
