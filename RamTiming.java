public class RamTiming{

    protected double MHZ;
    protected int CL;

    //Calculates RAM Access speed
    public double ramTiming(double MHZ, int CL){
        double halvedMHZ = MHZ/2;
        double Timing = (CL/halvedMHZ)*1000;
        return Timing;
    }

}