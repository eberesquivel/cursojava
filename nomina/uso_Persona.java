import java.util.*;

public class uso_Persona {
    public static void main(String[] args) {

        Persona[] lasPersonas = new Persona [2];
        lasPersonas[0] = new Empleado2("eber", 2000, 2018, 4, 27);
        lasPersonas[1] = new Alumno("raziel", "Sistemas");

        for (Persona p: lasPersonas){
            System.out.println(p.dameNombre()+" , "+p.dameDescripcion());
        }
    }
    
}

abstract class Persona{
    public Persona (String nom) {
        this.nombre=nom;
    }
    public String dameNombre(){

        return nombre;
    }
    public abstract String dameDescripcion();
        
   

    private String nombre;
}

class Empleado2 extends Persona{

    //SObrecarga de constructor: Varios constructores dentro de una misma clase
    //metodo constructor
     public Empleado2(String nom,double sue, int agno,int mes, int dia){
        super(nom);
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno,mes-1,dia);//Construye una fecha mediante un objeto tipo Gregorian Calendar
        altaContrato= calendario.getTime();//se almacena una fecha
        // ++IdSiguiente;
        // Id=IdSiguiente;

     }

     public  String dameDescripcion(){
         return "Este empleado tiene un sueldode = " + sueldo;
     }

     //getter sueldo

     public double getSueldo(){

        return this.sueldo;

     }

    // getter fecha

    public Date getFechaContrato(){
        return this.altaContrato;
    }

    //Setter®

    public void subeSueldo(double porcentaje) {
        double aumento=sueldo*porcentaje/100;
        sueldo+=aumento;
    }

     //variables encapsuladas a modificar por metodos getter y setter
    
     private double sueldo;
     private Date altaContrato;
}

class Alumno extends Persona{

   public Alumno (String nom, String car) {
       super(nom);
       this.carrera = car;
       
   }

   public  String dameDescripcion(){
    return "Este alumno esta estudiando la carrera de : " + carrera;
}

   private String carrera;
}