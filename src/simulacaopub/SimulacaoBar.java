package simulacaopub;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SimulacaoBar {

    public static void main(String[] args) {        
        Bar bar = new Bar();
        long tempoInicial = System.currentTimeMillis();
        Thread t = new Thread(bar);
        System.out.println("Informações Gerais");
        System.out.println(bar.getQuantClientesAguardandoCopo()+" clientes");
        System.out.println(bar.getQuantCoposLivres()+ " copos");
        System.out.println(bar.getQuantGarcomLivre()+" garçom");
        imprimirLinhaPontilhada();
        imprimirLinhaPontilhada();
        while(true){
//            System.out.println("Tempo "+((System.currentTimeMillis()-tempoInicial)));
//            System.out.println(bar);
//            imprimirLinhaPontilhada();
            if(t.getState()==Thread.State.NEW){
                t.start();
            }
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
