package Actividad_1;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Random;
import java.awt.Font;

public class Teclado implements KeyListener {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teclado window = new Teclado();
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
	public Teclado() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private JLabel lblPalabra;
	private HashMap<Character, JLabel> teclas = new HashMap<>();
	private JLabel ultimaTeclaPresionada = null;
	private long startTime;
	private int nAciertos = 0;
	JLabel aciertolbl = new JLabel("ACIERTOS: " + nAciertos , SwingConstants.CENTER);
	private JTextField entradaUsuario;
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 989, 619);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		entradaUsuario = new JTextField();
		entradaUsuario.setFont(new Font("Tahoma", Font.BOLD, 24));
		entradaUsuario.setHorizontalAlignment(JTextField.CENTER);
		entradaUsuario.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyPressed(KeyEvent e) {
		        char keyChar = Character.toUpperCase(e.getKeyChar());

		        if (teclas.containsKey(keyChar)) {
		            if (ultimaTeclaPresionada != null) {
		                ultimaTeclaPresionada.setBackground(Color.decode("#e5e5e5"));
		            }

		            JLabel tecla = teclas.get(keyChar);
		            tecla.setBackground(new Color((int) (Math.random() * 0x1000000)));
		            ultimaTeclaPresionada = tecla;
		        }
		    }

		    @Override
		    public void keyTyped(KeyEvent e) {
		        if (entradaUsuario.getText().isEmpty()) {
		            startTime = System.currentTimeMillis();
		        }
		    }

		    @Override
		    public void keyReleased(KeyEvent e) {
		        if (ultimaTeclaPresionada != null) {
		            // Esto espera 200ms antes de restaurar el color original
		            Timer timer = new Timer(200, evt -> ultimaTeclaPresionada.setBackground(Color.decode("#e5e5e5")));
		            timer.setRepeats(false);
		            timer.start();
		        }
		        
		        String textoIngresado = entradaUsuario.getText().toUpperCase();
		        String palabraObjetivo = lblPalabra.getText().toUpperCase();
		        
		        if (textoIngresado.equals(palabraObjetivo)) {
		            long tiempoFinal = System.currentTimeMillis();
		            long segundosTranscurridos = (tiempoFinal - startTime) / 1000;

		            JOptionPane.showMessageDialog(frame, "¡Correcto! Tiempo: " + segundosTranscurridos + " segundos.");

		            entradaUsuario.setText(""); // Limpiar el campo
		            seleccionarPalabraAleatoria(); // Nueva palabra
		            nAciertos ++; 
	            	aciertolbl.setText("ACIERTOS: " + nAciertos);
		            
		        }
		    }
		});
		
		panel.add(entradaUsuario);
		
		 lblPalabra = new JLabel("Presiona una tecla...");
		 lblPalabra.setFont(new Font("Tahoma", Font.BOLD, 24));
		 lblPalabra.setHorizontalAlignment(JLabel.CENTER);
		 panel.add(lblPalabra);
		 seleccionarPalabraAleatoria(); 
		 
		 aciertolbl.setFont(new Font("Tahoma", Font.BOLD, 20));
		 aciertolbl.setForeground(Color.BLUE);
		 panel.add(aciertolbl);
		 
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("ESPACIO");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(Color.decode("#e5e5e5"));
		lblNewLabel_1.setHorizontalAlignment(JLabel.CENTER);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("BORRANDO");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBackground(Color.decode("#e5e5e5"));
		lblNewLabel_2.setHorizontalAlignment(JLabel.CENTER);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.decode("#6c757d"));
		panel_2.setBorder(new LineBorder(Color.decode("#6c757d"), 10));
		frame.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(3, 10, 10, 10));
		
		JLabel lblNewLabel_3 = new JLabel("Q");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setBackground(Color.decode("#e5e5e5"));
		lblNewLabel_3.setHorizontalAlignment(JLabel.CENTER);
		teclas.put('Q', lblNewLabel_3);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("W");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setOpaque(true);
		lblNewLabel_4.setBackground(Color.decode("#e5e5e5"));
		lblNewLabel_4.setHorizontalAlignment(JLabel.CENTER);
		teclas.put('W', lblNewLabel_4);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("E");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_5.setOpaque(true);
		lblNewLabel_5.setBackground(Color.decode("#e5e5e5"));
		lblNewLabel_5.setHorizontalAlignment(JLabel.CENTER);
		teclas.put('E', lblNewLabel_5);
		panel_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("R");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_6.setOpaque(true);
		lblNewLabel_6.setBackground(Color.decode("#e5e5e5"));
		lblNewLabel_6.setHorizontalAlignment(JLabel.CENTER);
		teclas.put('R', lblNewLabel_6);
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("T");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_7.setOpaque(true);
		lblNewLabel_7.setBackground(Color.decode("#e5e5e5"));
		lblNewLabel_7.setHorizontalAlignment(JLabel.CENTER);
		teclas.put('T', lblNewLabel_7);
		panel_2.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Y");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_8.setOpaque(true);
		lblNewLabel_8.setBackground(Color.decode("#e5e5e5"));
		lblNewLabel_8.setHorizontalAlignment(JLabel.CENTER);
		teclas.put('Y', lblNewLabel_8);
		panel_2.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("U");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_9.setOpaque(true);
		lblNewLabel_9.setBackground(Color.decode("#e5e5e5"));
		lblNewLabel_9.setHorizontalAlignment(JLabel.CENTER);
		teclas.put('U', lblNewLabel_9);
		panel_2.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("I");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_10.setOpaque(true);
		lblNewLabel_10.setBackground(Color.decode("#e5e5e5"));
		lblNewLabel_10.setHorizontalAlignment(JLabel.CENTER);
		teclas.put('I', lblNewLabel_10);
		panel_2.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("O");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_11.setOpaque(true);
		lblNewLabel_11.setBackground(Color.decode("#e5e5e5"));
		lblNewLabel_11.setHorizontalAlignment(JLabel.CENTER);
		teclas.put('O', lblNewLabel_11);
		panel_2.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("P");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_12.setOpaque(true);
		lblNewLabel_12.setBackground(Color.decode("#e5e5e5"));
		lblNewLabel_12.setHorizontalAlignment(JLabel.CENTER);
		teclas.put('P', lblNewLabel_12);
		panel_2.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("A");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_13.setOpaque(true);
		lblNewLabel_13.setBackground(Color.decode("#e5e5e5"));
		lblNewLabel_13.setHorizontalAlignment(JLabel.CENTER);
		teclas.put('A', lblNewLabel_13);
		panel_2.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("S");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_14.setOpaque(true);
		lblNewLabel_14.setBackground(Color.decode("#e5e5e5"));
		lblNewLabel_14.setHorizontalAlignment(JLabel.CENTER);
		teclas.put('S', lblNewLabel_14);
		panel_2.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("D");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_15.setOpaque(true);
		lblNewLabel_15.setBackground(Color.decode("#e5e5e5"));
		lblNewLabel_15.setHorizontalAlignment(JLabel.CENTER);
		teclas.put('D', lblNewLabel_15);
		panel_2.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("F");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_16.setOpaque(true);
		lblNewLabel_16.setBackground(Color.decode("#e5e5e5"));
		lblNewLabel_16.setHorizontalAlignment(JLabel.CENTER);
		teclas.put('F', lblNewLabel_16);
		panel_2.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("G");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_17.setOpaque(true);
		lblNewLabel_17.setBackground(Color.decode("#e5e5e5"));
		lblNewLabel_17.setHorizontalAlignment(JLabel.CENTER);
		teclas.put('G', lblNewLabel_17);
		panel_2.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("H");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_18.setOpaque(true);
		lblNewLabel_18.setBackground(Color.decode("#e5e5e5"));
		lblNewLabel_18.setHorizontalAlignment(JLabel.CENTER);
		teclas.put('H', lblNewLabel_18);
		panel_2.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("J");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_19.setOpaque(true);
		lblNewLabel_19.setBackground(Color.decode("#e5e5e5"));
		lblNewLabel_19.setHorizontalAlignment(JLabel.CENTER);
		teclas.put('J', lblNewLabel_19);
		panel_2.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("K");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_20.setOpaque(true);
		lblNewLabel_20.setBackground(Color.decode("#e5e5e5"));
		lblNewLabel_20.setHorizontalAlignment(JLabel.CENTER);
		teclas.put('K', lblNewLabel_20);
		panel_2.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("L");
		lblNewLabel_21.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_21.setOpaque(true);
		lblNewLabel_21.setBackground(Color.decode("#e5e5e5"));
		lblNewLabel_21.setHorizontalAlignment(JLabel.CENTER);
		teclas.put('L', lblNewLabel_21);
		panel_2.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("Ñ");
		lblNewLabel_22.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_22.setOpaque(true);
		lblNewLabel_22.setBackground(Color.decode("#e5e5e5"));
		lblNewLabel_22.setHorizontalAlignment(JLabel.CENTER);
		teclas.put('Ñ', lblNewLabel_22);
		panel_2.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("");
		lblNewLabel_23.setOpaque(true);
		lblNewLabel_23.setBackground(Color.decode("#e5e5e5"));
		lblNewLabel_23.setHorizontalAlignment(JLabel.CENTER);
		panel_2.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("Z");
		lblNewLabel_24.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_24.setOpaque(true);
		lblNewLabel_24.setBackground(Color.decode("#e5e5e5"));
		lblNewLabel_24.setHorizontalAlignment(JLabel.CENTER);
		teclas.put('Z', lblNewLabel_24);
		panel_2.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("X");
		lblNewLabel_25.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_25.setOpaque(true);
		lblNewLabel_25.setBackground(Color.decode("#e5e5e5"));
		lblNewLabel_25.setHorizontalAlignment(JLabel.CENTER);
		teclas.put('X', lblNewLabel_25);
		panel_2.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("C");
		lblNewLabel_26.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_26.setOpaque(true);
		lblNewLabel_26.setBackground(Color.decode("#e5e5e5"));
		lblNewLabel_26.setHorizontalAlignment(JLabel.CENTER);
		teclas.put('C', lblNewLabel_26);
		panel_2.add(lblNewLabel_26);
		
		JLabel lblNewLabel_27 = new JLabel("V");
		lblNewLabel_27.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_27.setOpaque(true);
		lblNewLabel_27.setBackground(Color.decode("#e5e5e5"));
		lblNewLabel_27.setHorizontalAlignment(JLabel.CENTER);
		teclas.put('V', lblNewLabel_27);
		panel_2.add(lblNewLabel_27);
		
		JLabel lblNewLabel_28 = new JLabel("B");
		lblNewLabel_28.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_28.setOpaque(true);
		lblNewLabel_28.setBackground(Color.decode("#e5e5e5"));
		lblNewLabel_28.setHorizontalAlignment(JLabel.CENTER);
		teclas.put('B', lblNewLabel_28);
		panel_2.add(lblNewLabel_28);
		
		JLabel lblNewLabel_29 = new JLabel("N");
		lblNewLabel_29.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_29.setOpaque(true);
		lblNewLabel_29.setBackground(Color.decode("#e5e5e5"));
		lblNewLabel_29.setHorizontalAlignment(JLabel.CENTER);
		teclas.put('N', lblNewLabel_29);
		panel_2.add(lblNewLabel_29);
		
		JLabel lblNewLabel_30 = new JLabel("M");
		lblNewLabel_30.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_30.setOpaque(true);
		lblNewLabel_30.setBackground(Color.decode("#e5e5e5"));
		lblNewLabel_30.setHorizontalAlignment(JLabel.CENTER);
		teclas.put('M', lblNewLabel_30);
		panel_2.add(lblNewLabel_30);
		
		JLabel lblNewLabel_31 = new JLabel("");
		lblNewLabel_31.setOpaque(true);
		lblNewLabel_31.setBackground(Color.decode("#e5e5e5"));
		lblNewLabel_31.setHorizontalAlignment(JLabel.CENTER);
		panel_2.add(lblNewLabel_31);
		
		JLabel lblNewLabel_32 = new JLabel("");
		lblNewLabel_32.setOpaque(true);
		lblNewLabel_32.setBackground(Color.decode("#e5e5e5"));
		lblNewLabel_32.setHorizontalAlignment(JLabel.CENTER);
		panel_2.add(lblNewLabel_32);
		
		entradaUsuario.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				verificarPalabra();
		    
			}
		});

		    frame.setFocusable(true);
		    frame.requestFocusInWindow();
	}

	private String[] palabras = {
			"PIKACHU", "CHARMANDER", "BULBASAUR", "SQUIRTLE", "JIGGLYPUFF",
		    "MEWTWO", "MEW", "GENGAR", "EEVEE", "SNORLAX",
		    "LUCARIO", "GARCHOMP", "INFERNAPE", "GRENINJA", "ZOROARK",
		    "DRAGONITE", "RAICHU", "VAPOREON", "JOLTEON", "FLAREON",
		    "ESPEON", "UMBREON", "LEAFEON", "GLACEON", "SYLVEON",
		    "TYPHLOSION", "FERALIGATR", "MEGANIUM", "AMPHAROS", "HERACROSS",
		    "SCIZOR", "HOUNDOOM", "TYRANITAR", "SCEPTILE", "BLAZIKEN",
		    "SWAMPERT", "METAGROSS", "SALAMENCE", "TORTERRA", "INFERNAPE",
		    "EMPOLEON", "LUXRAY", "ROSERAEDE", "STARAPTOR", "GARCHOMP",
		    "LUCARIO", "DARKRAI", "SHAYMIN", "ARCEUS", "ZEKROM",
		    "RESHIRAM", "KYUREM", "GENESECT", "GOODRA", "DECIDUEYE",
		    "INCINEROAR", "PRIMARINA", "ZERAORA", "ZACIAN", "ZAMAZENTA",
		    "ETERNATUS", "URSHIFU", "CALYREX", "DIALGA", "PALKIA",
		    "GIRATINA", "REGIGIGAS", "HEATRAN", "CRESSELIA", "MANAPHY",
		    "JIRACHI", "CELEBI", "DEOXYS", "VICTINI", "MELOETTA",
		    "VOLCANION", "HOOPA", "DIANCIE", "KELDEO", "TERRAKION",
		    "VIRIZION", "COBALION", "LANDORUS", "THUNDURUS", "TORNADUS",
		    "XERNEAS", "YVELTAL", "ZYGARDE", "TAPU KOKO", "TAPU LELE",
		    "TAPU BULU", "TAPU FINI", "BUZZWOLE", "PHEROMOSA", "XURKITREE",
		    "CELESTEELA", "KARTANA", "GUZZLORD", "NECROZMA", "MARSHADOW"
	    };

	    private String palabraActual;

	    private String seleccionarPalabraAleatoria() {
	        Random rand = new Random();
	        palabraActual = palabras[rand.nextInt(palabras.length)];
	        lblPalabra.setText(palabraActual);
			return palabraActual;
	    }
	    
	    private void verificarPalabra() {
	        String palabraIngresada = entradaUsuario.getText().toUpperCase();
	        String palabraCorrecta = lblPalabra.getText().toUpperCase();

	        if (palabraIngresada.equals(palabraActual)) {
	            int opcion = JOptionPane.showConfirmDialog(
	                frame,
	                "¡Correcto! ¿Querés otra palabra?",
	                "Palabra correcta",
	                JOptionPane.YES_NO_OPTION
	            );

	            if (opcion == JOptionPane.YES_OPTION) {
	            	nAciertos ++; 
	            	aciertolbl.setText("ACIERTOS: " + nAciertos);
	                palabraActual = seleccionarPalabraAleatoria();
	                lblPalabra.setText(palabraActual);
	                entradaUsuario.setText(""); // Limpiar el campo para la nueva palabra
	            } else {
	                JOptionPane.showMessageDialog(frame, "¡Gracias por jugar!");
	                frame.dispose(); // Cierra la ventana del juego
	            }
	        }
	    }

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

	

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
}
