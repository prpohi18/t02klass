package klass;
public class Ring {
    protected double raadius;
    public Ring(double r){
        raadius = r;
    }
    public double pindala(){
        return 3.14*raadius*raadius;
    }
    public double umbermoot(){
        return 2*3.14*raadius;
    }
    public String toString(){
        return "Kera raadius on "+raadius;
    }
}
