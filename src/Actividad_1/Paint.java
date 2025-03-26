package Actividad_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Paint {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paint window = new Paint();
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
	public Paint() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1014, 626);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.WEST);
		//panel.setSize(200,600);		
		panel.setBorder(new LineBorder(Color.decode("#00afb9"), 10));
		panel.setBackground(Color.decode("#00afb9"));
		panel.setLayout(new GridLayout(4, 1, 10, 10));
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(3, 1, 3, 3));
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setSize(400,40);	
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		panel_2.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		panel_2.add(lblNewLabel);
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		
		
	}

}
