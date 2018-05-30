import javax.swing.*;

public class entrada_Numeros {
    public static void main(String[] args) {
        String num1 =JOptionPane.showInputDialog("Introduce un número");
        Double num2 = Double.parseDouble(num1);
        System.out.print("La raiz de " + num2 + " es de ");
        System.out.printf("%1.4f", Math.sqrt(num2));
    }
}