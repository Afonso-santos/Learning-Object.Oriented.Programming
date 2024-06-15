public class telemovel{
    private String marca;
    private String marca;
    private String modelo;
    private int x;
    private int y;
    // Dimensoes
    private int numeroMensagens;
    private String[] mensagens;
    private int armazenamento;
    private int armazenamentoFotos;
    private int armazenamentoApps;
    private int espacoOcupado;

    private int fotos;
    private int apps;
    private String[] appNomes

   

    public boolea existeEspaco(int numeroBytes){
        if(this.getArmazenamento >= this.getEspacoOcupado + numeroBytes){
            return true;
        }

        return false;
    } 

    public void instalaApp(String nome, int tamanho){
        if (this.existeEspaco(tamanho)){

            this.appNomes[this.getApps()] = new String(nome);

            this.setApps(this.getApps() + 1);
            this.setArmazenamentoApps(this.getArmazenamentoApps + tamanho);
            this.setEspacoOcupado(this.getEspacoOcupado +tamanho);
        }

    }

    public void recebeMsg(String msg){
        
        int n = this.getNumeroMensagens;

        String[] novo = new String[n+1];


        System.arraycopy(this.mensagens,0,novo,0,n);    
        
        novo[n+1]= msg

        this.setMensagens(novo);

        this.setNumeroMensagens(n+1);
    }


    public double tamMedioApps(){
        return this.getArmazenamentoApps() / this.getApps();
    }

    public String maiorMsg(){
        int max =0;
        String maior ="";
        
        String[] aux =this.getMensagens();

        for(String msg : aux){
            if(msg.length() >max){
                maior =msg ;
                max = msg.lengh;
            }
        }
        
        return maior;
    }
    

    public void removeApp(String nome, int tamanho){
        int index =-1;

        for(int i=0; i< this.apps && index==-1 ; i++){
            if(app.equals(nome))
                index=i;
                
        }
        
        if(index != -1){
            String[]novo = Sring[ this.apps-1];
            System.arraycopy(this.appNomes,0,novo,0,index);
            System.arraycopy(this.appNomes,index+1,novo,index,this.app-index-1);

            this.setAppNomes(novo);
            this.setApps( this.getApps() --);
        }
    }









    public telemovel(){
        this.marca = "";
        this.modelo = "";
        this.x = 0;
        this.y = 0;
        this.numeroMensagens = 0;
        this.mensagens = new String[100];
        this.armazenamento = 0;
        this.armazenamentoFotos = 0;
        this.armazenamentoApps = 0;
        this.espacoOcupado = 0;
        this.fotos = 0;
        this.apps = 0;
        this.appNomes = new String[100];

    } 

    public telemovel(String marca, String modelo, int x, int y, int numeroMensagens, String[] mensagens, int armazenamento, int armazenamentoFotos, int armazenamentoApps, int espacoOcupado, int fotos, int apps, String[] appNomes){
        this.marca = new String(marca);
        this.modelo = new String(modelo);
        this.x = x;
        this.y = y;
        this.numeroMensagens = numeroMensagens;
        this.mensagens = mensagens;
        this.armazenamento = armazenamento;
        this.armazenamentoFotos = armazenamentoFotos;
        this.armazenamentoApps = armazenamentoApps;
        this.espacoOcupado = espacoOcupado;
        this.fotos = fotos;
        this.apps = apps;
        this.appNomes = appNomes;
    }


    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public int getNumeroMensagens(){
        return this.numeroMensagens;
    }

    public String[] getMensagens(){
        new String[this.mensagens.length];
        for(int i = 0; i < this.mensagens.length; i++){
            mensagens[i] = new String(this.mensagens[i]);
        }

        return mensagens;
    }

    public int getArmazenamento(){
        return this.armazenamento;
    }

    public int getArmazenamentoFotos(){
        return this.armazenamentoFotos;
    }

    public int getArmazenamentoApps(){
        return this.armazenamentoApps;
    }

    public int getEspacoOcupado(){
        return this.espacoOcupado;
    }

    public int getFotos(){
        return this.fotos;
    }

    public int getApps(){
        return this.apps;
    }

    public String[] getAppNomes(){
        new String[this.appNomes.length];
        for(int i = 0; i < this.appNomes.length; i++){
            appNomes[i] = new String(this.appNomes[i]);
        }

        return appNomes;
    }

    public void setMarca(String marca){
        this.marca = new String(marca);
    }

    public void setModelo(String modelo){
        this.modelo = new String(modelo);
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public void setNumeroMensagens(int numeroMensagens){
        this.numeroMensagens = numeroMensagens;
    }

    public void setMensagens(String[] mensagens){
        this.mensagens = new String[mensagens.length];
        for(int i = 0; i < mensagens.length; i++){
            this.mensagens[i] = new String(mensagens[i]);
        }
    }

    public void setArmazenamento(int armazenamento){
        this.armazenamento = armazenamento;
    }

    public void setArmazenamentoFotos(int armazenamentoFotos){
        this.armazenamentoFotos = armazenamentoFotos;
    }

    public void setArmazenamentoApps(int armazenamentoApps){
        this.armazenamentoApps = armazenamentoApps;
    }

    public void setEspacoOcupado(int espacoOcupado){
        this.espacoOcupado = espacoOcupado;
    }

    public void setFotos(int fotos){
        this.fotos = fotos;
    }


    public void setApps(int apps){
        this.apps = apps;
    }

    public void setAppNomes(String[] appNomes){
        this.appNomes = new String[appNomes.length];
        for(int i = 0; i < appNomes.length; i++){
            this.appNomes[i] = new String(appNomes[i]);
        }
    }

 

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Marca: ").append(this.marca).append("\n");
        sb.append("Modelo: ").append(this.modelo).append("\n");
        sb.append("Coordenadas: (").append(this.x).append(", ").append(this.y).append(")\n");
        sb.append("Numero de mensagens: ").append(this.numeroMensagens).append("\n");
        sb.append("Mensagens: ").append("\n");
        for(int i = 0; i < this.mensagens.length; i++){
            sb.append(this.mensagens[i]).append("\n");
        }
        sb.append("Armazenamento: ").append(this.armazenamento).append("\n");
        sb.append("Armazenamento de fotos: ").append(this.armazenamentoFotos).append("\n");
        sb.append("Armazenamento de apps: ").append(this.armazenamentoApps).append("\n");
        sb.append("Espaco ocupado: ").append(this.espacoOcupado).append("\n");
        sb.append("Fotos: ").append(this.fotos).append("\n");
        sb.append("Apps: ").append(this.apps).append("\n");
        sb.append("Nomes das apps: ").append("\n");
        for(int i = 0; i < this.appNomes.length; i++){
            sb.append(this.appNomes[i]).append("\n");
        }

        return sb.toString();
    }
    
    public  boolean equals(Object o){
        if(this==0) return true;
        if(o== null|| o.getClass() != this.getClass()) return false;

        telemovel tele = (telemovel) o;

        return this.marca.equals(tele.getMarca()) && this.modelo.equals(tele.getModelo()) && this.x == tele.getX() && this.y == tele.getY() && this.numeroMensagens == tele.getNumeroMensagens() && this.mensagens.equals(tele.getMensagens()) && this.armazenamento == tele.getArmazenamento() && this.armazenamentoFotos == tele.getArmazenamentoFotos() && this.armazenamentoApps == tele.getArmazenamentoApps() && this.espacoOcupado == tele.getEspacoOcupado() && this.fotos == tele.getFotos() && this.apps == tele.getApps() && this.appNomes.equals(tele.getAppNomes());
    }

    public telemovel clone(){
        return new telemovel(this);
    }
}