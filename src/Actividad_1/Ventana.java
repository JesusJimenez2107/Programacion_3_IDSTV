package Actividad_1;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Ventana extends JFrame{

	public Ventana(){
		this.setVisible(true);
		this.setSize(1000,600);  //tamaño login
		//this.setSize(416,654); //tamaño calculadora
		this.setLocationRelativeTo(null);
		
		//this.setTitle("Login");
		//this.setTitle("Calculadora");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setMaximumSize(new Dimension(1000,1000));
		this.setMinimumSize(new Dimension(400,400));	
		
		//this.add(this.login());
		//this.add(this.registro());
		//this.add(this.Usuarios());
		//this.add(this.calculadora());
		
		
		//barra
		
		JMenuBar barra = new JMenuBar();
		
		JMenu file = new JMenu ("Archivo");
		barra.add(file);
		
		JMenuItem op_1 = new JMenuItem("Nuevo");
		file.add(op_1);
		
		JMenuItem op_2 = new JMenuItem("Abrir");
		file.add(op_2);
		
		JMenuItem op_3 = new JMenuItem("Guardar");
		file.add(op_3);
		
		//ImageIcon saveIcon = new ImageIcon("saveIcon.png");
		//op_3.setIcon(saveIcon);
		
		JMenuItem op_4 = new JMenuItem("Guardar como");
		file.add(op_4);
		
		JMenuItem op_5 = new JMenuItem("Salir");
		file.add(op_5);
		
		JMenu edit = new JMenu ("Editar");
		barra.add(edit);
		
		JMenuItem op_6 = new JMenuItem("Cortar");
		edit.add(op_6);
		
		JMenuItem op_7 = new JMenuItem("Copiar");
		edit.add(op_7);
		
		JMenuItem op_8 = new JMenuItem("Pegar");
		edit.add(op_8);
		
		this.setJMenuBar(barra);
		this.repaint();
		this.revalidate();
	
	}
	
	public JPanel login() {
		Border border = BorderFactory.createLineBorder(Color.decode("#16404D"), 2);
	
		JPanel mipanel = new JPanel();
		mipanel.setBackground(Color.decode("#F2EFE7"));
		mipanel.setOpaque(true); //se necesita para poder ver el color
		mipanel.setSize(1000,600);
		mipanel.setLocation(0, 0);
		mipanel.setLayout(null);//permite poner los elementos donde quieras
		
		JLabel etiqueta1 = new JLabel("Bienvenido");
		etiqueta1.setSize(200, 30);
		etiqueta1.setLocation(105, 30);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setFont(new Font ("Verdana", Font.BOLD, 30));
		mipanel.add(etiqueta1);
		
		JLabel etiqueta2 = new JLabel("Ingrese su correo:");
		etiqueta2.setSize(200, 30);
		etiqueta2.setLocation(40, 130);
		etiqueta2.setFont(new Font ("Verdana", Font.BOLD, 16));
		mipanel.add(etiqueta2);
		
		ImageIcon imagen1 = new ImageIcon("loginIcon.png");
		JLabel iconoLog = new JLabel();
		iconoLog.setSize(30, 30);
		iconoLog.setLocation(40, 160);
		iconoLog.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH)));
		iconoLog.setOpaque(true);
		iconoLog.setBackground(Color.decode("#6b9394"));
		iconoLog.setBorder(border);
		mipanel.add(iconoLog);
		
		JTextField email = new JTextField();
		email.setSize(300, 30);
		email.setLocation(73, 160);
		email.setOpaque(true);
		email.setBackground(Color.decode("#A6CDC6"));
		email.setFont(new Font ("Verdana", Font.BOLD, 16));
		email.setBorder(border);
		mipanel.add(email);
		
		JLabel etiqueta3 = new JLabel("Contraseña:");
		etiqueta3.setSize(200, 30);
		etiqueta3.setLocation(40, 210);
		etiqueta3.setFont(new Font ("Verdana", Font.BOLD, 16));
		mipanel.add(etiqueta3);
		
		ImageIcon imagen2 = new ImageIcon("passIcon.png");
		JLabel iconoPass = new JLabel();
		iconoPass.setSize(30, 30);
		iconoPass.setLocation(40, 240);
		iconoPass.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH)));
		iconoPass.setOpaque(true);
		iconoPass.setBackground(Color.decode("#6b9394"));
		iconoPass.setBorder(border);
		mipanel.add(iconoPass);
		
		JPasswordField  contra = new JPasswordField ();
		contra.setSize(300, 30);
		contra.setLocation(73, 240);
		contra.setOpaque(true);
		contra.setBackground(Color.decode("#A6CDC6"));
		contra.setFont(new Font ("Verdana", Font.BOLD, 16));
		contra.setBorder(border);
		mipanel.add(contra);
		
		JCheckBox recuerdame = new JCheckBox("Recuerdame",false);
		recuerdame.setSize(120, 30);
		recuerdame.setLocation(36, 280);
		recuerdame.setFont(new Font ("Verdana", Font.BOLD, 12));
		mipanel.add(recuerdame);
		
		JLabel etiqueta4 = new JLabel("¿Olvidó su Contraseña?");
		etiqueta4.setSize(200, 30);
		etiqueta4.setLocation(230, 280);
		etiqueta4.setFont(new Font ("Verdana", Font.ITALIC, 12));
		mipanel.add(etiqueta4);
		
		JButton acceder = new JButton("ACCEDER") {
		    @Override
		    protected void paintComponent(Graphics g) {
		        Graphics2D g2 = (Graphics2D) g.create();
		        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		        // Dibuja el botón con bordes redondeados
		        g2.setColor(getBackground());
		        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30); // Radio de borde 30px

		        super.paintComponent(g);
		        g2.dispose();
		    }
		};

		acceder.setSize(200, 40);
		acceder.setLocation(105, 350);
		acceder.setOpaque(false); 
		acceder.setContentAreaFilled(false);
		acceder.setBorderPainted(false);
		acceder.setBackground(Color.decode("#DDA853"));
		acceder.setHorizontalAlignment(JButton.CENTER);
		acceder.setFont(new Font("Verdana", Font.BOLD, 20));
		acceder.setForeground(Color.decode("#FBFBFB"));
		acceder.setBorder(border);

		acceder.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseEntered(MouseEvent e) {
		        acceder.setBackground(Color.decode("#16404d"));
		        acceder.repaint();
		    }

		    @Override
		    public void mouseExited(MouseEvent e) {
		        acceder.setBackground(Color.decode("#DDA853"));
		        acceder.repaint();
		    }
		});
		
		mipanel.add(acceder);
		
		ImageIcon imagen3 = new ImageIcon("fondoLog.png");
		JLabel fondoLog = new JLabel();
		fondoLog.setSize(500, 600);
		fondoLog.setLocation(500, 0);
		fondoLog.setIcon(new ImageIcon(imagen3.getImage().getScaledInstance(500, 600, Image.SCALE_SMOOTH)));
		mipanel.add(fondoLog);
		
		return mipanel;
	}

	public JPanel registro() {
		
		Border border = BorderFactory.createLineBorder(Color.decode("#16404D"), 2);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.decode("#FBF5DD"));
		panel2.setOpaque(true); //se necesita para poder ver el color
		panel2.setSize(500,500);
		panel2.setLocation(0, 0);
		panel2.setLayout(null);//permite poner los elementos donde quieras
		
		JLabel etq1 = new JLabel("REGISTRO");
		etq1.setSize(200, 30);
		etq1.setLocation(150, 30);
		etq1.setHorizontalAlignment(JLabel.CENTER);
		etq1.setFont(new Font ("Verdana", Font.BOLD, 30));
		panel2.add(etq1);
		
		JLabel etq2 = new JLabel("Datos Personales");
		etq2.setSize(500, 30);
		etq2.setLocation(0, 100);
		etq2.setBackground(Color.decode("#16404D"));
		etq2.setOpaque(true);
		etq2.setHorizontalAlignment(JLabel.CENTER);
		etq2.setFont(new Font ("Verdana", Font.BOLD, 20));
		etq2.setForeground(Color.decode("#FBFBFB"));
		panel2.add(etq2);
		
		JLabel etq3 = new JLabel("Nombre de usuario:");
		etq3.setSize(200, 30);
		etq3.setLocation(40, 140);
		etq3.setFont(new Font ("Verdana", Font.BOLD, 16));
		panel2.add(etq3);
		
		JTextField nUsuario = new JTextField();
		nUsuario.setSize(300, 30);
		nUsuario.setLocation(38, 170);
		nUsuario.setOpaque(true);
		nUsuario.setBackground(Color.decode("#A6CDC6"));
		nUsuario.setFont(new Font ("Verdana", Font.BOLD, 16));
		nUsuario.setBorder(border);
		panel2.add(nUsuario);
		
		JLabel etq4 = new JLabel("Contraseña:");
		etq4.setSize(200, 30);
		etq4.setLocation(40, 210);
		etq4.setFont(new Font ("Verdana", Font.BOLD, 16));
		panel2.add(etq4);
		
		JTextField cUsuario = new JTextField();
		cUsuario.setSize(300, 30);
		cUsuario.setLocation(38, 240);
		cUsuario.setOpaque(true);
		cUsuario.setBackground(Color.decode("#A6CDC6"));
		cUsuario.setFont(new Font ("Verdana", Font.BOLD, 16));
		cUsuario.setBorder(border);
		panel2.add(cUsuario);
		
		JLabel etq5 = new JLabel("Correo:");
		etq5.setSize(200, 30);
		etq5.setLocation(40, 280);
		etq5.setFont(new Font ("Verdana", Font.BOLD, 16));
		panel2.add(etq5);
		
		JTextField corrUsuario = new JTextField();
		corrUsuario.setSize(300, 30);
		corrUsuario.setLocation(38, 310);
		corrUsuario.setOpaque(true);
		corrUsuario.setBackground(Color.decode("#A6CDC6"));
		corrUsuario.setFont(new Font ("Verdana", Font.BOLD, 16));
		corrUsuario.setBorder(border);
		panel2.add(corrUsuario);
		
		JLabel etq6 = new JLabel("Descripción:");
		etq6.setSize(200, 30);
		etq6.setLocation(40, 350);
		etq6.setFont(new Font ("Verdana", Font.BOLD, 16));
		panel2.add(etq6);
		
		JTextArea bio = new  JTextArea();
		bio.setSize(300, 105);
		bio.setLocation(38, 380);
		bio.setOpaque(true);
		bio.setBackground(Color.decode("#A6CDC6"));
		bio.setFont(new Font ("Verdana", Font.BOLD, 16));
		bio.setLineWrap(true); // Permite que el texto pase a la siguiente línea
		bio.setWrapStyleWord(true); // Ajusta por palabras completas
		bio.setBorder(border);
		panel2.add(bio);
		
		JLabel etq7 = new JLabel("Preferencias:");
		etq7.setSize(200, 30);
		etq7.setLocation(40, 495);
		etq7.setFont(new Font ("Verdana", Font.BOLD, 16));
		panel2.add(etq7);
		
		JCheckBox dulces = new JCheckBox("Dulces",false);
		dulces.setSize(80, 30);
		dulces.setLocation(36, 525);
		dulces.setBackground(Color.decode("#FBF5DD"));
		dulces.setOpaque(true);
		dulces.setFont(new Font ("Verdana", Font.BOLD, 12));
		panel2.add(dulces);
		
		JCheckBox salado = new JCheckBox("Salado",false);
		salado.setSize(80, 30);
		salado.setLocation(116, 525);
		salado.setBackground(Color.decode("#FBF5DD"));
		salado.setOpaque(true);
		salado.setFont(new Font ("Verdana", Font.BOLD, 12));
		panel2.add(salado);
		
		JCheckBox saludable = new JCheckBox("Saludable",false);
		saludable.setSize(100, 30);
		saludable.setLocation(196, 525);
		saludable.setBackground(Color.decode("#FBF5DD"));
		saludable.setOpaque(true);
		saludable.setFont(new Font ("Verdana", Font.BOLD, 12));
		panel2.add(saludable);
		
		JLabel etq8 = new JLabel("Colonia:");
		etq8.setSize(200, 30);
		etq8.setLocation(40, 560);
		etq8.setFont(new Font ("Verdana", Font.BOLD, 16));
		panel2.add(etq8);
		
		String[] opciones = {"Centro", "Panteon", "Pueblo nuevo", "Camino Real", "Santa fe"};
		JComboBox<String> colonias = new JComboBox<>(opciones);
		colonias.setSize(200, 30);
		colonias.setLocation(40, 590);
		colonias.setFont(new Font ("Verdana", Font.BOLD, 14));
		panel2.add(colonias);
		
		JLabel etq9 = new JLabel("Terminos y condiciones");
		etq9.setSize(500, 30);
		etq9.setLocation(0, 630);
		etq9.setBackground(Color.decode("#16404D"));
		etq9.setOpaque(true);
		etq9.setHorizontalAlignment(JLabel.CENTER);
		etq9.setFont(new Font ("Verdana", Font.BOLD, 20));
		etq9.setForeground(Color.decode("#FBFBFB"));
		panel2.add(etq9);
		
		JLabel etq10 = new JLabel("¿Aceptas los términos y condiciones?");
		etq10.setSize(350, 30);
		etq10.setLocation(40, 660);
		etq10.setFont(new Font ("Verdana", Font.BOLD, 14));
		panel2.add(etq10);
		
		JRadioButton aceptar = new JRadioButton("Aceptar");
		aceptar.setBounds(38, 690, 100, 30);
		aceptar.setBackground(Color.decode("#FBF5DD"));
		aceptar.setOpaque(true);
		aceptar.setFont(new Font ("Verdana", Font.BOLD, 12));
		
		JRadioButton rechazar = new JRadioButton("Rechazar");
		rechazar.setBounds(140, 690, 100, 30);
		rechazar.setBackground(Color.decode("#FBF5DD"));
		rechazar.setOpaque(true);
		rechazar.setFont(new Font ("Verdana", Font.BOLD, 12));
		
		ButtonGroup group = new ButtonGroup();
	    group.add(aceptar);
	    group.add(rechazar);
		panel2.add(aceptar);
		panel2.add(rechazar);
		
		JButton  confirmar = new JButton ("CREAR CUENTA");
		confirmar.setSize(300, 40);
		confirmar.setLocation(100, 730);
		confirmar.setOpaque(true);
		confirmar.setBackground(Color.decode("#DDA853"));
		confirmar.setHorizontalAlignment(JButton.CENTER);
		confirmar.setFont(new Font ("Verdana", Font.BOLD, 26));
		panel2.add(confirmar);
		
		return panel2;
	}
	
	public JPanel Usuarios() {
		
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.decode("#FBF5DD"));
		panel3.setOpaque(true); //se necesita para poder ver el color
		panel3.setSize(1000,800);
		panel3.setLocation(0, 0);
		panel3.setLayout(null);//permite poner los elementos donde quieras
		
		JLabel etq1 = new JLabel("BIENVENIDO");
		etq1.setSize(300, 30);
		etq1.setLocation(350, 30);
		etq1.setHorizontalAlignment(JLabel.CENTER);
		etq1.setFont(new Font ("Verdana", Font.BOLD, 30));
		panel3.add(etq1);
		
		String title []= {"Nombre", "Apellido", "Edad", "Ciudad"};
		
		String data [][] = {{"Jesus", "Jimenez", "28", "La Paz"},
				{"Jesus", "Jimenez", "28", "La Paz"},
				{"Jesus", "Jimenez", "28", "La Paz"},
				{"Jesus", "Jimenez", "28", "La Paz"},
				{"Jesus", "Jimenez", "28", "La Paz"},
				{"Jesus", "Jimenez", "28", "La Paz"},
				{"Jesus", "Jimenez", "28", "La Paz"},
				{"Jesus", "Jimenez", "28", "La Paz"},
				{"Jesus", "Jimenez", "28", "La Paz"},
				{"Jesus", "Jimenez", "28", "La Paz"},
				{"Jesus", "Jimenez", "28", "La Paz"},
				{"Jesus", "Jimenez", "28", "La Paz"},
				{"Jesus", "Jimenez", "28", "La Paz"},
				{"Jesus", "Jimenez", "28", "La Paz"},
				{"Jesus", "Jimenez", "28", "La Paz"},
				{"Jesus", "Jimenez", "28", "La Paz"},
				{"Jesus", "Jimenez", "28", "La Paz"},
				{"Jesus", "Jimenez", "28", "La Paz"},
				{"Jesus", "Jimenez", "28", "La Paz"},
				{"Jesus", "Jimenez", "28", "La Paz"},
				{"Jesus", "Jimenez", "28", "La Paz"},
				{"Jesus", "Jimenez", "28", "La Paz"},
				{"Jesus", "Jimenez", "28", "La Paz"},
				{"Jesus", "Jimenez", "28", "La Paz"},
				{"Jesus", "Jimenez", "28", "La Paz"},
				{"Jesus", "Jimenez", "28", "La Paz"},
				{"Jesus", "Jimenez", "28", "La Paz"}
				};
		
		JTable tabla = new JTable(data,title);
		JScrollPane scroll_pane = new JScrollPane(tabla);
		scroll_pane.setSize(850, 300);
		scroll_pane.setLocation(60, 200);
		panel3.add(scroll_pane);
		
		JButton  descargar = new JButton ("Descargar");
		descargar.setSize(120, 40);
		descargar.setLocation(650, 150);
		descargar.setOpaque(true);
		descargar.setBackground(Color.decode("#DDA853"));
		descargar.setHorizontalAlignment(JButton.CENTER);
		descargar.setFont(new Font ("Verdana", Font.BOLD, 12));
		panel3.add(descargar);
		
		JButton  añadir = new JButton ("Añadir");
		añadir.setSize(120, 40);
		añadir.setLocation(790, 150);
		añadir.setOpaque(true);
		añadir.setBackground(Color.decode("#DDA853"));
		añadir.setHorizontalAlignment(JButton.CENTER);
		añadir.setFont(new Font ("Verdana", Font.BOLD, 12));
		panel3.add(añadir);
		
		JLabel etq2 = new JLabel("USUARIOS");
		etq2.setSize(300, 30);
		etq2.setLocation(60, 90);
		etq2.setBackground(Color.decode("#16404D"));
		etq2.setOpaque(true);
		etq2.setHorizontalAlignment(JLabel.CENTER);
		etq2.setFont(new Font ("Verdana", Font.BOLD, 20));
		etq2.setForeground(Color.decode("#FBFBFB"));
		panel3.add(etq2);
		
		JLabel etq3 = new JLabel("30");
		etq3.setSize(300, 30);
		etq3.setLocation(60, 120);
		etq3.setBackground(Color.decode("#16404D"));
		etq3.setOpaque(true);
		etq3.setHorizontalAlignment(JLabel.CENTER);
		etq3.setFont(new Font ("Verdana", Font.BOLD, 16));
		etq3.setForeground(Color.decode("#FBFBFB"));
		panel3.add(etq3);
		
	return panel3;	
	}
	
	public JPanel calculadora () {
		
		JPanel panel4 = new JPanel();
		panel4.setBackground(Color.decode("#c6c5b9"));
		panel4.setOpaque(true); //se necesita para poder ver el color
		panel4.setSize(500,654);
		panel4.setLocation(0, 0);
		panel4.setLayout(null);//permite poner los elementos donde quieras
		
		Border border = BorderFactory.createLineBorder(Color.decode("#393d3f"), 2);
		
		JTextField pantalla = new JTextField();
		pantalla.setSize(368, 80);
		pantalla.setLocation(16, 16);
		pantalla.setOpaque(true);
		pantalla.setBackground(Color.decode("#fdfdff"));
		pantalla.setFont(new Font ("Verdana", Font.BOLD, 22));
		pantalla.setBorder(border);
		panel4.add(pantalla);
		
		JButton bt_1 = new JButton("/");
		bt_1.setSize(80, 80);
		bt_1.setLocation(16, 112);
		bt_1.setOpaque(true);
		bt_1.setBackground(Color.decode("#62929e"));
		bt_1.setFont(new Font ("Verdana", Font.BOLD, 26));
		bt_1.setBorder(border);
		panel4.add(bt_1);
		
		JButton bt_2 = new JButton("*");
		bt_2.setSize(80, 80);
		bt_2.setLocation(112, 112);
		bt_2.setOpaque(true);
		bt_2.setBackground(Color.decode("#62929e"));
		bt_2.setFont(new Font ("Verdana", Font.BOLD, 26));
		bt_2.setBorder(border);
		panel4.add(bt_2);
		
		JButton bt_3 = new JButton("-");
		bt_3.setSize(80, 80);
		bt_3.setLocation(208, 112);
		bt_3.setOpaque(true);
		bt_3.setBackground(Color.decode("#62929e"));
		bt_3.setFont(new Font ("Verdana", Font.BOLD, 26));
		bt_3.setBorder(border);
		panel4.add(bt_3);
		
		JButton bt_4 = new JButton("AC");
		bt_4.setSize(80, 80);
		bt_4.setLocation(304, 112);
		bt_4.setOpaque(true);
		bt_4.setBackground(Color.decode("#62929e"));
		bt_4.setFont(new Font ("Verdana", Font.BOLD, 26));
		bt_4.setBorder(border);
		panel4.add(bt_4);
		
		JButton bt_5 = new JButton("7");
		bt_5.setSize(80, 80);
		bt_5.setLocation(16, 208);
		bt_5.setOpaque(true);
		bt_5.setBackground(Color.decode("#62929e"));
		bt_5.setFont(new Font ("Verdana", Font.BOLD, 26));
		bt_5.setBorder(border);
		panel4.add(bt_5);
		
		JButton bt_6 = new JButton("8");
		bt_6.setSize(80, 80);
		bt_6.setLocation(112, 208);
		bt_6.setOpaque(true);
		bt_6.setBackground(Color.decode("#62929e"));
		bt_6.setFont(new Font ("Verdana", Font.BOLD, 26));
		bt_6.setBorder(border);
		panel4.add(bt_6);
		
		JButton bt_7 = new JButton("9");
		bt_7.setSize(80, 80);
		bt_7.setLocation(208, 208);
		bt_7.setOpaque(true);
		bt_7.setBackground(Color.decode("#62929e"));
		bt_7.setFont(new Font ("Verdana", Font.BOLD, 26));
		bt_7.setBorder(border);
		panel4.add(bt_7);
		
		JButton bt_8 = new JButton("+");
		bt_8.setSize(80, 176);
		bt_8.setLocation(304, 208);
		bt_8.setOpaque(true);
		bt_8.setBackground(Color.decode("#62929e"));
		bt_8.setFont(new Font ("Verdana", Font.BOLD, 26));
		bt_8.setBorder(border);
		panel4.add(bt_8);
		
		JButton bt_9 = new JButton("4");
		bt_9.setSize(80, 80);
		bt_9.setLocation(16, 304);
		bt_9.setOpaque(true);
		bt_9.setBackground(Color.decode("#62929e"));
		bt_9.setFont(new Font ("Verdana", Font.BOLD, 26));
		bt_9.setBorder(border);
		panel4.add(bt_9);
		
		JButton bt_10 = new JButton("5");
		bt_10.setSize(80, 80);
		bt_10.setLocation(112, 304);
		bt_10.setOpaque(true);
		bt_10.setBackground(Color.decode("#62929e"));
		bt_10.setFont(new Font ("Verdana", Font.BOLD, 26));
		bt_10.setBorder(border);
		panel4.add(bt_10);
		
		JButton bt_11 = new JButton("6");
		bt_11.setSize(80, 80);
		bt_11.setLocation(208, 304);
		bt_11.setOpaque(true);
		bt_11.setBackground(Color.decode("#62929e"));
		bt_11.setFont(new Font ("Verdana", Font.BOLD, 26));
		bt_11.setBorder(border);
		panel4.add(bt_11);
		
		JButton bt_12 = new JButton("1");
		bt_12.setSize(80, 80);
		bt_12.setLocation(16, 400);
		bt_12.setOpaque(true);
		bt_12.setBackground(Color.decode("#62929e"));
		bt_12.setFont(new Font ("Verdana", Font.BOLD, 26));
		bt_12.setBorder(border);
		panel4.add(bt_12);
		
		JButton bt_13 = new JButton("2");
		bt_13.setSize(80, 80);
		bt_13.setLocation(112, 400);
		bt_13.setOpaque(true);
		bt_13.setBackground(Color.decode("#62929e"));
		bt_13.setFont(new Font ("Verdana", Font.BOLD, 26));
		bt_13.setBorder(border);
		panel4.add(bt_13);
		
		JButton bt_14 = new JButton("3");
		bt_14.setSize(80, 80);
		bt_14.setLocation(208, 400);
		bt_14.setOpaque(true);
		bt_14.setBackground(Color.decode("#62929e"));
		bt_14.setFont(new Font ("Verdana", Font.BOLD, 26));
		bt_14.setBorder(border);
		panel4.add(bt_14);
		
		JButton bt_15 = new JButton("=");
		bt_15.setSize(80, 176);
		bt_15.setLocation(304, 400);
		bt_15.setOpaque(true);
		bt_15.setBackground(Color.decode("#546a7b"));
		bt_15.setFont(new Font ("Verdana", Font.BOLD, 26));
		bt_15.setBorder(border);
		panel4.add(bt_15);
		
		JButton bt_16 = new JButton("0");
		bt_16.setSize(176, 80);
		bt_16.setLocation(16, 496);
		bt_16.setOpaque(true);
		bt_16.setBackground(Color.decode("#62929e"));
		bt_16.setFont(new Font ("Verdana", Font.BOLD, 26));
		bt_16.setBorder(border);
		panel4.add(bt_16);
		
		JButton bt_17 = new JButton(".");
		bt_17.setSize(80, 80);
		bt_17.setLocation(208, 496);
		bt_17.setOpaque(true);
		bt_17.setBackground(Color.decode("#62929e"));
		bt_17.setFont(new Font ("Verdana", Font.BOLD, 26));
		bt_17.setBorder(border);
		panel4.add(bt_17);
		
		return panel4;
	}
	
	@Override
	public void paint (Graphics g) {
		
		super.paint(g);
		
		Graphics2D g2d = (Graphics2D) g.create();
		
		g2d.setStroke(new BasicStroke(3));
		
		g2d.drawRect(50, 100, 100, 100);
		
		g2d.setColor(Color.decode("#15616d"));
		g2d.fillRect(85, 135, 120, 120);
		
		g2d.setFont(new Font ("Verdana", Font.BOLD, 30));
		g2d.drawString("Bienvenido", 300, 200);
		
		g2d.setColor(Color.decode("#78290f"));
		g2d.drawLine(0, 50, 500, 500);
		
		g2d.drawLine(60, 500, 500, 55);
		
		g2d.fillArc(100, 350, 100, 100, 0, 360);
		
		g2d.setColor(Color.decode("#ff7d00"));
		g2d.drawArc(100, 250, 80, 80, 45, 180);
		
		g2d.fillOval(150, 350, 100, 65);
		
		g2d.drawPolygon(new int[] {200, 250, 300}, new int[] {100, 80, 200}, 3);
		
		BufferedImage image;
		try {
			image = ImageIO.read(new File("owl.png"));
			g2d.drawImage(image, 300, 250, null);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
