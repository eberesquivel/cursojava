
//definición de la clase
public class Coche {
   private int ruedas;
   private int motor;
   private int largo;
   private int ancho;
   private int peso;
//Métodos getters y Setters ruedas
   public String getRuedas()
   {
   	return "La cantidad de ruedas que tiene el coche es:" + this.ruedas;
   }

   public void setRuedas(int ruedas)
   {
   	this.ruedas = ruedas;
   }

// getters y setter largo
      public String getLargo()
	{
		return "El largo de el coche es: "+this.largo;
	}

	public void setLargo(int largo)
	{
		this.largo = largo;
	}

//Método Constructor se llama igual que la clase

public Coche() {
      ruedas=4;
      largo=2000;
      ancho=300;
      motor=1600;
      peso =500;
}



}

