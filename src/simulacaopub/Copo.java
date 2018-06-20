package simulacaopub;

public class Copo {
    final static int LIVRE = 0;
    final static int VAZIO = 1;
    final static int ENCHENDO = 2;
    final static int CHEIO = 3;
    final static int SECANDO = 4;
    
    
    private int statusAtual=0;
    private long timerEnchendo=0;
    private long timerSecando=0;

    public int getStatusAtual() {
        return statusAtual;
    }

    public void setStatusAtual(int statusAtual) {
        switch(statusAtual){
            case(Copo.ENCHENDO):
                setTimerEnchendo(System.currentTimeMillis());
                break;
            case(Copo.SECANDO):
                setTimerSecando(System.currentTimeMillis());
                break;                
        }
        this.statusAtual = statusAtual;
    }

    public long getTimerEnchendo() {
        return timerEnchendo;
    }

    private void setTimerEnchendo(long timerEnchendo) {
        this.timerEnchendo = timerEnchendo;
    }

    public long getTimerSecando() {
        return timerSecando;
    }

    private void setTimerSecando(long timerSecando) {
        this.timerSecando = timerSecando;
    }
    
}
