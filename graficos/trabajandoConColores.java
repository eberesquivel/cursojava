import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;


/**
 * trabajandoConColores
 */
public class trabajandoConColores {

    public static void main(String[] args) {
        MarcoColor marco1 = new MarcoColor();
        marco1.setVisible(true);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}


class MarcoColor extends JFrame{

    public MarcoColor(){
        setTitle("Prueba Dibujo");
        setBounds(400, 400, 400, 400);
        laminaConFiguras2 lamina = new laminaConFiguras2();
        add(lamina);
       // lamina.setBackground(new Color(23, 123, 54));
       lamina.setBackground(SystemColor.window);
    
    }
    
}

class laminaConFiguras2 extends JPanel{

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2= (Graphics2D)g; //Refundición de objeto g de tipo Graphics a Graphics 2D almacenado en objeto g2
        Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
        g2.setPaint(Color.WHITE);
        g2.draw(rectangulo);
        g2.setPaint(Color.RED);
        g2.fill(rectangulo);

        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        g2.setPaint(new Color(0,120,23).brighter().brighter());
        g2.fill(elipse);
;
        
    }
}
