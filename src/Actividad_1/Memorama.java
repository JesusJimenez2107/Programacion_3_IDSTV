package Actividad_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.Timer;

public class Memorama {
    private int[] carta = new int[16]; // Arreglo para almacenar las cartas mezcladas
    private JButton[] botones = new JButton[16]; // Botones del memorama
    private int primeraCarta = -1, segundaCarta = -1;
    private boolean esperando = false;
    private Timer timer;
    private JFrame frame;
    private int paresEncontrados = 0;
    private int movimientos = 0;
    private int puntaje = 0;
    private JLabel lblPuntaje;
    private JLabel lblMovimientos;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Memorama window = new Memorama();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Memorama() {
        inicializarCartas();
        initialize();
    }

    private void inicializarCartas() {
        // Lista con números del 1 al 8 repetidos dos veces
        List<Integer> listaCartas = new ArrayList<>();
        for (int i = 1; i <= 8; i++) {
            listaCartas.add(i);
            listaCartas.add(i);
        }
        // Mezclamos la lista
        Collections.shuffle(listaCartas);
        for (int i = 0; i < 16; i++) {
            carta[i] = listaCartas.get(i);
        }
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 918, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout(0, 0));

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(new BorderLayout(0, 0));

        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new LineBorder(Color.decode("#f07167"), 10));
        panel_1.setBackground(Color.decode("#f07167"));
        panel.add(panel_1, BorderLayout.EAST);
        panel_1.setLayout(new GridLayout(3, 1, 10, 10));

        lblPuntaje = new JLabel("PUNTAJE: " + puntaje);
        lblPuntaje.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel_1.add(lblPuntaje);

        lblMovimientos = new JLabel("MOVIMIENTOS: " + movimientos);
        lblMovimientos.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel_1.add(lblMovimientos);

        JButton btnReiniciar = new JButton("Reiniciar");
        btnReiniciar.setBackground(Color.decode("#fdfcdc"));
        btnReiniciar.addActionListener(e -> reiniciarJuego());
        panel_1.add(btnReiniciar);

        JPanel panel_2 = new JPanel();
        panel_2.setBorder(new LineBorder(Color.decode("#00afb9"), 10));
        panel_2.setBackground(Color.decode("#00afb9"));
        panel.add(panel_2, BorderLayout.CENTER);
        panel_2.setLayout(new GridLayout(4, 4, 10, 10));

        for (int i = 0; i < 16; i++) {
            botones[i] = new JButton("");
            botones[i].setBackground(Color.decode("#fdfcdc"));
            botones[i].setIcon(new ImageIcon(Memorama.class.getResource("/Actividad_1/ball.png"))); // Imagen de carta oculta
            final int index = i;
            botones[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (!esperando) {
                        manejarClick(index);
                    }
                }
            });
            panel_2.add(botones[i]);
        }

        JPanel panel_3 = new JPanel();
        panel_3.setBackground(Color.decode("#0081a7"));
        panel.add(panel_3, BorderLayout.NORTH);

        JLabel lblTitulo = new JLabel("Juego de Memorama");
        lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel_3.add(lblTitulo);
    }

    private void manejarClick(int indice) {
        if (botones[indice].getIcon() != null && botones[indice].getIcon().toString().contains("ball.png")) {
            botones[indice].setIcon(new ImageIcon(getClass().getResource("/Actividad_1/" + carta[indice] + ".png")));

            if (primeraCarta == -1) {
                primeraCarta = indice;
            } else if (segundaCarta == -1) {
                segundaCarta = indice;
                verificarPareja();
            }
        }
    }

    private void verificarPareja() {
        esperando = true;

        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (primeraCarta != -1 && segundaCarta != -1) {
                    movimientos++;
                    lblMovimientos.setText("MOVIMIENTOS: " + movimientos);
                    if (carta[primeraCarta] == carta[segundaCarta]) { // Se encontró un par
                        paresEncontrados++;
                        puntaje += 100;
                        lblPuntaje.setText("PUNTAJE: " + puntaje);
                        if (paresEncontrados == 8) { // Si encontró todos los pares, mostrar mensaje
                            JOptionPane.showMessageDialog(frame, "¡Felicidades, ganaste!", "Juego terminado", JOptionPane.INFORMATION_MESSAGE);
                            timer.stop(); // Detener el temporizador al finalizar el juego
                        }
                    } else {
                        // Voltear las cartas si no son un par
                        botones[primeraCarta].setIcon(new ImageIcon(getClass().getResource("/Actividad_1/ball.png")));
                        botones[segundaCarta].setIcon(new ImageIcon(getClass().getResource("/Actividad_1/ball.png")));
                    }
                    primeraCarta = -1;
                    segundaCarta = -1;
                    esperando = false;
                }
            }
        });

        timer.setRepeats(false);
        timer.start();
    }

    private void reiniciarJuego() {
        inicializarCartas();
        for (int i = 0; i < 16; i++) {
            botones[i].setIcon(new ImageIcon(getClass().getResource("/Actividad_1/ball.png")));
        }
        primeraCarta = -1;
        segundaCarta = -1;
        esperando = false;
        
        movimientos = 0; // Reiniciar contador de movimientos
        puntaje = 0; // Reiniciar puntaje
        lblMovimientos.setText("MOVIMIENTOS: " + movimientos);
        lblPuntaje.setText("PUNTAJE: " + puntaje);
    }
}
