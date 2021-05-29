package views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Vista_Modulos1 extends JPanel {

	public Vista_Modulos1() {
setLayout(new BorderLayout(0, 0));
		
		JPanel panel_login = new JPanel();
		FlowLayout fl_panel_login = (FlowLayout) panel_login.getLayout();
		fl_panel_login.setAlignment(FlowLayout.RIGHT);
		add(panel_login, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("New label");
		panel_login.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		panel_login.add(btnNewButton);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel lblNewLabel_3 = new JLabel("MODULOS");
		btnNewButton_4.setIcon(new ImageIcon(".\\images\\clientes.png"));
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setIcon(new ImageIcon(".\\images\\marketing.png"));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon(".\\images\\factura.png"));
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(".\\images\\programar.png"));
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(206)
					.addComponent(lblNewLabel_3))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(100)
					.addComponent(btnNewButton_4)
					.addGap(200)
					.addComponent(btnNewButton_5))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(91)
					.addComponent(lblNewLabel_4)
					.addGap(187)
					.addComponent(lblNewLabel_5))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(97)
					.addComponent(btnNewButton_3)
					.addGap(200)
					.addComponent(btnNewButton_2))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(91)
					.addComponent(lblNewLabel_1)
					.addGap(187)
					.addComponent(lblNewLabel_2))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(50)
					.addComponent(lblNewLabel_3)
					.addGap(155)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_4)
						.addComponent(btnNewButton_5))
					.addGap(5)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_4)
						.addComponent(lblNewLabel_5))
					.addGap(160)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_3)
						.addComponent(btnNewButton_2))
					.addGap(5)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_2)))
		);
		panel_1.setLayout(gl_panel_1);
	}
	
}
