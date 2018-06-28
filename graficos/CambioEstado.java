import javax.swing.*;

//import com.sun.glass.ui.Window;

import java.awt.Frame;
import java.awt.event.*;


public class CambioEstado {

    public static void main(String[] args) {
        MarcoEstado marco = new MarcoEstado();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}

class MarcoEstado extends JFrame{
    public MarcoEstado () {
        setVisible(true);
        setBounds(300, 300, 500, 350);
        CambiaEstado nuevo_estado = new CambiaEstado();
        addWindowStateListener(nuevo_estado);
    }
}

class CambiaEstado implements WindowStateListener{

    public void windowStateChanged(WindowEvent e) {
        System.out.println("La ventana ha cambiado de Estado");
        if(e.getNewState()== Frame.MAXIMIZED_BOTH){
            System.out.println("La ventana ha sido maximizada");
        }else if(e.getNewState()== Frame.NORMAL){
            System.out.println("la ventana está normal");
        }else if(e.getNewState()== Frame.ICONIFIED){
            System.out.println("la ventana ha sido minimizada");
        }
        
    }
}