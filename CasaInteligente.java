
import java.util.ArrayList;
import java.util.stream.Collectors;

public class CasaInteligente{
    private ArrayList<lampada> lampadas;

    public CasaInteligente(){
        this.lampadas  = new ArrayList<List>();
    }


    public CasaInteligente(CasaInteligente c){
        this.lampadas = new ArrayList<lampada>();

        for(lampada l : c.lampada){
            this.lampadas.add(new lampada(l));
        }

    }

    void ArrayList<lampada> getLampadas(){
        return this.stream().map(lampada::clone).collect(Collectors.toCollection(ArrayList::new));
    }

    public void addLampada(lampada l){
        this.lampadas.add(l.clone());
    }

    public void ligaLamapadaNormal(int index){
        lampada copia = this.lampadas.get(index);
        copia.lampOn();

        this.lampadas.set(index, copia);

    }

    public void ligaLampadaEco( int index){
        lamapa copia = this.lampadas.get(index);
        copia.lampECO();

        this.lampadas.set(index , copia);
    }

    public int qtEmEco(){
        return (int)  this.lampadas.stream().filter(a->a.getConsumo().equals(eco)).count();
    }

    public void removeLampada(int index){
        this.lampadas.remove(index);
    }

    public void ligaTodasEco(){
        this.lampadas.forEach(lamp::lampECO);
    }


    public void ligaTodasMax(){
        this.lampadas.forEach(lamp::lampOn);
    }

    public double consumoTota(){
        return this.lampadas.mapToDouble(lamp::getConsumoTotal).sum();
    }

    public void reset(){
        this.lampadas.forEach(lamp::lampOFF);
    }

    public CasaInteligente ( ArrayList<lampada> lis){
        this.lampadas =lis.stream().map(lampada::clone).Collectors(Collectors.toCollection(ArrayList::new));
    }

    public CasaInteligente clone(){
        return new CasaInteligente(this);
    }

    public boolean equals (Object o){
        if(this==0) return true;

        if(o == null || o.getClass()!= this.getClass()) return false;

        CasaInteligente aux = (CasaInteligente) o;
        return aux.lampadas.equal(this.lampadas)
    }




}