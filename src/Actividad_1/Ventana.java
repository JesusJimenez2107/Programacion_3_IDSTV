package Actividad_1;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Ventana extends JFrame{

	public Ventana(){
		this.setVisible(true);
		this.setSize(1000,600);
		this.setLocationRelativeTo(null);
		
		this.setTitle("Login");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setMaximumSize(new Dimension(1000,1000));
		this.setMinimumSize(new Dimension(400,400));	
		
		//this.add(this.login());
		//this.add(this.registro());
		//this.add(this.Usuarios());
		this.repaint();
	}
}
