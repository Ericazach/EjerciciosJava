package EjerciciosTres;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;
import java.awt.Color;

public class Formulario {

	private JFrame frmRegistro;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario window = new Formulario();
					window.frmRegistro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Formulario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegistro = new JFrame();
		frmRegistro.getContentPane().setBackground(new Color(128, 128, 255));
		frmRegistro.setTitle("Registro");
		frmRegistro.setBounds(100, 100, 462, 491);
		frmRegistro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistro.getContentPane().setLayout(null);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Source Sans Pro ExtraLight", Font.PLAIN, 17));
		lblNombre.setBounds(26, 11, 65, 23);
		frmRegistro.getContentPane().add(lblNombre);

		textField = new JTextField();
		textField.setBounds(114, 14, 115, 20);
		frmRegistro.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblPais = new JLabel("Pais");
		lblPais.setFont(new Font("Source Sans Pro ExtraLight", Font.PLAIN, 17));
		lblPais.setBounds(26, 51, 65, 23);
		frmRegistro.getContentPane().add(lblPais);

		JList list = new JList();
		list.setBounds(228, 108, -55, -34);
		frmRegistro.getContentPane().add(list);

		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Source Sans Pro ExtraLight", Font.PLAIN, 14));
		spinner.setModel(new SpinnerListModel(new String[] { "Alemania", "Francia", "Espa\u00F1a" }));
		spinner.setToolTipText("");
		spinner.setBounds(114, 54, 115, 20);
		frmRegistro.getContentPane().add(spinner);
	}
}
