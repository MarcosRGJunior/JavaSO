
package montanharussa;

import java.util.logging.Level;
import java.util.logging.Logger;


public class  Carro extends Thread 
{
    
   private int numeroPassageirosNoCarro = 0;
	private int numeroDeAcentos;
	
	public Carro(int numeroDeAcentos) 
        {
		this.numeroDeAcentos = numeroDeAcentos;
	}

    public Carro() 
    {
        
    }
	
	public int getNumPassageiros() {
		return this.numeroPassageirosNoCarro;
	}
	
	public boolean carroCheio() {
		if(this.numeroPassageirosNoCarro == this.numeroDeAcentos) {
			return true;
		}
                else
                {
                return false;
                }
	}

    public int getNumeroDeAcentos() {
        return numeroDeAcentos;
    }

  


        
	
	synchronized void entrarCarro() 
        {
            notifyAll();	
			while(this.numeroPassageirosNoCarro < this.numeroDeAcentos) 
                        {
                                System.out.println("Passageiro ENTROU!");
				this.numeroPassageirosNoCarro++;
                          
            
                        }
			                      if(this.numeroPassageirosNoCarro == this.numeroDeAcentos) 
                        {
                            passeio();
                        }
        }       

	
	synchronized void esvaziarCarro() 
        {
            notifyAll();
       
           this.numeroPassageirosNoCarro = 0;
           System.out.println("MONTANHA RUSSA PAROU!");
          
           try {
           Thread.sleep(1000);
       } catch (InterruptedException ex) {
           Logger.getLogger(Carro.class.getName()).log(Level.SEVERE, null, ex);
       }
       
			
		} 
    
        synchronized void passeio()
        {
            
            
                            notifyAll();
                                System.out.println("MONTANHA RUSSA FUNFANDO!");
       try {
           Thread.sleep(1000);
       } catch (InterruptedException ex) {
           Logger.getLogger(Carro.class.getName()).log(Level.SEVERE, null, ex);
       }
                                esvaziarCarro();
	}
            
          
}
 