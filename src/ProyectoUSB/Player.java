/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoUSB;

import javafx.scene.image.Image;
import javafx.scene.shape.Shape;

/**
 *
 * @author Hernan
 */
public class Player extends Movable {
    private Image right;
    private Image left;
    private int headWidth;
    private String facingDirection = "RIGHT";

    
    public Player(int xPos, int yPosCabeza, int width, int height,int headWidth, Image sprite) {
        super(xPos, yPosCabeza, width, height, sprite);
        right = new Image("Imagenes/right1_corregido.png");
        left = new Image("Imagenes/left1_corregido.png");
        this.headWidth=headWidth;
        
    }

    
    @Override
    public void moveLeft(){
        sprite = left;
        facingDirection = "LEFT";
    }
    
    @Override
    public void moveRight(){
        sprite = right;
        facingDirection = "RIGHT";
    }

    public Image getLeft() {
        return left;
    }

    public void setLeft(Image left) {
        this.left = left;
    }


    public int getHeadHeight() {
        return headWidth;
    }

    public void setHeadWidth(int yPosCuerpo) {
        this.headWidth = yPosCuerpo;
    }

    public String getFacingDirection() {
        return facingDirection;
    }
    
    public Projectile shoot(){
        Projectile projectile = new Projectile(xPos+10, yPos+10, facingDirection);
        return projectile;
    }
    
    


    
 
    

}
