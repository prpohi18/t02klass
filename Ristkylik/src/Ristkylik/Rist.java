package Ristkylik;
public class Rist {
    public static void main (String[] args) {
        Ristkylik laud1=new Ristkylik(2, 1);
	Ristkylik laud2=new Ristkylik(1.5, 1);
	Ristkylik laud3=new Ristkylik(2, 1.5);
	System.out.println(laud1);
	System.out.println(laud2);
        System.out.println(laud3);
    }
}

//Ristkylik 2.0x1.0m, ymberm66t 6.0m, pindala 2.0 ruutmeetrit.
//Ristkylik 1.5x1.0m, ymberm66t 5.0m, pindala 1.5 ruutmeetrit.
//Ristkylik 2.0x1.5m, ymberm66t 7.0m, pindala 3.0 ruutmeetrit.
//BUILD SUCCESSFUL (total time: 0 seconds)

//Exception in thread "main" java.lang.RuntimeException: Sobimatu pikkus
//	at Ristkylik.Ristkylik.<init>(Ristkylik.java:6)
//	at Ristkylik.Rist.main(Rist.java:6)
//C:\Users\Kevin\AppData\Local\NetBeans\Cache\8.2\executor-snippets\run.xml:53: Java returned: 1
//BUILD FAILED (total time: 0 seconds)