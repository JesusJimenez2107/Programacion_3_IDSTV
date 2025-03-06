package Actividad_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Ventana2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana2 window = new Ventana2();
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
	public Ventana2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 946, 590);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder (Color.decode("#e76f51"),10));
		panel.setBackground(Color.decode("#e76f51"));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Registro de usuario");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 22));
		panel.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.decode("#e76f51"));
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(2, 2, 10, 10));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder (Color.decode("#f4a261"),5));
		panel_2.setBackground(Color.decode("#f4a261"));
		panel_1.add(panel_2);
		panel_2.setLayout(new GridLayout(8, 2, 4, 4));
		
		JLabel lblNewLabel_1 = new JLabel("Datos generales");
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 15));
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_5 = new JLabel("");
		panel_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_2 = new JLabel("Nombres:");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 15));
		panel_2.add(lblNewLabel_2);
		
		textField = new JTextField();
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Apellido paterno:");
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 15));
		panel_2.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Apellido materno:");
		lblNewLabel_4.setFont(new Font("Verdana", Font.PLAIN, 15));
		panel_2.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Fecha de nacimiento:");
		lblNewLabel_6.setFont(new Font("Verdana", Font.PLAIN, 15));
		panel_2.add(lblNewLabel_6);
		
		textField_3 = new JTextField();
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Sexo:");
		lblNewLabel_7.setFont(new Font("Verdana", Font.PLAIN, 15));
		panel_2.add(lblNewLabel_7);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		rdbtnNewRadioButton.setFont(new Font("Verdana", Font.PLAIN, 13));
		rdbtnNewRadioButton.setBackground(Color.decode("#f4a261"));
		panel_2.add(rdbtnNewRadioButton);
		
		JLabel lblNewLabel_8 = new JLabel("");
		panel_2.add(lblNewLabel_8);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Femenino");
		rdbtnNewRadioButton_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		rdbtnNewRadioButton_1.setBackground(Color.decode("#f4a261"));
		panel_2.add(rdbtnNewRadioButton_1);
		
		ButtonGroup group = new ButtonGroup();
	    group.add(rdbtnNewRadioButton);
	    group.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_9 = new JLabel("Nacionalidad:");
		lblNewLabel_9.setFont(new Font("Verdana", Font.PLAIN, 15));
		panel_2.add(lblNewLabel_9);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Verdana", Font.PLAIN, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"México", "Peru", "Argentina", "Brazil", "Chile", "Canada", "USA", "Ecuador"}));
		panel_2.add(comboBox);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.decode("#e9c46a"));
		panel_1.add(panel_3);
		panel_3.setLayout(new BorderLayout(5, 5));
		
		JLabel lblPerfilDeUsuario = new JLabel("  Perfil de usuario");
		lblPerfilDeUsuario.setFont(new Font("Verdana", Font.BOLD, 15));
		panel_3.add(lblPerfilDeUsuario, BorderLayout.NORTH);
		
		JLabel lblNewLabel_10 = new JLabel("");
		ImageIcon imagen1 = new ImageIcon("C:\\Users\\Jepaj\\eclipse-workspace\\Actividad_1\\profile.png");
		lblNewLabel_10.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_10, BorderLayout.CENTER);
		
		JLabel lblNewLabel_11 = new JLabel("");
		panel_3.add(lblNewLabel_11, BorderLayout.WEST);
		
		JPanel panel_6 = new JPanel();
		
		panel_6.setBackground(Color.decode("#e9c46a"));
		panel_3.add(panel_6, BorderLayout.SOUTH);
		panel_6.setLayout(new GridLayout(2, 3, 10,10));
		
		JLabel lblNewLabel_12 = new JLabel("");
		panel_6.add(lblNewLabel_12);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar foto de perfil");
		chckbxNewCheckBox.setBackground(Color.decode("#e9c46a"));
		chckbxNewCheckBox.setFont(new Font("Verdana", Font.PLAIN, 12));
		panel_6.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_13 = new JLabel("");
		panel_6.add(lblNewLabel_13);
		
		JLabel lblNewLabel_15 = new JLabel("");
		panel_6.add(lblNewLabel_15);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Mostrar fecha de nacimiento");
		chckbxNewCheckBox_1.setBackground(Color.decode("#e9c46a"));
		chckbxNewCheckBox_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		panel_6.add(chckbxNewCheckBox_1);
		
		JLabel lblNewLabel_14 = new JLabel("");
		panel_6.add(lblNewLabel_14);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.decode("#2a9d8f"));
		panel_1.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_16 = new JLabel("  Datos opcionales");
		lblNewLabel_16.setFont(new Font("Verdana", Font.BOLD, 15));
		panel_4.add(lblNewLabel_16, BorderLayout.NORTH);
		
		JPanel panel_7 = new JPanel();
		panel_4.add(panel_7, BorderLayout.CENTER);
		panel_7.setBackground(Color.decode("#2a9d8f"));
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_8 = new JPanel();
		panel_7.add(panel_8, BorderLayout.NORTH);
		panel_8.setBackground(Color.decode("#2a9d8f"));
		panel_8.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel_17 = new JLabel("Descripcion");
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_17.setFont(new Font("Verdana", Font.PLAIN, 15));
		panel_8.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Preferencias");
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18.setFont(new Font("Verdana", Font.PLAIN, 15));
		panel_8.add(lblNewLabel_18);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder (Color.decode("#2a9d8f"),10));
		panel_7.add(panel_9, BorderLayout.CENTER);
		panel_9.setBackground(Color.decode("#2a9d8f"));
		panel_9.setLayout(new GridLayout(1, 0, 10, 10));
		
		JTextArea textArea_1 = new JTextArea(5,5);
		textArea_1.setLineWrap(true);
		textArea_1.setWrapStyleWord(true);
		JScrollPane scrollPane = new JScrollPane(textArea_1);
		panel_9.add(scrollPane);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setLineWrap(true);
		textArea_2.setWrapStyleWord(true);
		JScrollPane scrollPane_2 = new JScrollPane(textArea_2);
		panel_9.add(scrollPane_2);
		
		
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder (Color.decode("#264653"),10));
		panel_5.setBackground(Color.decode("#264653"));
		panel_1.add(panel_5);
		panel_5.setLayout(new GridLayout(7, 3, 0, 0));
		
		JLabel lblNewLabel_19 = new JLabel("");
		panel_5.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("");
		panel_5.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("");
		panel_5.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("");
		panel_5.add(lblNewLabel_22);
		
		JButton btnNewButton = new JButton("NUEVO");
		panel_5.add(btnNewButton);
		
		JLabel lblNewLabel_24 = new JLabel("");
		panel_5.add(lblNewLabel_24);
		
		JLabel lblNewLabel_27 = new JLabel("");
		panel_5.add(lblNewLabel_27);
		
		JLabel lblNewLabel_31 = new JLabel("");
		panel_5.add(lblNewLabel_31);
		
		JLabel lblNewLabel_32 = new JLabel("");
		panel_5.add(lblNewLabel_32);
		
		JLabel lblNewLabel_33 = new JLabel("");
		panel_5.add(lblNewLabel_33);
		
		JButton btnNewButton_1 = new JButton("GUARDAR");
		panel_5.add(btnNewButton_1);
		
		JLabel lblNewLabel_36 = new JLabel("");
		panel_5.add(lblNewLabel_36);
		
		JLabel lblNewLabel_35 = new JLabel("");
		panel_5.add(lblNewLabel_35);
		
		JLabel lblNewLabel_34 = new JLabel("");
		panel_5.add(lblNewLabel_34);
		
		JLabel lblNewLabel_30 = new JLabel("");
		panel_5.add(lblNewLabel_30);
		
		JLabel lblNewLabel_23 = new JLabel("");
		panel_5.add(lblNewLabel_23);
		
		JButton btnNewButton_2 = new JButton("SALIR");
		panel_5.add(btnNewButton_2);
		
		JLabel lblNewLabel_25 = new JLabel("");
		panel_5.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("");
		panel_5.add(lblNewLabel_26);
		
		JLabel lblNewLabel_28 = new JLabel("");
		panel_5.add(lblNewLabel_28);
		
		JLabel lblNewLabel_29 = new JLabel("");
		panel_5.add(lblNewLabel_29);
	}

}
