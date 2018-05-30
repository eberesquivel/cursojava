//Uso de ciclo while

import javax.swing.*;
public class Acceso_aplicacion {
    public static void main(String[] args) {
        
        String clave = "Eber";
        String pass = "";

        // condicion que pregunta si las cadenas de texto no son iguales
        while(clave.equals(pass)== false){
            pass= JOptionPane.showInputDialog("Introduce la contraseña por favoR");

            if (clave.equals(pass)== false){

                System.out.println("Contraseña Incorrecta");
            }

        }
        System.out.println("COntraseña correcto. Accero permitido");
    }
}