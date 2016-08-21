package br.univel.telas;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tela3 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String ID = "TELA3";

	private final TelaController controller;

	public Tela3(final TelaController controller) {
		this.controller = controller;
		setLayout(null);
		setSize(380, 200);

		JButton btnNewButton = new JButton("<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela3.this.controller.show(Tela2.ID);
			}
		});
		btnNewButton.setBounds(109, 166, 89, 23);
		add(btnNewButton);

		JLabel lblTela = new JLabel("Tela 3");
		lblTela.setBounds(143, 63, 78, 51);
		lblTela.setFont(new Font("Tahoma", Font.PLAIN, 25));
		add(lblTela);
		
		JButton button = new JButton("|<");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela3.this.controller.show(Tela1.ID);
			}
		});
		button.setBounds(10, 166, 89, 23);
		add(button);
	}

}
