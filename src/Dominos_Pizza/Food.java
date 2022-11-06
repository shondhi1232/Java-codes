/*
Assume that, you are assigned to develop a program for “Domino's Pizza” to
automate their system. A customer has attributes named id, name, address,
and phone number. There are two types of food: pizza and drinks. All types of
food have a unique id, food name, and price. But pizza has one more attribute
called flavor name. Moreover, drinks have a brand name. A customer can order
any kind of food.

Answer the following questions based on above scenario:
● Make required class(es) with necessary attributes and methods considering
the above scenario by using code reusability concept.
● Ensure data hiding technique properly while designing your classes.
● Make the option/provision/method where customers can make an order
with food name and quantity. Also calculate the bill.
● Make a method where the user can take all the input from the user.
● Make a method where you print the information of the order.
● Make a Main class with the main method to initialize objects of required
classes and show all order information by a customer.

*/
package Dominos_Pizza;

public class Food {
    
    protected int f_id;
    protected String f_name;
    protected int f_price;
    protected String tk = "tk";
    protected String f_quantity;
   
}
