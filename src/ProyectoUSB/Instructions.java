/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoUSB;

import java.util.ArrayList;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Juan
 */
public class Instructions {
    
    
    private Scene scene;
    private ArrayList<Label> label;
    private Label title;
    private Button back;
    private Image background;
    private ImageView image;
    private StackPane stackGrid;
   private GridPane grid;
   private VBox vbox;
    
    public Instructions() {
        
        this.label=new ArrayList<>();
        stackGrid = new StackPane();
        grid = new GridPane();
        grid.setVgap(35);
        grid.setAlignment(Pos.CENTER);
        
        stackGrid.setPadding(new Insets(25, 25, 25, 25));
        stackGrid.setAlignment(Pos.CENTER);
        
        vbox = new VBox(10); //Contiene los botones
        vbox.setAlignment(Pos.CENTER);
        
        background = new Image("Imagenes/Puntua.jpg");
        image = new ImageView(background);
        
        title = new Label ("Instructions");
        
        title.setTextFill(Color.web("#ffffff"));
        title.setFont(new Font("Georgia", 40));
        
       Label l1 = new Label("El juego consiste en lograr que nuestro astronauta, perdido en una luna lejana a su hogar, ");
        this.label.add(l1);
        
       Label l10=new Label("logre pasar todos los niveles para recuperar su nave y regresar a casa.");
        this.label.add(l10);
        
       Label l2 = new Label("Su astronauta cuenta con 3 vidas. Una vida se pierde si su astronauta ha sido dañado 5 veces. ¡Tenga cuidado!");
        this.label.add(l2);
        
       Label l3 = new Label("En cada luna (nivel) usted se encontrará con una serie de extraterrestres que querran evitar ");
        this.label.add(l3);
        
       Label l11=new Label("que llegue a su destino, no deje que estos seres lleguen a tocarlo,la salud de su astronauta disminuira.");
        this.label.add(l11);
        
       Label l4 = new Label("Si pierde una vida, debera empezar a realizar el nivel desde el principio.");
        this.label.add(l4);
        
       Label l5 = new Label("Si pierde sus tres vidas, habra perdido y debera iniciar la partida de nuevo si lo desea.");
        this.label.add(l5);
        
       Label l6 = new Label("Utilice las teclas de movimiento ubicadas a la derecha de su teclado para moverse de un lado a otro y para volar.");
        this.label.add(l6);
        
       Label l7 = new Label("Usted tambien cuenta con herramientas de ataque. Presione la tecla C para disparar a sus enemigos");
        this.label.add(l7);
        
       Label l12 = new Label(" y aumentar su puntaje. ");
        this.label.add(l12);
        
       Label l8 = new Label("Elimine a todos sus enemigos para obtener puntaje maximo. El juego le indicara cuando haya llegado a su meta");
        this.label.add(l8);
        
       Label l9 = new Label("Ahora que conoce las instrucciones, ¡disfrute del juego!");
        this.label.add(l9);
        
        for(Label labels:this.label){
            labels.setTextFill(Color.web("#ffffff"));
            vbox.getChildren().add(labels);
        }
        
        back = new Button("Back");
        back.setTextFill(Color.web("#000000"));
        vbox.getChildren().add(back);
       
        
        grid.add(title, 0, 1);
        grid.add(vbox, 0, 2);
        GridPane.setHalignment(title, HPos.CENTER); //Centra el titulo en su casilla        
        stackGrid.getChildren().add(image);
        stackGrid.getChildren().add(grid);
        scene = new Scene(stackGrid, 650, 406);
        
    }
      /*public void show(Stage stage) {
      stage.setTitle("Orion's Maze");
      stage.setScene(scene);
      stage.show();
   }*/
    
      
    public void mostrar(Stage stage){
        stage.setTitle("Orion's Maze");
        stage.setScene(scene);
        stage.show();
    }  

    public Button getBack() {
        return back;
    }

    public ArrayList<Label> getLabel() {
        return label;
    }

    public void setLabel(ArrayList<Label> label) {
        this.label = label;
    }
     

}
