
package herancaanimal;


public class HerancaAnimal 
{

  
    public static void main(String[] args) 
    {
         Mamifero camelo = new Mamifero("Camelo", (float) 150, 4, " Amarelo ", "Terra", (float) 2.0, "Cactus");
         Peixe tubarao = new Peixe("Tubarao", (float) 300, 0,"Cinzento", "Mar", (float) 1.5, "Barbatanas e Cauda");
         
         camelo.dadosMamifero();
         tubarao.dadosPeixe();
    }
    
}
