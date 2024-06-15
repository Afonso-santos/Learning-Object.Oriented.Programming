public class LinhaEncomenda{

    private String referencia;
    private String descricao;
    private double preco;
    private int quantidade;
    private int imposto;
    private int descontoComercial;


    public double calculaValorLinhaEnc(){

        return this.preco * this.quantidade * (1+ this.imposto * 100) * (1-this.descontoComercial*100);
    }

    public double calculaValorDesconto(){
        return this.preco * this.quantidade * (1-this,descontoComercial*100);
    }

    public LinhaEncomenda(){
        this.referencia ="";
        this.descricao="";
        this.preco =0;
        this.quantidade =0;
        this.imposto=0;
        this.descontoComercial=0;
    }

    public LinhaEncomenda (String referencia, String descricao , double preco, int quantidade, int imposto , int descontoComercial ){
        this.referencia=referencia;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
        this.imposto = imposto;
        this.descontoComercial= descontoComercial;
    }

    public void setReferencia( String referencia){
        this.referencia= referencia;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void setPreco( double preco){
        this.preco = preco;
    }

    public void setQuantidade(int quantidade){
        this.quantidade=quantidade;
    }
    public void setImposto(int imposto){
        this.imposto=imposto;
    }
    public void setDescontoComercial(int descontoComercial){ 
        this.descontoComercial=descontoComercial;
    }

    public String getReferencia(){
        return this.referencia;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public double getPreco(){
        return this.preco;
    }


    public int getQuantidade(){
        return this.quantidade;
    }

    public int getImposto(){
        return this.imposto;
    }

    public int getDescontoComercial(){
        return this.descontoComercial;
    }   


    public boolean equals(Object o){
        if(o == this)return true;

        if(o == null || o.getClass() != this.getClass()) return false;


        LinhaEncomenda le = (LinhaEncomenda) o ;
        return le.equals(this.referencia) && le.equals(this.descricao) && le.preco = this.preco && le.quantidade = this.quantidade && le.imposto == this.imposto && le.descontoComercial == this.descontoComercial;
    }

    public LinhaEncomenda clone(){
        return new LinhaEncomenda(this);
    }



}