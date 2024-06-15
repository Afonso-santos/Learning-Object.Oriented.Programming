import java.lang.Math;


public class Circulo {
    
    private double x;
    private double y;
    private double radio;


    public Circulo(){
        this.x=0;
        this.y=0;
        this.radio=0;
    }
    
    public Circulo(double x, double y, double radio){
        this.x=x;
        this.y=y;
        this.radio=radio;
    }

    public Circulo( Circulo c){
        this.x=c.x;
        this.y=c.y;
        this.radio= c.radio;

        // ou

        this(c.getX(),c.getY(),c.getRadio());
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public double getRadio(){
        return this.radio;
    }

    public void setX( double x){
        this.x=x;
    }

    public void setY(double y){
        this.y=y;
    }

    public void setRadio(double radio){
        this.radio=radio;
    }

    public void  alteraCentro ( double x, double y){
        this.setX(x);
        this.setY(y);
    }

    public double calculaArea(){

       return  Math.PI * this.radio ^2

    }

    public double perimetro(){
        return Math.PI *2*this.radio;
    }


    public boolean equal(Object c){
        if(this == c) return true;

        if(c == null || this.getClass() != c.getClass()) return false;

        Circulo cir = (Circulo) c;
        return this.x== cir.x && this.y== cir.y && this.radio =radio;
    }


    public Circulo clone(){
        return new Circulo(this); 
    }

}

