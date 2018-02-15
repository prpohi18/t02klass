/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodutoo;

/**
 *
 * @author zeus
 */
public class Kodutoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        warrior p1 = new warrior(20, 5, 1);
        warrior p2 = new warrior(20, 4, 3);
        System.out.println(p1);
        System.out.println(p2);
        p1.fight(p2);
    }
    /*
    run:
        Sõdalane eludega: 20.0, ründega: 5.0, kaitsega: 1.0
        Sõdalane eludega: 20.0, ründega: 4.0, kaitsega: 3.0
        Sõdalane üks lõi teist sõdalast 2.0 võrra, sõdalasel elusid jäänud 18.0/20.0
        Sõdalane kaks lõi esimest sõdalast 3.0 võrra, sõdalasel elusid jäänud 17.0/20.0
        Sõdalane üks lõi teist sõdalast 2.0 võrra, sõdalasel elusid jäänud 16.0/20.0
        Sõdalane kaks lõi esimest sõdalast 3.0 võrra, sõdalasel elusid jäänud 14.0/20.0
        Sõdalane üks lõi teist sõdalast 2.0 võrra, sõdalasel elusid jäänud 14.0/20.0
        Sõdalane kaks lõi esimest sõdalast 3.0 võrra, sõdalasel elusid jäänud 11.0/20.0
        Sõdalane üks lõi teist sõdalast 2.0 võrra, sõdalasel elusid jäänud 12.0/20.0
        Sõdalane kaks lõi esimest sõdalast 3.0 võrra, sõdalasel elusid jäänud 8.0/20.0
        Sõdalane üks lõi teist sõdalast 2.0 võrra, sõdalasel elusid jäänud 10.0/20.0
        Sõdalane kaks lõi esimest sõdalast 3.0 võrra, sõdalasel elusid jäänud 5.0/20.0
        Sõdalane üks lõi teist sõdalast 2.0 võrra, sõdalasel elusid jäänud 8.0/20.0
        Sõdalane kaks lõi esimest sõdalast 3.0 võrra, sõdalasel elusid jäänud 2.0/20.0
        Sõdalane üks lõi teist sõdalast 2.0 võrra, sõdalasel elusid jäänud 6.0/20.0
        Sõdalane kaks lõi esimest sõdalast 3.0 võrra, sõdalasel elusid jäänud -1.0/20.0
        Sõdalane kaks võitis
        BUILD SUCCESSFUL (total time: 0 seconds)
    */
}
