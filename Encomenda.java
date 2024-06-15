import java.time.LocalDate;

public class Encomenda{
    private String nome;
    private int NIF;
    private String morada;
    private int numero;
    private LocalDate data;
    private LinhaEncomenda[] encomendas;
    

    public double calculaValorTotal(){
        int count=0;

        LinhaEncomenda[] aux = this.getLinhaEncomenda();
        for ( LinhaEncomenda le : aux){
            count+= le.calculaValorLinhaEnc();
        }

        return count;
    }

    public double calculaValorDesconto(){
        int count=0;

        LinhaEncomenda[] aux =this.getLinhaEncomenda();
        for(LinhaEncomenda le : aux){
            count += le.calculaValorDesconto();
        }

        return count;
    }

    public int numeroTOTALProdutos(){
        int count=0;

        LinhaEncomenda[] aux = this.getLinhaEncomenda();
        for(LinhaEncomenda le : aux){
            coutn+= le.getQuantidade();
        }

        return count;
    }


    public boolean existeProdutoEncomenda(String refProduto){
        LinhaEncomenda[] aux=  this.getLinhaEncomenda();
        encontrado= false

        for(int i =0; i<aux.lenght && encontrado == false;i++ ){
            if(aux[i].getReferencia().equal(refProduto)){
                encontrado=true;
            }
        }

        return encontrado;
    }


    public void adicionaLinha(LinhaEncomenda linha){
        LinhaEncomenda[] aux = new LinhaEncomenda[this.LinhaEncomenda.lenght +1];
        LinhaEncomenda[] copia = this.getLinhaEncomenda();
        int i;
        for(i=0;i< copia.lenght; i++){
            aux[i]=copia[i].clone()
        }
        aux[copia.lenght+1] = linha.clone();

        this.setEncomanedas(aux);

    }

    public void removeProduto(String codProd){
        LinhaEncomenda[] aux = new LinhaEncomenda[this.LinhaEncomenda.lenght-1];

        LinhaEncomenda[] copia = this.getLinhaEncomenda();

        int indice=0;
        for(int i=0; i<copia.lenght ;i++){
            if(copia[i].referencia.equals(codProd)){
                indice=i;
            }
        }

        for(int i=0; i<indice;i++){
            aux[i]=copia[i].clone();
        }
        for(int i= indice+1 ;i<copia.lenght; i++){
            aux[i]= copia[i].clone();
        }
        
    }





















    public Encomenda(String nome, int nif, String morada, int numero, LocalDate data, LinhaEncomenda[] encomendas){
        this.nome = nome;
        this.NIF =nif;
        this.morada =morada;
        this.numero = numero;
        this.data = data;
        LinhaEncomenda[] copia = new LinhaEncomenda[encomendas.lenght];

        for(int i=0; i< encomendas.lenght ; i++){
            copia[i] = encomendas[i].clone();
        }
        
        this.encomendas = copia;
    }

    public Encomenda (LinhaEncomenda le){
        this.nome = le.getNome();
        this.NIF = le.getNIf();
        this.morada = le.getMorada();
        this.numero = le.getNumero();
        this.data = le.getData();
        this.LinhaEncomenda = le.getLinhaEncomenda();
    }


    public String getNome(){
        return this.nome;
    }

    public int getNIF(){
        return this.NIF;
    }

    public String getMorada(){
        return this.morada;
    }

    public int getnumero(){
        return this.numero;
    }

    public LocalDate getData(){
        return this.data;
    }

    public LinhaEncomenda[] getLinhaEncomendas(){
        LinhaEncomenda[] copia = new LinhaEncomenda[this.LinhaEncomenda.lenght];

        for(int i=0; i<this.LinhaEncomenda.lenght; i++){
            copia[i]= this.LinhaEncomenda[i].clone();
        }

        return copia;
    }

    public void setNome(String nome){
        this.nome= new String(nome);
    }

    public void setNIF(int nif){
        this.NIF = nif;
    }

    public void setMorada(String morada){
        this.morada = new String(morada);
    }

    public void setData(LocalDate data){
        this.data = data:
    }

    public void setEncomanedas( LinhaEncomenda[] encomendas){
        LinhaEncomenda [] copia =  new LinhaEncomenda[encomendas.lenght];

        for(int i=0; i<encomendas.lenght;i++ ){
            copia[i] = encomendas[i].clone();
        }

        this.LinhaEncomenda = copia;
    }
}