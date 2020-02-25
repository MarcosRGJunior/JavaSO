/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montanharussa;

/**
 *
 * @author pc
 */
public class MontanhaRussa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Carro c = new Carro(3);
       Passageiro u = new Passageiro(c);
       Passageiro d = new Passageiro(c);
       Passageiro t = new Passageiro(c);
       Passageiro q = new Passageiro(c);
       Passageiro s = new Passageiro(c);
       Passageiro o = new Passageiro(c);
       Passageiro n = new Passageiro(c);
       
       
       c.start();
       u.start();
       d.start();
       t.start();
       q.start();
       s.start();
       o.start();
       n.start();
    }
    
}
