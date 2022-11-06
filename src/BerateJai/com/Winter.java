
package BerateJai.com;

import java.util.Scanner;

public class Winter extends Tour_Package{
    
    protected String season="Xmas";
    protected int n;
    Scanner input = new Scanner(System.in);
    
    @Override
   protected void payment_calcualtion(){
        System.out.println("Are you registareted Traveler?\n than enter the code for 10% discount ");
         if(registared_t_id==044){
          discount_total_price = (package_id*package_price)*(10/100);
          System.out.println("with discount package price is: "+discount_total_price);
        }
        else{
             tax=(package_id*package_price)*(2/100); 
             total_price = (package_id*package_price)+tax;
             System.out.println("with tax package price is: "+total_price);
        }
         
         
   }
    
  
    protected void winter_package(){          
     
       System.out.println("Please enter the number how many winter packages you want: " );
       n= input.nextInt();
        Winter[] seatCapacity = new Winter[9];
        
        
          System.out.println("Please enter the package name:");
          package_name = input.next();
          System.out.println("    Package name is: " +package_name);
      
        for (package_id = 1;package_id <= n; package_id++){
         
          System.out.println("    package Id is: " +package_id);
          System.out.println("    Tour season: " +season);          
          System.out.println("    package price is: " +package_price);
          payment_calcualtion();
        }

         payment_calcualtion();
    }
    
      
    
    
}
