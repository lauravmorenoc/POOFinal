/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoUSB;

import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author Juan
 */
public class ControladorMejPun {
     private Instructions mp;
     private Modelo modelo;

    public ControladorMejPun() {
        this.mp = new Instructions();
        
        //adicionar eventos
        Modelo modelo = new Modelo();
        this.mp.getBack().setOnAction(new EventoBack());
        this.mp.getLabel().get(0);
        
    }
    
    public void mostrarVista(){
        Singleton singleton = Singleton.getSingleton();
        this.mp.mostrar(singleton.getStage());
    }
    
    
    //Clase interna - inner class
    class EventoBack implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent t) {
           ControladorMenu m = new ControladorMenu(modelo);
           m.mostrarVista();
        }
        
    }
    
    /*class EventoOptions implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent t) {
           //Controlador2 c2 = new Controlador2(modelo);
           //c2.mostrarVista();
        }
        
    }
    
    class EventoHighScores implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent t) {
           //Controlador2 c2 = new Controlador2(modelo);
           //c2.mostrarVista();
        }
        
    }
    
    class EventoExit implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent t) {
            System.exit(0);
           //Controlador2 c2 = new Controlador2(modelo);
           //c2.mostrarVista();
        }
        
    }*/

    public Instructions getVentana1() {
        return mp;
    }
    
    
    
}
