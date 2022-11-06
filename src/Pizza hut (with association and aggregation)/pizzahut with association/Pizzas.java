
package pizzahut;

public class Pizzas extends Pizzahut {
    
    protected int size;
    protected String toppings;
    protected String name;
    
    Pizzas(int pc, int s, String t, String n){
        super(pc);
        size = s;
        toppings = t;
        name = n;
        
    }


    protected void pizza_Info(){
        System.out.println("Pizza name: "+name );
        System.out.println("Pizza toppings: "+toppings );
        System.out.println("Pizza size: "+size );
        super.Item_price();
     
    }
}
