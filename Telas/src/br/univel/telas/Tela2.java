package br.univel.telas;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tela2 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String ID = "TELA2";

	private final TelaController controller;

	public Tela2(final TelaController controller) {
		this.controller = controller;
		setLayout(null);
		setSize(380, 200);

		JLabel lblTela = new JLabel("Tela 2");
		lblTela.setBounds(143, 79, 69, 31);
		lblTela.setFont(new Font("Tahoma", Font.PLAIN, 25));
		add(lblTela);

		JButton btnNewButton = new JButton(">");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela2.this.controller.show(Tela3.ID);
			}
		});
		btnNewButton.setBounds(281, 166, 89, 23);
		add(btnNewButton);

		JButton btnNewButton_1 = new JButton("<");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela2.this.controller.show(Tela1.ID);
			}
		});
		btnNewButton_1.setBounds(10, 166, 89, 23);
		add(btnNewButton_1);
	}
}
