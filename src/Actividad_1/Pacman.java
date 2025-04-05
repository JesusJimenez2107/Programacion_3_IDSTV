package Actividad_1;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pacman implements KeyListener {

	private JFrame frame;
	private DrawingPanel drawingPanel; 
	private int x=200,y=100;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pacman window = new Pacman();
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
	public Pacman() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#457b9d"));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.decode("#457b9d"));
		frame.getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		
		drawingPanel = new DrawingPanel();
		drawingPanel.setBorder(new LineBorder(Color.decode("#457b9d"), 10));
		drawingPanel.setBackground(Color.decode("#a8dadc"));
		frame.getContentPane().add(drawingPanel, BorderLayout.CENTER);
		
		drawingPanel.addKeyListener(this);
		drawingPanel.setFocusable(true);
			
		JButton reiniciar = new JButton("Reiniciar");
		reiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x=200;
				y=100;
				drawingPanel.repaint();
				drawingPanel.requestFocus();
			}
		});
		panel_1.add(reiniciar);
		
	}

	class DrawingPanel extends JPanel {
	    public DrawingPanel() {
	        setBackground(Color.WHITE);
	    }

	    @Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        Graphics2D g2d = (Graphics2D) g;
	        
	        g2d.setColor(Color.decode("#e63946"));
	        g2d.fillOval(x, y, 30, 30);
	        }
	    }

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode()==87) {
			y-=5;
			if(y<=-15) {
				y=500;
			}
		}
		if (e.getKeyCode()==83) {
			y+=5;
			if(y>=500) {
				y=-15;
			}
		}
		if (e.getKeyCode()==65) {
			x-=5;
			if(x<=-25) {
				x=470;
			}
		}
		if (e.getKeyCode()==68) {
			x+=5;
			if(x>=470) {
				x=-25;
			}
		}
		
		drawingPanel.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
