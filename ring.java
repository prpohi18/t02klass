public class ring{
    protected double raadius;
    
    public ring (double radius){
        raadius = radius;

    }

    public double pindala(){
        double pindala = raadius * raadius * Math.PI;
        return pindala;
    }

    public double ymbermoot(){
        double ymbermoot = 2 * Math.PI * raadius;
        return ymbermoot;

    }

}