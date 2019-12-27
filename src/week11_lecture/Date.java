/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11_lecture;

import java.time.LocalDate;

/**
 *
 * @author Anna29
 */
public class Date {
    int day;
    int month;
    int year;
    
    public Date(){
       
        LocalDate myObj = LocalDate.now();
        day = myObj.getDayOfMonth();
        month = myObj.getMonthValue();
        year = myObj.getYear();
    }
    
    public Date(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
    }
    
    public String toString(){
        return ""+ day+"/"+month+"/"+year;
    }
    
    
    
}
