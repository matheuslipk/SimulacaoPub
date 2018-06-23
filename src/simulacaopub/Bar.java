package simulacaopub;

public class Bar implements Runnable{
    static final long TEMPO_ENCHER_COPO = 3000;
    static final long TEMPO_BEBER = 4000;

    private final int quantClientes = 3;
    private final int quantCopos = 3;
    private final int quantGarcom = 1;
    
    private final long tempoInicial;
    private Copo copos[];
    private Cliente clientes[];
    private Garcom gr[];
    
    public Bar(){
        inicializarClientes();
        inicializarCopos();
        inicializarGarcons();
        this.tempoInicial = System.currentTimeMillis();
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
        int quantClientesAguardando = 0;
        for(int i=0; i<clientes.length; i++){
            if(clientes[i].getStatusAtual()==Cliente.AGUARDANDO_GARCOM){
                quantClientesAguardando++;
            }
        }
        return quantClientesAguardando;
    }
    
    public int getQuantClientesCopoEnchendo(){
        int quantClientesCopoEnchendo = 0;
        for(int i=0; i<clientes.length; i++){
            if(clientes[i].getStatusAtual()==Cliente.COPO_ENCHENDO){
                quantClientesCopoEnchendo++;
            }
        }
        return quantClientesCopoEnchendo;
    }
    
    public int getQuantClientesTerminouEncher(){
        int quantClientesTerminouEncher = 0;
        for(int i=0; i<clientes.length; i++){
            if(clientes[i].getStatusAtual()==Cliente.COPO_ENCHENDO && (System.currentTimeMillis() - this.clientes[i].getTimerCopoEnchendo())>=Bar.TEMPO_ENCHER_COPO){
                quantClientesTerminouEncher++;
            }
        }
        return quantClientesTerminouEncher;
    }
    
    public int getQuantClientesCopoCheio(){
        int quantClientesCopoCheio = 0;
        for(int i=0; i<clientes.length; i++){
            if(clientes[i].getStatusAtual()==Cliente.COPO_CHEIO){
                quantClientesCopoCheio++;
            }
        }
        return quantClientesCopoCheio;
    }
    
    public int getQuantClientesBebendo(){
        int quantClientesCopoCheio = 0;
        for(int i=0; i<clientes.length; i++){
            if(clientes[i].getStatusAtual()==Cliente.BEBENDO){
                quantClientesCopoCheio++;
            }
        }
        return quantClientesCopoCheio;
    }
    
    public int getQuantClientesTerminouBeber(){
        int quantClientes = 0;
        for(int i=0; i<clientes.length; i++){
            if(clientes[i].getStatusAtual()==Cliente.BEBENDO && (System.currentTimeMillis() - this.clientes[i].getTimerBebendo())>=Bar.TEMPO_BEBER){
                quantClientes++;
            }
        }
        return quantClientes;
    }
    
    public int getQuantGarcomLivre(){
        int quantGarcom = 0;
        for(int i=0; i<this.gr.length; i++){
            if(gr[i].getStatusAtual()==Garcom.LIVRE){
                quantGarcom++;
            }
        }
        return quantGarcom;
    }
    
    public int getQuantGarcomEnchendoCopo(){
        int quantGarcom = 0;
        for(int i=0; i<this.gr.length; i++){
            if(gr[i].getStatusAtual()==Garcom.ENCHENDO_COPO){
                quantGarcom++;
            }
        }
        return quantGarcom;
    }
    
    public int getQuantGarcomTerminouEncher(){
        int quantGarcom = 0;
        for(int i=0; i<this.gr.length; i++){
            if(gr[i].getStatusAtual()==Garcom.ENCHENDO_COPO && (System.currentTimeMillis() - gr[i].getTimerEnchendoCopo())>=Bar.TEMPO_ENCHER_COPO){
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
    
    public Cliente getClienteAguardandoCopo(){
        for(int i=0; i<this.clientes.length; i++){
            if(this.clientes[i].getStatusAtual()==Cliente.AGUARDANDO_COPO){
//                System.out.println(this.clientes[i]+" copo");
                return this.clientes[i];
            }
        }
        return null;
    }
    
    public Cliente getClienteAguardandoGarcom(){
        for(int i=0; i<this.clientes.length; i++){
            if(this.clientes[i].getStatusAtual()==Cliente.AGUARDANDO_GARCOM){
                return this.clientes[i];
            }
        }
        return null;
    }
    
    public Cliente getClienteTerminouEncher(){
        for(int i=0; i<this.clientes.length; i++){
            if(this.clientes[i].getStatusAtual()==Cliente.COPO_ENCHENDO && (System.currentTimeMillis() - this.clientes[i].getTimerCopoEnchendo()) >=Bar.TEMPO_ENCHER_COPO){
                return this.clientes[i];
            }
        }
        return null;
    }
    
    public Cliente getClienteCopoCheio(){
        for(int i=0; i<this.clientes.length; i++){
            if(this.clientes[i].getStatusAtual()==Cliente.COPO_CHEIO){
                return this.clientes[i];
            }
        }
        return null;
    }
    
    public Cliente getClienteTerminouBeber(){
        for(int i=0; i<this.clientes.length; i++){
            if(this.clientes[i].getStatusAtual()==Cliente.BEBENDO && (System.currentTimeMillis() - this.clientes[i].getTimerBebendo()) >=Bar.TEMPO_BEBER){
                return this.clientes[i];
            }
        }
        return null;
    }
    
    public Garcom getGarcomLivre(){
        for(int i=0; i<this.gr.length; i++){
            if(this.gr[i].getStatusAtual()==Garcom.LIVRE){
                return this.gr[i];
            }
        }
        return null;
    }
    
    public Garcom getGarcomEnchendoCopo(){
        for(int i=0; i<this.gr.length; i++){
            if(this.gr[i].getStatusAtual()==Garcom.ENCHENDO_COPO){
                return this.gr[i];
            }
        }
        return null;
    }
    
    @Override
    public String toString(){
        String texto = "----------------------------------------------\n";
        texto+="Tempo (s): "+(((System.currentTimeMillis()-this.tempoInicial)/1000)+"\n");
        texto+=("CLIENTES\n"+getQuantClientesAguardandoCopo()+" aguardando copo && ");
        texto+=(getQuantClientesAguardandoGarcom()+" aguardando garçom && ");
        texto+=(getQuantClientesCopoEnchendo()+" copo enchendo && ");
        texto+=(getQuantClientesBebendo()+ " bebendo\n");
        texto+=(getQuantCoposLivres()+" copos livres\n");
        texto+=(getQuantGarcomLivre()+ " garçons livres");
        return texto;
    }
    
    private void inicializarClientes(){
        this.clientes = new Cliente[quantClientes];
        for(int i=0; i<this.clientes.length; i++){
            this.clientes[i] = new Cliente("Cliente "+i);
        }
    }
    
    private void inicializarCopos(){
        this.copos = new Copo[quantCopos];
        for(int i=0; i<this.copos.length; i++){
            this.copos[i] = new Copo();
        }
    }
    
    private void inicializarGarcons(){
        this.gr = new Garcom[quantGarcom];
        for(int i=0; i<this.gr.length; i++){
            this.gr[i] = new Garcom();
        }
    }

    @Override
    public void run() {
        while(true){
            if(getQuantClientesAguardandoCopo()>=1 && getQuantCoposLivres()>=1){
                getCopoLivre().setStatusAtual(Copo.VAZIO);
                getClienteAguardandoCopo().setStatusAtual(Cliente.AGUARDANDO_GARCOM);
                System.out.println(this);
            }
            if(getQuantClientesAguardandoGarcom()>=1 && getQuantGarcomLivre()>=1){
                getClienteAguardandoGarcom().setStatusAtual(Cliente.COPO_ENCHENDO);    
                getGarcomLivre().setStatusAtual(Garcom.ENCHENDO_COPO);
                System.out.println(this);
            }
            if(getQuantGarcomTerminouEncher()>=1 && getQuantClientesTerminouEncher()>=1){
               getGarcomEnchendoCopo().setStatusAtual(Garcom.LIVRE);
               getClienteTerminouEncher().setStatusAtual(Cliente.COPO_CHEIO);
               System.out.println(this);
            }
            if(getQuantClientesCopoCheio()>=1){
               getClienteCopoCheio().setStatusAtual(Cliente.BEBENDO);
               System.out.println(this);
            }
            if(getQuantClientesTerminouBeber()>=1){
               getClienteTerminouBeber().setStatusAtual(Cliente.AGUARDANDO_GARCOM);
               System.out.println(this);
            }
            
            
//           try {
//              Thread.sleep(1);
//           } catch (InterruptedException ex) {
//           }
        }
    }
    
}


