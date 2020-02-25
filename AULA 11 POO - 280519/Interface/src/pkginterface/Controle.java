
package pkginterface;

public class Controle implements ControleRemoto
{
     TV tv;
    private String nome; 
    private boolean estado;
    
    public Controle(String nome, boolean estado)
    {
                this.nome=nome;
                this.estado= estado;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public boolean isEstado() 
    {
        return estado;
    }

    public void setEstado(boolean estado) 
    {
        this.estado = estado;
    }

    
    public void aumentarVolume() 
    {
        System.out.println("alto pra caralho ");
    }

    
    public void reduzirVolume() 
    {
         System.out.println("Baixo ");  
    }
 
    
    public void Sincronizar(TV tv)  
    {
        this.tv = tv;
        System.out.println(this.nome +" Sincronizou com tv " + tv.getNome());  
    }
    
}
