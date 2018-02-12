public class Kera{
  protected double raadius;
  public Kera(double r){
    raadius = r;
  }
  public double pindala(){
    return 4*3.14*raadius*raadius;
  }
  public double ruumala(){
    return (4*3.14*raadius*raadius*raadius)/3;
  }
  public String toString(){
    return "Kera raadius on "+raadius;
  }
}
