import javax.swing.*;

import java.awt.event.*;

/**
 * Eventos_Ventana
 */
public class Eventos_Ventana {

    public static void main(String[] args) {
        MarcoVentana mimarco = new MarcoVentana();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MarcoVentana mimarco2  =new MarcoVentana();
        mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mimarco.setTitle("Ventana 1");
        mimarco.setBounds(300, 300, 500, 350);
        mimarco2.setTitle("Ventana 2");
        mimarco2.setBounds(500, 500, 500, 350);
    }
}

class MarcoVentana extends JFrame{
    public MarcoVentana(){
        // setTitle("Respondiendo");
        // setBounds(300, 300, 500, 350);
        setVisible(true);
        //Instancia Clase oyente
        M_Ventana oyente_ventana = new M_Ventana();
        addWindowListener(oyente_ventana);
    }


}

class M_Ventana implements WindowListener{
	
    public void windowActivated(WindowEvent e){
        System.out.println("Ventana Activada");
    }
    public void windowClosed(WindowEvent e){
        System.out.println("Ventana Cerrada");
    }
    public void windowClosing(WindowEvent e){
        System.out.println("Ventana Cerrandoce");
    }
    public void windowDeactivated(WindowEvent e){
        System.out.println("Ventana Desactivada");
    }
    public void windowDeiconified(WindowEvent e){
        System.out.println("Ventana Restaurada");
    }
    public void windowIconified(WindowEvent e){
        System.out.println("Ventana Minimizada");
    }
    public void windowOpened(WindowEvent e){
        System.out.println("Ventana Abierta");
    }

}
