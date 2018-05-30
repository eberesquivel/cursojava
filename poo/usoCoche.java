import javax.swing.JOptionPane;

public class usoCoche extends Coche{
    public static void main(String[] args){
        Coche tiida = new Coche(); // Instancia de clase o ejemplar de clase coche
        System.out.println(tiida.getDatosGenerales());
        tiida.setColor(JOptionPane.showInputDialog("Introduce un Color"));
       
        System.out.println(tiida.getColor());
        tiida.configura_asientos(JOptionPane.showInputDialog("Cuenta con asientos de cuero"));
        System.out.println(tiida.getAsientos());
        tiida.configura_aire(JOptionPane.showInputDialog("Cuenta con Aire Acondicionado"));
        System.out.println(tiida.getAire());
        System.out.println(tiida.get_PesoCoche());
        System.out.println("El precio final del coche es: "+ tiida.precio_coche());
    }
}