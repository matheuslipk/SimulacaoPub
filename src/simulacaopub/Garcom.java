package simulacaopub;

public class Garcom {
    final static int LIVRE = 1;
    final static int ENCHENDO_COPO = 2;
    
    private int statusAtual = Garcom.LIVRE;
    private long timerEnchendoCopo;

    public int getStatusAtual() {
        return statusAtual;
    }

    public void setStatusAtual(int statusAtual) {
       if(statusAtual==Garcom.ENCHENDO_COPO){
          setTimerEnchendoCopo(System.currentTimeMillis());
       }
        this.statusAtual = statusAtual;
    }
    
    public long getTimerEnchendoCopo(){
       return this.timerEnchendoCopo;
    }
    
    private void setTimerEnchendoCopo(long timer){
       this.timerEnchendoCopo = timer;
    }
    
}
