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
public class Square extends  Retangle{
    
    public Square(String color, double EdgeA) {
        super(color, EdgeA, EdgeA);
    }

    @Override
    public void showInf() {
       String str = String.format("Square    |%5s|%5.2f|%5.2f|%5.2f",
                     color, EdgeA, Premeter(), Area());
        System.out.println(str);
    }
    
    
    
}
