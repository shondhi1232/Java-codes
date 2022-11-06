
package Hotel_Sea_Crown;

import java.util.Scanner;

public class Deluxe extends Room {
    
    protected int room_size;
    protected int n;
    //Scanner input = new Scanner(System.in);
    protected void deluxe_room(){
      
     
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter the number how many deluxe room you want: " );
      n= input.nextInt();
      Deluxe[] deluxe = new Deluxe[29];
      
        for (room_id = 1; room_id <= n; room_id++){
            
          System.out.println("Your deluxe Room Id is: " +(room_id+500));
          
          System.out.println("Please enter the room size:");
          room_size = input.nextInt();
          System.out.println("Deluxe Room size is: " +room_size);
        }

    
    }

   
    
}
