/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traverse;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author cktri
 */
public class exceptiontest {
    public static void main (String[]args){
        int b[]= new int[7];
        int a;
        Scanner scan= new Scanner(System.in);
        
                
    
    
    try{
    a=scan.nextInt();
    System.out.print(b[10]);
        }
    catch(Exception eix){
        
                System.out.println(eix.getMessage());
    }
    finally{
        System.out.print("this block will always be executed ");
    }
    }
    
}
