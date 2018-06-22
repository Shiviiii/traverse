package traverse;

import java.util.*;


public class checkingofarraylist {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        
      ArrayList<Integer> arltest=new ArrayList <>();
      
      System.out.println("Size of Arraylist at creation:"+arltest.size());
      for(int i= 0;i<size;i++){
          arltest.add(sc.nextInt());
      }
          System.out.print("enter number to be checked ");
          int num=sc.nextInt();
          if(arltest.contains(num))
              System.out.print("number is present ");
          else
                            System.out.print("number is not present ");

         
      
    }

    }
    
