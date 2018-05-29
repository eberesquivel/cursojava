import java.util.*;

public class adivina_Numero {
    public static void main(String[] args) {

        //Se utiliza una refundición ya que el metodo random devuelve un numero double y se combierte en entero para generar
        //un número aleatorio entre '0 ' y '100'
        int aleatorio = (int)(Math.random()*100);
        //System.out.println(aleatorio);

        Scanner entrada = new Scanner(System.in);

        int numero=0;
        int intentos=0;

        while(numero!=aleatorio){
            intentos++;
            System.out.println("Introduce un número por favor");
            numero= entrada.nextInt();
            if (aleatorio<numero){
                System.out.println("Intoruduce un número mas bajo");
        
            }else if (aleatorio>numero){
                System.out.println("Introduce un número mas alto");
            }
        }   
        System.out.println("Correcto lo has conseguido en: " +intentos+ " intentos");
    }
}