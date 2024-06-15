import java.util.ArrayList;

public class Stack{

    private ArrayList<String> valores;

    public Stack(){
        this.valores= new ArrayList<String>();
    }

    public Stack(ArrayList<String> a){

        this.valores = new ArrayList<String>(a);
    }

    public Stack(Stack s){
        
        this(s.valores);
    }


    public String top(){

        return this.valores.get(this.valores.size()-1);
    }

    public void push(String s){
        this.add(s);
    }

    public void pop(){
        this.remove(this.valores.sizer -1);
    }

    public  boolean empty(){
       return this.valores.isEmpty();
    }

    public int lenght(){
        return this.size();
    }

}