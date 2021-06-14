package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.Scrollbar;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;

import controller.Controlador;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class Vista_Facturacion extends JPanel {
	private JTable tableDescrip2;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnMostrarBalance, btnCancelarBalance, btnGenerarFac, btnEliminarFac, btnBalanceMen, btnGenerarNueva, btnCancelarFac, btnEliminarFact, btnCancelarEliminar;
	

	private JButton btnAniadirUsu;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnResumen;
	private JButton btnHome;
	private JTextField textField_3;
	private JComboBox cbMes;
	private JComboBox cbAnio;
	private JLabel lblTotalIngresos;
	private JLabel lblFormato;
	private JTextArea txtAreaFactura;

	
	public Vista_Facturacion() {
		setLayout(null);
		
		this.setSize(1366, 768);
		
		JLabel lblTituloModulo = new JLabel("Facturaci\u00F3n...");
		lblTituloModulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		lblTituloModulo.setBounds(95, 57, 213, 69);
		add(lblTituloModulo);
		

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
		btnBalanceMen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBalanceMen.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBalanceMen.setBackground(SystemColor.controlHighlight);
		btnBalanceMen.setBounds(25, 455, 330, 64);
		add(btnBalanceMen);
		
		JPanel panelGenerarFac = new JPanel();
		panelGenerarFac.setLayout(null);
		panelGenerarFac.setBounds(377, 30, 979, 659);
		add(panelGenerarFac);
		
		JLabel lblTituloPanel = new JLabel("NUEVA FACTURA");
		lblTituloPanel.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblTituloPanel.setBounds(424, 25, 288, 50);
		panelGenerarFac.add(lblTituloPanel);
		
		JLabel lblBuscarPedido = new JLabel("BUSCAR PEDIDO");
		lblBuscarPedido.setToolTipText("");
		lblBuscarPedido.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblBuscarPedido.setBounds(17, 101, 161, 35);
		panelGenerarFac.add(lblBuscarPedido);
		
		JLabel lblDescripcion = new JLabel("DESCRIPCI\u00D3N");
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
		
		JComboBox cbBuscarPedido = new JComboBox();
		cbBuscarPedido.setBounds(188, 105, 772, 27);
		panelGenerarFac.add(cbBuscarPedido);
		
		JLabel lblFactura = new JLabel("F.FACTURA:");
		lblFactura.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblFactura.setBounds(17, 173, 171, 35);
		panelGenerarFac.add(lblFactura);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(188, 171, 772, 40);
		panelGenerarFac.add(textField_3);
		
		lblFormato = new JLabel("(AAAA-MM-DD)");
		lblFormato.setForeground(Color.LIGHT_GRAY);
		lblFormato.setFont(new Font("Cambria Math", Font.PLAIN, 14));
		lblFormato.setBounds(17, 195, 144, 35);
		panelGenerarFac.add(lblFormato);
		
		txtAreaFactura = new JTextArea();
		txtAreaFactura.setBounds(188, 227, 772, 353);
		panelGenerarFac.add(txtAreaFactura);
		
		JPanel panelEliminarFac = new JPanel();
		panelEliminarFac.setLayout(null);
		panelEliminarFac.setBounds(377, 30, 979, 659);
		add(panelEliminarFac);
		
		JLabel lblTituloPanel2 = new JLabel("ELIMINAR FACTURA");
		lblTituloPanel2.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblTituloPanel2.setBounds(422, 28, 334, 50);
		panelEliminarFac.add(lblTituloPanel2);
		
		JLabel lblDescripcion_1 = new JLabel("FACTURAS:");
		lblDescripcion_1.setToolTipText("");
		lblDescripcion_1.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblDescripcion_1.setBounds(32, 141, 135, 35);
		panelEliminarFac.add(lblDescripcion_1);
		
		btnEliminarFact = new JButton("ELIMINAR");
		btnEliminarFact.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEliminarFact.setBackground(SystemColor.controlHighlight);
		btnEliminarFact.setBounds(304, 606, 251, 35);
		panelEliminarFac.add(btnEliminarFact);
		
		btnCancelarEliminar = new JButton("CANCELAR");
		btnCancelarEliminar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelarEliminar.setBackground(SystemColor.controlHighlight);
		btnCancelarEliminar.setBounds(589, 606, 251, 35);
		panelEliminarFac.add(btnCancelarEliminar);
		
		tableDescrip2 = new JTable();
		tableDescrip2.setBounds(184, 124, 772, 435);
		panelEliminarFac.add(tableDescrip2);
		
		JPanel panelBalances = new JPanel();
		panelBalances.setLayout(null);
		panelBalances.setBounds(377, 30, 979, 659);
		add(panelBalances);
		
		JLabel lblBalances = new JLabel("BALANCES");
		lblBalances.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblBalances.setBounds(424, 25, 288, 50);
		panelBalances.add(lblBalances);
		
		btnMostrarBalance = new JButton("MOSTRAR");
		btnMostrarBalance.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMostrarBalance.setBackground(SystemColor.controlHighlight);
		btnMostrarBalance.setBounds(304, 606, 251, 27);
		panelBalances.add(btnMostrarBalance);
		
		btnCancelarBalance = new JButton("CANCELAR");
		btnCancelarBalance.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelarBalance.setBackground(SystemColor.controlHighlight);
		btnCancelarBalance.setBounds(589, 606, 251, 27);
		panelBalances.add(btnCancelarBalance);
		
		JLabel lblMes_1 = new JLabel("MES:");
		lblMes_1.setBounds(184, 102, 154, 13);
		panelBalances.add(lblMes_1);
		
		JLabel lblAo_1 = new JLabel("A\u00D1O:");
		lblAo_1.setBounds(415, 102, 154, 13);
		panelBalances.add(lblAo_1);
		
		JLabel lblTotalFactura = new JLabel("Total Facturas");
		lblTotalFactura.setBounds(415, 194, 72, 13);
		panelBalances.add(lblTotalFactura);
		
		textField_1 = new JTextField();
		textField_1.setBounds(266, 194, 118, 13);
		panelBalances.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(497, 194, 116, 13);
		panelBalances.add(textField_2);
		
		cbMes = new JComboBox();
		cbMes.setBounds(184, 120, 200, 27);
		panelBalances.add(cbMes);
		
		cbAnio = new JComboBox();
		cbAnio.setBounds(413, 120, 200, 27);
		panelBalances.add(cbAnio);
		
		lblTotalIngresos = new JLabel("Total Ingresos");
		lblTotalIngresos.setBounds(184, 194, 72, 13);
		panelBalances.add(lblTotalIngresos);
	}
	
	
	
	public JButton getBtnHome() {
		return btnHome;
	}



	public void setControlador(Controlador controlador) {
		btnHome.addActionListener(controlador);
		//btnAniadirUsu.addActionListener(controlador);
		//btnModificar.addActionListener(controlador);
		//btnEliminar.addActionListener(controlador);
		//btnResumen.addActionListener(controlador);

		btnMostrarBalance.addActionListener(controlador);
		btnCancelarBalance.addActionListener(controlador);
		btnGenerarFac.addActionListener(controlador);
		btnEliminarFac.addActionListener(controlador);
		btnBalanceMen.addActionListener(controlador);
		btnGenerarNueva.addActionListener(controlador);
		btnCancelarFac.addActionListener(controlador);
		btnEliminarFact.addActionListener(controlador);
		btnCancelarEliminar.addActionListener(controlador);

	}
}
