package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.SystemColor;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

public class Vista_Clientes extends JPanel {

	private JButton btnAnadir, btnResumen, btnModificar, btnEliminar, btnHome, btnBorrar, btnGuardar, btnMod;
	private JTextField txtFieldNombre, txtId;
	private JTextField txtFieldApellido;
	private JTextField txtFieldEmail;
	private JTextField txtFieldNacimiento;
	private JTextField txtFieldDireccion;
	private JTextField txtFieldTelefono;
	private JPanel panelAnadir, panelResumen;
	private DefaultTableModel tblModel;
	private JScrollPane scrpClientes;
	private JTable tblClientes;

	public Vista_Clientes() {

		setLayout(null);

		this.setSize(1366, 768);
		this.setBackground(new Color(197, 224, 180));

		JLabel lblTituloModulo = new JLabel("Clientes ...");
		lblTituloModulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		lblTituloModulo.setBounds(117, 57, 213, 69);
		add(lblTituloModulo);

		btnAnadir = new JButton("A\u00D1ADIR");
		btnAnadir.setBackground(SystemColor.controlHighlight);
		btnAnadir.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAnadir.setBounds(25, 307, 330, 64);
		add(btnAnadir);

		btnResumen = new JButton("RESUMEN");
		btnResumen.setBackground(SystemColor.controlHighlight);
		btnResumen.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnResumen.setBounds(25, 381, 330, 64);
		add(btnResumen);

		panelAnadir = new JPanel();
		panelAnadir.setLayout(null);
		panelAnadir.setBackground(new Color(197, 224, 180));
		panelAnadir.setBounds(377, 30, 979, 659);
		add(panelAnadir);

		JLabel lblNombre = new JLabel("NOMBRE:");
		lblNombre.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblNombre.setBounds(58, 142, 135, 35);
		lblNombre.setBounds(32, 141, 135, 35);
		panelAnadir.add(lblNombre);

		JLabel lblApellido = new JLabel("APELLIDO:");
		lblApellido.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblApellido.setBounds(58, 212, 142, 35);
		lblApellido.setBounds(32, 211, 142, 35);
		panelAnadir.add(lblApellido);

		JLabel lblEmail = new JLabel("E-MAIL:");
		lblEmail.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblEmail.setBounds(58, 301, 116, 37);
		lblEmail.setBounds(32, 299, 116, 37);
		panelAnadir.add(lblEmail);

		JLabel lblDatosCliente = new JLabel("DATOS CLIENTE");
		lblDatosCliente.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblDatosCliente.setBounds(422, 28, 288, 50);
		panelAnadir.add(lblDatosCliente);

		btnMod = new JButton("MODIFICAR");
		btnMod.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnMod.setBackground(SystemColor.controlHighlight);
		btnMod.setBounds(283, 588, 251, 43);

		btnMod = new JButton("MODIFICAR");
		btnMod.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnMod.setBackground(SystemColor.controlHighlight);
		btnMod.setBounds(304, 606, 251, 35);

		btnMod.setVisible(false);
		panelAnadir.add(btnMod);

		btnGuardar = new JButton("GUARDAR");
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnGuardar.setBackground(SystemColor.controlHighlight);
		btnGuardar.setBounds(283, 588, 251, 43);
		btnGuardar.setBounds(304, 606, 251, 35);
		panelAnadir.add(btnGuardar);

		btnBorrar = new JButton("BORRAR");
		btnBorrar.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnBorrar.setBackground(SystemColor.controlHighlight);
		btnBorrar.setBounds(589, 606, 251, 35);
		panelAnadir.add(btnBorrar);

		txtId = new JTextField();
		txtId.setVisible(false);

		txtFieldNombre = new JTextField();
		txtFieldNombre.setColumns(10);
		txtFieldNombre.setBounds(198, 134, 748, 50);
		panelAnadir.add(txtFieldNombre);

		JLabel lblFnacimiento = new JLabel("F.NACIMIENTO:");
		lblFnacimiento.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblFnacimiento.setBounds(32, 372, 171, 35);
		panelAnadir.add(lblFnacimiento);

		JLabel lblFormato = new JLabel("(AAAA-MM-DD)");
		lblFormato.setFont(new Font("Cambria Math", Font.PLAIN, 14));
		lblFormato.setForeground(Color.LIGHT_GRAY);
		lblFormato.setBounds(46, 388, 171, 35);
		panelAnadir.add(lblFormato);

		JLabel lblDireccion = new JLabel("DIRECCIÓN:");
		lblDireccion.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblDireccion.setBounds(43, 452, 171, 35);
		lblDireccion.setBounds(32, 451, 171, 35);
		panelAnadir.add(lblDireccion);

		JLabel lblTelefono = new JLabel("TELÉFONO:");
		lblTelefono.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblTelefono.setBounds(43, 517, 171, 35);
		lblTelefono.setBounds(32, 516, 171, 35);
		panelAnadir.add(lblTelefono);

		txtFieldApellido = new JTextField();
		txtFieldApellido.setColumns(10);
		txtFieldApellido.setBounds(198, 204, 748, 50);
		panelAnadir.add(txtFieldApellido);

		txtFieldEmail = new JTextField();
		txtFieldEmail.setColumns(10);
		txtFieldEmail.setBounds(198, 293, 748, 50);
		panelAnadir.add(txtFieldEmail);

		txtFieldNacimiento = new JTextField();
		txtFieldNacimiento.setColumns(10);
		txtFieldNacimiento.setBounds(198, 366, 748, 50);
		panelAnadir.add(txtFieldNacimiento);

		txtFieldDireccion = new JTextField();
		txtFieldDireccion.setColumns(10);
		txtFieldDireccion.setBounds(198, 444, 748, 50);
		panelAnadir.add(txtFieldDireccion);

		txtFieldTelefono = new JTextField();
		txtFieldTelefono.setColumns(10);
		txtFieldTelefono.setBounds(198, 509, 748, 50);
		panelAnadir.add(txtFieldTelefono);

		BorderLayout layResumen = new BorderLayout();
		panelResumen = new JPanel();
		panelResumen.setBackground(new Color(197, 224, 180));
		panelResumen.setBounds(377, 30, 979, 659);
		add(panelResumen);
		panelResumen.setLayout(layResumen);

		FlowLayout flTit = new FlowLayout(FlowLayout.CENTER);
		JPanel pnlTituloRes = new JPanel();
		pnlTituloRes.setBackground(new Color(197, 224, 180));
		pnlTituloRes.setLayout(flTit);
		JLabel lblResumenCliente = new JLabel("Resumen Cliente");
		lblResumenCliente.setBounds(402, 10, 286, 39);
		lblResumenCliente.setFont(new Font("Tahoma", Font.BOLD, 32));
		pnlTituloRes.add(lblResumenCliente);
		panelResumen.add(pnlTituloRes, BorderLayout.NORTH);

		scrpClientes = new JScrollPane();
		scrpClientes.setVisible(true);
		panelResumen.add(scrpClientes, BorderLayout.CENTER);

		tblClientes = new JTable();
		configurarTabla();
		tblClientes.setRowHeight(40);
		tblClientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrpClientes.setViewportView(tblClientes);

		FlowLayout flBot = new FlowLayout(FlowLayout.CENTER, 60, 10);
		JPanel pnlBtnRes = new JPanel();
		pnlBtnRes.setBackground(new Color(197, 224, 180));
		pnlBtnRes.setLayout(flBot);

		Dimension dBtn = new Dimension(300, 40);

		btnModificar = new JButton("MODIFICAR");
		btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnModificar.setBackground(SystemColor.controlHighlight);
		btnModificar.setPreferredSize(dBtn);
		pnlBtnRes.add(btnModificar);

		btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEliminar.setBackground(SystemColor.controlHighlight);
		btnEliminar.setPreferredSize(dBtn);
		pnlBtnRes.add(btnEliminar);

		panelResumen.add(pnlBtnRes, BorderLayout.SOUTH);

		JPanel panel_home = new JPanel();
		panel_home.setBackground(new Color(197, 224, 180));
		panel_home.setBounds(25, 11, 32, 32);
		add(panel_home);

		btnHome = new JButton("");
		btnHome.setIcon(new ImageIcon(Vista_Clientes.class.getResource("/imagenes/home.png")));
		btnHome.setBorder(null);
		btnHome.setBackground(null);
		btnHome.setContentAreaFilled(false);
		btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				btnHome.setIcon(new ImageIcon(Vista_Clientes.class.getResource("/imagenes/home_grande.png")));
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				btnHome.setIcon(new ImageIcon(Vista_Clientes.class.getResource("/imagenes/home.png")));
			}
		});
		panel_home.add(btnHome);

		panelAnadir.setVisible(true);
		panelResumen.setVisible(false);

	}

	public JTextField getTxtId() {
		return txtId;
	}

	private void configurarTabla() {
		tblModel = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		tblModel.addColumn("ID");
		tblModel.addColumn("NOMBRE");
		tblModel.addColumn("APELLIDO");
		tblModel.addColumn("EMAIL");
		tblModel.addColumn("TELÉFONO");
		tblModel.addColumn("F. NACIMIENTO");
		tblModel.addColumn("DIRECCIÓN");

		final DefaultTableCellRenderer cellRend = new DefaultTableCellRenderer();
		cellRend.setHorizontalAlignment(SwingConstants.CENTER);

		tblClientes.setModel(tblModel);

		tblClientes.getColumn("ID").setCellRenderer(cellRend);
		tblClientes.getColumn("NOMBRE").setCellRenderer(cellRend);
		tblClientes.getColumn("APELLIDO").setCellRenderer(cellRend);
		tblClientes.getColumn("EMAIL").setCellRenderer(cellRend);
		tblClientes.getColumn("TELÉFONO").setCellRenderer(cellRend);
		tblClientes.getColumn("F. NACIMIENTO").setCellRenderer(cellRend);
		tblClientes.getColumn("DIRECCIÓN").setCellRenderer(cellRend);

		tblClientes.getColumn("ID").setPreferredWidth(5);
		tblClientes.getColumn("NOMBRE").setPreferredWidth(20);
		tblClientes.getColumn("APELLIDO").setPreferredWidth(30);
		tblClientes.getColumn("EMAIL").setPreferredWidth(90);
		tblClientes.getColumn("TELÉFONO").setPreferredWidth(25);
		tblClientes.getColumn("F. NACIMIENTO").setPreferredWidth(30);
		tblClientes.getColumn("DIRECCIÓN").setPreferredWidth(90);

	}

	public void cargarTabla(ArrayList<Cliente> listaClientes) {
		tblModel.getDataVector().clear();

		Object[] fila = new Object[7];

		for (Cliente cli : listaClientes) {
			fila[0] = cli.getIdCliente();
			fila[1] = cli.getNombreCliente();
			fila[2] = cli.getApellidoCliente();
			fila[3] = cli.getEmailCliente();
			fila[4] = cli.getTelefonoCliente();
			fila[5] = cli.getFechaNaCliente();
			fila[6] = cli.getDireccionCliente();

			tblModel.addRow(fila);
		}

	}

	public void cargarPanelAnadir() {
		if (!panelAnadir.isVisible()) {
			panelResumen.setVisible(false);
			panelAnadir.setVisible(true);
			this.repaint();
		}
	}

	public void cargarPanelResumen() {
		if (!panelResumen.isVisible()) {
			panelAnadir.setVisible(false);
			panelResumen.setVisible(true);
			this.repaint();
		}
	}

	public void cambioModificar() {
		if (btnMod.isVisible()) {
			btnMod.setVisible(false);
			btnGuardar.setVisible(true);
		} else if (btnGuardar.isVisible()) {
			btnGuardar.setVisible(false);
			btnMod.setVisible(true);
		}
		vaciarCampos();
	}

	public void cambioModificarHome() {
		if (btnMod.isVisible()) {
			btnMod.setVisible(false);
			btnGuardar.setVisible(true);
		}
		vaciarCampos();
	}

	public void cambioModificarVisible() {
		btnMod.setVisible(true);
		btnGuardar.setVisible(false);
		vaciarCampos();
	}

	public JButton getBtnMod() {
		return btnMod;
	}

	public JTable getTable() {
		return tblClientes;
	}

	public JButton getBtnAnadir() {
		return btnAnadir;
	}

	public JButton getBtnResumen() {
		return btnResumen;
	}

	public JButton getBtnModificar() {
		return btnModificar;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public JButton getBtnHome() {
		return btnHome;
	}

	public JButton getBtnBorrar() {
		return btnBorrar;
	}

	public JButton getBtnGuardar() {
		return btnGuardar;
	}

	public void setControlador(Controlador controlador) {
		btnAnadir.addActionListener(controlador);
		btnResumen.addActionListener(controlador);
		btnGuardar.addActionListener(controlador);
		btnModificar.addActionListener(controlador);
		btnEliminar.addActionListener(controlador);
		btnBorrar.addActionListener(controlador);
		btnHome.addActionListener(controlador);
		btnMod.addActionListener(controlador);
	}

	public DefaultTableModel getTblModel() {
		return tblModel;
	}

	public void vaciarCampos() {
		txtFieldDireccion.setText("");
		txtFieldTelefono.setText("");
		txtFieldApellido.setText("");
		txtFieldEmail.setText("");
		txtFieldNacimiento.setText("");
		txtFieldNombre.setText("");
	}

	public Cliente generarCliente() {
		Cliente cliente = null;

		if (txtFieldNombre.getText().equals("") || txtFieldApellido.getText().equals("")
				|| txtFieldEmail.getText().equals("") || txtFieldTelefono.getText().equals("")
				|| txtFieldNacimiento.getText().equals("") || txtFieldDireccion.getText().equals("")) {
			JOptionPane.showMessageDialog(this, "Introduzca todos los datos por favor", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else if (formatoEmail()) {
			JOptionPane.showMessageDialog(this, "Introduzca un e-mail válido por favor", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else if (formatoFecha()) {
			JOptionPane.showMessageDialog(this, "El formato de la fecha debe ser AAAA-MM-DD", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else if (formatoTelefono()) {
			JOptionPane.showMessageDialog(this, "Introduzca un número de teléfono válido por favor", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else {
			cliente = new Cliente(txtFieldNombre.getText(), txtFieldApellido.getText(), txtFieldEmail.getText(),
					txtFieldTelefono.getText(), txtFieldNacimiento.getText(), txtFieldDireccion.getText());
		}

		if (txtFieldNombre.getText().equals("") || txtFieldApellido.getText().equals("")
				|| txtFieldEmail.getText().equals("") || txtFieldTelefono.getText().equals("")
				|| txtFieldNacimiento.getText().equals("") || txtFieldDireccion.getText().equals("")) {
			JOptionPane.showMessageDialog(this, "Introduzca todos los datos por favor", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else if (formatoEmail()) {
			JOptionPane.showMessageDialog(this, "Introduzca un e-mail válido por favor", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else if (formatoFecha()) {
			JOptionPane.showMessageDialog(this, "El formato de la fecha debe ser AAAA-MM-DD", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else if (formatoTelefono()) {
			JOptionPane.showMessageDialog(this, "Introduzca un número de teléfono válido por favor", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else {
			cliente = new Cliente(txtFieldNombre.getText(), txtFieldApellido.getText(), txtFieldEmail.getText(),
					txtFieldTelefono.getText(), txtFieldNacimiento.getText(), txtFieldDireccion.getText());
		}

		return cliente;
	}

	public Cliente generarClienteMod() {
		Cliente cliente = null;
		if (txtFieldNombre.getText().equals("") || txtFieldApellido.getText().equals("")
				|| txtFieldEmail.getText().equals("") || txtFieldTelefono.getText().equals("")
				|| txtFieldNacimiento.getText().equals("") || txtFieldDireccion.getText().equals("")) {
			JOptionPane.showMessageDialog(this, "Introduzca todos los datos por favor", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else if (formatoEmail()) {
			JOptionPane.showMessageDialog(this, "Introduzca un e-mail válido por favor", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else if (formatoFecha()) {
			JOptionPane.showMessageDialog(this, "El formato de la fecha debe ser AAAA-MM-DD", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else if (formatoTelefono()) {
			JOptionPane.showMessageDialog(this, "Introduzca un número de teléfono válido por favor", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else {
			cliente = new Cliente(Integer.parseInt(txtId.getText()), txtFieldNombre.getText(),
					txtFieldApellido.getText(), txtFieldEmail.getText(), txtFieldTelefono.getText(),
					txtFieldNacimiento.getText(), txtFieldDireccion.getText());
		}
		return cliente;
	}

	public void cargarCliente(Cliente cliente) {
		txtId.setText(cliente.getIdCliente() + "");
		txtFieldDireccion.setText(cliente.getDireccionCliente());
		txtFieldTelefono.setText(cliente.getTelefonoCliente());
		txtFieldApellido.setText(cliente.getApellidoCliente());
		txtFieldEmail.setText(cliente.getEmailCliente());
		txtFieldNacimiento.setText(cliente.getFechaNaCliente());
		txtFieldNombre.setText(cliente.getNombreCliente());
	}

	public int confirmaEliminar() {
		int opcion = JOptionPane.showConfirmDialog(this, "¿Desea eliminar el usuario de la base de datos?", "Eliminar",
				JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
		return opcion;
	}

	public int confirmaModificar() {
		int opcion2 = JOptionPane.showConfirmDialog(this, "¿Desea modificar el usuario en la base de datos?",
				"Modificar", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
		return opcion2;
	}

	public int salir() {
		int opcion3 = JOptionPane.showConfirmDialog(this, "¿Desea volver al menú principal?", "Volver",
				JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
		return opcion3;
	}

	public boolean formatoTelefono() {
		String tel = txtFieldTelefono.getText();
		Pattern pTel = Pattern.compile("^[0-9]+$");
		Matcher mTel = pTel.matcher(tel);
		if (!(mTel.find()) || (tel.length() != 9)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean formatoEmail() {
		String correo = txtFieldEmail.getText();
		Pattern pEm = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		Matcher mEm = pEm.matcher(correo);
		if (mEm.find()) {
			return false;
		} else {
			return true;
		}
	}

	public boolean formatoFecha() {
		String fech = txtFieldNacimiento.getText();
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

	public int confirmaCancelar() {
		int opcion4 = JOptionPane.showConfirmDialog(this, "¿Desea borrar los campos?", "Borrar",
				JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
		return opcion4;

	}
}