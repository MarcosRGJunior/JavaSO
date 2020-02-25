
package herancaanimal;


public class Peixe extends Animal
{
    private String caracteristicas;
    
    public Peixe(String nome, Float comprimento, int numeroDePastas, String cor, String ambiente, Float velocidadeMedia, String caracteristicas) 
    {
        super(nome, comprimento, numeroDePastas, cor, ambiente, velocidadeMedia);
        this.caracteristicas = caracteristicas;
        
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
 
  public void dadosPeixe()
    {
        super.dados();
        System.out.println("Caracteristica: " + getCaracteristicas() );
        
    }
    
}
