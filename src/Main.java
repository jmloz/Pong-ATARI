import javax.swing.*;

public class Main {
    final static int ANCHO = 1000;
    final static int ALTO = 500;

    public Main() {
        JFrame ventana = new JFrame();
        ventana.setSize(ANCHO, ALTO);
        ventana.setBounds(0, 0, ANCHO, ALTO);
        ventana.setVisible(true);
        ventana.setResizable(false);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Pong - ATARI");

        Game gameP = new Game();
        ventana.add(gameP);


    }

    public static void main(String[] args) {
        new Main();
    }
}
