/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herancaanimal;

/**
 *
 * @author 2910700
 */
public class Animal 
{
    private String nome;
    private float comprimento;
    private int numeroDePastas;
    private String cor;
    private String ambiente;
    private float velocidadeMedia;
    
    public Animal(String nome,Float comprimento,int numeroDePastas,String cor, String ambiente,Float velocidadeMedia)
    {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numeroDePastas = numeroDePastas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidadeMedia = velocidadeMedia;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public Float getComprimento() 
    {
        return comprimento;
    }

    public void setComprimento(Float comprimento) 
    {
        this.comprimento = comprimento;
    }

    public int getNumeroDePastas() 
    {
        return numeroDePastas;
    }

    public void setNumeroDePastas(int numeroDePastas) 
    {
        this.numeroDePastas = numeroDePastas;
    }

    public String getCor() 
    {
        return cor;
    }

    public void setCor(String cor) 
    {
        this.cor = cor;
    }

    public String getAmbiente() 
    {
        return ambiente;
    }

    public void setAmbiente(String ambiente) 
    {
        this.ambiente = ambiente;
    }

    public Float getVelocidadeMedia() 
    {
        return velocidadeMedia;
    }

    public void setVelocidadeMedia(Float velocidadeMedia) 
    {
        this.velocidadeMedia = velocidadeMedia;
    }
    
    public void dados()
    {
        System.out.println("Nome: " + getNome() + "\n" + "Comprimento: " + getComprimento() + "\n" + "Numero de Pastas: " + getNumeroDePastas() + "\n" +  "Cor: " + getCor() + "\n" + "Ambiente: " + getAmbiente()+ "\n" + "Velocidade media: " + getVelocidadeMedia() + "m/s");
        
    }
    
}

