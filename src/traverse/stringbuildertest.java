/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traverse;

/**
 *
 * @author cktri
 */
public class stringbuildertest {   
    public static void main (String[] args) {
        StringBuilder s1=new StringBuilder("test"),s2;
        s2=s1;
        s1.append("board");
        System.out.println(s2);
    }

    
}
