package Actividad_1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

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
		
		JPanel mipanel = new JPanel();
		mipanel.setBackground(Color.decode("#F2EFE7"));
		mipanel.setOpaque(true); //se necesita para poder ver el color
		mipanel.setSize(500,500);
		mipanel.setLocation(0, 0);
		mipanel.setLayout(null);//permite poner los elementos donde quieras
		
		JLabel etiqueta1 = new JLabel("Bienvenido");
		etiqueta1.setSize(200, 30);
		etiqueta1.setLocation(150, 30);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setFont(new Font ("Verdana", Font.BOLD, 30));
		mipanel.add(etiqueta1);
		
		JLabel etiqueta2 = new JLabel("Ingrese su correo:");
		etiqueta2.setSize(200, 30);
		etiqueta2.setLocation(40, 130);
		etiqueta2.setFont(new Font ("Verdana", Font.BOLD, 16));
		mipanel.add(etiqueta2);
		
		JTextField email = new JTextField();
		email.setSize(300, 30);
		email.setLocation(38, 160);
		email.setOpaque(true);
		email.setBackground(Color.decode("#9ACBD0"));
		email.setFont(new Font ("Verdana", Font.BOLD, 16));
		mipanel.add(email);
		
		JLabel etiqueta3 = new JLabel("Contraseña:");
		etiqueta3.setSize(200, 30);
		etiqueta3.setLocation(40, 210);
		etiqueta3.setFont(new Font ("Verdana", Font.BOLD, 16));
		mipanel.add(etiqueta3);
		
		JPasswordField  contra = new JPasswordField ();
		contra.setSize(300, 30);
		contra.setLocation(38, 240);
		contra.setOpaque(true);
		contra.setBackground(Color.decode("#9ACBD0"));
		contra.setFont(new Font ("Verdana", Font.BOLD, 16));
		mipanel.add(contra);
		
		JCheckBox recuerdame = new JCheckBox("Recuerdame",false);
		recuerdame.setSize(120, 30);
		recuerdame.setLocation(36, 280);
		recuerdame.setFont(new Font ("Verdana", Font.BOLD, 12));
		mipanel.add(recuerdame);
		
		JLabel etiqueta4 = new JLabel("¿Olvidó su Contraseña?");
		etiqueta4.setSize(200, 30);
		etiqueta4.setLocation(180, 280);
		etiqueta4.setFont(new Font ("Verdana", Font.BOLD, 12));
		mipanel.add(etiqueta4);
		
		JButton  acceder = new JButton ("ACCEDER");
		acceder.setSize(200, 40);
		acceder.setLocation(80, 350);
		acceder.setOpaque(true);
		acceder.setBackground(Color.decode("#2973B2"));
		acceder.setHorizontalAlignment(JButton.CENTER);
		acceder.setFont(new Font ("Verdana", Font.BOLD, 20));
		mipanel.add(acceder);
		
		return mipanel;
	}
	
}
