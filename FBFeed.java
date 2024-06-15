
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FBFeed{

    ArrayList<FBPost> posts;

    public FBFeed (){
        this(new ArrayList<FBPost>());        
    }

    public FBFeed(ArrayList <FBFpost> lista){
        this.posts = new ArrayList<FBFpost>();

        for(FBFpost fb : lista){
            this.post.add(fb.clone());
        }
    }

    public FBFeed (FBFeed fbf){
        this(fbf.posts);
    }

    public int nrPosts(String user){
        return this.posts.filter(a->a.getUtilizador().equals(user)).count();
    }

    public List<FBFpost> postsOf(String user){
        return this.posts.filter(a->a.getUtilizador().equals(user).collect(Collectiors.tolist()))
    }

    public List<FBPost> postsOf(String user, LocalDateTime inicio, LocalDateTime fim){
        return this.post.filter(a->a.getUtilizador().equals(user) &&
                                !a.getData().isBefore(inicio) &&
                                !a.getData(),isAfter(fim))
                                .collect(Collectors.toList());
    }

    public FBPost getPost( int id){
        FBPost post= this.post.stream().filter(a->a.getId() == id ).findFirst();
        
        if(post == null) return null;
        return post.clone();
    }

    public void comment(FBPost post, String comentario){
       FBPost aux = this.post.stream().filter(a->a.getId == post.getId());

       ArrayList<String> aux1 = aux.getComentarios();

       aux1.add(comentario);
        
       aux.setComentarios(aux1);

       this.posts.set(aux);
    }

    public void comment(int postid, String comentario){
        FBpost post = (FBpost) this.posts.stream().filter(a->a.getId == id);
        
        ArrayList<String> aux1 = aux.getComentarios();

        aux1.add(comentario);
         
        aux.setComentarios(aux1);
 
        this.posts.set(aux);
    }

    public void like(FBPost post){
        int numLikes= post.getLikes();
        post.setLikes(numLikes+1);

        int index=0;
        boolean encontrado = false;
        for(index=0;index<this.posts.size() && encontrado ==false ;i++){
            if(this.posts[index].getId() == post.getId()){
                encontrado = true;
            }
        }

        if(encontrado){
            this.posts.set( index , post);
        }
    }

    public List<Integer> top5Comments(){

        return posts.stream()
                    .map(post -> Map.entry(post.getId(), post.getComentarios().size()))
                    .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                    .limit(5)
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toList());

    }










    public FBFeed clone(){
        return new FBFeed(this);
    }

    public boolean equals(Object o){
        if(o == this){
            return true;
        }

        if(o== null || o.getClass() != this.getClass()) return false;

        FBFeed fbf = (FBFeed) o;
        boolean igual =true;
        for(int i=0; i<fbf.posts.size() ;i++){
            igual= fbf.posts.get(i).equals(this.post.get(i));
        }

        return igual;
    }
}