package simulacaopub;

public class Cliente {
    final static int AGUARDANDO_COPO = 1;
    final static int AGUARDANDO_GARCOM = 2;
    final static int COPO_ENCHENDO = 3;
    final static int COPO_CHEIO = 4;
    final static int BEBENDO = 5;
    final static int TERMINOU_BEBER = 6;
    
    
    private int statusAtual;
    private long timerCopoEnchendo;
    private long timerBebendo;
    private long timerBeberTerminou;

    public int getStatusAtual() {
        return statusAtual;
    }

    public void setStatusAtual(int statusAtual) {
        this.statusAtual = statusAtual;
    }

    public long getTimerCopoEnchendo() {
        return timerCopoEnchendo;
    }

    public void setTimerCopoEnchendo(long timerCopoEnchendo) {
        this.timerCopoEnchendo = timerCopoEnchendo;
    }

    public long getTimerBebendo() {
        return timerBebendo;
    }

    public void setTimerBebendo(long timerBebendo) {
        this.timerBebendo = timerBebendo;
    }

    public long getTimerBeberTerminou() {
        return timerBeberTerminou;
    }

    public void setTimerBeberTerminou(long timerBeberTerminou) {
        this.timerBeberTerminou = timerBeberTerminou;
    }
}
