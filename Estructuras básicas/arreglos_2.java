import javax.swing.JOptionPane;

/*public class arreglos_2{
    public static void main(String[] args) {
        String [] paises =new String[8];

        for(int i=0; i<8; i++){
            paises[i]=JOptionPane.showInputDialog("Introduce un pais"+(i+1));

        }

        // Ejemplo for normal
        // for(int i=0; i<paises.length;i++){
            // System.out.println("Pais: "+(i+1)+ " " +paises[i]);
        // }

        // Ejemplo for each
        for(String elemento:paises){
            System.out.println("Pais: "+elemento);
        }
    }
}*/

public class arreglos_2{
    public static void main(String[] args) {

        int[] matriz_aleatorios = new int[150];

        for(int i=0; i<matriz_aleatorios.length;i++){
            matriz_aleatorios[i]= (int)Math.round(Math.random()*100);
         }

         for(int numeros:matriz_aleatorios){
             System.out.println(numeros+ " ");
         }
    }
}