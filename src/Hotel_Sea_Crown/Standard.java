
package Hotel_Sea_Crown;

import java.util.Scanner;

public class Standard extends Room {
    
    protected int n;
    protected boolean isAcAvailability;
    
    protected void standard_room(){
      
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the number how many Standard room you want : ");
    n= input.nextInt();
       Standard[] standard = new Standard[9];
       
        for (room_id = 1; room_id <= n; room_id++){
            
            System.out.println("AC or Non-AC?\n (AC = 1) ");
            int choice = input.nextInt();
            if(choice == 1){ 
                System.out.println("Your standard Room Id with Ac is: " +(room_id+100));           
                isAcAvailability = true; 
                System.out.println("AcAvailability is: "+isAcAvailability); 
            }
            
            else{ 
                System.out.println("Your standard Room Id with Ac is: " +(room_id+300));
                isAcAvailability = false; 
                System.out.println("AcAvailability is: "+isAcAvailability);
            }
          
        }
     }
}
