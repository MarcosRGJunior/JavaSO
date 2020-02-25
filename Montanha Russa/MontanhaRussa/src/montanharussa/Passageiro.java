/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montanharussa;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author pc
 */
public class Passageiro extends Thread 
{
    public Random tempo = new Random();
    public Carro teste= new Carro();
    
    public Passageiro(Carro teste)
    {
        this.teste = teste;
    }

     public  void run() 
     {
          
         
         if(teste.getNumPassageiros()< teste.getNumeroDeAcentos())
         {

                teste.entrarCarro();
               
         }
       
              
                  System.out.println("Passageiro andando!");
                  
                 
               
               
}
}
         
  
    
