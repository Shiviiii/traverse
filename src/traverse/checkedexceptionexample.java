/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traverse;

/**
 *
 * @author cktri
 */import java.io.*;
public class checkedexceptionexample {
    public static void main (String[]args) throws FileNotFoundException
  
            {
        filetest();
        
    }
      public static void filetest()  throws FileNotFoundException{
          File file=new File("E:\\shivi.txt");
        FileInputStream inp=new FileInputStream(file);
    
          
      }

}
