/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoUSB;

import java.util.ArrayList;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/**
 *
 * @author Hernan
 */
public class Enemy extends Movable implements Runnable {
    
    private int health;
    
    public Enemy(int xPos, int yPos, int xPosFinal, int yPosFinal, Image sprite, int health) {
        super(xPos, yPos, xPosFinal, yPosFinal, sprite);
        this.direction = "UP";
        this.health = health;
    }
    
    @Override
    public void moveUp(){
        this.yPos-=3;
    }
    
    @Override
    public void moveDown(){
        this.yPos+= 3;
    }
    
    @Override
    public void start(){
        if(yPos > 200 && direction.equals("UP")){
            moveUp();
            if(yPos == 201)direction = "DOWN";
        }
        if(direction.equals("DOWN")){
            moveDown();
            if(yPos == 330)direction = "UP";
        }
    }
    
    /*public Projectile shoot(ArrayList<Projectile> projectiles){
        Projectile projectile = new Projectile(xPos, yPos, "LEFT");
        return projectile;
    }*/

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    
    
}
