
package overriding;

public class methodtest extends method {
     
        String Gender="female";
                       
          
        @Override
        void profile(){
        //super.profile(); //To change body of generated methods, choose Tools | Templates.
        System.out.println(name);
        System.out.println(score);
        System.out.println(ID);
        System.out.println(age);
        System.out.println(Gender);
        
        }
    
 
    
}