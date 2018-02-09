package t02klass;

public class Ruumala {
    protected double a;
    protected double b;
    protected double c;
    
    
    public Ruumala(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
  }
   
    public double põhjaPindala(){
       return a*b;
    }
    
    public double ristRuumala(){
        return a*b*c;
    }
    
    public double diagonaal(){
        return Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2)+Math.pow(c, 2));
    }
    
    public double getX(){return a;}
    public double getY(){return b;}
    public double getC(){return c;}
    
    public String KasOnSuurem(Ruumala teine){
        double ruum1=a*b*c;
        double ruum2=teine.getX()*teine.getY()*teine.getC();
        if (ruum1>ruum2){
                return "Esimene risttahukas on suurem";
        } else {
                return "Teine Risttahukas on suurem";
        }
    }
  }

/*
Põhja Pindala on 44.0

Põhja Pindala on 12.0

Diagonaal on 13.152946437965905

Diagonaal on 10.295630140987

Ruumala 264.0

Ruumala 108.0

Esimene risttahukas on suurem
*/