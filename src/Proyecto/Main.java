/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Juan
 */
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Menu m = new Menu();
        m.show(primaryStage);
    }
}
