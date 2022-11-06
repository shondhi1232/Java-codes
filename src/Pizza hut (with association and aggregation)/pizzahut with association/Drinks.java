
package pizzahut;

public class Drinks extends Pizzahut{
    protected String brand;
    protected String flavor;
    
    Drinks(int pc,String b,String f){
        super(pc);
        brand = b;
        flavor = f;
    }
    protected void drink_Info(){
        System.out.println("Drink Brand: "+brand );
        System.out.println("Drink Flavor: "+flavor );
        super.Item_price();
    }
    
}
