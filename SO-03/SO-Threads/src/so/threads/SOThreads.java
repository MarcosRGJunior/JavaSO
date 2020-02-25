
package so.threads;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SOThreads extends Thread
{
    //tarefa 1
    Random gerador = new Random();
    public void run()
    {
        for(int i=0;i<1000;i++)
        {
            try {
                Thread.sleep( gerador.nextInt(100));
            } catch (InterruptedException ex) {
                Logger.getLogger(SOThreads.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(Thread.currentThread().getName()+":" + i);
        }
    }
    public static void main(String[] args) 
    {
        
     
        (new SOThreads()).start();
        (new SOThreads()).start();
    }
}
