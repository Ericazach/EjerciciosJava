package EjerciciosTres;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Formulario {

	private JFrame frmRegistro;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JMenuBar BarraBtn;

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

		BarraBtn = new JMenuBar();

		JMenu archivo = new JMenu("Archivo");
		JMenu editar = new JMenu("Editar");

		BarraBtn.add(archivo);
		BarraBtn.add(editar);

		JMenuItem abrir = new JMenuItem("Abrir");
		JMenuItem guardar = new JMenuItem("Guardar");
		JMenuItem cargar = new JMenuItem("Cargar");
		JMenuItem salir = new JMenuItem("Salir");

		JMenuItem modificar = new JMenuItem("Modificar");
		JMenuItem copiar = new JMenuItem("Copiar");
		JMenuItem pegar = new JMenuItem("Pegar");

		archivo.add(abrir);
		archivo.add(guardar);
		archivo.add(cargar);
		archivo.add(salir);

		editar.add(modificar);
		editar.add(copiar);
		editar.add(pegar);

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frmRegistro = new JFrame();
		frmRegistro.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmRegistro.getContentPane().setBackground(new Color(192, 192, 192));
		frmRegistro.setTitle("Registro");
		frmRegistro.setBounds(100, 100, 462, 491);
		frmRegistro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistro.getContentPane().setLayout(null);

		frmRegistro.setJMenuBar(BarraBtn);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(62, 281, 49, 17);
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmRegistro.getContentPane().add(lblNombre);

		textField = new JTextField();
		textField.setBounds(147, 280, 230, 20);
		frmRegistro.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(71, 306, 31, 17);
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmRegistro.getContentPane().add(lblEdad);

		textField_1 = new JTextField();
		textField_1.setBounds(147, 305, 230, 20);
		textField_1.setColumns(10);
		frmRegistro.getContentPane().add(textField_1);

		JLabel lblEmpleo = new JLabel("Empleo");
		lblEmpleo.setBounds(64, 331, 45, 17);
		lblEmpleo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmRegistro.getContentPane().add(lblEmpleo);

		textField_2 = new JTextField();
		textField_2.setBounds(147, 330, 230, 20);
		textField_2.setColumns(10);
		frmRegistro.getContentPane().add(textField_2);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(62, 112, 315, 127);
		frmRegistro.getContentPane().add(textArea);

		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(52, 396, 89, 23);
		frmRegistro.getContentPane().add(btnEnviar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(172, 396, 89, 23);
		frmRegistro.getContentPane().add(btnCancelar);

		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(299, 396, 89, 23);
		frmRegistro.getContentPane().add(btnSalir);
	}
}
