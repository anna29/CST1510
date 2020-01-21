/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week14_lecture;

import java.util.Date;


public class Circle extends GeometricObject{

    // p method is overloud
    public void p(int i){
        System.out.println("This is the Circle number: "+i);
     
    }



// to String is Override
    public String toString() {
        return super.toString()+ "Circle{" + "radius=" + radius + '}';
    }

    private double radius;


    public Circle() {
      //  super("Circle");
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String colour, boolean filler) {
        this.radius = radius;
        setColor(colour);
        setFilled(filler);
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getPerimeter(){
        return 2* radius *Math.PI;
    }
    
    public double getDiameter(){
        return 2 * radius;
    }
    
    public void printObject(){
        System.out.println("Date of creating circle is:"
        + super.getDate());
    }
    

    
    
}
