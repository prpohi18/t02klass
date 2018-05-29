public class kodut{
    public static void main(String[] arg){
        kolmnurk kolmnurk1 = new kolmnurk(4,2,2,4); // double korgus, double pohik, double kaatet, double hypotenuus
        kolmnurk kolmnurk2 = new kolmnurk(7,6,2,4);
        kolmnurk kolmnurk3 = new kolmnurk(16,5,3,5);
        System.out.println("Esimese kolmnurga pindala on: " + kolmnurk1.pindala() + "ja ümbermõõt on : " + kolmnurk1.ymbermõõt());
        System.out.println("Esimese kolmnurga pindala on: " + kolmnurk2.pindala() + "ja ümbermõõt on : " + kolmnurk2.ymbermõõt());
        System.out.println("Esimese kolmnurga pindala on: " + kolmnurk3.pindala() + "ja ümbermõõt on : " + kolmnurk3.ymbermõõt());
    }
}


//Esimese kolmnurga pindala on: 4.0ja ümbermõõt on : 8.0
//Esimese kolmnurga pindala on: 21.0ja ümbermõõt on : 12.0
//Esimese kolmnurga pindala on: 40.0ja ümbermõõt on : 13.0
