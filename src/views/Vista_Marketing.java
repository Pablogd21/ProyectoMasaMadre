
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
import javax.swing.JTextArea;

public class Vista_Marketing extends JPanel {
	private JTextField txtFieldTituloCom;
	private JButton btnNuevaComunicacion, btnEncuestas, btnHome;
	private JPanel panelComunicacion; 
	private JTextArea txtAreaCom;
	private JTextField txtFieldTituloEncuesta;
	
	public Vista_Marketing() {
		
		this.setSize(1366,768);
		setLayout(null);
		
		btnNuevaComunicacion = new JButton("NUEVA COMUNICACI\u00D3N");
		btnNuevaComunicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNuevaComunicacion.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNuevaComunicacion.setBackground(SystemColor.controlHighlight);
		btnNuevaComunicacion.setBounds(25, 307, 330, 64);
		add(btnNuevaComunicacion);
		
		btnEncuestas = new JButton("ENCUESTAS");
		btnEncuestas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEncuestas.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEncuestas.setBackground(SystemColor.controlHighlight);
		btnEncuestas.setBounds(25, 381, 330, 64);
		add(btnEncuestas);
		
		JLabel lblModuloMarketing = new JLabel("Marketing...");
		lblModuloMarketing.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		lblModuloMarketing.setBounds(100, 57, 213, 69);
		add(lblModuloMarketing);
		
		panelComunicacion = new JPanel();
		panelComunicacion.setLayout(null);
		panelComunicacion.setBounds(377, 30, 979, 659);
		add(panelComunicacion);
		
		JLabel lblCom = new JLabel("COMUNICACI\u00D3N");
		lblCom.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblCom.setBounds(401, 21, 288, 50);
		panelComunicacion.add(lblCom);
		
		JLabel lblTituloCom = new JLabel("TITULO:");
		lblTituloCom.setToolTipText("");
		lblTituloCom.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblTituloCom.setBounds(29, 96, 89, 42);
		panelComunicacion.add(lblTituloCom);
		
		JLabel lblDescripCom = new JLabel("DESCRIPCI\u00D3N:");
		lblDescripCom.setToolTipText("");
		lblDescripCom.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblDescripCom.setBounds(29, 166, 135, 35);
		panelComunicacion.add(lblDescripCom);
		
		txtFieldTituloCom = new JTextField();
		txtFieldTituloCom.setColumns(10);
		txtFieldTituloCom.setBounds(185, 97, 774, 42);
		panelComunicacion.add(txtFieldTituloCom);
		
		JButton btnEnviarCom = new JButton("ENVIAR");
		btnEnviarCom.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEnviarCom.setBackground(SystemColor.controlHighlight);
		btnEnviarCom.setBounds(304, 606, 251, 35);
		panelComunicacion.add(btnEnviarCom);
		
		JButton btnCancelarCom = new JButton("CANCELAR");
		btnCancelarCom.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelarCom.setBackground(SystemColor.controlHighlight);
		btnCancelarCom.setBounds(589, 606, 251, 35);
		panelComunicacion.add(btnCancelarCom);
		
		txtAreaCom = new JTextArea();
		txtAreaCom.setBounds(185, 166, 772, 414);
		panelComunicacion.add(txtAreaCom);
		
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
		
		JPanel panelEncuesta = new JPanel();
		panelEncuesta.setLayout(null);
		panelEncuesta.setBounds(377, 30, 979, 659);
		add(panelEncuesta);
		
		JLabel lblEncuesta = new JLabel("ENCUESTA");
		lblEncuesta.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblEncuesta.setBounds(401, 21, 288, 50);
		panelEncuesta.add(lblEncuesta);
		
		JLabel lblTituloEncuesta = new JLabel("TITULO:");
		lblTituloEncuesta.setToolTipText("");
		lblTituloEncuesta.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblTituloEncuesta.setBounds(40, 100, 89, 42);
		panelEncuesta.add(lblTituloEncuesta);
		
		txtFieldTituloEncuesta = new JTextField();
		txtFieldTituloEncuesta.setColumns(10);
		txtFieldTituloEncuesta.setBounds(185, 97, 774, 42);
		panelEncuesta.add(txtFieldTituloEncuesta);
		
		JButton btnEnviarEncuesta = new JButton("ENVIAR");
		btnEnviarEncuesta.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEnviarEncuesta.setBackground(SystemColor.controlHighlight);
		btnEnviarEncuesta.setBounds(304, 606, 251, 35);
		panelEncuesta.add(btnEnviarEncuesta);
		
		JButton btnCancelarEncuesta = new JButton("CANCELAR");
		btnCancelarEncuesta.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelarEncuesta.setBackground(SystemColor.controlHighlight);
		btnCancelarEncuesta.setBounds(589, 606, 251, 35);
		panelEncuesta.add(btnCancelarEncuesta);
		
		JTextArea txtAreaEncuesta = new JTextArea();
		txtAreaEncuesta.setBounds(185, 166, 772, 414);
		panelEncuesta.add(txtAreaEncuesta);
		
		JLabel lblDescripEncuesta = new JLabel("DESCRIPCION:");
		lblDescripEncuesta.setToolTipText("");
		lblDescripEncuesta.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblDescripEncuesta.setBounds(29, 166, 135, 35);
		panelEncuesta.add(lblDescripEncuesta);
	
	}
	
	
	
	public JButton getBtnHome() {
		return btnHome;
	}



	public void setControlador(Controlador controlador) {
		txtFieldTituloCom.addActionListener(controlador);
		btnNuevaComunicacion.addActionListener(controlador);
		btnEncuestas.addActionListener(controlador);
		btnHome.addActionListener(controlador);
	}
}

