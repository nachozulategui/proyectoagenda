package paquete;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class logeo extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField jpassClave;
	private JButton btningresar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					logeo frame = new logeo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public logeo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 212);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(157, 37, 82, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(52, 80, 58, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("contrase\u00F1a:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(37, 121, 73, 14);
		contentPane.add(lblNewLabel_2);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(120, 77, 96, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		jpassClave = new JPasswordField();
		jpassClave.setBounds(120, 118, 96, 20);
		contentPane.add(jpassClave);
		
		btningresar = new JButton("Ingresar");
		btningresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				char[] clave = jpassClave.getPassword();
				String claveFinal = new String(clave);
				
				if(txtUsuario.getText().equals("nacho") && claveFinal.equals("123")) {
					dispose();
					JOptionPane.showMessageDialog(null, "Bienvenido al sistema","INGRESASTE",
							JOptionPane.INFORMATION_MESSAGE);
					principal p = new principal();
					p.setVisible(true);
					
				}else {
					JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrectos","ERROR",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btningresar.setBounds(264, 80, 89, 40);
		contentPane.add(btningresar);
	}
}
