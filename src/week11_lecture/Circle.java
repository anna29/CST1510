/*
 * 
 */
package week11_lecture;

/**
 *
 * 
 */
public class Circle {
    
    private double radius;    
    static int numberOfObjects = 0;
    private Date date;
    
    public Circle(){
        numberOfObjects ++;
        date = new Date();
    }
    public Circle(double radius){
       this.radius = radius;
       numberOfObjects++;
    }  
    public double getArea (){
        return radius * radius * Math.PI;
    }
   
    public void setRadious(double radius){
        this.radius = radius;
    }
     public double getRadious(){
        return radius;
    }
     
    public String toString (){
        return "The circle radius is: "+radius+ " this is circle number: "+ numberOfObjects +" that has been created "+ ", the date of cretion is: "+ date;
    }
    
}
