
package consumidor_produtor;


public class Consumidor_produtor 
{

   
    public static void main(String[] args) 
    {
      Estoque e1= new Estoque();
      Comprador c1= new Comprador();
      Fornecedor f1 = new Fornecedor();
        
      e1.setQtd(10);
      e1.setPreco(2.50);
      e1.setSaldo(1000.00);
      
      c1.setQtd(10);
      c1.setSaldo(5000);
      
      f1.setQtd(260);
      f1.setPreco(1.50);
      
     
      c1.comprar(250, e1, f1);
    }
    
}
