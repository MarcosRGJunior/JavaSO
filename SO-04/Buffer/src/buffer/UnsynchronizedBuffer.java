
import java.util.logging.Level;
import java.util.logging.Logger;

// Fig. 23.9: UnsynchronizedBuffer.java
// UnsynchronizedBuffer representa um �nico inteiro compartilhado.

public class UnsynchronizedBuffer implements Buffer
{
   private int buffer = -1; // compartilhado pelas threads Produtor e Consumidor

   // coloca o valor no buffer
   public synchronized void set( int value )
   {
      
       notifyAll(); // acorda todas as Threads que estão paradas 
      
      System.out.printf( "Producer writes\t%2d", value );
      buffer = value;
       try {
           wait();
       } catch (InterruptedException ex) {
           Logger.getLogger(UnsynchronizedBuffer.class.getName()).log(Level.SEVERE, null, ex);
       }
       
   } // fim do m�todo set

   // retorna valor do buffer
   public synchronized int get()
   {
              notifyAll();
      if(buffer!=-1)// assim evita o metodo rodar antes de ter algo para consumir, a primeira vez ele pula
      {
      System.out.printf( "Consumer reads\t%2d", buffer );
       try {
           wait();
          
       } catch (InterruptedException ex) {
           Logger.getLogger(UnsynchronizedBuffer.class.getName()).log(Level.SEVERE, null, ex);
       }
      }
      return buffer;
      
   } // fim do m�todo get
} // fim da classe UnsynchronizedBuffer


/**************************************************************************
 * (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
