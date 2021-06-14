package views;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.Controlador;
import javax.swing.border.LineBorder;
import java.awt.FlowLayout;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Vista_Planificacion extends JPanel {

	private JButton btnAniadirUsu;
	private JButton btnModificar;
	private JButton btnHome;
	private JPanel panel_resumen;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField textField;
	private JTextField textField_1;

	public Vista_Planificacion() {
		setLayout(null);

		this.setSize(1366, 768);
		
		JPanel panel_aniadir = new JPanel();
		panel_aniadir.setBounds(294, 31, 1000, 662);
		add(panel_aniadir);
		panel_aniadir.setLayout(null);
		
		lblNewLabel = new JLabel("Buscar Cliente:");
		lblNewLabel.setBounds(10, 23, 85, 30);
		panel_aniadir.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Fecha Pedido:");
		lblNewLabel_1.setBounds(10, 64, 85, 30);
		panel_aniadir.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Descripci\u00F3n");
		lblNewLabel_2.setBounds(10, 105, 85, 30);
		panel_aniadir.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Importe");
		lblNewLabel_3.setBounds(10, 406, 46, 14);
		panel_aniadir.add(lblNewLabel_3);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setHgap(15);
		flowLayout.setAlignment(FlowLayout.RIGHT);
		flowLayout.setVgap(45);
		panel.setBounds(10, 517, 980, 134);
		panel_aniadir.add(panel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(btnNewButton_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(368, 118, 622, 255);
		panel_aniadir.add(textArea);
		
		textField = new JTextField();
		textField.setBounds(368, 28, 622, 20);
		panel_aniadir.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(368, 69, 622, 20);
		panel_aniadir.add(textField_1);

		btnAniadirUsu = new JButton("A\u00F1adir Pedido");
		btnAniadirUsu.setBackground(Color.BLACK);
		btnAniadirUsu.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnAniadirUsu.setBounds(49, 203, 195, 65);
		add(btnAniadirUsu);

		btnModificar = new JButton("Resumen Pedido");
		btnModificar.setBackground(Color.BLACK);
		btnModificar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnModificar.setBounds(49, 292, 195, 65);
		add(btnModificar);
		
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
		
		panel_resumen = new JPanel();
		panel_resumen.setBounds(294, 31, 1000, 662);
		add(panel_resumen);
	}
	

	public JButton getBtnHome() {
		return btnHome;
	}

	public void setControlador(Controlador controlador) {
		btnHome.addActionListener(controlador);
		btnAniadirUsu.addActionListener(controlador);
		btnModificar.addActionListener(controlador);

	}
}
