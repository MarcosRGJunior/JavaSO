
package herancaanimal;


public class Mamifero extends Animal
{
    private String alimento;
            
    public Mamifero(String nome, Float comprimento, int numeroDePastas, String cor, String ambiente, Float velocidadeMedia, String alimento) 
    {
        super(nome, comprimento, numeroDePastas, cor, ambiente, velocidadeMedia);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    
    public void dadosMamifero()
    {
        super.dados();
        System.out.println("Alimento: " + getAlimento());
        
    }
    
}
