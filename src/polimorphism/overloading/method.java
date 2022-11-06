
package overloading;

public class method {
    
    
    void add (int a ,int b ,int sum){
         System.out.println("sum = "+sum); 
        
    }
    
    void add (double a , double b){
         System.out.println(a+b);
         
    }
    
    void add (int a ,int b ){
        System.out.println(a*b);
         
    }
     
    void add (String a){
          System.out.println("name is "+a);
    }
    void add (int a){
           System.out.println(a*a);
    }
    void add (){
        System.out.println("empty funtion");
    }
    
       
}
