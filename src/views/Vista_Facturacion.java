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

public class Vista_Facturacion extends JPanel {
	
	private JTable tableDatosFactura;
	private JTable tableDescrip2;
	private JTable table;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnMostrarBalance, btnLimpiar, btnGenerarFac, btnEliminarFac, btnBalanceMen, btnGenerarNueva, btnCancelarFac, btnEliminarFact, btnCancelarEliminar;
	private JSpinner spMesBalances, spAnioBalances, spDiaBalances, spMes,spAnio, spDia;
	private Scrollbar scrollBuscar;
	

	private JButton btnAniadirUsu;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnResumen;
	private JButton btnHome;

	
	public Vista_Facturacion() {
		setLayout(null);
		
		this.setSize(1366, 768);
		
		JPanel panelBalances = new JPanel();
		panelBalances.setLayout(null);
		panelBalances.setBounds(361, 38, 979, 659);
		add(panelBalances);
		
		JLabel lblBalances = new JLabel("BALANCES");
		lblBalances.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblBalances.setBounds(424, 25, 288, 50);
		panelBalances.add(lblBalances);
		
		JLabel lblDescripcionBalance = new JLabel("DESCRIPCI\u00D3N");
		lblDescripcionBalance.setToolTipText("");
		lblDescripcionBalance.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblDescripcionBalance.setBounds(17, 271, 135, 35);
		panelBalances.add(lblDescripcionBalance);
		
		btnMostrarBalance = new JButton("MOSTRAR");
		btnMostrarBalance.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMostrarBalance.setBackground(SystemColor.controlHighlight);
		btnMostrarBalance.setBounds(304, 606, 251, 27);
		panelBalances.add(btnMostrarBalance);
		
		btnLimpiar = new JButton("LIMPIAR");
		btnLimpiar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLimpiar.setBackground(SystemColor.controlHighlight);
		btnLimpiar.setBounds(589, 606, 251, 27);
		panelBalances.add(btnLimpiar);
		
		spMesBalances = new JSpinner();
		spMesBalances.setBounds(444, 100, 230, 27);
		panelBalances.add(spMesBalances);
		
		spAnioBalances = new JSpinner();
		spAnioBalances.setBounds(713, 100, 230, 27);
		panelBalances.add(spAnioBalances);
		
		JLabel lblDia_1 = new JLabel("D\u00CDA:");
		lblDia_1.setBounds(183, 87, 154, 13);
		panelBalances.add(lblDia_1);
		
		JLabel lblMes_1 = new JLabel("MES:");
		lblMes_1.setBounds(444, 87, 154, 13);
		panelBalances.add(lblMes_1);
		
		JLabel lblAo_1 = new JLabel("A\u00D1O:");
		lblAo_1.setBounds(713, 85, 154, 13);
		panelBalances.add(lblAo_1);
		
		spDiaBalances = new JSpinner();
		spDiaBalances.setBounds(183, 100, 230, 27);
		panelBalances.add(spDiaBalances);
		
		table = new JTable();
		table.setBounds(184, 217, 770, 353);
		panelBalances.add(table);
		
		JLabel lblTotalIngresos = new JLabel("Total Ingresos");
		lblTotalIngresos.setBounds(290, 177, 75, 13);
		panelBalances.add(lblTotalIngresos);
		
		JLabel lblTotalFactura = new JLabel("Total Facturas");
		lblTotalFactura.setBounds(602, 177, 72, 13);
		panelBalances.add(lblTotalFactura);
		
		textField_1 = new JTextField();
		textField_1.setBounds(375, 177, 146, 13);
		panelBalances.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(694, 177, 146, 13);
		panelBalances.add(textField_2);
		
		JLabel lblTituloModulo = new JLabel("Facturación ...");
		lblTituloModulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblTituloModulo.setBounds(75, 658, 169, 28);
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
		btnGenerarFac.setBounds(21, 272, 330, 42);
		add(btnGenerarFac);
		
		btnEliminarFac = new JButton("ELIMINAR FACTURA");
		btnEliminarFac.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEliminarFac.setBackground(SystemColor.controlHighlight);
		btnEliminarFac.setBounds(21, 324, 330, 42);
		add(btnEliminarFac);
		
		btnBalanceMen = new JButton("BALANCE MENSUAL");
		btnBalanceMen.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBalanceMen.setBackground(SystemColor.controlHighlight);
		btnBalanceMen.setBounds(21, 375, 330, 42);
		add(btnBalanceMen);
		
		JPanel panelGenerarFac = new JPanel();
		panelGenerarFac.setLayout(null);
		panelGenerarFac.setBounds(361, 38, 979, 659);
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
		btnGenerarNueva.setBounds(304, 606, 251, 27);
		panelGenerarFac.add(btnGenerarNueva);
		
		btnCancelarFac = new JButton("CANCELAR");
		btnCancelarFac.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelarFac.setBackground(SystemColor.controlHighlight);
		btnCancelarFac.setBounds(589, 606, 251, 27);
		panelGenerarFac.add(btnCancelarFac);
		
		scrollBuscar = new Scrollbar();
		scrollBuscar.setBounds(184, 81, 770, 56);
		panelGenerarFac.add(scrollBuscar);
		
		spMes = new JSpinner();
		spMes.setBounds(445, 185, 230, 27);
		panelGenerarFac.add(spMes);
		
		spAnio = new JSpinner();
		spAnio.setBounds(713, 185, 230, 27);
		panelGenerarFac.add(spAnio);
		
		JLabel lblDia = new JLabel("D\u00CDA:");
		lblDia.setBounds(184, 162, 154, 13);
		panelGenerarFac.add(lblDia);
		
		JLabel lblMes = new JLabel("MES:");
		lblMes.setBounds(445, 162, 154, 13);
		panelGenerarFac.add(lblMes);
		
		JLabel lblAo = new JLabel("A\u00D1O:");
		lblAo.setBounds(713, 162, 154, 13);
		panelGenerarFac.add(lblAo);
		
		spDia = new JSpinner();
		spDia.setBounds(184, 185, 230, 27);
		panelGenerarFac.add(spDia);
		
		tableDatosFactura = new JTable();
		tableDatosFactura.setBounds(184, 260, 770, 310);
		panelGenerarFac.add(tableDatosFactura);
		
		JPanel panelEliminarFac = new JPanel();
		panelEliminarFac.setLayout(null);
		panelEliminarFac.setBounds(361, 38, 979, 659);
		add(panelEliminarFac);
		
		JLabel lblTituloPanel2 = new JLabel("ELIMINAR FACTURA");
		lblTituloPanel2.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblTituloPanel2.setBounds(396, 25, 334, 50);
		panelEliminarFac.add(lblTituloPanel2);
		
		JLabel lblNumFact = new JLabel("N\u00BA FACTURA");
		lblNumFact.setToolTipText("");
		lblNumFact.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblNumFact.setBounds(17, 101, 161, 35);
		panelEliminarFac.add(lblNumFact);
		
		JLabel lblDescripcion_1 = new JLabel("DESCRIPCI\u00D3N");
		lblDescripcion_1.setToolTipText("");
		lblDescripcion_1.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblDescripcion_1.setBounds(17, 185, 135, 35);
		panelEliminarFac.add(lblDescripcion_1);
		
		btnEliminarFact = new JButton("ELIMINAR");
		btnEliminarFact.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEliminarFact.setBackground(SystemColor.controlHighlight);
		btnEliminarFact.setBounds(317, 574, 251, 27);
		panelEliminarFac.add(btnEliminarFact);
		
		btnCancelarEliminar = new JButton("CANCELAR");
		btnCancelarEliminar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelarEliminar.setBackground(SystemColor.controlHighlight);
		btnCancelarEliminar.setBounds(598, 574, 251, 27);
		panelEliminarFac.add(btnCancelarEliminar);
		
		tableDescrip2 = new JTable();
		tableDescrip2.setBounds(184, 164, 757, 354);
		panelEliminarFac.add(tableDescrip2);
		
		JTextField textField = new JTextField();
		textField.setBounds(184, 101, 757, 27);
		panelEliminarFac.add(textField);
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
		btnLimpiar.addActionListener(controlador);
		btnGenerarFac.addActionListener(controlador);
		btnEliminarFac.addActionListener(controlador);
		btnBalanceMen.addActionListener(controlador);
		btnGenerarNueva.addActionListener(controlador);
		btnCancelarFac.addActionListener(controlador);
		btnEliminarFact.addActionListener(controlador);
		btnCancelarEliminar.addActionListener(controlador);

	}
	

}
