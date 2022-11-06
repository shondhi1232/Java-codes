
package ABCshop;

import java.util.Scanner;

public class collection {
     public static void main(String[] args){
        Scanner input = new Scanner (System.in);
         shopsales s =new shopsales();
            s.attributes();
            s.DiscountCalculate();
            
            System.out.println("Please enter your chair Id sir: ");
            int chair_id = input.nextInt();
            System.out.println("Please enter your buy quantity sir: ");
            int quantity = input.nextInt();
            s.buychair(chair_id,quantity);
            
            System.out.println("Kindly enter your color and material choice sir: ");
            String match = input.nextLine();
            String material2 = input.nextLine();
            s.productchecking(match, material2); 
     }
    
}
