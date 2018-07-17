
import java.awt.*;
import javax.swing.*;
import java.awt.Event.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class FocoEvento {
    public static void main(String[] args) {
        MarcoFoco miMarco = new MarcoFoco();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MarcoFoco extends JFrame {
    public MarcoFoco() {
        setVisible(true);
        setBounds(400, 300, 400, 200);
        add(new LaminaFoco());
    }
}
class LaminaFoco extends JPanel {
    public LaminaFoco() {
        setLayout(null);
        cuadro1 = new JTextField();
        cuadro2 = new JTextField();
        cuadro1.setVisible(true);
        cuadro2.setVisible(true);
        cuadro1.setBounds(120, 10, 150, 20);
        cuadro2.setBounds(120, 60, 150, 20);
        add(cuadro1);
        add(cuadro2);
        LanzaFocos elFoco = new LanzaFocos();
        cuadro1.addFocusListener(elFoco);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
 
    private JTextField cuadro1;
    private JTextField cuadro2;
    
    private class LanzaFocos implements FocusListener {
        public void focusGained(FocusEvent e) {

        }
        public void focusLost(FocusEvent e) {
             System.out.println("Perdiste el foco");
        }
    }
}