import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class SistemadeSuporte{

    ArrayList<PedidodeSuporte> pedidos;    

    public SistemadeSuporte(){
        this(new ArrayList<PedidodeSuporte> ps);   
    }

    public SistemadeSuporte(ArrayList<SistemadeSuporte> ps ){
        this.pedidos = new ArrayList<PedidodeSuporte>();

        for(PedidodeSuporte sup : ps){
            this.pedidos.add(sup.clone());
        }
    }

    public SistemadeSuporte ( SistemadeSuporte ss){
        this(ss.pedidos);
    }

    public ArrayList<SistemadeSuporte> getPedidos(){
        ArrayList<SistemadeSuporte>tp = new ArrayList<PedidodeSuporte> ps ;

        for(SistemadeSuporte ss : this.pedidos){
            tp.add(ss.clone());
        }

        return tp;
    }

    
    
    public SistemadeSuporte clone(){
        return new SistemadeSuporte(this);
    }

    public PedidodeSuporte procuraPedido(String user,LocalDateTime data){
        ArrayList<PedidodeSuporte> ps = this.getPedidos();

        PedidodeSuporte sup = ps.stream().filter(a->a.getNome().equals(user) && a.getDate().equals(data)).findFirst().orElse(null);

        if(sup!=null) return sup.clone();
        return null
    }

    public void resolvePedido(PedidodeSuporte pedido,String tecnico, String info){
        int index;
        boolean encontrado = false;
        for(index=0;index<this.pedidos.size() && encontrado!=true; i++){
            
            encontrado=this.pedidos[i].equals(pedido)
        }
        
        PedidodeSuporte ps = this.pedidos.get(--index);

        ps.setTratado(tecnico);
        ps.setDescricao(info);

        this.pedidos.set(index, ps);

    }

    public List<PedidodeSuporte> resolvidos(){
        return this.pedidos.stream().filter(a -> ! a.getTratado() !=null).collect(Collectors.toList());
    }

    public String colaboradorTop(){
        ArrayList<PedidodeSuporte> lista = new ArrayList<>(this.pedidos);
        int max = -1;
        String colab = "";
        int resolvidos;
        for (PedidodeSuporte ped : lista) {
            resolvidos = (int) lista.stream().filter(a->a.getTratado().equals(ped.getTratado())).count();
            if (resolvidos > max) {
                max = resolvidos;
                colab = ped.getTratado();
            }
        }
        return colab;
    }

    public List<PedidodeSuporte>resolvidos(LocalDateTime inicio, LocalDateTime fim){
        return this.pedidos.stream().filter(a->a.getDate().isAfter(inicio) && a.getData().isBefore(fim) && a.getTratado()!=null).collect(Collectors.toList());
    }

    public double tempoMedioResolucao(){
         List aux =this.pedidos.stream().filter(a -> a.getDataTratado() != null).mapToDouble(a-> Timediff(a.getDataTratado() -a.getData())).collect(Collectiors.toList());


         return aux.sum() / aux.size;
    }

    

}