public class Ostukorv {
  protected double kaal1;
  protected double kaal2;
  protected double kaal3;


  public Ostukorv(double kaal1, double kaal2, double kaal3){
    this.kaal1=kaal1;
    this.kaal2=kaal2;
    this.kaal3=kaal3;
  }

  public double kiloHind1(){
    return kaal1 * 0.6;
  }

  public double kiloHind2(){
    return kaal2 * 0.8;
  }

  public double kiloHind3(){
    return kaal3 * 1.2;
  }

  public double getX(){return kaal1;}
  public double getY(){return kaal2;}
  public double getC(){return kaal3;}

  public String kojuvedu(Ostukorv teineOst){
      double kokkuKaal1=kaal1+kaal2+kaal3;
      double kokkuKaal2=teineOst.getX()+teineOst.getY()+teineOst.getC();
      if (kokkuKaal1>kokkuKaal2){
              return "Ostja nr1 kojuvedu tasuta, kuna suurem ostukorv";
      } else {
              return "Ostja nr2 kojuvedu tasuta, kuna suurem ostukorv";
      }
  }
}
// [kippkert@greeny t02klass]$ java Proov1
// Ostukorvi 1. summa 7.24.
// Ostukorvi 2. summa 8.5.
// Ostja nr2 kojuvedu tasuta, kuna suurem ostukorv.
// [kippkert@greeny t02klass]$ 