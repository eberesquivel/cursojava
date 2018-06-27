import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

/**
 * trabajandoConFuentes
 */
public class trabajandoConFuentes {

    public static void main(String[] args) { 
        MarcoConFuentes marco = new MarcoConFuentes();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}

class MarcoConFuentes extends JFrame{

    public MarcoConFuentes(){
        setTitle("Prueba con Fuentes");
        setBounds(400, 400, 400, 400);
        LaminaConFuentes lamina = new LaminaConFuentes();
        add(lamina);
        lamina.setForeground(Color.DARK_GRAY);

    }
}

class LaminaConFuentes extends JPanel{

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2= (Graphics2D)g;
        Font mifuente = new Font("Zapfino",Font.BOLD,26);
        g2.setFont(mifuente);
        g2.drawString("Gregorio", 100, 100);
        // g2.setColor(Color.MAGENTA);
        g2.drawString("Curso de Java",100,200);
        
    
    }

}