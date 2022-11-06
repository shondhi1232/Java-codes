
package Dominos_Pizza;

import java.util.Scanner;

public class Customer {
    int c_id;
    String c_name;
    String c_adrs;
    int c_phn_nmbr;
    int total_price;
    protected Pizza p;
    protected Drinks d;
    
    Scanner n = new Scanner(System.in);
    protected void customer_input(int c_id,String c_name,String c_adrs,int c_phn_nmbr){
       this.c_id =c_id;
       this.c_name =c_name;
       this.c_adrs = c_adrs;
       this.c_phn_nmbr = c_phn_nmbr;
    }
    
      
    protected void customer_input(Pizza p,Drinks d){
       this.p =p;
       this.d =d;        
     
    }
    
    
    protected void customer_info(){
        
        System.out.println();
        System.out.println("Customer id: "+c_id);
        System.out.println("Customer name: "+c_name);
        System.out.println("Customer address: "+c_adrs);
        System.out.println("Customer number: "+c_phn_nmbr);               
        
    }
   
     protected void order_Info(){
         customer_info();       
         System.out.println("which item you want? \n 1.Pizza \n 2.Drinks");
         System.out.println("Please enter your choice: ");    
        int choice = n.nextInt();
        switch (choice) {
            case 1:
                p.pizza_item();
                System.out.println("Do you want drink item in your list?\n if yes than press 1 or no than press any key");
                int press = n.nextInt();
                if(press==1){
                    d.drink_item();
                    total_price = p.f_price+d.f_price;
                    System.out.println("Your total bill is: "+total_price); 
                }else{
                    total_price = p.f_price;
                    System.out.println("Your total bill is: "+total_price);
                }
                break;
            case 2:
                d.drink_item();
                total_price = d.f_price;
                System.out.println("Your total bill is: "+total_price);
                break;
            default:    
                System.out.println("Invalid option ");
                break;
        }
     
    }
    
      
    
    
}
