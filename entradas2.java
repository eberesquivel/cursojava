import javax.swing.*;

public class entradas2 {
    public static void main(String[] args) {
        String nombre_usuario = JOptionPane.showInputDialog("Introuce tu nombre por favor", "Nombre");
        String edad =JOptionPane.showInputDialog("Introuce tu edad por favor", "Edad");
        int edad_usuario=Integer.parseInt(edad);
        edad_usuario++;
        System.out.println("Hola "+ nombre_usuario+ " el próximo año tendrás "+ (edad_usuario) +" años");
    }
}