package views;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import controller.Controlador;
import model.data.Cliente;
import sun.swing.table.DefaultTableCellHeaderRenderer;

import javax.swing.JTable;
import java.awt.SystemColor;
import java.util.ArrayList;

public class Vista_Clientes extends JPanel {
	
	
	private JButton btnAnadir, btnResumen, btnModificar, btnEliminar, btnHome, btnBorrar, btnGuardar;
	private JTextField txtFieldNombre;
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

		JLabel lblTituloModulo = new JLabel("Clientes ...");
		lblTituloModulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		lblTituloModulo.setBounds(83, 636, 213, 69);
		add(lblTituloModulo);

		btnAnadir = new JButton("A\u00D1ADIR");
		btnAnadir.setBackground(SystemColor.controlHighlight);
		btnAnadir.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAnadir.setBounds(25, 300, 330, 84);
		add(btnAnadir);

		btnResumen = new JButton("RESUMEN");
		btnResumen.setBackground(SystemColor.controlHighlight);
		btnResumen.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnResumen.setBounds(25, 399, 330, 84);
		add(btnResumen);

		panelAnadir = new JPanel();
		panelAnadir.setLayout(null);
		panelAnadir.setBounds(377, 30, 979, 659);
		add(panelAnadir);

		JLabel lblNombre = new JLabel("NOMBRE:");
		lblNombre.setToolTipText("");
		lblNombre.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblNombre.setBounds(58, 141, 135, 35);
		panelAnadir.add(lblNombre);

		JLabel lblApellido = new JLabel("APELLIDO:");
		lblApellido.setToolTipText("");
		lblApellido.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblApellido.setBounds(58, 230, 142, 35);
		panelAnadir.add(lblApellido);

		JLabel lblEmail = new JLabel("EMAIL:");
		lblEmail.setToolTipText("");
		lblEmail.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblEmail.setBounds(58, 299, 116, 37);
		panelAnadir.add(lblEmail);

		JLabel lblDatosCliente = new JLabel("DATOS CLIENTE");
		lblDatosCliente.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblDatosCliente.setBounds(422, 28, 288, 50);
		panelAnadir.add(lblDatosCliente);


		btnGuardar = new JButton("GUARDAR");
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 25));


		btnGuardar = new JButton("GUARDAR");
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 20));

		btnGuardar.setBackground(SystemColor.controlHighlight);
		btnGuardar.setBounds(283, 588, 251, 27);
		panelAnadir.add(btnGuardar);

		btnBorrar = new JButton("BORRAR");
		btnBorrar.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnBorrar.setBackground(SystemColor.controlHighlight);
		btnBorrar.setBounds(586, 588, 251, 43);
		panelAnadir.add(btnBorrar);



		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelar.setBackground(SystemColor.controlHighlight);
		btnCancelar.setBounds(586, 588, 251, 27);
		panelAnadir.add(btnCancelar);

		txtFieldNombre = new JTextField();
		txtFieldNombre.setColumns(10);
		txtFieldNombre.setBounds(198, 134, 748, 50);
		panelAnadir.add(txtFieldNombre);

		JLabel lblFnacimiento = new JLabel("F.NACIMIENTO:");
		lblFnacimiento.setToolTipText("");
		lblFnacimiento.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblFnacimiento.setBounds(32, 381, 171, 35);
		panelAnadir.add(lblFnacimiento);

		JLabel lblDireccion = new JLabel("DIRECCION:");
		lblDireccion.setToolTipText("");
		lblDireccion.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblDireccion.setBounds(43, 451, 171, 35);
		panelAnadir.add(lblDireccion);

		JLabel lblTelefono = new JLabel("TELEFONO:");
		lblTelefono.setToolTipText("");
		lblTelefono.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblTelefono.setBounds(43, 516, 171, 35);
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
		panelResumen.setBounds(377, 30, 979, 659);
		add(panelResumen);
		panelResumen.setLayout(layResumen);
		
		FlowLayout flTit = new FlowLayout(FlowLayout.CENTER);
		JPanel pnlTituloRes = new JPanel();
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
		
		FlowLayout flBot = new FlowLayout(FlowLayout.CENTER,60,10);
		JPanel pnlBtnRes = new JPanel();
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
		
		panelAnadir.setVisible(true);
		panelResumen.setVisible(false);

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
		txtFieldDireccion.addActionListener(controlador);
		txtFieldTelefono.addActionListener(controlador);
		txtFieldApellido.addActionListener(controlador);
		txtFieldEmail.addActionListener(controlador);
		txtFieldNacimiento.addActionListener(controlador);
		txtFieldNombre.addActionListener(controlador);
		btnGuardar.addActionListener(controlador);
		btnModificar.addActionListener(controlador);
		btnEliminar.addActionListener(controlador);
		btnBorrar.addActionListener(controlador);
		btnHome.addActionListener(controlador);
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
			if (txtFieldNombre.getText().equals("") || txtFieldApellido.getText().equals("") || txtFieldEmail.getText().equals("") ||
					txtFieldTelefono.getText().equals("") || txtFieldNacimiento.getText().equals("") || txtFieldDireccion.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "Introduzca todos los datos por favor", "Error",
						JOptionPane.ERROR_MESSAGE);
			} else {
				cliente = new Cliente(0, txtFieldNombre.getText(), txtFieldApellido.getText(), txtFieldEmail.getText(),
						txtFieldTelefono.getText(), txtFieldNacimiento.getText(), txtFieldDireccion.getText());
			}
		return cliente;
	}
}