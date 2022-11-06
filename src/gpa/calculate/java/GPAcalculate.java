
package gpa.calculate.java;

import java.util.Scanner; 
public class GPAcalculate {

    public static void main(String[] args) {
        
        System.out.println("//'GPA calculating'//");
        
        int i;
        int sum=0;
        int result;
         
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your Total subjects number:");
        int numberOfTotalSub = input.nextInt();
        
        double marks[]=new double[20];
        System.out.println("Please enter your marks of subjects: ");
        for(i=0; i<numberOfTotalSub; i++){
         
            marks[i] = input.nextDouble();
                            
        }
        for(i=1; i<numberOfTotalSub+1; i++){
              sum+= marks[i];
        }
        for(i=0;i<numberOfTotalSub;i++){
            if(marks[i]>=80){
                System.out.println("your result is A+ and your marks is :"+marks[i]);
            }
            else if (marks[i]>=70){
                System.out.println("your result is A and your marks is :"+marks[i]); 
            }
            else if (marks[i]>=60){
                System.out.println("your result is A- and your marks is :"+marks[i]); 
            }
            else if (marks[i]>=50){
                System.out.println("your result is B+ and your marks is :"+marks[i]); 
            }
            else if (marks[i]>=40){
                System.out.println("your result is B and your marks is :"+marks[i]); 
            }
            else if(marks[i]<40){
                System.out.println("your result is fail and your marks is :"+marks[i]); 
            }
            else;
        }
       
        int result1 = sum/numberOfTotalSub;
 
         
            switch (result1){
                case 80:
                    System.out.println("your GPA is A+");  
                 break;
                case 70:
                    System.out.println("your GPA is A"); 
                 break;
                case 60:
                    System.out.println("your GPA is A-"); 
                 break;
                case 50:
                    System.out.println("your GPA is B+"); 
                 break;
                case 40:
                    System.out.println("your GPA is B"); 
                 break;
                case 30:
                    System.out.println("your GPA is Fail"); 
                 break;
            
            }
                
        System.out.println("your total marks is: "+result1);
        
    }
    
}


