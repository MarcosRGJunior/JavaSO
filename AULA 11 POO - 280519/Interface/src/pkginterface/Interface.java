
package pkginterface;


public class Interface 
{

  
    public static void main(String[] args) 
    {
       TV roberto = new TV("Roberto", true);
       
       Controle jacira = new Controle("Jacira", true);
       
       jacira.Sincronizar(roberto);
       jacira.aumentarVolume();
       
       roberto.Desliga();
       
       
       TV ronaldo= new TV("Ronaldo", false);
       
       Controle nani = new Controle("nani", true);
       
       nani.Sincronizar(ronaldo);
       nani.reduzirVolume();
       
       ronaldo.ligar();
       
    }
    
}
