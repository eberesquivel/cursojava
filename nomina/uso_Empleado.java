import java.util.*;

public class uso_Empleado {
    public static void main(String[] args) {
//lo mismo de abajo pero con más código 
/*
        Empleado empleado1 = new Empleado("Gregorio Eber",85000,1990,12,17);
        Empleado empleado2 = new Empleado("Teresa Saldaña",95000,1995,06,02);
        Empleado empleado3 = new Empleado("María Chavira",103000,2002,03,12);

        empleado1.subeSueldo(5);
        empleado2.subeSueldo(5);
        empleado3.subeSueldo(5);

        System.out.println("Nombre: "+empleado1.getNombre()+"Sueldo: "+empleado1.getSueldo()+ "Fecha alta: "+ empleado1.getFechaContrato());
        System.out.println("Nombre: "+empleado2.getNombre()+"Sueldo: "+empleado2.getSueldo()+ "Fecha alta: "+ empleado2.getFechaContrato());
        System.out.println("Nombre: "+empleado3.getNombre()+"Sueldo: "+empleado3.getSueldo()+ "Fecha alta: "+ empleado3.getFechaContrato());
*/
//Instanciando objetos Empleados alamacenados en un ARRAY
        Empleado mis_empleados [] = new Empleado[3];
        mis_empleados[0] = new Empleado("Gregie Greg", 85000,1990,12,17);
        mis_empleados[1] = new Empleado("Teresa Saldaña ",95000,1995,06,02);
        mis_empleados[2] = new Empleado("María Chavira ",103000,2002,03,12);
/* //Subir sueldos a empleados mediante un for tradicional
        for(i=0;i<3;i++){
            mis_empleados[i].subeSueldo(5);
        }

        for(i=0;i<3;i++){
            System.out.println("Nombre: "+ mis_empleados[i].getNombre()+ 
            "Sueldo"+mis_empleados[i].getSueldo()+ "Fecha de Alta: "+mis_empleados[i].getFechaContrato());
        }
*/

//Subir sueldos a empleados mediante un for each

        for(Empleado e: mis_empleados){

            e.subeSueldo(5);
        }

        for(Empleado e: mis_empleados){
            System.out.println("Nombre: "+ e.getNombre()+ 
            " Sueldo "+e.getSueldo()+ " Fecha de Alta: "+e.getFechaContrato());
        }


     }
}


class Empleado {
    
    
    //metodo constructor
     public Empleado(String nom,double sue, int agno,int mes, int dia){
        nombre= nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno,mes-1,dia);//Construye una fecha mediante un objeto tipo Gregorian Calendar
        altaContrato= calendario.getTime();//se almacena una fecha

     }

     //getters Nombre

     public String getNombre(){

        return this.nombre;
     }

     //getter sueldo

     public double getSueldo(){

        return this.sueldo;

     }

    // getter fecha

    public Date getFechaContrato(){
        return this.altaContrato;
    }

    //Setter

    public void subeSueldo(double porcentaje) {
        double aumento=sueldo*porcentaje/100;
        sueldo+=aumento;
    }

     //variables encapsuladas a modificar por metodos getter y setter
     private String nombre;
     private double sueldo;
     private Date altaContrato;
}