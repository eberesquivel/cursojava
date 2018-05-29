import javax.swing.*;

public class peso_Ideal {
    public static void main(String[] args) {
        String genero ="";

        // Este código se ejecutará infinitas veces siempre y cuando el dato introducido sea 
        //distinto de H y M, Se utiliza el metodo equalsIgnoreCase para no distinguir entre mayusculas y minusculas
        do{
            genero = JOptionPane.showInputDialog("Introduce tu genero (H/M)");

        }while(genero.equalsIgnoreCase("H")== false && genero.equalsIgnoreCase("M")==false);

        int altura = Integer.parseInt(JOptionPane.showInputDialog("Intruduce la altura en cm"));
        int pesoideal=0;

        if(genero.equalsIgnoreCase("H")){
            pesoideal= altura-110;
        }else if(genero.equalsIgnoreCase("M")){
            pesoideal=altura-120;
        }
        System.out.println("Tu peso ideal es "+pesoideal +" kg");
    }
}