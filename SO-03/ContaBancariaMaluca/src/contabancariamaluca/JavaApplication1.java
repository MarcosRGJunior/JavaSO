/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabancariamaluca;

import javax.swing.JOptionPane;

/**
 *
 * @author profbrigadeiro
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaCorrente c = new ContaCorrente();
        MeuDeposito d = new MeuDeposito();
        MeuSaque s = new MeuSaque();
        d.start();
        s.start();
        
        JOptionPane.showMessageDialog(null,"fim");
        System.out.println("########################"+c.getSaldo());
        
    }
    
}
