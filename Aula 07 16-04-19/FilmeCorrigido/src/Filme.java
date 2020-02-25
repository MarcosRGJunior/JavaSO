
public class Filme 
{
    private String titulo;
    private int duracaoEmMinutos;
    protected float nota;
    public String genero;

    private float getNota() 
    {
        return nota;
    }

    protected void setNota(float nota) 
    {
        this.nota = nota;
    }

    public String getGenero() 
    {
        return genero;
    }

    public void setGenero(String genero) 
    {
        this.genero = genero;
    }
    
    //Construtor
    public Filme()
    {
        
    }
    
     public Filme(String titulo, int duracaoEmMinutos)
    {
        this.titulo=titulo;
        this.duracaoEmMinutos= duracaoEmMinutos;
    }
    // obter valor
    public String getTitulo() 
    {
        return titulo;
    }
    // colocar valor
    public void setTitulo(String titulo) 
    {
        this.titulo = titulo;
    }

    public int getDuracaoEmMinutos() 
    {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) 
    {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    
     public void exibirDuracaoEmHoras()
    {
        int horas = duracaoEmMinutos / 60;  // poderia ser usado também, mas é menos recomendado: getDuracaoEmMinutos() / 60;
        int rest = duracaoEmMinutos % 60;
        
        System.out.println("O Filme " + titulo + " possui " + horas + " horas e " + rest+ " minutos de duração e sua nota é de: " +getNota());
    }
    
}
