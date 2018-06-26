import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

/**
 * prueba_Temporizador2
 */
public class prueba_Temporizador2 {

    public static void main(String[] args) {
        Reloj mireloj = new Reloj ();
        mireloj.enMarcha(3000,true);
        JOptionPane.showMessageDialog(null, "pulsa aceptar para terminar");
        System.exit(0);
    }
}
//constructor
class Reloj{

    public Reloj(){

        // this.intervalo= intervalo;
        // this.sonido= sonido;
    }

    //metodos
    public void enMarcha(int intervalo, final boolean sonido) {
        //inner local class no lleva ningun modificador
        class DameLaHora2 implements ActionListener{
                 public void actionPerformed(ActionEvent evento) {
                     Date ahora = new Date();
                     System.out.println("te pongo la hora cada 3 seg "+ ahora);
                     if (sonido){
                         Toolkit.getDefaultToolkit().beep(); 
                     }
                 }
        
             }
        ActionListener oyente = new DameLaHora2();
        Timer mitemporizador = new Timer(intervalo, oyente);
        mitemporizador.start();
    }
    //variables
    // private int intervalo;
    // private boolean sonido;

    //inner class lleva siemrpre el midificador private
    // private class DameLaHora2 implements ActionListener{
    //     public void actionPerformed(ActionEvent evento) {
    //         Date ahora = new Date();
    //         System.out.println("te pongo la hora cada 3 seg "+ ahora);
    //         if (sonido){
    //             Toolkit.getDefaultToolkit().beep(); 
    //         }
    //     }

    // }
}