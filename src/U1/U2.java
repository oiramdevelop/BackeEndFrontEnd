package U1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

public class U2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U2 window = new U2();
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
	public U2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel.setBounds(33, 30, 46, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblContrasea = new JLabel("Contraseña");
		lblContrasea.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblContrasea.setBounds(33, 69, 67, 14);
		frame.getContentPane().add(lblContrasea);

		textField = new JTextField();
		textField.setBounds(121, 27, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(121, 66, 86, 20);
		frame.getContentPane().add(textField_1);

		JLabel lblNewLabel_1 = new JLabel("Introduzca usuario y contraseña");
		lblNewLabel_1.setBounds(123, 149, 190, 14);
		frame.getContentPane().add(lblNewLabel_1);

		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// aqui va mi codigo cuando el usuario le de a aceptar
				lblNewLabel_1.setText("Aceptar pulsado");

				String usuario = textField.getText();
				String clave = textField_1.getText();

				boolean valido = usuario.equals("administrador") && clave.equals("miclave1234");

				if (valido)

				{
					lblNewLabel_1.setText("¡ Bienvenido ! " + usuario);
					lblNewLabel_1.setForeground(Color.GREEN);

				}

				else

				{
					lblNewLabel_1.setText("Usuario Incorrecto");
					lblNewLabel_1.setForeground(Color.red);
				}

			}

		});
		btnNewButton.setBounds(151, 174, 89, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
			}
		});
		btnNewButton_1.setBounds(151, 227, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
