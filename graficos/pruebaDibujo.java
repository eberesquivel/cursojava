import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;





public class pruebaDibujo {

    public static void main(String[] args) {
        MarcoConDibujo marco1 = new MarcoConDibujo();
        marco1.setVisible(true);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}

class MarcoConDibujo extends JFrame{

    public MarcoConDibujo(){
        setTitle("Prueba Dibujo");
        setBounds(400, 400, 400, 400);
        laminaConFiguras lamina = new laminaConFiguras();
        add(lamina);
    }
    
}

class laminaConFiguras extends JPanel{

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // g.drawRect(50, 50, 200, 200);
        //g.drawLine(100, 100, 300, 300);
        //g.drawArc(50, 100, 100, 200, 120, 150);
        Graphics2D g2= (Graphics2D)g; //Refundición de objeto g de tipo Graphics a Graphics 2D almacenado en objeto g2
        Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
        g2.draw(rectangulo);

        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        g2.draw(elipse);

        g2.draw(new Line2D.Double(100, 100, 300,250));

        double CentroenX = rectangulo.getCenterX();
        double CentroenY = rectangulo.getCenterY();
        double radio= 150;
        Ellipse2D circulo= new Ellipse2D.Double();
        circulo.setFrameFromCenter(CentroenX, CentroenY,CentroenX+radio, CentroenY+radio);
        g2.draw(circulo);
        
    }
}