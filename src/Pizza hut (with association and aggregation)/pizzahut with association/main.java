
package pizzahut;

public class main {
    public static void main(String[] args){
        
        Customer c = new Customer("shondhi",01302);
        Pizzas p = new Pizzas (345,12,"Suasage and extra cheese","Meat Lovers");
        Drinks d = new Drinks (40,"Pepsi","Mint");
        c.Customer_info();
        c.items_details(p, d);
        
        
    }
}
