package Actividad_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Memorama {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Memorama window = new Memorama();
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
	public Memorama() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 918, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder (Color.decode("#f07167"),10));
		panel_1.setBackground(Color.decode("#f07167"));
		panel.add(panel_1, BorderLayout.EAST);
		panel_1.setLayout(new GridLayout(3, 1, 10, 10));
		
		JLabel lblNewLabe2 = new JLabel("PUNTAJE:");
		lblNewLabe2.setIcon(new ImageIcon("back.png"));
		lblNewLabe2.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(lblNewLabe2);
		
		JLabel lblNewLabel_1 = new JLabel("MOVIMIENTOS:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton_16 = new JButton("Reiniciar");
		btnNewButton_16.setBackground(Color.decode("#fdfcdc"));
		panel_1.add(btnNewButton_16);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder (Color.decode("#00afb9"),10));
		panel_2.setBackground(Color.decode("#00afb9"));
		panel.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(4, 4, 10, 10));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(Color.decode("#fdfcdc"));
		btnNewButton.setIcon(new ImageIcon(Memorama.class.getResource("/Actividad_1/ball.png")));
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(Color.decode("#fdfcdc"));
		btnNewButton_1.setIcon(new ImageIcon(Memorama.class.getResource("/Actividad_1/ball.png")));
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBackground(Color.decode("#fdfcdc"));
		btnNewButton_2.setIcon(new ImageIcon(Memorama.class.getResource("/Actividad_1/ball.png")));
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBackground(Color.decode("#fdfcdc"));
		btnNewButton_3.setIcon(new ImageIcon(Memorama.class.getResource("/Actividad_1/ball.png")));
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setBackground(Color.decode("#fdfcdc"));
		btnNewButton_4.setIcon(new ImageIcon(Memorama.class.getResource("/Actividad_1/ball.png")));
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setBackground(Color.decode("#fdfcdc"));
		btnNewButton_5.setIcon(new ImageIcon(Memorama.class.getResource("/Actividad_1/ball.png")));
		panel_2.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setBackground(Color.decode("#fdfcdc"));
		btnNewButton_6.setIcon(new ImageIcon(Memorama.class.getResource("/Actividad_1/ball.png")));
		panel_2.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setBackground(Color.decode("#fdfcdc"));
		btnNewButton_7.setIcon(new ImageIcon(Memorama.class.getResource("/Actividad_1/ball.png")));
		panel_2.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setBackground(Color.decode("#fdfcdc"));
		btnNewButton_8.setIcon(new ImageIcon(Memorama.class.getResource("/Actividad_1/ball.png")));
		panel_2.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.setBackground(Color.decode("#fdfcdc"));
		btnNewButton_9.setIcon(new ImageIcon(Memorama.class.getResource("/Actividad_1/ball.png")));
		panel_2.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("");
		btnNewButton_10.setBackground(Color.decode("#fdfcdc"));
		btnNewButton_10.setIcon(new ImageIcon(Memorama.class.getResource("/Actividad_1/ball.png")));
		panel_2.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("");
		btnNewButton_11.setBackground(Color.decode("#fdfcdc"));
		btnNewButton_11.setIcon(new ImageIcon(Memorama.class.getResource("/Actividad_1/ball.png")));
		panel_2.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("");
		btnNewButton_12.setBackground(Color.decode("#fdfcdc"));
		btnNewButton_12.setIcon(new ImageIcon(Memorama.class.getResource("/Actividad_1/ball.png")));
		panel_2.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("");
		btnNewButton_13.setBackground(Color.decode("#fdfcdc"));
		btnNewButton_13.setIcon(new ImageIcon(Memorama.class.getResource("/Actividad_1/ball.png")));
		panel_2.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("");
		btnNewButton_14.setBackground(Color.decode("#fdfcdc"));
		btnNewButton_14.setIcon(new ImageIcon(Memorama.class.getResource("/Actividad_1/ball.png")));
		panel_2.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("");
		btnNewButton_15.setBackground(Color.decode("#fdfcdc"));
		btnNewButton_15.setIcon(new ImageIcon(Memorama.class.getResource("/Actividad_1/ball.png")));
		panel_2.add(btnNewButton_15);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.decode("#0081a7"));
		panel.add(panel_3, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Juego de Memorama");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_3.add(lblNewLabel);
	}

}
