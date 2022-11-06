
package Dominos_Pizza;

import java.util.Scanner;

public class Pizza extends Food {
    
    protected String p_flavor;
    
    Scanner sn = new Scanner(System.in);
    
    protected void Meaty_Onion_pizza(){
     
     f_id = 221; 
     System.out.println("Please enter your pizza name here for confirm the order: "); 
     String name = sn.next();
     f_name = name;
     f_price = 335 ;
     
     System.out.println("Pizza size is:\n1.Small\n2.Medium\n3.Large ");
     System.out.println("Please enter your pizza quantity: "); 
     String quantity = sn.next();
     f_quantity = quantity;
     System.out.println("which falvor you want? \n 1.Smoke \n 2.Normal");
     System.out.println("Please enter your choice: ");    
     int choice = sn.nextInt();
        switch (choice) {
            case 1:
                p_flavor = "Smoke";
                System.out.println("  Pizza id: "+f_id+"\n  Pizza name: "+f_name+"\n  Pizza price: "+f_price+tk+"\n  Pizza falvor: "+p_flavor);
                System.out.println("  Pizza quantity: "+f_quantity);
                break;
            case 2:
                p_flavor = "Normal";
                System.out.println("  Pizza id: "+f_id+"\n  Pizza name: "+f_name+"\n  Pizza price: "+f_price+tk+"\n  Pizza falvor: "+p_flavor);
                System.out.println("  Pizza quantity: "+f_quantity);
                break;
            default:
                System.out.println("Invalid option ");
                break;
        }
     
    }
    
    protected void Sausage_pizza(){
     
     f_id = 323; 
     System.out.println("Please enter your pizza name here for confirm the order: "); 
     String name = sn.next();
     f_name = name;
     f_price = 349 ;
     
     System.out.println("Pizza size is:\n1.Small\n2.Medium\n3.Large "); 
     System.out.println("Please enter your pizza quantity: "); 
     String quantity = sn.next();
     f_quantity = quantity;
     
     System.out.println("which falvor you want? \n 1.Smoke \n 2.Normal");
     System.out.println("Please enter your choice: ");    
     int choice = sn.nextInt();
        switch (choice) {
            case 1:
                p_flavor = "Smoke";
                System.out.println("  Pizza id: "+f_id+"\n  Pizza name: "+f_name+"\n  Pizza price: "+f_price+tk+"\n  Pizza falvor: "+p_flavor);
                System.out.println("  Pizza quantity: "+f_quantity);
                break;
            case 2:
                p_flavor = "Normal";
                System.out.println("  Pizza id: "+f_id+"\n  Pizza name: "+f_name+"\n  Pizza price: "+f_price+tk+"\n  Pizza falvor: "+p_flavor);
                System.out.println("  Pizza quantity: "+f_quantity);
                break;
            default:    
                System.out.println("Invalid option ");
                break;
        }
     
    }
    
    protected void pizza_item(){
       System.out.println("which falvor you want? \n 1.Meaty Onion Pizza \n 2.Sausage Pizza"); 
       System.out.println("Please enter your choice: ");    
        int choice = sn.nextInt();
        if(choice==1){
              Meaty_Onion_pizza();
        }
        else{
           Sausage_pizza(); 
        }
    }
    
}
