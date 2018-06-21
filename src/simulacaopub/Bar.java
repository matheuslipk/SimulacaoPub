package simulacaopub;

public class Bar {
    final int tempoEncher = 3;
    final int tempoBeber = 4;

    final int quantClientes = 3;
    final int quantCopos = 3;
    final int quantGarcom = 1;
    
    private Copo copos[];
    public Cliente clientes[];
    private Garconete gr[];
    
    public Bar(){
        this.clientes = new Cliente[quantClientes];
        copos = new Copo[quantCopos];        
        gr = new Garconete[quantGarcom];
    }
    
    public int getQuantCoposLivres(){
        int quantCoposLivre = 0;
        for(int i=0; i<copos.length; i++){
            if(copos[i].getStatusAtual()==Copo.LIVRE){
                quantCoposLivre++;
            }            
        }
        return quantCoposLivre;
    }
    
    public int getQuantCoposCheios(){
        int quantCoposCheios = 0;
        for(int i=0; i<copos.length; i++){
            if(copos[i].getStatusAtual()==Copo.CHEIO){
                quantCoposCheios++;
            }            
        }
        return quantCoposCheios;
    }    
        
    public int getQuantCoposVazios(){
        int quantCoposVazios = 0;
        for(int i=0; i<copos.length; i++){
            if(copos[i].getStatusAtual()==Copo.VAZIO){
                quantCoposVazios++;
            }            
        }
        return quantCoposVazios;
    }
    
    public int getQuantClientesAguardandoCopo(){
        int quantClientesAguardando = 0;
        for (Cliente cliente : this.clientes) {
            if (cliente.getStatusAtual() == Cliente.AGUARDANDO_COPO) {
                quantClientesAguardando++;
            }
        }
        return quantClientesAguardando;
    }
    
    public int getQuantClientesAguardandoGarcom(){
        int quantClientes = 0;
        for(int i=0; i<clientes.length; i++){
            if(clientes[i].getStatusAtual()==Cliente.AGUARDANDO_GARCOM){
                quantClientes++;
            }
        }
        return quantClientes;
    }
    
    public int getQuantClientesTerminouBeber(){
        int quantClientes = 0;
        for(int i=0; i<clientes.length; i++){
            if(clientes[i].getStatusAtual()==Cliente.TERMINOU_BEBER){
                quantClientes++;
            }
        }
        return quantClientes;
    }
    
    public int getQuantGarcomLivre(){
        int quantGarcom = 0;
        for(int i=0; i<this.gr.length; i++){
            if(gr[i].getStatusAtual()==Garconete.LIVRE){
                quantGarcom++;
            }
        }
        return quantGarcom;
    }
    
    public int getQuantGarcomOcupado(){
        int quantGarcom = 0;
        for(int i=0; i<this.gr.length; i++){
            if(gr[i].getStatusAtual()==Garconete.OCUPADO){
                quantGarcom++;
            }
        }
        return quantGarcom;
    }
    
    private void inicializarClientes(){
        this.clientes = new Cliente[quantClientes];
        for(Cliente cliente : this.clientes){
            cliente = new Cliente();
        }
    }
}


