/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabancariamaluca;

import javaapplication1.ContaCorrente;

/**
 *
 * @author profbrigadeiro
 */
public class MeuSaque extends Thread{
    @Override
    public void run() {
        ContaCorrente x = new ContaCorrente();
		for(int i=0; i<10000; i++)
                {
                    x.sacar(100);
		    System.out.println("saquei "+i);
                }
	}

    
}

    

