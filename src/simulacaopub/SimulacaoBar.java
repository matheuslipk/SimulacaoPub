package simulacaopub;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SimulacaoBar {

    public static void main(String[] args) {        
        Bar b = new Bar();
        long tempoInicial = System.currentTimeMillis();
        while(true){
            System.out.println("Tempo "+((System.currentTimeMillis()-tempoInicial)/1000));
            System.out.println(b);
//            System.out.println(b.getQuantClientesAguardandoCopo()+" clientes aguardando copo");
//            System.out.println(b.getQuantCoposLivres()+" copos livres");
//            System.out.println(b.getQuantGarcomLivre()+ " garçons livres");
            imprimirLinhaPontilhada();
            try {
            Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(SimulacaoBar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    private static void imprimirLinhaPontilhada(){
        System.out.println("-------------------------------------------------");
    }
}
