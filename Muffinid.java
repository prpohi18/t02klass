import java.io.*;
import java.util.*;
public class Muffinid{
    protected double kogusalg;
    protected double mKogus;
    protected double mHind = 1.50;

    public Muffinid(double mass, double mitu){
        kogusalg=mass;
        mKogus=mitu;
    }

    public double massKg(){
        return kogusalg / 1000.0;
    }

    public double massMg(){
        return kogusalg * 1000.0;
    }
 
    public double muffiniKogusG()throws IOException{
        double koostis = mKogus * kogusalg;
        return koostis;
    }

    public double muffiniKogusKg() throws IOException{
        double koostis = mKogus * massKg();
        return koostis;
    }

    public double muffiniteHind(int mArv){
        double hind = mHind * mArv;
        return hind;
    }

}