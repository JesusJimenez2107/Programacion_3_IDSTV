package Actividad_1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
		this.setSize(1000,600);
		this.setLocationRelativeTo(null);
		
		this.setTitle("Login");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setMaximumSize(new Dimension(1000,1000));
		this.setMinimumSize(new Dimension(400,400));	
		
		this.add(this.login());
		//this.add(this.registro());
		//this.add(this.Usuarios());
		this.repaint();
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
	
}
