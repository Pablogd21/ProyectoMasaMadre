
package views;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.Controlador;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vista_Marketing extends JPanel {
	
	private JTextField txtFieldTituloFeli;
	private JTextField txtFieldConteFeli;
	private JTextField txtFieldDestiFeli;
	private JTextField txtFieldTituloCom;
	private JTextField txtFieldConteCom;
	private JTextField txtFieldDestiCom;
	private JButton btnNuevaComunicacion, btnFelicitaciones, btnEncuestas, btnEnviarFeli, btnHome;
	private JPanel panelFelicitacion, panelComunicacion; 
	
	public Vista_Marketing() {
		
		this.setSize(1366,768);
		setLayout(null);
		
		btnNuevaComunicacion = new JButton("NUEVA COMUNICACI\u00D3N");
		btnNuevaComunicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNuevaComunicacion.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNuevaComunicacion.setBackground(SystemColor.controlHighlight);
		btnNuevaComunicacion.setBounds(28, 260, 330, 69);
		add(btnNuevaComunicacion);
		
		btnFelicitaciones = new JButton("FELICITACIONES");
		btnFelicitaciones.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnFelicitaciones.setBackground(SystemColor.controlHighlight);
		btnFelicitaciones.setBounds(28, 339, 330, 56);
		add(btnFelicitaciones);
		
		btnEncuestas = new JButton("ENCUESTAS");
		btnEncuestas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEncuestas.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnEncuestas.setBackground(SystemColor.controlHighlight);
		btnEncuestas.setBounds(28, 405, 330, 56);
		add(btnEncuestas);
		
		JLabel lblModuloMarketing = new JLabel("Marketing ...");
		lblModuloMarketing.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		lblModuloMarketing.setBounds(73, 689, 213, 69);
		add(lblModuloMarketing);
		
		panelFelicitacion = new JPanel();
		panelFelicitacion.setLayout(null);
		panelFelicitacion.setBounds(379, 72, 979, 659);
		add(panelFelicitacion);
		
		JLabel lblFelicitaFeli = new JLabel("FELICITACI\u00D3N");
		lblFelicitaFeli.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblFelicitaFeli.setBounds(424, 25, 288, 50);
		panelFelicitacion.add(lblFelicitaFeli);
		
		JLabel lblTituloFeli = new JLabel("TITULO:");
		lblTituloFeli.setToolTipText("");
		lblTituloFeli.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblTituloFeli.setBounds(39, 124, 135, 35);
		panelFelicitacion.add(lblTituloFeli);
		
		JLabel lblConteFeli = new JLabel("CONTENIDO:");
		lblConteFeli.setToolTipText("");
		lblConteFeli.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblConteFeli.setBounds(27, 323, 135, 35);
		panelFelicitacion.add(lblConteFeli);
		
		JLabel lblDestiFeli = new JLabel("DESTINATARIO:");
		lblDestiFeli.setToolTipText("");
		lblDestiFeli.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblDestiFeli.setBounds(26, 539, 161, 35);
		panelFelicitacion.add(lblDestiFeli);
		
		txtFieldTituloFeli = new JTextField();
		txtFieldTituloFeli.setColumns(10);
		txtFieldTituloFeli.setBounds(184, 99, 770, 50);
		panelFelicitacion.add(txtFieldTituloFeli);
		
		txtFieldConteFeli = new JTextField();
		txtFieldConteFeli.setColumns(10);
		txtFieldConteFeli.setBounds(184, 171, 770, 336);
		panelFelicitacion.add(txtFieldConteFeli);
		
		btnEnviarFeli = new JButton("ENVIAR");
		btnEnviarFeli.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEnviarFeli.setBackground(SystemColor.controlHighlight);
		btnEnviarFeli.setBounds(304, 606, 251, 27);
		panelFelicitacion.add(btnEnviarFeli);
		
		JButton btnCancelarFeli = new JButton("CANCELAR");
		btnCancelarFeli.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelarFeli.setBackground(SystemColor.controlHighlight);
		btnCancelarFeli.setBounds(589, 606, 251, 27);
		panelFelicitacion.add(btnCancelarFeli);
		
		txtFieldDestiFeli = new JTextField();
		txtFieldDestiFeli.setColumns(10);
		txtFieldDestiFeli.setBounds(184, 532, 770, 50);
		panelFelicitacion.add(txtFieldDestiFeli);
		
		panelComunicacion = new JPanel();
		panelComunicacion.setLayout(null);
		panelComunicacion.setBounds(377, 72, 979, 659);
		add(panelComunicacion);
		
		JLabel lblComunicacin = new JLabel("COMUNICACI\u00D3N");
		lblComunicacin.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblComunicacin.setBounds(401, 21, 288, 50);
		panelComunicacion.add(lblComunicacin);
		
		JLabel lblTitulo = new JLabel("TITULO:");
		lblTitulo.setToolTipText("");
		lblTitulo.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblTitulo.setBounds(58, 100, 89, 42);
		panelComunicacion.add(lblTitulo);
		
		JLabel lblContenido = new JLabel("CONTENIDO:");
		lblContenido.setToolTipText("");
		lblContenido.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblContenido.setBounds(40, 337, 135, 35);
		panelComunicacion.add(lblContenido);
		
		JLabel lblDestinatario = new JLabel("DESTINATARIO:");
		lblDestinatario.setToolTipText("");
		lblDestinatario.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblDestinatario.setBounds(26, 537, 161, 35);
		panelComunicacion.add(lblDestinatario);
		
		txtFieldTituloCom = new JTextField();
		txtFieldTituloCom.setColumns(10);
		txtFieldTituloCom.setBounds(185, 97, 774, 50);
		panelComunicacion.add(txtFieldTituloCom);
		
		txtFieldConteCom = new JTextField();
		txtFieldConteCom.setColumns(10);
		txtFieldConteCom.setBounds(185, 166, 772, 340);
		panelComunicacion.add(txtFieldConteCom);
		
		JButton btnEnviarCom = new JButton("ENVIAR");
		btnEnviarCom.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEnviarCom.setBackground(SystemColor.controlHighlight);
		btnEnviarCom.setBounds(304, 606, 251, 27);
		panelComunicacion.add(btnEnviarCom);
		
		JButton btnCancelarCom = new JButton("CANCELAR");
		btnCancelarCom.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelarCom.setBackground(SystemColor.controlHighlight);
		btnCancelarCom.setBounds(589, 606, 251, 27);
		panelComunicacion.add(btnCancelarCom);
		
		txtFieldDestiCom = new JTextField();
		txtFieldDestiCom.setColumns(10);
		txtFieldDestiCom.setBounds(185, 530, 774, 50);
		panelComunicacion.add(txtFieldDestiCom);
		
		JPanel panel_home = new JPanel();
		panel_home.setBounds(25, 11, 32, 32);
		add(panel_home);

		btnHome = new JButton("");
		btnHome.setIcon(new ImageIcon(".\\images\\home.png"));
		btnHome.setBorder(null);
		btnHome.setBackground(null); 
        btnHome.setContentAreaFilled(false);
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
	
	
	
	public JButton getBtnHome() {
		return btnHome;
	}



	public void setControlador(Controlador controlador) {
		txtFieldTituloFeli.addActionListener(controlador);
		txtFieldConteFeli.addActionListener(controlador);
		txtFieldDestiFeli.addActionListener(controlador);
		txtFieldTituloCom.addActionListener(controlador);
		txtFieldConteCom.addActionListener(controlador);
		txtFieldDestiFeli.addActionListener(controlador);
		btnNuevaComunicacion.addActionListener(controlador);
		btnFelicitaciones.addActionListener(controlador);
		btnEncuestas.addActionListener(controlador);
		btnHome.addActionListener(controlador);
	}
}

