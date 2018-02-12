public class Andmed{
  public static void main(String[] args){
    Kera kera1 = new Kera(10);
    Kera kera2 = new Kera(15);
    System.out.println(kera1);
    System.out.println(kera2);
    System.out.println("Esimese kera pindala on "+kera1.pindala()+" ja ruumala on "+kera1.ruumala());
    System.out.println("Teise kera pindala on "+kera2.pindala()+" ja ruumala on "+kera2.ruumala());
  }
}
/*
Kera raadius on 10.0
Kera raadius on 15.0
Esimese kera pindala on 1256.0 ja ruumala on 4186.666666666667
Teise kera pindala on 2826.0 ja ruumala on 14130.0
*/
