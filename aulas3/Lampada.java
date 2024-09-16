import java.util.Random;

public class Lampada{
    private boolean ligada;
    private boolean queimada;
    
    public Lampada(){
        ligada=false;
        queimada=false;
    }

    public void ligar(){
        Random r=new Random();
        
        if((! queimada)&&(! ligada)){
        }
        if(r.nextInt(100)<30)
        queimada=true;
    }
    public void desligar(){
        if((! queimada)&&(ligada))
        ligada=false;
    }

    public String estado(){
        if(queimada)
            return "queimada";
        else if(ligada)
            return "ligada";
        else
            return "desligada";

    }
}
