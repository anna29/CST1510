/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week14_lecture;

import java.util.Date;


public class GeometricObject {
    
    public void p(String s){
        System.out.println(s);
     
    }
 
   

    public String toString() {
        return "GeometricObject{" + "color=" + color + ", filled=" + filled + ", date=" + date + '}';
    }
    
    private String color;
    private boolean filled;
    private Date date;
 
    public GeometricObject (){
    date = new Date();
        
        
    }
    
    
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        date = new Date();
        
    }  

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    

   
  
 
    
}
