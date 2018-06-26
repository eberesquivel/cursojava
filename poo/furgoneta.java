
public class furgoneta extends Coche{ //hereda de la clase coche con extends


    private int capacidad_carga;
    private int plazas_extra;
    

    //Constructor
    public furgoneta(int plazas_extra, int capacidad_carga){

        super();//llama al constructor de la clase padre en este caso Coche.
        this.capacidad_carga= capacidad_carga;
        this.plazas_extra=plazas_extra;
    }

    public String getDatosFurgoneta(){

        return"La capacidad de carfa es : " + capacidad_carga + " Y las plazas son: " + plazas_extra;
    }
}