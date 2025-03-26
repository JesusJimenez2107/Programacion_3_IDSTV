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
import java.awt.Font;
import java.awt.GridBagLayout;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class Paint {

	private JFrame frame;
	private JTextField textField;

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
		frame = new JFrame("Paint");
		frame.setBounds(100, 100, 1014, 626);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.WEST);
		//panel.setSize(200,600);		
		panel.setBorder(new LineBorder(Color.decode("#4a5759"), 10));
		panel.setBackground(Color.decode("#4a5759"));
		panel.setLayout(new GridLayout(4, 1, 10, 10));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.decode("#dedbd2"), 10));
		panel_2.setBackground(Color.decode("#dedbd2"));
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(4, 1, 3, 3));
		
		JLabel lblNewLabel = new JLabel("Opciones  ");
		lblNewLabel.setFont(new Font("Myanmar Text", Font.BOLD | Font.ITALIC, 17));
		panel_2.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Pincel");
		btnNewButton.setOpaque(true); 
		btnNewButton.setContentAreaFilled(true);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(Color.decode("#b0c4b1"));
		btnNewButton.setFont(new Font("Myanmar Text", Font.PLAIN, 17));
		//btnNewButton.setSize(400,40);	
		panel_2.add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("Borrador");
		btnNewButton_1.setOpaque(true); 
		btnNewButton_1.setContentAreaFilled(true);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(Color.decode("#b0c4b1"));
		btnNewButton_1.setFont(new Font("Myanmar Text", Font.PLAIN, 17));
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Limpiar todo");
		btnNewButton_2.setOpaque(true); 
		btnNewButton_2.setContentAreaFilled(true);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBackground(Color.decode("#b0c4b1"));
		btnNewButton_2.setFont(new Font("Myanmar Text", Font.PLAIN, 17));
		panel_2.add(btnNewButton_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(Color.decode("#dedbd2"), 10));
		panel_4.setBackground(Color.decode("#dedbd2"));
		panel.add(panel_4);
		panel_4.setLayout(new GridLayout(5, 1, 3, 3));
		
		JLabel lblNewLabel_1 = new JLabel("Formas geométricas");
		lblNewLabel_1.setFont(new Font("Myanmar Text", Font.BOLD | Font.ITALIC, 17));
		panel_4.add(lblNewLabel_1);
		
		JButton btnNewButton_3 = new JButton("Rectángulo");
		btnNewButton_3.setOpaque(true); 
		btnNewButton_3.setContentAreaFilled(true);
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setBackground(Color.decode("#b0c4b1"));
		btnNewButton_3.setFont(new Font("Myanmar Text", Font.PLAIN, 17));
		panel_4.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Círculo");
		btnNewButton_4.setOpaque(true); 
		btnNewButton_4.setContentAreaFilled(true);
		btnNewButton_4.setBorderPainted(false);
		btnNewButton_4.setBackground(Color.decode("#b0c4b1"));
		btnNewButton_4.setFont(new Font("Myanmar Text", Font.PLAIN, 17));
		panel_4.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Triángulo");
		btnNewButton_5.setOpaque(true); 
		btnNewButton_5.setContentAreaFilled(true);
		btnNewButton_5.setBorderPainted(false);
		btnNewButton_5.setBackground(Color.decode("#b0c4b1"));
		btnNewButton_5.setFont(new Font("Myanmar Text", Font.PLAIN, 17));
		panel_4.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Línea");
		btnNewButton_6.setOpaque(true); 
		btnNewButton_6.setContentAreaFilled(true);
		btnNewButton_6.setBorderPainted(false);
		btnNewButton_6.setBackground(Color.decode("#b0c4b1"));
		btnNewButton_6.setFont(new Font("Myanmar Text", Font.PLAIN, 17));
		panel_4.add(btnNewButton_6);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.decode("#dedbd2"), 10));
		panel_3.setBackground(Color.decode("#dedbd2"));
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(4, 1, 10, 10));
		
		JLabel lblNewLabel_2 = new JLabel("Colores");
		lblNewLabel_2.setFont(new Font("Myanmar Text", Font.BOLD | Font.ITALIC, 17));
		panel_3.add(lblNewLabel_2);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.decode("#dedbd2"));
		panel_3.add(panel_6);
		panel_6.setLayout(new GridLayout(1, 3, 10, 10));
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setOpaque(true); 
		btnNewButton_7.setContentAreaFilled(true);
		btnNewButton_7.setBorderPainted(false);
		btnNewButton_7.setBackground(Color.black);
		panel_6.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setOpaque(true); 
		btnNewButton_8.setContentAreaFilled(true);
		btnNewButton_8.setBorderPainted(false);
		btnNewButton_8.setBackground(Color.LIGHT_GRAY);
		panel_6.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.setOpaque(true); 
		btnNewButton_9.setContentAreaFilled(true);
		btnNewButton_9.setBorderPainted(false);
		btnNewButton_9.setBackground(Color.WHITE);
		panel_6.add(btnNewButton_9);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.decode("#dedbd2"));
		panel_3.add(panel_7);
		panel_7.setLayout(new GridLayout(1, 3, 10, 10));
		
		JButton btnNewButton_10 = new JButton("");
		btnNewButton_10.setOpaque(true); 
		btnNewButton_10.setContentAreaFilled(true);
		btnNewButton_10.setBorderPainted(false);
		btnNewButton_10.setBackground(Color.BLUE);
		panel_7.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("");
		btnNewButton_11.setOpaque(true); 
		btnNewButton_11.setContentAreaFilled(true);
		btnNewButton_11.setBorderPainted(false);
		btnNewButton_11.setBackground(Color.CYAN);
		panel_7.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("");
		btnNewButton_12.setOpaque(true); 
		btnNewButton_12.setContentAreaFilled(true);
		btnNewButton_12.setBorderPainted(false);
		btnNewButton_12.setBackground(Color.GREEN);
		panel_7.add(btnNewButton_12);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.decode("#dedbd2"));
		panel_3.add(panel_8);
		panel_8.setLayout(new GridLayout(1, 3, 10, 10));
		
		JButton btnNewButton_13 = new JButton("");
		btnNewButton_13.setOpaque(true); 
		btnNewButton_13.setContentAreaFilled(true);
		btnNewButton_13.setBorderPainted(false);
		btnNewButton_13.setBackground(Color.ORANGE);
		panel_8.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("");
		btnNewButton_14.setOpaque(true); 
		btnNewButton_14.setContentAreaFilled(true);
		btnNewButton_14.setBorderPainted(false);
		btnNewButton_14.setBackground(Color.PINK);
		panel_8.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("");
		btnNewButton_15.setOpaque(true); 
		btnNewButton_15.setContentAreaFilled(true);
		btnNewButton_15.setBorderPainted(false);
		btnNewButton_15.setBackground(Color.RED);
		panel_8.add(btnNewButton_15);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(Color.decode("#dedbd2"), 10));
		panel_5.setBackground(Color.decode("#dedbd2"));
		panel_5.setLayout(new GridLayout(4, 1, 3, 3));
		panel.add(panel_5);
		
		JLabel lblNewLabel_3 = new JLabel("Grosor");
		lblNewLabel_3.setFont(new Font("Myanmar Text", Font.BOLD | Font.ITALIC, 17));
		panel_5.add(lblNewLabel_3);
		
		JSlider slider = new JSlider();
		slider.setBackground(Color.decode("#b0c4b1"));
		panel_5.add(slider);
		
		JLabel lblNewLabel_4 = new JLabel("Color de fondo");
		lblNewLabel_4.setFont(new Font("Myanmar Text", Font.BOLD | Font.ITALIC, 17));
		panel_5.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setFont(new Font("Myanmar Text", Font.BOLD | Font.ITALIC, 17));
		textField.setForeground(Color.decode("#6c757d"));
		textField.setText("#000000");
		textField.setBackground(Color.decode("#b0c4b1"));
		panel_5.add(textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.decode("#4a5759"), 10));
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0};
		gbl_panel_1.rowHeights = new int[]{0};
		gbl_panel_1.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		
	}

}
