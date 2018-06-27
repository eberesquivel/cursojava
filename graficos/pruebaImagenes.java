import java.awt.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;


/**
 * trabajandoConFuentes
 */
public class pruebaImagenes {

    public static void main(String[] args) { 
        MarcoImagen marco = new MarcoImagen();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}

class MarcoImagen extends JFrame{

    public MarcoImagen(){
        setTitle("Prueba con Imagenes");
        setBounds(750, 300, 500 , 500);
        LaminaConImagenes lamina = new LaminaConImagenes();
        add(lamina);
        

    }
}

class LaminaConImagenes extends JPanel{

    //Constructor
    public LaminaConImagenes(){
        try{
            imagen= ImageIO.read(new File("/Users/imac/Desktop/java/graficos/bola.png"));
        
        }catch(IOException e){
          System.out.println("La imagen no se encuentra");
        }
    }

//Metodos
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //File miimagen= new File("/Users/imac/Desktop/java/graficos/icono.png");
       

        int anchuraImagen=imagen.getWidth(this);
        int alturaImagen= imagen.getHeight(this);

        g.drawImage(imagen,0,0, null);
        for(int i=0; i< 500; i++){
            for(int j=0; j<500; j++){
                if(i+j>0){
                g.copyArea(0, 0, anchuraImagen, alturaImagen, anchuraImagen*i, alturaImagen*j);
                }
            }

        }
        /*g.copyArea(0, 0, 32, 32, 32, 0);*/
    
    }
    private Image imagen;
}