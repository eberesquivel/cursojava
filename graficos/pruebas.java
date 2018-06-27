import java.awt.GraphicsEnvironment;
import javax.swing.*;
/**
 * pruebas
 */
public class pruebas {

    public static void main(String[] args) {
        String fuente = JOptionPane.showInputDialog("Introduce Fuente");
        boolean estalafuente= false;
        

        String [] nombresDeFuentes=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for(String nombredelafuente: nombresDeFuentes){
           if(nombredelafuente.equals(fuente)){
               estalafuente=true;
           }
        }
        if(estalafuente){
            System.out.println("Fuente instalada");
        }else{
            System.out.println("no Esta instalada");
        }
    }
}