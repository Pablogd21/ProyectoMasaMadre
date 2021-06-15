package views;

import java.awt.Font;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.Controlador;
import model.data.Cliente;

import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Vista_Marketing extends JPanel {
	private JTextField txtFieldTituloCom;
	private JButton btnNuevaComunicacion, btnEncuestas, btnHome, btnCancelarCom, btnEnviarCom, btnCancelarEncuesta, btnEnviarEncuesta, btnCrearEnc;
	private JPanel panelComunicacion, panelEncuesta;
	private JTextArea txtAreaCom, txtAreaEncuesta;
	private JTextField txtFieldTituloEncuesta;
	private JComboBox<Cliente> cbClientes;
	private Session session;
	private final Properties properties = new Properties();
	private final String textoEncuesta = "Querido cliente, para Masa Madre es muy importante su opinión, no le tomará más que unos segundos realizar la siguiente encuesta, muchas gracias. \nLink:";

	public Vista_Marketing() {

		this.setSize(1366, 768);
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

		JLabel lblAsuntoCom = new JLabel("ASUNTO:");
		lblAsuntoCom.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblAsuntoCom.setBounds(25, 96, 89, 42);
		panelComunicacion.add(lblAsuntoCom);

		JLabel lblContenidoCom = new JLabel("CONTENIDO:");
		lblContenidoCom.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblContenidoCom.setBounds(25, 166, 135, 35);
		panelComunicacion.add(lblContenidoCom);

		txtFieldTituloCom = new JTextField();
		txtFieldTituloCom.setColumns(10);
		txtFieldTituloCom.setBounds(185, 97, 774, 42);
		panelComunicacion.add(txtFieldTituloCom);

		btnEnviarCom = new JButton("ENVIAR");
		btnEnviarCom.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEnviarCom.setBackground(SystemColor.controlHighlight);
		btnEnviarCom.setBounds(304, 606, 251, 35);
		panelComunicacion.add(btnEnviarCom);

		btnCancelarCom = new JButton("CANCELAR");
		btnCancelarCom.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelarCom.setBackground(SystemColor.controlHighlight);
		btnCancelarCom.setBounds(589, 606, 251, 35);
		panelComunicacion.add(btnCancelarCom);

		txtAreaCom = new JTextArea();
		txtAreaCom.setBounds(185, 166, 772, 300);
		panelComunicacion.add(txtAreaCom);
		
		cbClientes = new JComboBox<Cliente>();
		cbClientes.setBounds(185, 500, 772, 30);
		panelComunicacion.add(cbClientes);
		
		JLabel lblDestinatario = new JLabel("DESTINATARIO:");
		lblDestinatario.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblDestinatario.setBounds(25, 500, 150, 35);
		panelComunicacion.add(lblDestinatario);

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

		panelEncuesta = new JPanel();
		panelEncuesta.setLayout(null);
		panelEncuesta.setBounds(377, 30, 979, 659);
		panelEncuesta.setVisible(false);
		add(panelEncuesta);

		JLabel lblEncuesta = new JLabel("ENCUESTA");
		lblEncuesta.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblEncuesta.setBounds(401, 21, 288, 50);
		panelEncuesta.add(lblEncuesta);

		JLabel lblTituloEncuesta = new JLabel("TÍTULO:");
		lblTituloEncuesta.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblTituloEncuesta.setBounds(29, 100, 135, 42);
		panelEncuesta.add(lblTituloEncuesta);
		
		JLabel lblDescripEncuesta = new JLabel("DESCRIPCIÓN:");
		lblDescripEncuesta.setFont(new Font("Cambria Math", Font.PLAIN, 21));
		lblDescripEncuesta.setBounds(29, 166, 135, 35);
		panelEncuesta.add(lblDescripEncuesta);

		txtFieldTituloEncuesta = new JTextField();
		txtFieldTituloEncuesta.setColumns(10);
		txtFieldTituloEncuesta.setBounds(185, 97, 774, 42);
		panelEncuesta.add(txtFieldTituloEncuesta);
		
		btnCrearEnc = new JButton("CREAR ENCUESTA");
		btnCrearEnc.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCrearEnc.setBackground(SystemColor.controlHighlight);
		btnCrearEnc.setBounds(440, 546, 251, 35);
		panelEncuesta.add(btnCrearEnc);

		btnEnviarEncuesta = new JButton("ENVIAR");
		btnEnviarEncuesta.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEnviarEncuesta.setBackground(SystemColor.controlHighlight);
		btnEnviarEncuesta.setBounds(304, 606, 251, 35);
		panelEncuesta.add(btnEnviarEncuesta);

		btnCancelarEncuesta = new JButton("CANCELAR");
		btnCancelarEncuesta.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelarEncuesta.setBackground(SystemColor.controlHighlight);
		btnCancelarEncuesta.setBounds(589, 606, 251, 35);
		panelEncuesta.add(btnCancelarEncuesta);

		txtAreaEncuesta = new JTextArea();
		txtAreaEncuesta.setLineWrap(true);
		txtAreaEncuesta.setWrapStyleWord(true);
		txtAreaEncuesta.setBounds(185, 166, 772, 350);
		txtAreaEncuesta.setText(textoEncuesta);
		panelEncuesta.add(txtAreaEncuesta);

	}

	public JTextField getTxtFieldTituloCom() {
		return txtFieldTituloCom;
	}

	public JButton getBtnNuevaComunicacion() {
		return btnNuevaComunicacion;
	}

	public JButton getBtnEncuestas() {
		return btnEncuestas;
	}

	public JButton getBtnCancelarCom() {
		return btnCancelarCom;
	}

	public JButton getBtnEnviarCom() {
		return btnEnviarCom;
	}

	public JPanel getPanelComunicacion() {
		return panelComunicacion;
	}

	public JTextArea getTxtAreaCom() {
		return txtAreaCom;
	}

	public JTextField getTxtFieldTituloEncuesta() {
		return txtFieldTituloEncuesta;
	}
	
	public JTextArea getTxtAreaEncuesta() {
		return txtAreaEncuesta;
	}

	public JButton getBtnHome() {
		return btnHome;
	}

	public JButton getBtnCrearEnc() {
		return btnCrearEnc;
	}

	public void setControlador(Controlador controlador) {
		txtFieldTituloCom.addActionListener(controlador);
		btnNuevaComunicacion.addActionListener(controlador);
		btnEncuestas.addActionListener(controlador);
		btnHome.addActionListener(controlador);
		btnCancelarCom.addActionListener(controlador);
		btnEnviarCom.addActionListener(controlador);
		btnCancelarEncuesta.addActionListener(controlador);
		btnEnviarEncuesta.addActionListener(controlador);
		btnCrearEnc.addActionListener(controlador);
	}
	
	public JButton getBtnCancelarEncuesta() {
		return btnCancelarEncuesta;
	}

	public JButton getBtnEnviarEncuesta() {
		return btnEnviarEncuesta;
	}

	public void cargarComboBox(ArrayList<Cliente> array) {
		DefaultComboBoxModel<Cliente> cmbModel = new DefaultComboBoxModel<>();
		for (Cliente cliente : array) {
			cmbModel.addElement(cliente);
		}
		cbClientes.setModel(cmbModel);
		
	}
	
	public int salir() { 
		int opcion = JOptionPane.showConfirmDialog( this, "¿Desea volver al menú principal?", "Volver", JOptionPane.YES_NO_OPTION,
			 JOptionPane.WARNING_MESSAGE); 
		return opcion; 
	}
	
	public void init() {
		 
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.port",587);
		properties.put("mail.smtp.mail.sender","masamadrebbdd@gmail.com");
		properties.put("mail.smtp.user", "masamadrebbdd@gmail.com");
		properties.put("mail.smtp.auth", "true");
 
		session = Session.getDefaultInstance(properties);
	}
	
	public void sendEmail(String email,String asunto, String mensaje, String pass){
		 
		init();
		try{
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress((String)properties.get("mail.smtp.mail.sender")));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
			message.setSubject(asunto);
			message.setText(mensaje);
			Transport t = session.getTransport("smtp");
			t.connect((String)properties.get("mail.smtp.user"), pass);
			t.sendMessage(message, message.getAllRecipients());
			t.close();
		}catch (MessagingException me){
			JOptionPane.showMessageDialog(this, "Fallo al enviar correo", "Error",
					JOptionPane.ERROR_MESSAGE);
			return;
		}
		
	}
	
	public void sendEmailEncuesta(ArrayList<String> emails,String asunto, String mensaje, String pass){
		 
		init();
		InternetAddress [] direcciones = new InternetAddress [emails.size()];
		System.out.println(emails);
		try{
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress((String)properties.get("mail.smtp.mail.sender")));
			for (int i = 0; i < emails.size(); i++) {
				direcciones[i] = new InternetAddress(emails.get(i));
			}
		    message.setRecipients(Message.RecipientType.BCC,direcciones);
			message.setSubject(asunto);
			message.setText(mensaje);
			Transport t = session.getTransport("smtp");
			t.connect((String)properties.get("mail.smtp.user"), pass);
			t.sendMessage(message, message.getAllRecipients());
			t.close();
		}catch (MessagingException me){
			JOptionPane.showMessageDialog(this, "Fallo al enviar correo", "Error",
					JOptionPane.ERROR_MESSAGE);
			return;
		}
		
	}

	public JComboBox<Cliente> getCbCliente() {
		return cbClientes;
	}
	
	public void vaciarCamposCom() {
		txtAreaCom.setText("");
		txtFieldTituloCom.setText("");
	}
	
	public void vaciarCamposEnc() {
		txtAreaEncuesta.setText(textoEncuesta);
		txtFieldTituloEncuesta.setText("");
	}
	
	public void cargarPanelCom() {
		if (!panelComunicacion.isVisible()) {
			panelEncuesta.setVisible(false);
			panelComunicacion.setVisible(true);
			this.repaint();
		}
	}
	
	public void cargarPanelEnc() {
		if (!panelEncuesta.isVisible()) {
			panelComunicacion.setVisible(false);
			panelEncuesta.setVisible(true);
			this.repaint();
		}
	}
	
	public void crearEncuesta() {
		try {
			Runtime.getRuntime().exec(new String[] { "cmd", "/c", "start chrome https://docs.google.com/forms/u/0/"});
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public int confirmaCancelar() {
		int opcion4 = JOptionPane.showConfirmDialog( this, "¿Desea borrar los campos?", "Borrar", JOptionPane.YES_NO_OPTION,
				 JOptionPane.WARNING_MESSAGE); 
		return opcion4;
	}
}
