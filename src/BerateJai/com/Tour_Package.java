/*
Suppose, you have to develop software for the manager of a Tourism Management Company
named “Berate-Jai.com”. Here, the company offers different types of tour packages. All tour
packages have some common attributes such as package-id, package-name, package-price and
seat capacity (A package has a maximum 10 seat-capacity). But, the summer packages have one
more attribute named month (for which the value will be either “January” or “June”). And, the winter
packages have an attribute season (for which the value will be either “New Year” or “Xmas”). All
Travelers have tId, tName, country. All Travelers can buy any number of package(s) and the
total-price will be calculated accordingly. While calculating the total-price, a 10% discount will be
given to only the registered travelers. On the other hand, non-registered travelers will not get any
discount, but have to pay 2% tax. A traveler can buy any package until the seat-capacity is not full.
Total-price will be calculated by multiplying the number of packages (of a traveler) with per
package-price.
1. Design a class diagram/UML
2. Answer the following questions with code:
● Now break down the scenario into proper meaningful class(es)
● Try to take all the input from user
● Implement encapsulation on the class(es)
● Implement inheritance on only those class(es) which are needed to be inherited
● Write a method named “buy_package” through which travelers can buy package
● Write a method named “payment_calcualtion” through which calculate the necessary
calculation.
● Make a Main class, where you create a reference of the specified class(es) and call the
necessary method(s) to complete the process.
3. Is there any Association, aggregation and composition relationship used in your code? If yes,
then mention the class(es) name.
4. Is there any polymorphism being used in your code? If yes, then mention the type of
polymorphism, class, method name. Also write the reason why you have used polymorphism
in your code?
[Note: Answer the questions 3 and 4, to the point and as much as possible short answer]
*/
package BerateJai.com;

public class Tour_Package {
  
    protected int package_id;
    protected String package_name;
    protected int package_price;
    protected int seat_capacity;
    protected String tk="tk";
    protected int registared_t_id=044;
    protected int discount_total_price;
    protected int total_price;
    protected int tax;
    
    
   protected void payment_calcualtion(){
        System.out.println("Are you registareted Traveler?\n than enter the code for 10% discount ");
         if(registared_t_id==044){
          discount_total_price = (package_id*package_price)*(10/100);
          System.out.println("with discount packageprice is: "+discount_total_price);
        }
        else{
             tax=(package_id*package_price)*(2/100); 
             total_price = (package_id*package_price)+tax;
             System.out.println("with tax package price is: "+total_price);
        }
         
         
   }
    
    
  
} 
