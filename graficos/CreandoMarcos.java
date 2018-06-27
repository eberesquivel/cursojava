import java.awt.Frame;

import javax.swing.*;
import javax.swing.plaf.basic.BasicTreeUI.SelectionModelPropertyChangeHandler;

public class CreandoMarcos {

    public static void main(String[] args) {
        miMarco marco1 = new miMarco();
        
    }
}

/**
 * InnerCreandoMarcos
 */
class miMarco extends JFrame {
    public  miMarco() {
        // setSize(500,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // setLocation(500, 300);
        setBounds(500, 300, 250, 250);
        setResizable(false);
        // setExtendedState(Frame.MAXIMIZED_BOTH);
        setTitle("Ventana1");
    }

}