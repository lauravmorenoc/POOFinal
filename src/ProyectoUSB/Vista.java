/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoUSB;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import javafx.animation.AnimationTimer;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.media.AudioClip;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Laura M
 */
public abstract class Vista extends AnimationTimer{
    protected Scene scene;
    protected Background bg;
    protected Background bgInverted;
 //   protected Button reintentar;
    protected Button salir;
    protected Button pause;
    protected Button continuar;
    protected Pane layout;
    protected Canvas canvas;
    protected GraphicsContext pencil;
    protected Image placeholder;
    protected ArrayList<String> keyPresses; 
    protected StaticObject floor;
    protected ArrayList<StaticObject> objects=new ArrayList<>();
    protected ArrayList<Enemy> enemigos;
    protected Player player;
    protected int frames;
    protected int playerFrame;
    protected int enemyFrame;
    protected ArrayList<Projectile> projectiles;
    protected ArrayList<Projectile> enemyProjectiles;
    protected Label health;
    protected Label lives;
    protected Label score;
    
    protected Label HighestScore;
    protected boolean salto;

    protected VBox deathPane; 
    protected Label youLost; 
    protected Button returnToMenuWin;
    protected Button returnToMenuLose;
    protected Scene deathScene;
    protected VBox winPane;
    protected Button nextLevel;
    protected Label youWon;
    protected Scene winScene;
    protected AudioClip audio;
    protected AudioClip audioP;
    protected AudioClip audioV;
    protected Modelo modelo;
    
    
    public Vista() {
        this.modelo=new Modelo();
        audio = new AudioClip (this.getClass().getResource("/Audios/AudioMenu.wav").toString());
        audioV = new AudioClip (this.getClass().getResource("/Audios/victoria.wav").toString());
        audioP = new AudioClip (this.getClass().getResource("/Audios/perder.wav").toString());
        
        this.objects=new ArrayList<>();
        this.enemigos=new ArrayList<>();
        this.layout = new Pane();
        
        this.canvas = new Canvas(650, 406); 
        layout.getChildren().add(canvas); 
        this.scene = new Scene(layout, canvas.getWidth(), canvas.getHeight());
        this.pencil = canvas.getGraphicsContext2D();
        this.keyPresses= new ArrayList<>();   
        this.projectiles = new ArrayList<>();
        this.enemyProjectiles = new ArrayList<>();
        
        this.deathPane = new VBox();
        this.youLost = new Label("Has perdido");
        this.returnToMenuLose = new Button("Regresar al menú");
        this.deathPane.setAlignment(Pos.CENTER);
        this.deathPane.getChildren().add(youLost);
        this.deathPane.getChildren().add(returnToMenuLose);
        this.deathPane.setSpacing(20);
        this.deathPane.setLayoutX(280);
        this.deathPane.setLayoutY(196);
        
        
        this.winPane = new VBox();
        this.winPane.setSpacing(20);
        this.nextLevel = new Button("Siguiente nivel");
        this.youWon = new Label("Pasaste este nivel!");
        this.returnToMenuWin = new Button("Regresar al menu");
        this.winPane.setAlignment(Pos.CENTER);
        this.winPane.getChildren().add(youWon);
        this.winPane.getChildren().add(nextLevel);
        this.winPane.getChildren().add(returnToMenuWin);
        this.winPane.setLayoutX(280);
        this.winPane.setLayoutY(196);
        
        
        
        this.winScene = new Scene(winPane, 650, 406);
        this.deathScene = new Scene(deathPane, 650, 406);
    }
    
    
    
    public void show(Stage stage) {
      stage.setTitle("Orion's Maze");
      this.start();
      stage.setScene(scene);
      stage.show();
   }

    /*public Button getReintentar() {
        return reintentar;
    }

    public void setReintentar(Button Reintentar) {
        this.reintentar = Reintentar;
    }*/

    public Button getSalir() {
        return salir;
    }

    public void setSalir(Button salir) {
        this.salir = salir;
    }

    public Button getContinuar() {
        return continuar;
    }

    public void setContinuar(Button continuar) {
        this.continuar = continuar;
    }

    public Background getBg() {
        return bg;
    }

    public void setBg(Background bg) {
        this.bg = bg;
    }

    public Pane getLayout() {
        return layout;
    }

    public void setLayout(Pane layout) {
        this.layout = layout;
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }

    public GraphicsContext getPencil() {
        return pencil;
    }

    public void setPencil(GraphicsContext pencil) {
        this.pencil = pencil;
    }

    public Image getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(Image placeholder) {
        this.placeholder = placeholder;
    }

    public ArrayList<String> getKeyPresses() {
        return keyPresses;
    }

    public void setKeyPresses(ArrayList<String> keyPresses) {
        this.keyPresses = keyPresses;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getFrames() {
        return frames;
    }

    public void setFrames(int frames) {
        this.frames = frames;
    }

    public Scene getScene() {
        return scene;
    }

    public ArrayList<StaticObject> getObjects() {
        return objects;
    }

    public void setObjects(ArrayList<StaticObject> objects) {
        this.objects = objects;
    }

    public ArrayList<Enemy> getEnemigos() {
        return enemigos;
    }

    public void setEnemigos(ArrayList<Enemy> enemigos) {
        this.enemigos = enemigos;
    }

    public Background getBgInverted() {
        return bgInverted;
    }

    public void setBgInverted(Background bgInverted) {
        this.bgInverted = bgInverted;
    }

    public StaticObject getFloor() {
        return floor;
    }

    public void setFloor(StaticObject floor) {
        this.floor = floor;
    }

    public ArrayList<Projectile> getProjectiles() {
        return projectiles;
    }

    public int getPlayerFrame() {
        return playerFrame;
    }

    public int getEnemyFrame() {
        return enemyFrame;
    }

    public ArrayList<Projectile> getEnemyProjectiles() {
        return enemyProjectiles;
    }

    public Label getHealth() {
        return health;
    }

    public Label getLives() {
        return lives;
    }

    public Label getScore() {
        return score;
    }

    public VBox getDeathPane() {
        return deathPane;
    }

    public Label getYouLost() {
        return youLost;
    }


    public Scene getDeathScene() {
        return deathScene;
    }

    public Button getReturnToMenuWin() {
        return returnToMenuWin;
    }

    public Button getReturnToMenuLose() {
        return returnToMenuLose;
    }

    public Button getNextLevel() {
        return nextLevel;
    }

    public Label getHighestScore() {
        return HighestScore;
    }

    public void setHighestScore(Label HighestScore) {
        this.HighestScore = HighestScore;
    }

    public Button getPause() {
        return pause;
    }

    public void setPause(Button pause) {
        this.pause = pause;
    }

    public boolean isSalto() {
        return salto;
    }

    public void setSalto(boolean salto) {
        this.salto = salto;
    }

    public AudioClip getAudio() {
        return audio;
    }

    public void setAudio(AudioClip audio) {
        this.audio = audio;
    }

    public AudioClip getAudioP() {
        return audioP;
    }

    public void setAudioP(AudioClip audioP) {
        this.audioP = audioP;
    }

    public AudioClip getAudioV() {
        return audioV;
    }

    public void setAudioV(AudioClip audioV) {
        this.audioV = audioV;
    }
    
}
