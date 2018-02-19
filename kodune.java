public class kodune{
    public static void main(String[] arg){
        ring ring1 = new ring(4);
        ring ring2 = new ring(8);
        ring ring3 = new ring(12);
        System.out.println("Esimese ringi pindala on: " + ring1.pindala() + " ja ümbermõõt on: " + ring1.ymbermoot());
        System.out.println("Teise ringi pindala on: " + ring2.pindala() + " ja ümbermõõt on: " + ring2.ymbermoot());
        System.out.println("Kolmanda ringi pindala on: " + ring3.pindala() + " ja ümbermõõt on: " + ring3.ymbermoot());

    }

}