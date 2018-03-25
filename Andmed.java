import java.util.Scanner;

public class Andmed {
    public static void main(String[] args){
        String nimi;
        int vanus = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Palun lisage koera nimi ja vanus: ");
        nimi = scan.next();
        vanus = scan.nextInt();

        scan.close();

        Koer koer = new Koer(nimi, vanus);
        Koer koer1 = new Koer ("Muri", 4);
        Koer koer2 = new Koer ("Kuri", 7);
        Koer koer3 = new Koer ("Musti", 12);
        Koer koer4 = new Koer ("Kusti", 2);

        System.out.println(koer);
        System.out.println(koer1);
        System.out.println(koer2);
        System.out.println(koer3);
        System.out.println(koer4);
    }
}