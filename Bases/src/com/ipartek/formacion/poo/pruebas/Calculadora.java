package com.ipartek.formacion.poo.pruebas;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculadora {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 336, 162);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(22, 23, 68, 23);
		frame.getContentPane().add(lblNombre);

		textField = new JTextField();
		textField.setBounds(80, 24, 106, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblResultado = new JLabel("Escribe tu nombre para que te salude");
		lblResultado.setBounds(22, 57, 213, 23);
		frame.getContentPane().add(lblResultado);

		JButton btnMandar = new JButton("Send");
		btnMandar.setBounds(196, 23, 89, 23);
		frame.getContentPane().add(btnMandar);
	}
}
