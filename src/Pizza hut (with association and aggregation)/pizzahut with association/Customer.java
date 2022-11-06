
package pizzahut;


public class Customer {
    protected String name;
    protected int phn_numbr;
    protected int total_price;
    Pizzas piz;//has a relation (Aggrigation)
    Drinks dk;//has a relation (Aggrigation)
    
    Customer(String name,int phn_numbr){
        
        this.name = name;
        this.phn_numbr = phn_numbr;
        
     
    }
    protected void items_details(Pizzas piz,Drinks dk){
       this.piz = piz;
       this.dk = dk; 
      piz.pizza_Info();
      dk.drink_Info();
      total_price=piz.price+dk.price;
      System.out.println("Total Price is "+total_price);
    }
    
    protected void Customer_info(){
        System.out.println("Customer name "+name);
        System.out.println("Customer Phone Number "+phn_numbr);
        System.out.println();
       
    }
}
