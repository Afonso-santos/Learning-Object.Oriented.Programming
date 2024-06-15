public class lampada{

    

    private static int on = 10;
    private static int eco =5;
    private static int off =0;

    private int consumo;
    private int consumo_total;
    private long tempo;

   



    public void lampOn(){
        if(this.consumo != off {
            this.setConsumoTotal( this.getConsumoTotal() + this.getConsumo() * (System.currentTimeMillis() - this.getTempo())   )
        }

        this.setConsumo(on);
        this.setTempo(System.currentTimeMillis());
    }


    public void lampOFF(){
        
        this.setConsumoTotal( this.getConsumoTotal()+  this.getConsumo() *(System.currentTimeMillis() - this.getTempo() ))

        this.setConsumo(off);
    }

    public void lampECO(){
        if(this.consumo != eco){
            this.setConsumoTotal( this.getConsumoTotal() + this.getConsumo() * (System.currentTimeMillis - this.getTempo))
        }
        
        this.setConsumo(eco);   
        this.setTempo(System.currentTimeMillis());
    }

    public double totalConsumo(){
        return this.getConsumoTotal;
    }

    public double periodoConsumo(){
        return this.getConsumoTotal() + this.getConsumo() * (System.currentTimeMillis - this.getTempo);
    }

    public lampada(){
        this.consumo=on;
        this.consumo_total=0;
        this.tempo=0;
        this
    }

    public lampada(int consumo, int consumo_total, long tempo, modo estado){
        this.consumo=consumo;
        this.consumo_total=consumo_total;
        this.tempo=tempo;
        this.estado=estado;
    }

    
    public int getConsumo(){
        return this.consumo;
    }

    public int getConsumoTotal(){
        return this.consumo_total;
    }

    public long getTempo(){
        return this.tempo;
    }

    public modo getEstado(){
        return this.estado;
    }

    public void setConsumo(int consumo){
        this.consumo=consumo;
    }

    public void setConsumoTotal(int consumo_total){
        this.consumo_total=consumo_total;
    }

    public void setTempo(long tempo){
        this.tempo=tempo;
    }

    public void setEstado(modo estado){
        this.estado=estado;
    }




}

