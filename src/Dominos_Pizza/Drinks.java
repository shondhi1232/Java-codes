

package Dominos_Pizza;

import java.util.Scanner;


public class Drinks extends Food {
    String d_brand;
    Boolean isAvailable;
    
    Scanner sn = new Scanner(System.in);
    
    protected void drink_item(){
     
         System.out.println("which drink you want? \n 1.Pepsi \n 2.Cocacola");
         System.out.println("Please enter your choice: ");    
        int choice = sn.nextInt();
        switch (choice) {
            case 1:
                f_id = 344;
                System.out.println("Please enter your drink name here for confirm the order: "); 
                String f_name = sn.next();
                f_price = 40 ;
                d_brand = "Pepsi";
                System.out.println("  Drink id: "+f_id+"\n  Drink name: "+f_name+"\n  Drink price: "+f_price+tk+"\n  Drink Brand: "+ d_brand);
                break;
            case 2:
                f_id = 352;
                System.out.println("Please enter your drink name here for confirm the order: "); 
                String n= sn.next();
                f_name = n;
                f_price = 40 ;
                d_brand = "Cocacola";
                System.out.println("  Drink id: "+f_id+"\n  Drink name: "+f_name+"\n  Drink price: "+f_price+tk+"\n  Drink Brand: "+ d_brand);
                break;
            default:    
                System.out.println("Invalid option ");
                break;
        }
     
    }
    
}
