/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week14_lecture;

/**
 *
 * @author Anna29
 */
public class Rectangle extends GeometricObject{

    private double width;
    private double height;
 
    public Rectangle(){
        
    }
    public Rectangle(double width, double height, String color, Boolean b) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(b);
    }
    
    
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return width * height;
    }

    public double getPerimeter (){
        return 2 * (width + height);
    }
  
    public String toString() {
        return super.toString()+"Rectangle{" + "width=" + width + ", height=" + height + '}';
    }
    
    
}
