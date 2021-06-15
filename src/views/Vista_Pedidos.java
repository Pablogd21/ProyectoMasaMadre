package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import controller.Controlador;
import model.data.Cliente;
import model.data.Pedido;

public class Vista_Pedidos extends JPanel {

	private JButton btnAniadirPedido;
	private JButton btnResumenPedido;
	private JButton btnHome;
	private JLabel lblBuscarCliente;
	private JLabel lblFecha;
	private JLabel lblDescripcion;
	private JLabel lblImporte;
	private JTextArea txtAreaDescrip;
	private JTextField txtFecha;
	private JTextField txtImporte;
	private JPanel panel_home;
	private JPanel panel_botones;
	private JPanel panel_aniadir;
	private JButton btnGuardar;
	private JButton btnBorrar;
	private JComboBox<Cliente> cbCliente;
	private DefaultTableModel tblModel;
	private JPanel panel_resumen;
	private JPanel panel_titulo;
	private JLabel lblTitulo;
	private JPanel panel_botonesResumen;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JScrollPane scrpPedidos;
	private JTable tblPedidos;
	private JButton btnModificarP;
	private JTextField txtId;

	public Vista_Pedidos() {
		setLayout(null);

		this.setSize(1366, 768);
		this.setBackground(new Color(197, 224, 180));

		panel_aniadir = new JPanel();
		panel_aniadir.setBounds(294, 31, 1000, 662);
		panel_aniadir.setBackground(new Color(197, 224, 180));
		add(panel_aniadir);
		panel_aniadir.setLayout(null);

		lblBuscarCliente = new JLabel("Nombre del Cliente:");
		lblBuscarCliente.setBounds(10, 23, 121, 30);
		panel_aniadir.add(lblBuscarCliente);

		lblFecha = new JLabel("Fecha del Pedido:");
		lblFecha.setBounds(10, 64, 107, 30);
		panel_aniadir.add(lblFecha);

		lblDescripcion = new JLabel("Descripci\u00F3n:");
		lblDescripcion.setBounds(10, 105, 85, 30);
		panel_aniadir.add(lblDescripcion);

		lblImporte = new JLabel("Importe:");
		lblImporte.setBounds(10, 390, 65, 14);
		panel_aniadir.add(lblImporte);

		panel_botones = new JPanel();
		panel_botones.setBounds(10, 447, 980, 134);
		panel_botones.setBackground(new Color(197, 224, 180));
		panel_aniadir.add(panel_botones);
		panel_botones.setLayout(null);

		btnGuardar = new JButton("GUARDAR");
		btnGuardar.setBounds(660, 45, 150, 39);
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_botones.add(btnGuardar);

		btnBorrar = new JButton("BORRAR");
		btnBorrar.setBounds(820, 45, 150, 39);
		btnBorrar.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_botones.add(btnBorrar);
		
		btnModificarP = new JButton("MODIFICAR");
		btnModificarP.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnModificarP.setBounds(660, 45, 150, 39);
		btnModificarP.setVisible(false);
		panel_botones.add(btnModificarP);

		txtAreaDescrip = new JTextArea();
		txtAreaDescrip.setWrapStyleWord(true);
		txtAreaDescrip.setLineWrap(true);
		txtAreaDescrip.setBounds(368, 118, 622, 255);
		panel_aniadir.add(txtAreaDescrip);

		txtFecha = new JTextField();
		txtFecha.setColumns(10);
		txtFecha.setBounds(368, 69, 622, 20);
		panel_aniadir.add(txtFecha);

		txtImporte = new JTextField();
		txtImporte.setBounds(835, 387, 155, 20);
		panel_aniadir.add(txtImporte);
		txtImporte.setColumns(10);

		cbCliente = new JComboBox<Cliente>();
		cbCliente.setBounds(368, 27, 622, 22);
		panel_aniadir.add(cbCliente);

		btnAniadirPedido = new JButton("A\u00F1adir Pedido");
		btnAniadirPedido.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnAniadirPedido.setBounds(49, 203, 195, 65);
		add(btnAniadirPedido);

		btnResumenPedido = new JButton("Resumen Pedido");
		btnResumenPedido.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnResumenPedido.setBounds(49, 292, 195, 65);
		add(btnResumenPedido);

		panel_home = new JPanel();
		panel_home.setBackground(new Color(197, 224, 180));
		panel_home.setBounds(25, 11, 32, 32);
		add(panel_home);

		btnHome = new JButton("");
		btnHome.setIcon(new ImageIcon(".\\images\\home.png"));
		btnHome.setBorder(null);
		btnHome.setBackground(null);
		btnHome.setContentAreaFilled(false);
		btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				btnHome.setIcon(new ImageIcon(".\\images\\home_grande.png"));
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				btnHome.setIcon(new ImageIcon(".\\images\\home.png"));
			}
		});
		panel_home.add(btnHome);
		
		panel_resumen = new JPanel();
		panel_resumen.setBounds(294, 31, 1000, 662);
		panel_resumen.setBackground(new Color(197, 224, 180));
		add(panel_resumen);
		panel_resumen.setLayout(new BorderLayout(0, 0));
		
		panel_titulo = new JPanel();
		panel_titulo.setBackground(new Color(197, 224, 180));
		panel_resumen.add(panel_titulo, BorderLayout.NORTH);
		
		lblTitulo = new JLabel("RESUMEN PEDIDOS");
		panel_titulo.add(lblTitulo);
		
		panel_botonesResumen = new JPanel();
		panel_botonesResumen.setBackground(new Color(197, 224, 180));
		btnModificar = new JButton("MODIFICAR");
		btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_botonesResumen.add(btnModificar);
		
		btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_botonesResumen.add(btnEliminar);
		
		
		panel_resumen.add(panel_botonesResumen, BorderLayout.SOUTH);
		
		scrpPedidos = new JScrollPane();
		scrpPedidos.setVisible(true);
		panel_resumen.add(scrpPedidos, BorderLayout.CENTER);
		
		tblPedidos = new JTable();
		configurarTabla();
		tblPedidos.setRowHeight(40);
		tblPedidos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrpPedidos.setViewportView(tblPedidos);
		
		txtId = new JTextField();
		txtId.setVisible(false);
		
		panel_aniadir.setVisible(true);
		panel_resumen.setVisible(false);

	}

	private void configurarTabla() {
		tblModel = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		tblModel.addColumn("ID");
		tblModel.addColumn("DESCRIPCION");
		tblModel.addColumn("FECHA PEDIDO");
		tblModel.addColumn("ID CLIENTE");
		tblModel.addColumn("IMPORTE");

		final DefaultTableCellRenderer cellRend = new DefaultTableCellRenderer();
		cellRend.setHorizontalAlignment(SwingConstants.CENTER);
		
		tblPedidos.setModel(tblModel);
		
		tblPedidos.getColumn("ID").setCellRenderer(cellRend);
		tblPedidos.getColumn("DESCRIPCION").setCellRenderer(cellRend);
		tblPedidos.getColumn("FECHA PEDIDO").setCellRenderer(cellRend);
		tblPedidos.getColumn("ID CLIENTE").setCellRenderer(cellRend);
		tblPedidos.getColumn("IMPORTE").setCellRenderer(cellRend);
		
		
		
		tblPedidos.getColumn("ID").setPreferredWidth(5);
		tblPedidos.getColumn("DESCRIPCION").setPreferredWidth(100);
		tblPedidos.getColumn("FECHA PEDIDO").setPreferredWidth(30);
		tblPedidos.getColumn("ID CLIENTE").setPreferredWidth(5);
		tblPedidos.getColumn("IMPORTE").setPreferredWidth(20);

	}

	public void cargarComboBox(ArrayList<Cliente> array) {
		DefaultComboBoxModel<Cliente> cmbModel = new DefaultComboBoxModel<>();

		for (Cliente cliente : array) {

			cmbModel.addElement(cliente);
		}

		cbCliente.setModel(cmbModel);

	}

	public void setControlador(Controlador controlador) {
		btnHome.addActionListener(controlador);
		btnAniadirPedido.addActionListener(controlador);
		btnResumenPedido.addActionListener(controlador);
		btnBorrar.addActionListener(controlador);
		btnGuardar.addActionListener(controlador);
		btnModificar.addActionListener(controlador);
		btnEliminar.addActionListener(controlador);
		btnModificarP.addActionListener(controlador);

	}

	public void vaciarCampos() {
		txtAreaDescrip.setText("");
		txtFecha.setText("");
		txtImporte.setText("");

	}

	public int confirmaEliminar() {
		int opcion = JOptionPane.showConfirmDialog(this, "¿Desea eliminar el pedido de la base de datos?", "Eliminar",
				JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
		return opcion;
	}

	public int confirmaModificar() {
		int opcion2 = JOptionPane.showConfirmDialog(this, "¿Desea modificar el pedido en la base de datos?",
				"Modificar", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
		return opcion2;
	}

	public int salir() {
		int opcion3 = JOptionPane.showConfirmDialog(this, "¿Desea volver al menú principal?", "Volver",
				JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
		return opcion3;
	}
	
	public int confirmaCancelar() {
		int opcion4 = JOptionPane.showConfirmDialog( this, "¿Desea borrar los campos?", "Borrar", JOptionPane.YES_NO_OPTION,
				 JOptionPane.WARNING_MESSAGE); 
		return opcion4;
	}

	public void cargarPanelAnadir() {
		if (!panel_aniadir.isVisible()) {
			panel_resumen.setVisible(false);
			panel_aniadir.setVisible(true);
			this.repaint();
		}

	}

	public void cargarPanelResumen() {
		if (!panel_resumen.isVisible()) {
			panel_aniadir.setVisible(false);
			panel_resumen.setVisible(true);
			this.repaint();
		}

	}

	public void cargarTabla(ArrayList<Pedido> listaPedidos) {
		tblModel.getDataVector().clear();

		Object[] fila = new Object[7];

		for (Pedido ped : listaPedidos) {
			fila[0] = ped.getIdPedido();
			fila[1] = ped.getDescripcionPedido();
			fila[2] = ped.getFechaPedido();
			fila[3] = ped.getIdCliente();
			fila[4] = (ped.getPrecioPedido() + " €");

			tblModel.addRow(fila);
		}
	}

	public Pedido generarPedido() {
		Pedido pedido = null;

		// TODO hacer comprobacion combo box
		if (txtFecha.getText().equals("") || txtAreaDescrip.getText().equals("") || txtImporte.getText().equals("")) {
			JOptionPane.showMessageDialog(this, "Introduzca todos los datos por favor", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else if (formatoFecha()) {
			JOptionPane.showMessageDialog(this, "El formato de la fecha debe ser AAAA-MM-DD", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else if (formatoImporte()) {
			JOptionPane.showMessageDialog(this, "El importe solo puede contener puntos para los decimales", "Error", JOptionPane.ERROR_MESSAGE);
		} else {
			String tel = txtImporte.getText();
			NumberFormat format = NumberFormat.getInstance(Locale.getDefault());
			try {
				Number number = format.parse(tel);
				Double importe = number.doubleValue();
				Cliente p = (Cliente) cbCliente.getSelectedItem();
				pedido = new Pedido(p.getIdCliente(), txtAreaDescrip.getText(), importe,
						txtFecha.getText());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return pedido;
	}

	public boolean formatoImporte() {
		return false;
		

		
	}

	private boolean formatoFecha() {
		String fech = txtFecha.getText();
		String[] fechaComp = fech.split("-");
		boolean fechaCorrecta = false;
		Pattern pFe = Pattern.compile("^\\d{4}([\\-/.])(0?[1-9]|1[1-2])\\1(3[01]|[12][0-9]|0?[1-9])$");
		Matcher mFe = pFe.matcher(fech);
		if (mFe.find()) {
			int anio = Integer.parseInt(fechaComp[0]);
			int mes = Integer.parseInt(fechaComp[1]);
			int dia = Integer.parseInt(fechaComp[2]);

			Calendar cal = Calendar.getInstance();
			int anioAct = cal.get(Calendar.YEAR);
			if (anio < 1920 || anio > (anioAct - 18)) {
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
	
	public void cargarPedido(Pedido pedido) {
		cbCliente.setSelectedItem(pedido.getIdCliente());
		txtFecha.setText(pedido.getFechaPedido());
		txtAreaDescrip.setText(pedido.getDescripcionPedido());
		txtImporte.setText(pedido.getImportePedido1());
		txtId.setText(pedido.getIdPedido() + "");
	}
	
	public void cambioModificar() {
		if(btnGuardar.isVisible()) {
			btnGuardar.setVisible(false);
			btnModificarP.setVisible(true);
		} else if (btnModificarP.isVisible()) {
			btnModificarP.setVisible(false);
			btnGuardar.setVisible(true);
		}
		vaciarCampos();
	}
	
	public void cambioModificarHome() {
		if (btnModificarP.isVisible()) {
			btnModificarP.setVisible(false);
			btnGuardar.setVisible(true);
		}
		vaciarCampos();
	}
	
	public Pedido generarPedidoMod() {
		Pedido pedido = null;
		// TODO comprobacion combo box
		if (txtFecha.getText().equals("") || txtAreaDescrip.getText().equals("") || txtImporte.getText().equals("")) {
			JOptionPane.showMessageDialog(this, "Introduzca todos los datos por favor", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else if (formatoFecha()) {
			JOptionPane.showMessageDialog(this, "El formato de la fecha debe ser AAAA-MM-DD", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else if (formatoImporte()) {
			JOptionPane.showMessageDialog(this, "Introduzca un número de teléfono válido por favor", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else {
			Cliente p = (Cliente) cbCliente.getSelectedItem();
			pedido = new Pedido(Integer.parseInt(txtId.getText()), txtAreaDescrip.getText(),txtFecha.getText(), p.getIdCliente(),Double.parseDouble(txtImporte.getText()));
		}
	return pedido;
	}

	public JButton getBtnAniadirPedido() {
		return btnAniadirPedido;
	}

	public JButton getBtnResumenPedido() {
		return btnResumenPedido;
	}

	public JButton getBtnHome() {
		return btnHome;
	}

	public JTextArea getTxtAreaDescrip() {
		return txtAreaDescrip;
	}

	public JComboBox<Cliente> getCbCliente() {
		return cbCliente;
	}

	public JTextField getTxtFecha() {
		return txtFecha;
	}

	public JTextField getTxtImporte() {
		return txtImporte;
	}

	public JButton getBtnGuardar() {
		return btnGuardar;
	}

	public JButton getBtnBorrar() {
		return btnBorrar;
	}

	public DefaultTableModel getTblModel() {
		return tblModel;
	}

	public JButton getBtnModificar() {
		return btnModificar;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public JTable getTblPedidos() {
		return tblPedidos;
	}

	public JButton getBtnModificarP() {
		return btnModificarP;
	}

}
