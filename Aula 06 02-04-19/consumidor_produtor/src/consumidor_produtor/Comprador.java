/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consumidor_produtor;

/**
 *
 * @author 2910700
 */
public class Comprador 
{
    //atributo
    double saldo;
    int qtd;
    
    //construtor
    public Comprador() // quando for inicializado um novo objeto irá para o contrutir
    {
        System.out.println("Comprador criado...");
    } 
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    
    //interação entre objeto
    public void comprar(int qtd, Estoque e, Fornecedor f)
    {
        double custo= e.getPreco() * qtd;
        
        if(this.saldo>=custo)
        {
            if(e.vender(qtd, f))
            {
                System.out.println("Comprado!");
                setQtd(this.qtd+qtd);
                setSaldo(this.saldo- custo);
            }
            else
            {
                System.out.println("Nao Comprado!");
            }
        }
        else
        {
            System.out.println("POBRE!!!!!!! Sem saldo");
        }
    }
}