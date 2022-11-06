/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author HP
 */
public class student extends person{
    
   private String name;
   
   public student(String n){
       name=n;
   }
    
   public String getname(){
       return name;
     
   }
   public void setname(){
      this. name = name;
   }
   
    
}
