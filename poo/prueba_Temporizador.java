import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;
public class prueba_Temporizador {
    public static void main(String[] args) {
        DameLaHora oyente = new DameLaHora();
        Timer mitemporizador = new Timer(5000,oyente);
        mitemporizador.start();
        JOptionPane.showMessageDialog(null, "pulsa aceptar para detener");
        System.exit(0);
    }
    
}


class DameLaHora implements ActionListener{

    public  void actionPerformed(ActionEvent e) {
        Date ahora = new Date();
        System.out.println("te pongo la hora cada 5 seg "+ ahora);
        Toolkit.getDefaultToolkit().beep();
    }
}
