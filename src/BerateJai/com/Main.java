
package BerateJai.com;

import java.util.Scanner;

public class Main {
     public static void main(String[] agrs){
        
        
        Scanner input =new Scanner(System.in);
        
        Traveler t = new Traveler();
        Summer s =new Summer();
        Winter w = new Winter();
        t.Aggrigation(s, w);
        
        System.out.println("Kindly enter your id: ");
        int id = input.nextInt();
               
        System.out.println("Kindly enter your name: ");
        String name= input.next();
        
        System.out.println("Please enter your country: ");
        String ad = input.next();
        
        t.traveler_input(id, ad, ad);
        t.buy_package();
    }
}
