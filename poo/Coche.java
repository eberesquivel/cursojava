
//definición de la clase
public class Coche {
   private int ruedas;
   private int motor;
   private int largo;
   private int ancho;
   private int peso_plataforma;
   private String color;
   private int peso_total;
   private boolean asientos_cuero,aire;


//Método Constructor se llama igual que la clase

public Coche() {
      ruedas=4;
      largo=2000;
      ancho=300;
      motor=1600;
      peso_plataforma =500;
}

//Métodos getters y Setters ruedas
      public String getRuedas(){
      return "La cantidad de ruedas que tiene el coche es:" + this.ruedas;
      }


// getters  largo
      public String getDatosGenerales(){
         return "El largo de el coche es: "+this.largo/1000+" metros."+
         " y un ancho de "+ this.ancho/100+ " cm"+" La plataforma tiene 4 "+this.ruedas+ " y " +
         " un peso de "+ peso_plataforma + " kgs" ;
      }

//set color 
	
	public void setColor(String color_coche){
		this.color= color_coche;
            }
//get color
      public String getColor(){
                  return "El color de el coche es: "+this.color;
            }

//setter asientos

      public void configura_asientos(String asientos_cuero) {
     // this.asientos_cuero=asientos_cuero;
            if (asientos_cuero.equalsIgnoreCase("si")){
                  this.asientos_cuero=true;
            }else{
                  this.asientos_cuero=false;
            }
      }
//getter asientos
      public String getAsientos(){
            if(asientos_cuero=true){
             return"El coche tiene asientos cuero";
            }else{
            return"El coche tiene asientos de serie";
            }
      }

//Setter aire acondicionado

      public void configura_aire(String aire) {
            if (aire.equalsIgnoreCase("si")){
                  this.aire=true;}else{
            this.aire=false;
            }
      }

//Getter aire acondicionado

      public String getAire(){
            if(aire==true){
                  return "El auto cuenta con aire acondicionado ";
            }else{
                  return "El auto cuenta con climatizador";
            }
      }
// Ejemplo de Método Getter y Setter mixtos no recomendado en POO aunque funciona

      public String get_PesoCoche() {
            int peso_Carroceria =500;
            peso_total= peso_Carroceria+peso_total;
            if(asientos_cuero==true){
                  peso_total= peso_total+20;
            }
            if (aire== true){
                  peso_total=peso_total+50;
            }
            return "El peso del coche es " + peso_total;
      }


      //getter precio
      public int precio_coche(){

            int precio_final =100000;
            if(asientos_cuero==true){
                  precio_final+=20000;
            }
            if(aire == true){
                  precio_final+=15000;
            }
            return precio_final;
      }


}

