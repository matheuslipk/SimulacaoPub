package simulacaopub;

public class Garconete {
    final static int LIVRE = 1;
    final static int OCUPADO = 2;
    
    private int statusAtual = Garconete.LIVRE;

    public int getStatusAtual() {
        return statusAtual;
    }

    public void setStatusAtual(int statusAtual) {
        this.statusAtual = statusAtual;
    }
    
}
