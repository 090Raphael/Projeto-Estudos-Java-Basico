public class SmartTv {
    
    boolean ligada = false;    
    int canal = 1;
    int volume = 25;
    
    // Método Canal
    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++; // Incrementa o volume em 1
        System.out.println("Aumentando Volume para:" + canal);        
    }     
    public void diminuirCanal(){
       canal--; // Decrementa o volume em 1
    }
    
    // Método aumentar Volume
    public void aumentarVolume(){
        volume++; // Incrementa o volume em 1
        System.out.println("Aumentando Volume para:" + volume);        
    }

     // Método diminuir Volume
    public void diminuirVolume(){
       volume--; // Decrementa o volume em 1
    }
   
    // Método para ligar a TV
    public void ligar(){
        ligada = true;     
    }

    // Método para desligar a TV
    public void desligar(){
        ligada = false;     
    }
}