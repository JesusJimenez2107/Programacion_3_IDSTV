package Actividad_1;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.LineBorder;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class Pacman implements KeyListener {

	private JFrame frame;
	private DrawingPanel drawingPanel; 
	private Player pacman;
	private List<Player> paredes = new ArrayList<>();
	Timer timer;
	private int lastPress = 0;
	private Timer chronoTimer;
	private int secondsElapsed = 0;
	private JLabel lblNewLabel;
	private boolean hasStarted = false;

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
		
		pacman = new Player(200,200,30,30,Color.decode("#e63946"));
		
		paredes.add(new Player (120,300,200,30,Color.decode("#1d3557")));
		paredes.add(new Player (120,150,200,30,Color.decode("#1d3557")));
		paredes.add(new Player (380,150,30,200,Color.decode("#1d3557")));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#457b9d"));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		lblNewLabel = new JLabel("0:00");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 22));
		panel.add(lblNewLabel);
		
		chronoTimer = new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondsElapsed++;
				int minutes = secondsElapsed / 60;
				int seconds = secondsElapsed % 60;
				lblNewLabel.setText(String.format("%d:%02d", minutes, seconds));
			}
		});
		
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
				pacman.x=200;
				pacman.y=200;
				lastPress=0;
				secondsElapsed = 0;
				lblNewLabel.setText("0:00");
				chronoTimer.stop();
				hasStarted = false;
				drawingPanel.repaint();
				drawingPanel.requestFocus();
			}
		});
		panel_1.add(reiniciar);
		
		ActionListener taskPerformer = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				update();
				
			}
		};
		
		timer = new Timer (2,taskPerformer); 
		
	}

	class DrawingPanel extends JPanel {
	    public DrawingPanel() {
	        setBackground(Color.WHITE);
	    }

	    @Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        Graphics2D g2d = (Graphics2D) g;
	        
	        g2d.setColor(pacman.c);
	        g2d.fillOval(pacman.x, pacman.y, pacman.w, pacman.h);
	        
	        for (Player pared : paredes) {
	        	g2d.setColor(pared.c);
	        	g2d.fillRect(pared.x, pared.y, pared.w, pared.h);
	        }
	        }
	    }

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		lastPress=e.getKeyCode();
		if (!hasStarted) {
			hasStarted = true;
			secondsElapsed = 0;
			chronoTimer.start();
		}
		timer.start();
		
		update();
		
		
	}
		public void update () {
			Boolean colision = false;
			
			for(Player pared : paredes){
				if (pacman.colision(pared)) {
					colision=true;
				}
			}
			
			if (lastPress==87) {
				if(!colision) 
					pacman.y-=1;
				else {
					pacman.y+=2;
					lastPress=0;
				}
		
				if(pacman.y<=-15) {
					pacman.y=500;
				}
			}
			if (lastPress==83) {
				if(!colision) 
				pacman.y+=1;
				else {
					pacman.y-=2;
					lastPress=0;
				}
				
				if(pacman.y>=500) {
					pacman.y=-15;
				}
			}
			if (lastPress==65) {
				if(!colision) 
				pacman.x-=1;
				else {
					pacman.x+=2;
					lastPress=0;
				}
				if(pacman.x<=-25) {
					pacman.x=470;
				}
			}
			if (lastPress==68) {
				if(!colision) 
				pacman.x+=1;
				else {
					pacman.x-=2;
					lastPress=0;
				}
				if(pacman.x>=470) {
					pacman.x=-25;
				}
			}
			drawingPanel.repaint();
		}
	
		class Player {
			int x,y,w,h;
			Color c;
			
			public Player (int x, int y, int w, int h, Color c) {
				
				this.x=x;
				this.y=y;
				this.w=w;
				this.h=h;
				this.c=c;
			}
			public Boolean colision (Player target) {
				if(this.x < target.x + target.w &&
						this.x + this.w > target.x &&
						this.y < target.y + target.h &&
						this.y + this.h > target.y) {
					return true;
				}
				return false;
			}
		}
	
	


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
