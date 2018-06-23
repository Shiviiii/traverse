
package traverse;
        
public class multithreadteast implements Runnable {
    public static void main (String[]args){
        Runnable runnable= new Runnable() {
            @Override
            public void run() {
                //6throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             }
        };
        Thread thread2=new Thread(runnable);
        thread2.start();
        
        multithreadteast ob=new multithreadteast();
        Thread thread3=new Thread(ob);
        thread3.start();
    }

    @Override
    public void run() {
        System.out.println(" thread 3 is running");
    }

    
}
