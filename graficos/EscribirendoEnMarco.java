import javax.swing.*;
import java.awt.*;

public class EscribirendoEnMarco {

    public static void main(String[] args) {
        MarcoConTexto mimarco1 = new MarcoConTexto();
        mimarco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoConTexto extends JFrame {

    public MarcoConTexto(){
        setVisible(true);
        setBounds(400, 200, 600, 450);
        setTitle("Primer Texto ");
        Lamina milamina = new Lamina();
        add(milamina);
    }

    
}

class Lamina extends JPanel{

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Estamos aprendiendo Swing", 100, 100);
    }

}