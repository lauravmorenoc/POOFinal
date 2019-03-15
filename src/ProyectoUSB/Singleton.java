/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoUSB;

import java.io.IOException;
import javafx.stage.Stage;

/**
 *
 * @author Juan
 */
public class Singleton {
    public static Singleton singleton = null;
    private Stage stage;
    private int score;
    private ScoreToFile data;
    
    public static Singleton getSingleton(){
        if(singleton == null){
            singleton = new Singleton();
    }
            return singleton;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) throws IOException {
        data=new ScoreToFile("highScore.txt");
        this.score = score;
        if(score>this.data.getLastSaved()){
            this.data.guardar();
        }
    }
    
    public Stage getStage(){
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public ScoreToFile getData() {
        data=new ScoreToFile("highScore.txt");
        return data;
    }

    public void setData(ScoreToFile data) {
        this.data = data;
    }
    
    
}
