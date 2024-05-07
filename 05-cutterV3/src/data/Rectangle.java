/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author ADMIN
 */
public class Rectangle extends Shape {

    protected double hight;
    protected double width;

    public Rectangle(String owner, String color, double hight, double width) {
        super(owner, color);
        this.hight = hight;
        this.width = width;
    }

    public double getHight() {
        return hight;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getPerimeter() {
        return (hight + width) * 2;
    }

    @Override
    public double getArea() {
        return hight * width;
    }

    @Override
    public void paint() {
        String str = String.format("%-15s|%-10s|%-10s|%5.2f|%5.2f|%5.2f|%5.2f|",
                    "Rectangle", owner, color, hight, width, getPerimeter(), getArea());
        System.out.println(str);
    }

  
}
