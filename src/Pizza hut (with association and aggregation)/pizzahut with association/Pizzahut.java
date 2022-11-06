/**
 * Read the scenario carefully…
Assume that, you are assigned to develop a program for ​“Pizza Hut”​ 
to automate their system. A customer places orders. A customer has a 
name and phone number. All orders consist of a set of items. There 
are two types of items: pizzas and drinks. All items have a price. A 
pizza has a size, toppings and a name (e.g., “Margherita”, “Meat 
Lovers” or “Diavola” etc). A drink has a brand and a flavor.
* 
* Implement the class diagram from (Q. 1) into code ( write code a,b,c 
all together)
a. Make required class with necessary attributes and methods using 
Inheritance.
b. Ensure proper Encapsulation to develop your classes to answer the 
question (a)
c. Make a Main class with the main method to initialize objects of 
required classes and show all order information by a customer.
 */
package pizzahut;

public class Pizzahut {
    
    protected int price;
    protected String tk="tk";
    
    Pizzahut (int pc){
        price = pc;
    }
     
    protected void Item_price(){
        System.out.println("Price is "+price+tk);
        System.out.println();
    }
        
    
}
