
public class TestarFilme 
{

    public static void main(String[] args)
    {
        Filme Titanic = new Filme("Titanic", 194);
        
        Titanic.exibirDuracaoEmHoras();
        
        // criacao de objeto e alteracao de atributos com ser
        Filme f1= new Filme();
        f1.setTitulo("Vingadores");
        f1.setDuracaoEmMinutos(142);
        f1.setNota(9);
        f1.exibirDuracaoEmHoras();
        
        // uso de get, demonstração dos que estão em cartaz
        System.out.println("Os filmes que estão em cartaz são: " + Titanic.getTitulo() + " , " + f1.getTitulo());
    }
    
    
}
