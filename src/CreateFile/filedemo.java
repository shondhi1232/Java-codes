/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template filedemo, choose Tools | Templates
 * and open the template in the editor.
 */
package CreateFile;

import java.io.File;

/**
 *
 * @author HP
 */
public class filedemo {
    public static void main ( String[] args){
        File dir = new File ("G:/shondhi");
        dir.mkdir();/// directory will be create
        
        File file1 = new File("G:/shondhi/shondhi.Info");
        System.out.println("Successfully file created");
        
        
        String directory = dir.getAbsolutePath();
        System.out.println(directory);
        
        
    }
    
}
