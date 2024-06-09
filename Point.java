package examen2021.ex1;

public class Point {
    private int abs ; 
    private int ord ; 
    private String nom ; 

    public Point(int abs , int ord , String nom){
        this.abs=abs ; 
        this.ord=ord;
        this.nom=nom;
    }

    public int getAbs(){
        return abs ;
    }
    public void setAbs(int abs){
        this.abs=abs ;
    }
    public int getOrd(){
        return ord ;
    }
    public void setOrd(int ord ){
        this.ord=ord;
    }
    public String getNom(){
        return nom; 
    }

    public String afficher(){
        return String.format("%s (%s , %s)" , nom , abs , ord);
    }

    public boolean equals(Point p ){
        return abs == ((Point) p).abs && ord ==((Point)p).ord ; 
    }
}
