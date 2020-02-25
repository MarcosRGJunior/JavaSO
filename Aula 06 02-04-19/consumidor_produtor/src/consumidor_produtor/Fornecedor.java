
package consumidor_produtor;


public class Fornecedor 
{
    //atributo
    int qtd;
    double preco;
    
    //construtor
    public Fornecedor()
    {
        System.out.println("Fornecedor criado...");
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public boolean venderF(int qtd)
    {
        
        if(this.qtd>=qtd)
        {
            setQtd(this.qtd-qtd);
            return true;
        }
        return false;
    
    }
}
