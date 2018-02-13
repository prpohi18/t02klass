public class Proov1{
  public static void main(String[] args){
    Ostukorv ost1=new Ostukorv(1.4, 1.7, 4.2);
    Ostukorv ost2=new Ostukorv(2.7, 3.8, 3.2);
    System.out.println("Ostukorvi 1. summa "+(ost1.kiloHind1()+ost1.kiloHind2()+ost1.kiloHind3())+".");
    System.out.println("Ostukorvi 2. summa "+(ost2.kiloHind1()+ost2.kiloHind2()+ost2.kiloHind3())+".");
    System.out.println(ost1.kojuvedu(ost2)+".");
  }
}

