import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.Dimension;
import java.awt.Toolkit;

public class creando_MarcoCentrado {

    public static void main(String[] args) {
        MarcoCentrado mimarco = new MarcoCentrado();
        
    }
}

class MarcoCentrado extends JFrame {
    public  MarcoCentrado() {
        Toolkit mipantalla= Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla= mipantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;

        setSize(anchoPantalla/2,alturaPantalla/2);
        setLocation(anchoPantalla/4, alturaPantalla/4);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("Marco Centrado");
        Image miIcono = mipantalla.getImage("/Users/imac/Desktop/java/graficos/icono.ico");
        setIconImage(miIcono);
    }
}