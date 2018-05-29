public class kolmnurk{
    double pindala;
    double korgus;  //pindala=0.5bh
    double pohik;
    double  kaatet;
    double hypotenuus;

    public kolmnurk(double korgus, double pohik, double kaatet, double hypotenuus){
        
        this.korgus = korgus;
        this.pohik = pohik;
        this.kaatet = kaatet;
        this.hypotenuus = hypotenuus;
    }

    public double pindala(){
        double pindala = 0.5 * pohik * korgus;
        return pindala;
    }
        
    public double ymbermõõt(){
        double ymbermõõt =  pohik + kaatet + hypotenuus;
        return ymbermõõt;

    }
}