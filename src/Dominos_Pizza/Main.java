
package Dominos_Pizza;

import java.util.Scanner;

public class Main {
    public static void main(String[] agrs){
        
        Scanner input = new Scanner(System.in);
       
        Customer c = new Customer();
        
        System.out.println("Kindly enter your id: ");
        int id = input.nextInt();
               
        System.out.println("Kindly enter your name: ");
        String name= input.next();
        
        System.out.println("Please enter your address: ");
        String ad = input.next();
        
        System.out.println("Kindly enter your phone number: ");
        int phn_numbr = input.nextInt();
        
        c.customer_input(id, name, ad, phn_numbr);        
        
         Pizza p= new Pizza();
        Drinks d = new Drinks();
         c.customer_input(p, d);
         c.order_Info();
      
    }
    
}
