
import java.time.LocalDateTime;
import java.util.ArrayList;

public class FBPost{
    private int id;
    private String nome;
    private LocalDate date;
    private String conteudo
    private int likes;
    private ArrayList<String> comentarios;


    public FBPost( int id,String nome , LocalDateTime data , String cont , int like, ArrayList<String> coments){
        this.id =id;
        this.nome = nome;
        this.data =data;
        this. conteudo = cont;
        this.likes=likes;
        this.coments = new ArrayList<String>(coments);
    }

    public FBPost(FBPost f){
        this(f.id ,f.nome,f.data ,f.conteudo, f.likes, f.comentarios)
    }

    public void setId(int i) {
        this.id = i;
    }
    public void setUtilizador(String u) {
        this.utilizador = u;
    }
    public void setData(LocalDateTime d) {
        this.data = LocalDateTime.of(d.toLocalDate(), d.toLocalTime());
    }
    public void setConteudo(String c) {
        this.conteudo = c;
    }
    public void setLikes(int l) {
        this.likes = l;
    }
    public void setComentarios(ArrayList<String> c) {
        this.comentarios = new ArrayList<String>(c);
    }

    public int getId() {
        return this.id;
    }
    public String getUtilizador() {
        return this.utilizador;
    }
    public LocalDateTime getData() {
        return LocalDateTime.of(this.data.toLocalDate(), this.data.toLocalTime());
    }
    public String getConteudo() {
        return this.conteudo;
    }
    public int getLikes() {
        return this.likes;
    }
    public ArrayList<String> getComentarios() {
        return new ArrayList<String>(this.comentarios);
    }
    
    void FBPost clone(){
        return new FBPost(this);
    }
    

    public boolean equals(Object o){
        if(this == o) return true;

        if(o == null || o.getClass() != this.getClass())return false;

        FBPost fb = (FBPost) o;
        return fb.id == this.id && fb.nome.equals(this.nome) && this.data.equals(fb.data) && this.conteudo.equals(fb.conteudo) && this.likes == fb.likes &&  this.comentarios.equals(fb.comentarios);
    }
}