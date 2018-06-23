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
public class copyexample {
   public void innertest(){
       int x=50;
       class test{
           void tester(){
             int y=x+2;
           }
       
   }
   }

    int x1;
    static int x2;

    static class student {

        int strength;
        String name;

        student(int a, String n) {
            strength = a;
            name = n;
        }

        student getCopy() {
            x2 = x2 + 3;
            student ob;
            ob = new student(this.strength, this.name);
            return ob;
        }
    }

    class student2 {

        int id;
        String course;

    }

    public static void main(String[] args) {
        //student2 s2= new student2();
        student s1 = new student(5, "shivangi"), s2;
        s2 = s1.getCopy();
        s1.strength = 6;
        copyexample ob = new copyexample();
        ob.x1 = ob.x1 + 3;

        System.out.println(s2.strength + " " + s2.name);

    }
}
