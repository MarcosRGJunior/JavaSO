/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabancariamaluca;

import contabancariamaluca.ContaCorrente;

/**
 *
 * @author profbrigadeiro
 */
public class MeuDeposito extends Thread{
    
      ContaCorrente x ;
    
    public MeuDeposito(ContaCorrente x)
    {
        super();
        this.x = x;
    }
    
    @Override
    public void run() {
        
		for(int i=0; i<10000; i++)
                {
                    x.depositar(100);
                   
		    System.out.println("Depositei "+i);
                }
	}

    
}
