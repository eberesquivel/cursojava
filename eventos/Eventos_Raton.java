import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;

import javax.swing.JFrame;

/**
 * Eventos_Raton
 */
public class Eventos_Raton {

    public static void main(String[] args) {
        //Objeto fuente Marco
        MarcoRaton marcor = new MarcoRaton();
        marcor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoRaton extends JFrame{

    public MarcoRaton(){
        setVisible(true);
        setBounds(700, 300, 600, 450);
        //Evento que pone a la escucha al oyente
        addMouseListener(new EventosDeRaton());
        addMouseMotionListener(new EventosDeRaton2());
    }
}
    //Clase de Obejto oyente
class EventosDeRaton extends MouseAdapter {

    
    // public void mouseClicked(MouseEvent e) {
    //     //System.out.println("Coordenada x : "+ e.getX() + "Coordenada y: "+ e.getY());
    //     System.out.println(e.getClickCount());
    // }
    
    // public void mouseEntered(MouseEvent e) {
    //     System.out.println("acabas de entrar");
    // }
    
    // public void mouseExited(MouseEvent e) {
    //     System.out.println("acabas de salir");
    // }
    
         public void mousePressed(MouseEvent e) {
            
            if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK){
                System.out.println("has pulsado el boton izquierdo");
                
            }else if(e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK){
                System.out.println("has pulsado la rueda del raton");
            }else if(e.getModifiersEx()== MouseEvent.BUTTON3_DOWN_MASK){
                System.out.println("has presionado el boton derecho");
            }

            
            
            
        }
    // public void mouseReleased(MouseEvent e) {
    //     System.out.println("acabas de levantar");
    // }
            
}

class EventosDeRaton2 implements MouseMotionListener{


    
    public void mouseWheelMoved(MouseWheelEvent e) {
      // super.mouseWheelMoved(e);
       System.out.println("Estas moviendo la rueda del raton");
    }
   
    public void mouseMoved(MouseEvent e) {
       //super.mouseMoved(e);
       System.out.println("Estas moviendo el mouse");
    }
    
  
    public void mouseDragged(MouseEvent e) {
        System.out.println("Estas Arrastrando");
    }

}

