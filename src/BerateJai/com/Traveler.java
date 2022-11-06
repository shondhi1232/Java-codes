
package BerateJai.com;

import java.util.Scanner;

public class Traveler {
    
    protected int tId;
    protected String  tName;
    protected String  country;
    protected int total_price;       
   
    
    Summer s;
    Winter w;
    Scanner sn = new Scanner(System.in);
    protected void traveler_input(int id,String  tn,String  tc){
        tId = id;
        tName = tn;
        country= tc;
    }
    protected void traveler_info(){
         System.out.println("Traveler id: "+tId);
         System.out.println("Traveler name: "+tName);
         System.out.println("Traveler country: "+country);                 
    }
    protected void Aggrigation( Summer s, Winter w){
        this.s = s;
        this.w = w;
    } 
     
     protected void buy_package(){
         traveler_info();
         System.out.println("which package you want? \n 1.Summer \n 2.Winter");
         System.out.println("Please enter your choice: ");    
        int choice = sn.nextInt();
        switch (choice) {
            case 1:
                s.summer_package();           
                break;
            case 2:
                w.winter_package();              
                break;
            default:    
                System.out.println("Invalid option ");
                break;
        }
     
        
        
        
    }
}
