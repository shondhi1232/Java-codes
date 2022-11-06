/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreateFile;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
//import java.util.logging.Level;
//import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class formatter {
   // public void main(String[] args){ 
    public static void main(String[] args) {
        
        String name, phn_number;
        try {
            Formatter formatter =  new Formatter("G:/shontu/shondhi.txt");
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            int i;
          for(i=1;i<=num;i++){
            name = input.next();
            phn_number = input.next();
            formatter .format("%s %s \r\n",name,phn_number);
          }  
          formatter.close();
            
        } catch (FileNotFoundException ex) {
           // Logger.getLogger(formatter.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}