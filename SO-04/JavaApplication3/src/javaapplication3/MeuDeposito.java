/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author profbrigadeiro
 */
public class MeuDeposito extends Thread{
    @Override
    public void run() {
        ContaCorrente x = new ContaCorrente();
		for(int i=0; i<10000; i++)
                {
                    x.depositar(100);
		    System.out.println("Depositei "+i);
                }
	}

    
}
