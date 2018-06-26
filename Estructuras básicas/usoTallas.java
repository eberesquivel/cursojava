import java.util.*;
public class usoTallas {

    //enum Talla {MINI,MEDIANO,GRANDE,MUY_GRANDE};

    enum Talla{

        MINI("S"),MEDIANO("M"),GRANDE("L"), MUY_GRANDE("XL");
        private  Talla(String abreviatura) {
            this.abreviatura=abreviatura;
        }
        public String dameAbreviatura(){
            return abreviatura;
        }
        private String abreviatura;
    }
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Esciber una talla: MINI, MEDIANO, GRANDE, MUY_GRANDE");
        String entrada_datos = entrada.next().toUpperCase();
        Talla la_talla= Enum.valueOf(Talla.class, entrada_datos);// Se utiliza el metodo .valueOf de la clase enum
        // que devuelve el nombre de la constante enumerada a la que pertenece el texto introducido, almacenada en la variable
        //entrada_datos

        System.out.println("Talla =  " + la_talla);
        System.out.println("Abreviatura = "+ la_talla.dameAbreviatura());
    }
}