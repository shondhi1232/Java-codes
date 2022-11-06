
package Hotel_Sea_Crown;

import java.util.Scanner;


public class Main {
    
    public static void main(String[] args){
        
       Scanner input = new Scanner(System.in);
        Customer c = new Customer();// allocating memory to array
        System.out.println("Please enter the customer id: ");
         int id = input.nextInt();
         
        System.out.println("Please enter the customer name: ");
        String name = input.next();
        
        c.customer_info(id, name);
        Standard s = new Standard();
        Deluxe d = new Deluxe();
        c.rent_Room(s, d);
       
    }
}
