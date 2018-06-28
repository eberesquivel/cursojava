import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * pruebaEventos
 */
public class pruebaEventos {

    public static void main(String[] args) {
        MarcoBotones mimarco = new MarcoBotones();
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoBotones extends JFrame{

    public MarcoBotones(){

        setTitle("Botones y Eventos");
        setBounds(700, 300, 500, 300);
        LaminaBotones milamina = new LaminaBotones();
        add(milamina);
    }

}

class LaminaBotones extends JPanel implements ActionListener{

    JButton botonazul = new JButton("Azul");
    JButton botonamarillo = new JButton("Amarillo");    
    JButton botonrojo = new JButton("Rojo");

    //constructor
    public LaminaBotones(){

        add(botonazul);
        add(botonamarillo);
        add(botonrojo);

        //Instancias de clase interna
        ColordeFondo Amarillo = new ColordeFondo(Color.YELLOW);
        ColordeFondo Rojo = new ColordeFondo(Color.RED);
        ColordeFondo Azul = new ColordeFondo(Color.BLUE);
        //Al dar click al boton se genera un Ojbeto de tipo evento que viaja automaticamente
        //al objeto de tipo ActionEvent del metodo actionPerformed y se ejcuta el códico de ese metodo
       ///*Objeto Fuente: Boton que desencadenará la accion*/botonazul.addActionListener/*Objeto Evento: Action que podria traducirse como al hacer click*/(this/*Objeto Destino: en este caso la Clase Lamina*/);
        //botonamarillo.addActionListener(this);
        botonrojo.addActionListener(Rojo);
        botonamarillo.addActionListener(Amarillo);
        botonazul.addActionListener(Azul);
    }

    //MEtodos

    public void actionPerformed(ActionEvent e) {
        Object botonPulsado=e.getSource();
        if(botonPulsado == botonazul){
            setBackground(Color.BLUE);
        }
        if(botonPulsado == botonamarillo){
            setBackground(Color.YELLOW);
        }
        if(botonPulsado == botonrojo){
            setBackground(Color.RED);
        }
    }

    //Clase Intera
    private class ColordeFondo implements ActionListener{
        //Constructor
        public ColordeFondo(Color c){
    
            colorDeFondo=c;
        }
        //Metodos
        public void actionPerformed(ActionEvent e){
    
            setBackground(colorDeFondo);
        }
    
        private Color colorDeFondo;
    }

}

