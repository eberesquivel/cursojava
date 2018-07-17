import java.util.*;

public class paliyo {
    public static void main(String[] args) {
        String cadenaEntrada;
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingresa una palabra: ");
        cadenaEntrada = entrada.nextLine();
        int longitud = cadenaEntrada.length();
        int i, inicio, termino, enmedio;
        inicio=0;
        termino = longitud-1;
        enmedio = (inicio + termino)/2;
        for (i = inicio; i <= enmedio; i++){
            if (cadenaEntrada.charAt(inicio)== cadenaEntrada.charAt(termino)){
                inicio++;
                termino--;
            }else{
                break;
            }
        }
        if (i== enmedio + 1){
            System.out.println("Es un Palindromo ");
        }else{
            System.out.println("No es un palindromo");
        }
    }
}