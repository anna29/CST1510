/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week14_lecture;

import java.util.Date;

/**
 *
 * @author Anna29
 */
public class Main {
    public static void main(String[] args) {    
        displayObject (new Circle (1, "red", false));
        displayObject (new Rectangle (1, 1, "black", true));
        
    }

    public static void displayObject(GeometricObject object){
        System.out.println("Created on: "+ object.getDate()+
                "Colour is: "+object.getColor());
    }
    
}
