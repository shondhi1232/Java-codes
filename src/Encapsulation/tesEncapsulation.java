
package Encapsulation;

public class tesEncapsulation {
    public static void main(String[] args) {
        
        privatecode s1 = new privatecode();
        
        /*
        s1.age = 21;
        s1.name = "shondhi";
        s1.salary = 20567;
        s1.display();
        */
        
        s1.setAge(21);
        s1.setSalary(20204);
        s1.setName("shondhi");
        System.out.println( s1.getName());
        System.out.println( s1.getAge());
        System.out.println( s1.getSalary());
    }   
             
    
}
