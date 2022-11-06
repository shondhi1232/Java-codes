
package Hotel_Sea_Crown;

import java.util.Scanner;

public class Customer {
    
    protected String name;
    protected int Id;
    String roomCategory;
    Standard sr;
    Deluxe dr;
    
    
    protected void customer_info(int Id,String name){
       
        this.Id = Id;
        this.name = name; 
    }
    
    protected void customer_id(){
        
        System.out.println("Customer ID: "+Id);
        
    }
    protected void customer_name(){
       System.out.println("Customer name: "+name);  
    }
    protected void rent_Room(Standard sr,Deluxe dr){
        customer_id();
        customer_name();
        Scanner input = new Scanner(System.in);
        System.out.println("Room Category: 1.Standard 2.Deluxe");
        int choose = input.nextInt();
        switch (choose) {
            case 1 :
                roomCategory = "Standard";
                 System.out.println("Your Room Category is: "+roomCategory);
                 sr.standard_room();
              
                break;
            case 2:
                roomCategory = "Deluxe";
                System.out.println("Your Room Category is: "+roomCategory);
                dr.deluxe_room();
                break;
            default:
              System.out.println("Invalid option.");  
        }
    }
}
