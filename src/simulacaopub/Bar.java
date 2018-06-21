package simulacaopub;

public class Bar {
    private final int tempoEncher = 3;
    private final int tempoBeber = 4;

    private final int quantClientes = 3;
    private final int quantCopos = 3;
    private final int quantGarcom = 1;
    
    private Copo copos[];
    private Cliente clientes[];
    private Garconete gr[];
    
    public Bar(){
        inicializarClientes();
        inicializarCopos();
        inicializarGarcons();
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
    
    public Copo getCopoLivre(){
        for(int i=0; i<this.copos.length; i++){
            if(this.copos[i].getStatusAtual()==Copo.LIVRE){
                return this.copos[i];
            }
        }
        return null;
    }
    
    @Override
    public String toString(){
        String texto = "";
        texto+=(getQuantClientesAguardandoCopo()+" clientes aguardando copo\n");
        texto+=(getQuantCoposLivres()+" copos livres\n");
        texto+=(getQuantGarcomLivre()+ " garçons livres");
        return texto;
    }
    
    private void inicializarClientes(){
        this.clientes = new Cliente[quantClientes];
        for(int i=0; i<this.clientes.length; i++){
            this.clientes[i] = new Cliente();
        }
    }
    
    private void inicializarCopos(){
        this.copos = new Copo[quantCopos];
        for(int i=0; i<this.copos.length; i++){
            this.copos[i] = new Copo();
        }
    }
    
    private void inicializarGarcons(){
        this.gr = new Garconete[quantGarcom];
        for(int i=0; i<this.gr.length; i++){
            this.gr[i] = new Garconete();
        }
    }
    
}


