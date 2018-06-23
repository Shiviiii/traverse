/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traverse;

import java.util.Scanner;

public class Traverse {

    public static void main(String[] args) {
        String s;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string");
        s = sc.nextLine();
        int len = s.length();
        for (i = 0; i < len; i++)
        {
           int a =s.charAt(i);
            if(!isprime(a)){
                System.out.println("not prime");
                s=s.replace((char)a,'?');
            } else {
                System.out.println("is prme");// TODO code application logic here
            }
        }
        System.out.println(s);

    }

    public static boolean isprime(int args) {
        boolean isprime = true;
        for (int i = 2; i <= args - 1; i++) {
            if (args % i == 0) {
                isprime = false;

            }

        }
        return isprime;

    }
}
