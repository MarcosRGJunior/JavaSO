
package pkginterface;


public class TV implements Eletronico 
{
    private String nome; 
    private boolean estado;
    
    public TV(String nome, boolean estado)
    {
                this.nome=nome;
                this.estado= estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }  

    
    public void ligar() 
    {
        this.estado = true;
        System.out.println("Ligado");
    }

    
    public void Desliga() 
    {
        this.estado = false;
        System.out.println("Desligado");
    }
    
}
