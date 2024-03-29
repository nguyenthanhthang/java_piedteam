/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import com.sun.javafx.geom.Edge;

/**
 *
 * @author ADMIN
 */
public class Retangle {

    protected String color;
    protected double EdgeA;
    protected double EdgeB;

    public Retangle(String color, double EdgeA, double EdgeB) {
        this.color = color;
        this.EdgeA = EdgeA;
        this.EdgeB = EdgeB;
    }

    public String getColor() {
        return color;
    }

    public double getEdgeA() {
        return EdgeA;
    }

    public double getEdgeB() {
        return EdgeB;
    }

    public double Premeter() {
        return (EdgeA + EdgeB)*2;
    }

    public double Area() {
        return EdgeA * EdgeB;
    }

    public void showInf() {
        String str = String.format("Retangle     |%5s|%5.2f|%5.2f|%5.2f|%5.2f",
                     color, EdgeA, EdgeB, Premeter(), Area());
        System.out.println(str);
    }
}
