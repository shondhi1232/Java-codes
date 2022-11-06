/*
2. ABC shop sells only Chairs to customer. The attributes of this shop are: chair id, buyPrice, SalePrice,
color, material and quantity are stored.
 Write a method that that will initialize the attributes.
 Write a method where a customer can buy chair. This method will take chair id and quantity as
parameter. If quantity is greater than stock then customer can buy chair. After that,
 Write another method that will calculate the discount amount for customer, if total price is
greater than 5000 taka then 2% discount will be given. Otherwise a message will be shown to
customers that “discount not applicable”.
 Write a method where a customer will check whether a chair is made of plastic material and
brown color. If the chair is plastic and brown then customer will buy the chair. [Hints: string
matching]
In Main class create reference of the class and Call all the methods from main method. Also take input
from user where it is necessary
*/
package ABCshop;

public class shopsales {
    int total_price,quantity1;
    String color;
    String material1;
    int buyPrice;
    int SalePrice;
    int chair_id;

    void attributes(){
        chair_id = 22110;
        buyPrice = 1000 ;
        SalePrice = 1500;
        color="brown";
        material1 = "plastic ";
        quantity1 = 5000;  
    }
    void buychair(int chair_id,int quantity){
         if(quantity1>quantity){
             
          total_price= quantity*SalePrice; 
          System.out.println("Sir your total price is: "+total_price);
         }
         
     }
    void DiscountCalculate(){
        if(total_price>5000){
            total_price= total_price*(2/100);
        }
        else{
            System.out.println("discount not applicable");
        }
    }
    public void productchecking(String match,String material2){
        if(color.equals(match) && material1.equals(material2)){
         System.out.println("Cuatomer buys the chair");   
        }
        else{
             System.out.println("Cuatomer did not buy the chair");
        }
    }
}
