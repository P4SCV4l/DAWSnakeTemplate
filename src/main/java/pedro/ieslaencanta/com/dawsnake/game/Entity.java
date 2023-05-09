/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedro.ieslaencanta.com.dawsnake.game;

import javafx.geometry.Point2D;

/**
 *
 * @author PC
 */
public abstract class Entity implements IDrawable{
    protected Point2D Coordenada;
    protected int size;
    protected String color;

    public Entity() {
    }

    public Entity(Point2D Coordenada, int size, String color) {
        this.Coordenada = Coordenada;
        this.size = size;
        this.color = color;
    }
}
