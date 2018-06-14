package simulacaopub;

public class Copo {
    final static int LIVRE = 1;
    final static int VAZIO = 2;
    final static int ENCHENDO = 3;
    final static int CHEIO = 4;
    final static int SECANDO = 5;
    
    
    private int statusAtual;
    private long timerEnchendo;
    private long timerSecando;

    public int getStatusAtual() {
        return statusAtual;
    }

    public void setStatusAtual(int statusAtual) {
        this.statusAtual = statusAtual;
    }

    public long getTimerEnchendo() {
        return timerEnchendo;
    }

    public void setTimerEnchendo(long timerEnchendo) {
        this.timerEnchendo = timerEnchendo;
    }

    public long getTimerSecando() {
        return timerSecando;
    }

    public void setTimerSecando(long timerSecando) {
        this.timerSecando = timerSecando;
    }
    
}
