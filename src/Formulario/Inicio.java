package Formulario;
import java.util.ArrayList;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Clase01.Contactos;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class Inicio extends JFrame {

	ArrayList Agenda = new ArrayList();
	
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtNumero;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
		
		CrearModelo();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 685, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String no = txtNombre.getText ();
				String ap = txtApellido.getText ();
				String nu = txtNumero.getText ();
				String em = txtEmail.getText ();
				
				if (!no.isEmpty()) {
					if (!ap.isEmpty()) {
						if (!nu.isEmpty()) {
							if (!em.isEmpty()) {
								
								Contactos con = new Contactos (no, ap, Integer.parseInt(nu), em);
								Agenda.add(con);
								
								JOptionPane.showMessageDialog(null, "contacto guardado");
								
								txtNombre.setText ("");
								txtApellido.setText ("");
								txtNumero.setText ("");
								txtEmail.setText ("");
								
							}else {
								JOptionPane.showMessageDialog(null, "El campo Email esta vacio");
							}
						}else {
							JOptionPane.showMessageDialog(null, "El campo Numero esta vacio");
						}
					}else {
						JOptionPane.showMessageDialog(null, "El campo Apellido esta vacio");
					}
			}else {
				JOptionPane.showMessageDialog(null, "El campo Nombre esta vacio");
			}}}
		);
		btnNewButton.setBounds(79, 312, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Mostrar");
		btnNewButton_1.setBounds(256, 54, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Modificar");
		btnNewButton_2.setBounds(407, 54, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Eliminar");
		btnNewButton_3.setBounds(536, 54, 89, 23);
		contentPane.add(btnNewButton_3);
		
		txtNombre = new JTextField();
		txtNombre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtNombre.setBounds(124, 110, 105, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBounds(31, 112, 56, 17);
		contentPane.add(lblNewLabel);
		
		txtApellido = new JTextField();
		txtApellido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtApellido.setBounds(124, 165, 105, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		txtNumero = new JTextField();
		txtNumero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtNumero.setBounds(124, 212, 105, 20);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtEmail.setBounds(124, 265, 105, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido:");
		lblNewLabel_1.setBounds(31, 168, 83, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Numero:");
		lblNewLabel_2.setBounds(31, 215, 72, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("E-mail:");
		lblNewLabel_3.setBounds(31, 268, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		table01 = new JTable();
		table01.setBounds(256, 113, 372, 338);
		contentPane.add(table01);
	}
	
	private JTable table01;
	DefaultTableModel M;
	
	
	private void CrearModelo() {
		try {
			M = (new DefaultTableModel(
				null, new String [] {
						"Nombre","Apellido","Numero","Email"}
		));
			table01.setModel (M);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error");
		}
		
	}
}
