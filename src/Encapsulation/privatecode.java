
package Encapsulation;

public class privatecode {
    
    
    private int age;
    private float salary;
    private String name;

    

    public String getName() {
        return name;
    }

    /*
    void display() {
    System.out.println("your name "+name);
    System.out.println("your age is "+age);
    System.out.println(" and your salary is "+salary);
    }
     */
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    

    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    public float getSalary() {
        return salary;
    }
    
}
