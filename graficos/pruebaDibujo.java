import java.awt.*;
import javax.swing.*;




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
        g.drawArc(50, 100, 100, 200, 120, 150);
    }
}