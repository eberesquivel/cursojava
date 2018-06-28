import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

/**
 * EventosTeclado
 */
public class EventosTeclado {

    public static void main(String[] args) {
        MarcoConTeclas marco = new MarcoConTeclas();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}

class MarcoConTeclas extends JFrame{
    public MarcoConTeclas(){
        setVisible(true);
        setBounds(700, 300, 600, 450);
        EventosDeTeclado tecla = new EventosDeTeclado();
        addKeyListener(tecla);

    }

}

class EventosDeTeclado implements KeyListener{

    
    public void keyPressed(KeyEvent e) {
        // int codigo = e.getKeyCode();
        // System.out.println(codigo);
    }
    
    public void keyReleased(KeyEvent e) {
        
    }
    
    public void keyTyped(KeyEvent e) {
        char codigo = e.getKeyChar();
        System.out.println(codigo);
    }

}