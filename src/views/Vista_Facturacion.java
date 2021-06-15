package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import controller.Controlador;
import model.data.Cliente;
import model.data.DatosFactura;
import model.data.Factura;
import model.data.Pedido;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class Vista_Facturacion extends JPanel {
	
	private JTable tableDescrip2;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnGenerarFac, btnEliminarFac, btnBalanceMen, btnGenerarNueva, btnCancelarFac, btnEliminarFact;
	private JButton btnHome;
	private JTextField txtFieldFechaFactura;
	private JLabel lblTotalIngresos;
	private JLabel lblFormato;
	private JTextArea txtAreaFactura;
	JPanel panelEliminarFac, panelGenerarFac, panelBalances;
	JComboBox <String> cbMes,cbAnio;
	JComboBox <Pedido> cbBuscarPedido;
	private JScrollPane scrpFacturas;
	private DefaultTableModel tblModel;
	private JButton btnMostrarBalance;

	
	public Vista_Facturacion() {
		setLayout(null);
		
		this.setSize(1366, 768);
		this.setBackground(new Color(197, 224, 180));
		
		panelBalances = new JPanel();
		panelBalances.setBackground(new Color(197, 224, 180));
		panelBalances.setLayout(null);
		panelBalances.setBounds(377, 30, 979, 659);
		panelBalances.setVisible(false);
		add(panelBalances);
		
		
		JLabel lblBalances = new JLabel("BALANCE MENSUAL");
		lblBalances.setHorizontalAlignment(SwingConstants.CENTER);
		lblBalances.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblBalances.setBounds(0, 25, 979, 50);
		panelBalances.add(lblBalances);
		
		JLabel lblMes_1 = new JLabel("MES:");
		lblMes_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMes_1.setBounds(102, 94, 154, 25);
		panelBalances.add(lblMes_1);
		
		JLabel lblAo_1 = new JLabel("A\u00D1O:");
		lblAo_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAo_1.setBounds(627, 92, 154, 29);
		panelBalances.add(lblAo_1);
		
		JLabel lblTotalFactura = new JLabel("Total Facturas:");
		lblTotalFactura.setFont(new Font("Cambria Math", Font.PLAIN, 25));
		lblTotalFactura.setBounds(627, 183, 178, 38);
		panelBalances.add(lblTotalFactura);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(272, 186, 93, 34);
		panelBalances.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(797, 186, 93, 34);
		panelBalances.add(textField_2);
		
		cbMes = new JComboBox<String>();
		cbMes.setBounds(102, 130, 263, 27);
		panelBalances.add(cbMes);
		
		cbAnio = new JComboBox<String>();
		cbAnio.setBounds(627, 130, 263, 27);
		panelBalances.add(cbAnio);
		
		lblTotalIngresos = new JLabel("Total Ingresos:");
		lblTotalIngresos.setFont(new Font("Cambria Math", Font.PLAIN, 25));
		lblTotalIngresos.setBounds(102, 177, 178, 50);
		panelBalances.add(lblTotalIngresos);
		
		JPanel panel_mostrar = new JPanel();
		panel_mostrar.setBackground(new Color(197, 224, 180));
		panel_mostrar.setBounds(0, 586, 979, 73);
		panelBalances.add(panel_mostrar);
		
		btnMostrarBalance = new JButton("MOSTRAR BALANCE");
		btnMostrarBalance.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnMostrarBalance.setBackground(SystemColor.controlHighlight);
		panel_mostrar.add(btnMostrarBalance);
		
		JLabel lblTituloModulo = new JLabel("Facturaci\u00F3n...");
		lblTituloModulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		lblTituloModulo.setBounds(95, 57, 213, 69);
		add(lblTituloModulo);
		

		JPanel panel_home = new JPanel();
		panel_home.setBackground(new Color(197, 224, 180));
		panel_home.setBounds(25, 11, 32, 32);
		add(panel_home);

		btnHome = new JButton("");
		btnHome.setIcon(new ImageIcon(Vista_Facturacion.class.getResource("/imagenes/home.png")));
		btnHome.setBorder(null);
		btnHome.setBackground(null); 
        btnHome.setContentAreaFilled(false);
		btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				btnHome.setIcon(new ImageIcon(Vista_Facturacion.class.getResource("/imagenes/home_grande.png")));
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				btnHome.setIcon(new ImageIcon(Vista_Facturacion.class.getResource("/imagenes/home.png")));
			}
		});
		panel_home.add(btnHome);

		btnGenerarFac = new JButton("GENERAR FACTURA");
		btnGenerarFac.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnGenerarFac.setBackground(SystemColor.controlHighlight);
		btnGenerarFac.setBounds(25, 307, 330, 64);
		add(btnGenerarFac);
		
		btnEliminarFac = new JButton("ELIMINAR FACTURA");
		btnEliminarFac.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEliminarFac.setBackground(SystemColor.controlHighlight);
		btnEliminarFac.setBounds(25, 381, 330, 64);
		add(btnEliminarFac);
		
		btnBalanceMen = new JButton("BALANCE MENSUAL");
		btnBalanceMen.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBalanceMen.setBackground(SystemColor.controlHighlight);
		btnBalanceMen.setBounds(25, 455, 330, 64);
		add(btnBalanceMen);
		
		panelGenerarFac = new JPanel();
		panelGenerarFac.setLayout(null);
		panelGenerarFac.setBackground(new Color(197, 224, 180));
		panelGenerarFac.setBounds(377, 30, 979, 659);
		add(panelGenerarFac);
		
		JLabel lblTituloPanel = new JLabel("NUEVA FACTURA");
		lblTituloPanel.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblTituloPanel.setBounds(424, 25, 288, 50);
		panelGenerarFac.add(lblTituloPanel);
		
		JLabel lblBuscarPedido = new JLabel("BUSCAR PEDIDO:");
		lblBuscarPedido.setToolTipText("");
		lblBuscarPedido.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblBuscarPedido.setBounds(17, 101, 161, 35);
		panelGenerarFac.add(lblBuscarPedido);
		
		JLabel lblDescripcion = new JLabel("DESCRIPCI\u00D3N:");
		lblDescripcion.setToolTipText("");
		lblDescripcion.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblDescripcion.setBounds(17, 271, 135, 35);
		panelGenerarFac.add(lblDescripcion);
		
		btnGenerarNueva = new JButton("GENERAR");
		btnGenerarNueva.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnGenerarNueva.setBackground(SystemColor.controlHighlight);
		btnGenerarNueva.setBounds(304, 606, 251, 35);
		panelGenerarFac.add(btnGenerarNueva);
		
		btnCancelarFac = new JButton("CANCELAR");
		btnCancelarFac.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelarFac.setBackground(SystemColor.controlHighlight);
		btnCancelarFac.setBounds(589, 606, 251, 35);
		panelGenerarFac.add(btnCancelarFac);
		
		cbBuscarPedido = new JComboBox<Pedido>();
		cbBuscarPedido.setBounds(188, 105, 772, 27);
		panelGenerarFac.add(cbBuscarPedido);
		
		JLabel lblFactura = new JLabel("F.FACTURA:");
		lblFactura.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblFactura.setBounds(17, 173, 171, 35);
		panelGenerarFac.add(lblFactura);
		
		txtFieldFechaFactura = new JTextField();
		txtFieldFechaFactura.setColumns(10);
		txtFieldFechaFactura.setBounds(188, 171, 772, 40);
		panelGenerarFac.add(txtFieldFechaFactura);
		
		lblFormato = new JLabel("(AAAA-MM-DD)");
		lblFormato.setForeground(Color.LIGHT_GRAY);
		lblFormato.setFont(new Font("Cambria Math", Font.PLAIN, 14));
		lblFormato.setBounds(17, 195, 144, 35);
		panelGenerarFac.add(lblFormato);
		
		txtAreaFactura = new JTextArea();
		txtAreaFactura.setBounds(188, 227, 772, 353);
		panelGenerarFac.add(txtAreaFactura);
		
		panelEliminarFac = new JPanel();
		panelEliminarFac.setBackground(new Color(197, 224, 180));
		panelEliminarFac.setLayout(null);
		panelEliminarFac.setBounds(377, 30, 979, 659);
		add(panelEliminarFac);
		panelEliminarFac.setVisible(false);
		
		JLabel lblTituloPanel2 = new JLabel("ELIMINAR FACTURA");
		lblTituloPanel2.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblTituloPanel2.setBounds(422, 28, 334, 50);
		panelEliminarFac.add(lblTituloPanel2);
		
		JLabel lblDescripcion_1 = new JLabel("FACTURAS:");
		lblDescripcion_1.setToolTipText("");
		lblDescripcion_1.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblDescripcion_1.setBounds(32, 141, 135, 35);
		panelEliminarFac.add(lblDescripcion_1);
		
		btnEliminarFact = new JButton("ELIMINAR FACTURA");
		btnEliminarFact.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEliminarFact.setBackground(SystemColor.controlHighlight);
		btnEliminarFact.setBounds(400, 606, 550, 35);//hacer grande
		panelEliminarFac.add(btnEliminarFact);
		
		scrpFacturas = new JScrollPane();
		scrpFacturas.setVisible(true);
		scrpFacturas.setBounds(184, 124, 772, 435);
		panelEliminarFac.add(scrpFacturas);
		
		tableDescrip2 = new JTable();
		configurarTabla();
		tableDescrip2.setRowHeight(40);
		tableDescrip2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrpFacturas.setViewportView(tableDescrip2);
	}
	
	
	
	private void configurarTabla() {
		tblModel = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		tblModel.addColumn("ID FACTURA");
		tblModel.addColumn("F. FACTURA");
		tblModel.addColumn("ID CLIENTE");
		tblModel.addColumn("ID PEDIDO");
		tblModel.addColumn("IMPORTE");

		final DefaultTableCellRenderer cellRend = new DefaultTableCellRenderer();
		cellRend.setHorizontalAlignment(SwingConstants.CENTER);

		tableDescrip2.setModel(tblModel);

		tableDescrip2.getColumn("ID FACTURA").setCellRenderer(cellRend);
		tableDescrip2.getColumn("F. FACTURA").setCellRenderer(cellRend);
		tableDescrip2.getColumn("ID CLIENTE").setCellRenderer(cellRend);
		tableDescrip2.getColumn("ID PEDIDO").setCellRenderer(cellRend);
		tableDescrip2.getColumn("IMPORTE").setCellRenderer(cellRend);

		tableDescrip2.getColumn("ID FACTURA").setPreferredWidth(20);
		tableDescrip2.getColumn("F. FACTURA").setPreferredWidth(40);
		tableDescrip2.getColumn("ID CLIENTE").setPreferredWidth(20);
		tableDescrip2.getColumn("ID PEDIDO").setPreferredWidth(20);
		tableDescrip2.getColumn("IMPORTE").setPreferredWidth(40);
	}

	public void cargarTabla(ArrayList<Factura> listaFacturas) {
		tblModel.getDataVector().clear();

		Object[] fila = new Object[7];

		for (Factura fac : listaFacturas) {
			fila[0] = fac.getIdFactura();
			fila[1] = fac.getFechaFactura();
			fila[2] = fac.getIdCliente();
			fila[3] = fac.getIdPedido();
			fila[4] = fac.getImporteFactura();

			tblModel.addRow(fila);
		}
	}

	public JButton getBtnHome() {
		return btnHome;
	}
	
	public DefaultTableModel getTblModel() {
		return tblModel;
	}

	public JTable getTableDescrip2() {
		return tableDescrip2;
	}

	public JButton getBtnMostrarBalance() {
		return btnMostrarBalance;
	}

	public JButton getBtnGenerarFac() {
		return btnGenerarFac;
	}

	public JButton getBtnEliminarFac() {
		return btnEliminarFac;
	}

	public JButton getBtnBalanceMen() {
		return btnBalanceMen;
	}

	public JButton getBtnGenerarNueva() {
		return btnGenerarNueva;
	}

	public JButton getBtnCancelarFac() {
		return btnCancelarFac;
	}

	public JButton getBtnEliminarFact() {
		return btnEliminarFact;
	}

	public void setControlador(Controlador controlador) {
		btnHome.addActionListener(controlador);
		btnMostrarBalance.addActionListener(controlador);
		btnGenerarFac.addActionListener(controlador);
		btnEliminarFac.addActionListener(controlador);
		btnBalanceMen.addActionListener(controlador);
		btnGenerarNueva.addActionListener(controlador);
		btnCancelarFac.addActionListener(controlador);
		btnEliminarFact.addActionListener(controlador);
	}
	
	public void cargarComboBox(ArrayList<Pedido> array) {
		DefaultComboBoxModel<Pedido> cmbModel = new DefaultComboBoxModel<>();

		for (Pedido pedido : array) {
			cmbModel.addElement(pedido);
		}
		cbBuscarPedido.setModel(cmbModel);
	}
	
	public void cargarPanelEliminar() {
		if (!panelEliminarFac.isVisible()) {
			panelGenerarFac.setVisible(false);
			panelBalances.setVisible(false);
			panelEliminarFac.setVisible(true);
			this.repaint();
		}
	}

	public void cargarPanelGenerar() {
		if (!panelGenerarFac.isVisible()) {
			panelEliminarFac.setVisible(false);
			panelBalances.setVisible(false);
			panelGenerarFac.setVisible(true);
			this.repaint();
		}
	}
	
	public void cargarPanelBalance() {
		if (!panelBalances.isVisible()) {
			panelEliminarFac.setVisible(false);
			panelGenerarFac.setVisible(false);
			panelBalances.setVisible(true);
			this.repaint();
		}
	}
	
	public Factura generarFactura() {
		Factura factura = null;

		if (txtFieldFechaFactura.getText().equals("") || txtAreaFactura.getText().equals("")) {
			JOptionPane.showMessageDialog(this, "Introduzca todos los datos por favor", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else if (formatoFecha()) {
			JOptionPane.showMessageDialog(this, "El formato de la fecha debe ser AAAA-MM-DD", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else {
				Pedido p = (Pedido) cbBuscarPedido.getSelectedItem();
				factura = new Factura(0, p.getIdPedido(), p.getIdCliente(), p.getImportePedido(), txtFieldFechaFactura.getText());
		}
		return factura;
	}
	
	private boolean formatoFecha() {
		String fech = txtFieldFechaFactura.getText();
		String[] fechaComp = fech.split("-");
		boolean fechaCorrecta = false;
		Pattern pFe = Pattern.compile("^\\d{4}([\\-/.])(0?[1-9]|1[1-2])\\1(3[01]|[12][0-9]|0?[1-9])$");
		Matcher mFe = pFe.matcher(fech);
		if (mFe.find()) {
			int anio = Integer.parseInt(fechaComp[0]);
			int mes = Integer.parseInt(fechaComp[1]);
			int dia = Integer.parseInt(fechaComp[2]);

			if (anio < 1920 ) {
				fechaCorrecta = false;
			} else {
				if (mes > 0 && mes < 13) {
					if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
						if (dia > 0 && dia < 32) {
							fechaCorrecta = true;
						} else {
							fechaCorrecta = false;
						}
					} else if (mes == 2) {
						if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
							if (dia > 0 && dia < 30) {
								fechaCorrecta = true;
							} else {
								fechaCorrecta = false;
							}
						} else {
							if (dia > 0 && dia < 29) {
								fechaCorrecta = true;
							} else {
								fechaCorrecta = false;
							}
						}
					} else {
						if (dia > 0 && dia < 31) {
							fechaCorrecta = true;
						} else {
							fechaCorrecta = false;
						}
					}
				} else {
					fechaCorrecta = false;
				}
			}
		}
		if (fechaCorrecta == true) {
			return false;
		} else {
			return true;
		}
	}
	
	
	public int confirmaEliminar() {
		int opcion = JOptionPane.showConfirmDialog(this, "¿Desea eliminar la factura de la base de datos?", "Eliminar",
				JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
		return opcion;
	}
	
	public int confirmaCancelar() {
		int opcion4 = JOptionPane.showConfirmDialog(this, "¿Desea borrar los campos?", "Borrar",
				JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
		return opcion4;
	
	}
	
	public int salir() {
		int opcion3 = JOptionPane.showConfirmDialog(this, "¿Desea volver al menú principal?", "Volver",
				JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
		return opcion3;
	}

	public void vaciarCampos() {
		txtAreaFactura.setText("");
		txtFieldFechaFactura.setText("");
	}
	
	public int generarDocFactura(DatosFactura data) {
		int resDoc = 0;
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			String desktopRuta = System.getProperty("user.home") + "/Desktop";
			fw = new FileWriter(
					desktopRuta + "/Factura_" + data.getIdPedido() + "_" + data.getNombreCliente() + "_" + data.getApellidoCliente() + ".txt");
			bw = new BufferedWriter(fw);

			bw.write("************ DETALLES DE LA FACTURA ************");
			bw.newLine();
			bw.newLine();
			bw.write("DATOS CLIENTE:");
			bw.newLine();
			bw.newLine();
			bw.write("Nombre: " + data.getNombreCliente());
			bw.newLine();
			bw.write("Apellido: " + data.getApellidoCliente());
			bw.newLine();
			bw.write("Teléfono: " + data.getTelefonoCliente());
			bw.newLine();
			bw.write("E-mail: " + data.getEmailCliente());
			bw.newLine();
			bw.write("Dirección: " + data.getDireccionCliente());
			bw.newLine();
			bw.newLine();
			bw.write("DATOS PEDIDO: ");
			bw.newLine();
			bw.newLine();
			bw.write("idPedido: " + data.getIdPedido());
			bw.newLine();
			bw.write("Descripción: " + data.getDescripcionPedido());
			bw.newLine();
			bw.newLine();
			bw.write("DATOS FACTURA: ");
			bw.newLine();
			bw.newLine();
			bw.write("Fecha Facturación: " + txtFieldFechaFactura.getText());
			bw.newLine();
			bw.write("Descripción de Factura: " + txtAreaFactura.getText());
			bw.newLine();
			bw.write("Importe: " + data.getImportePedido() + " euros");
			bw.newLine();
			bw.newLine();
			bw.write("****************************************************");

		} catch (IOException ex) {
			resDoc = -100;
			ex.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		
		return resDoc;
	}
}