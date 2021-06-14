package views;

import java.awt.FlowLayout;
import java.awt.Font;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controller.Controlador;
import model.data.Cliente;
import model.data.Pedido;

import javax.swing.SwingConstants;
import javax.swing.JComboBox;

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
	private JPanel panel_resumen;
	private JPanel panel_home;
	private JPanel panel_botones;
	private JPanel panel_aniadir;
	private JLabel lblNewLabel;
	private JButton btnGuardar;
	private JButton btnBorrar;
	private JComboBox<Cliente> cbCliente;

	public Vista_Pedidos() {
		setLayout(null);

		this.setSize(1366, 768);

		panel_resumen = new JPanel();
		panel_resumen.setVisible(false);

		panel_aniadir = new JPanel();
		panel_aniadir.setBounds(294, 31, 1000, 662);
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
		FlowLayout fl_panel_botones = (FlowLayout) panel_botones.getLayout();
		fl_panel_botones.setHgap(15);
		fl_panel_botones.setAlignment(FlowLayout.RIGHT);
		fl_panel_botones.setVgap(45);
		panel_botones.setBounds(10, 447, 980, 134);
		panel_aniadir.add(panel_botones);

		btnGuardar = new JButton("GUARDAR");
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_botones.add(btnGuardar);

		btnBorrar = new JButton("BORRAR");
		btnBorrar.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_botones.add(btnBorrar);

		txtAreaDescrip = new JTextArea();
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
		panel_resumen.setBounds(294, 31, 1000, 662);
		panel_resumen.setLayout(null);
		add(panel_resumen);

		lblNewLabel = new JLabel("GILIPOLLAS");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(420, 53, 316, 182);
		panel_resumen.add(lblNewLabel);

		btnAniadirPedido = new JButton("A\u00F1adir Pedido");
		btnAniadirPedido.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnAniadirPedido.setBounds(49, 203, 195, 65);
		add(btnAniadirPedido);

		btnResumenPedido = new JButton("Resumen Pedido");
		btnResumenPedido.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnResumenPedido.setBounds(49, 292, 195, 65);
		add(btnResumenPedido);

		panel_home = new JPanel();
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

	}

	public void vaciarCampos() {
		txtAreaDescrip.setText("");
		// TODO vaciar combo box (selecteditem -1)
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
		}

	}

	public void AniadirPedido() {
		// TODO Auto-generated method stub

	}

	public void cargarTabla() {
		// TODO Auto-generated method stub

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
			JOptionPane.showMessageDialog(this, "El importe debe ser un número", "Error", JOptionPane.ERROR_MESSAGE);
		} else {
			pedido = new Pedido(txtAreaDescrip.getText(), Double.parseDouble(txtImporte.getText()), txtFecha.getText());
		}
		return pedido;
	}

	public boolean formatoImporte() {

		String tel = txtImporte.getText();
		String pattern = "###.##";
		DecimalFormat decimalFormat = new DecimalFormat(pattern);
		decimalFormat.applyPattern(tel);

		Pattern pTel = Pattern.compile("^[0-9]+$");
		Matcher mTel = pTel.matcher(tel);
		if (!(mTel.find())) {
			return true;
		} else {
			return false;
		}
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

	public JPanel getPanel_resumen() {
		return panel_resumen;
	}

	public JPanel getPanel_home() {
		return panel_home;
	}

	public JPanel getPanel_aniadir() {
		return panel_aniadir;
	}

	public JButton getBtnGuardar() {
		return btnGuardar;
	}

	public JButton getBtnBorrar() {
		return btnBorrar;
	}
}
