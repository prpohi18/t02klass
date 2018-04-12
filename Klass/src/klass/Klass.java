package klass;
public class Klass {
    public static void main(String[] args) {
        Ring ring1= new Ring(10);
        Ring ring2= new Ring(15);
        System.out.println(ring1);
        System.out.println(ring2);
        System.out.println("Esimese ringi pindala on "+ring1.pindala()+" ja ümbermõõt on "+ring1.umbermoot());
        System.out.println("Teise ringi pindala on "+ring2.pindala()+" ja ümbermõõt on "+ring2.umbermoot());
    }
    
}
/*
Ringi raadius on 10.0
Ringi raadius on 15.0
Esimese ringi pindala on 314.0 ja ümbermõõt on 62.800000000000004
Teise ringi pindala on 706.5 ja ümbermõõt on 94.2
*/
