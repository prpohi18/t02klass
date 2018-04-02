
package kodutöö2;


public class Hommik {
    double a;
    public Hommik(double kylg){
        a = kylg;
    }
    public double pindala(){
        return (a*a);       
    }
    public double ümbermõõt(){
        return (4*a);
    }
    @Override
    public String toString(){
        return "Nelinurga ümbermõõt on "+
                ümbermõõt()+" Ja pindala on "+pindala();
    }
}
