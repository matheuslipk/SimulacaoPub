package simulacaopub;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SimulacaoBar {

    public static void main(String[] args) {        
        Bar b = new Bar();
        while(true){
            System.out.println(b.clientes[0].getStatusAtual());
            
            try {
            Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(SimulacaoBar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
    }
    
}
