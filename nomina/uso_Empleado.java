import java.util.*;

public class  uso_Empleado {
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
        Jefatura jefe_RRHH= new Jefatura("Maicol", 55000, 2006, 9, 25);
        jefe_RRHH.estableceIncentivo(2570);
//Instanciando objetos Empleados alamacenados en un RRAY
        Empleado mis_empleados [] = new Empleado[5];
        mis_empleados[0] = new Empleado("Gregie Greg", 85000,1990,12,17);
        mis_empleados[1] = new Empleado("Teresa Saldaña ",95000,1995,06,02);
        mis_empleados[2] = new Empleado("María Chavira ",90000,2002,03,12);
        mis_empleados[3] = jefe_RRHH;//Principio de Sustitucion (Polimorfismno) 
        mis_empleados[4] = new Jefatura("Tere", 95000, 1999, 5, 26);
        Jefatura jefa_Finanzas = (Jefatura)mis_empleados[4];//Refundición de Objetos (casting)
        jefa_Finanzas.estableceIncentivo(55000);
        System.out.println(jefa_Finanzas.toma_decisiones("Dar mas días de vacaciones alos empleados"));
      
        // Empleado director_comercial= new Jefatura("Sandra", 85000, 2012, 05, 04);
        // Comparable ejemplo = new Empleado("Wber",80000,2011,04,04);

//Ejemplos instanceof
        // if(director_comercial instanceof Empleado){
        //     System.out.println("Es de tipo Jefatura");
        // }
        // if(ejemplo instanceof Comparable){
        //     System.out.println("Implementa la intefaz comparable");
        // }
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

        Arrays.sort(mis_empleados);

        for(Empleado e: mis_empleados){
            
            System.out.println("Nombre: "+ e.getNombre()+
            " Sueldo "+e.getSueldo()+ " Fecha de Alta: "+e.getFechaContrato());
        }


     }
}


class Empleado implements Comparable{

    //SObrecarga de constructor: Varios constructores dentro de una misma clase
    //metodo constructor
     public Empleado(String nom,double sue, int agno,int mes, int dia){
        nombre= nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno,mes-1,dia);//Construye una fecha mediante un objeto tipo Gregorian Calendar
        altaContrato= calendario.getTime();//se almacena una fecha
        // ++IdSiguiente;
        // Id=IdSiguiente;

     }

     public  Empleado (String nom){
    //    nombre=nom;
        // Asigna valores por defecto 
        this(nom,30000,2000,1,1);
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

    //Setter®

    public void subeSueldo(double porcentaje) {
        double aumento=sueldo*porcentaje/100;
        sueldo+=aumento;
    }

    // Método Compare to de la interfaz para ordenar por sueldo de menor a mayor
     public int compareTo(Object miObjeto){

         Empleado otroEmpleado=(Empleado)miObjeto;
         if(this.sueldo<otroEmpleado.sueldo){
             return -1;
         }
         if(this.sueldo>otroEmpleado.sueldo){
             return 1;
         }
         return 0;
     }

    

     //variables encapsuladas a modificar por metodos getter y setter
     private String nombre;
     private double sueldo;
     private Date altaContrato;
}


class Jefatura extends Empleado implements Jefes{
    //constructor
    public Jefatura(String nom, double sue, int agno, int mes, int dia){//parametros de la subclase
        super(nom,sue,agno,mes,dia);//parametros del constructor de la clase padre
    } 
    //Metodos
    public String toma_decisiones(String decision){
        return "Un miembro de la dirección a tomado la decision de:" + decision;
    }

    public void estableceIncentivo(double b){
        incentivo=b;
    }
    //SObreescritura de método heredado de la clase empleado, para asi poder 
    //agregar incentivos sobre el sueldo base unicamente a empleados de tipo Jefe
    public double getSueldo(){
        double sueldoJefe= super.getSueldo(); //almacena en sueldoJefe el valor del sueldo base almacenado en el metodo padre antes de ser sobrescrito por el metodo de la subclase antecediendo la palabra super

        return sueldoJefe + incentivo;
    }
    private double incentivo;
}

