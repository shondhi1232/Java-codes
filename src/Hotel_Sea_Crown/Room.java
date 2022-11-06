/**
 * 
In Hotel Sea-Crown, there are 40 rooms, 
1.among them 10 rooms are deluxe rooms 
2.and 30 rooms are standard rooms.
3. All hotel rooms have the common fields room-id and customer-id who has rented the room.
4.But the deluxe room has another field that is room-size and 
5.the standard room has another field that is AC-Availability. 
6.The customer who rented the room has common attributes - Id, name.

•Now break down the scenario into proper meaningful classeImplement encapsulation on the classes       
•Implement inheritance on only those classes which are needed to be inherited              
•Explain what the benefit you got by using encapsulation and inheritance in your code        
•Write a method named “rent_Room” through which customer can rent a room. 
(Prepare the logic by yourself and logic should be realistic)
 */

package Hotel_Sea_Crown;

public class Room {
    protected int room_id;
    protected int customer_id;
    protected Customer c ;
    
    protected void room_id(int room_id){
    
      this.room_id = room_id;     

    }
  
    protected void Customer_id(Customer c){
      this.c = c;   
    }
      
    
}