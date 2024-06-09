package examen2021.ex1;

public class Segment {
    private Point extr1 ; 
    private Point extr2 ;

    public Segment(Point extr1 , Point extr2){
        this.extr1=extr1;
        this.extr2=extr2;
    }

    public String toString(){
        return String.format("[nom de %s , nom de %s]" , extr1 , extr2);
    }

    public boolean estHorizontale() {
        boolean hor = false;
        if (extr1.getOrd() == (extr2.getOrd())) {
            hor = true;
        }
        return hor;
    }

    public boolean estVerticale(){
        return extr1.getAbs() == extr2.getAbs() ;
    }
    }
