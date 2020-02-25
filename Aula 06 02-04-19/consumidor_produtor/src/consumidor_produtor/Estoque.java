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
public class Estoque 
{
    //atributos
    int qtd; 
    double saldo;
    
       //construtor
    public Estoque()
    {
        System.out.println("Estoque criado...");
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    double preco;
    
    //interação entre classe
    public boolean vender(int qtd, Fornecedor f)
    {
        if(this.qtd>=qtd) // this= quantidade da classe for igual ou maior a quantidade chamada pela função vender
        {
            setQtd(this.qtd-qtd);
            setSaldo(this.saldo+ (getPreco()*qtd) );
            System.out.println("Saldo atual: " + getSaldo());
            System.out.println("Qtd atual: " + getQtd());
            return true;
            
        }
        comprarF(qtd, f);
        return false;
    }
    public void comprarF(int qtd, Fornecedor f)
    {   double custo= f.getPreco() * qtd;
        if(f.venderF(qtd))
        {
            System.out.println("Comprado do Fornecedor!");
                setQtd(this.qtd+qtd);
                setSaldo(this.saldo- custo);
                vender(qtd, f);
        }
        else
        {
            System.out.println("Deu ruim!");
        }
    }

    }
    

