import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends JPanel implements KeyListener, ActionListener {

    private static final long serialVersionUID = 1L;

    private boolean start = true;


    //Tiempo en el que se repinta.
    private Timer timer;
    private int tiempo = 7;
    //Variables de control para los jugadores.
    private int j1X = Main.ANCHO - 25;
    private int j1Y = Main.ALTO / 2 - 75;
    private int j2X = 5;
    private int j2Y = Main.ALTO / 2 - 75;

    //Variables para el movimiento de la bola
    private int bolaX = 200;
    private int bolaY = 300;

    //Variables de la direccion de la bola.
    private int dirBolaX;
    private int dirBolaY;

    //Se crea el metodo constructor.
    public Game() {
        timer = new Timer(tiempo, this); // Se crea el objeto timer.
        timer.start();
        setFocusable(true);
        addKeyListener(this);


    }

    //Metodo que nos permite dibujar la pantalla.
    public void paint(Graphics g) {
        //Configuracion de fondo/
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, Main.ANCHO, Main.ALTO);

        //Codigo para implementar el Jugador 1.
        g.setColor(Color.WHITE);
        g.fillRect(j1X, j1Y, 15, 100);

        //Codigo para implementar el Jugador 2.
        g.setColor(Color.WHITE);
        g.fillRect(j2X, j2Y, 15, 100);

        //Codigo para el diseno de la bola.
        g.setColor(Color.white);
        g.fillOval(bolaX, bolaY, 20, 20);


    }

    //Metodo para que la bola se mueva
    public void moverBol (){
        if(start){

        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
