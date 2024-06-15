public class Lugar{
    private String matricula;

    private String nome;
    private int minutos;
    private boolean permanente;

    public Lugar(){
        this.matricula="";
        this.nome="";
        this.minutos=0;
        this.permanente = false ;
    }

    public Lugar ( String matricula, String nome, int min , boolean permanente){
        this.matricula=matricula;
        this.nome=nome;
        this.minutos= min;
        this.permanente=permanente;
    }

    public Lugar( Lugar l){
        this(l.matricula,l.nome,l.minutos,l.permanente);
    }

    public boolean equals(Object o){
        if(this == o) return true;

        if(o == null || o.getClass() != this.getClass()){
            return false;
        }

        Lugar lu = (Lugar) o;
       
        return this.matricula.equals(lu.matricula) && this.nome.equals(nome) && this.minutos == lu.minutos &&  this.permanente == lu.permanente; 
    }

    public Lugar clone(){
        return new Lugar(this);
    }

    public void setMatricula(String matricula){
        this.matricula= matricula;
    }

    public void setNome(String nome){
       this.nome= nome;
    }

    public void setMinutos(int minutos){
        this.minutos =minutos;
    }

    public void setPermanente(boolean valor){
        this.permanente=permanente;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public String getNome(){
        return this.nome;
    }

    public int getMinutos(){
        return this.minutos;
    }

    public boolean getPermanente(){
        return this.permanente;
    }




}