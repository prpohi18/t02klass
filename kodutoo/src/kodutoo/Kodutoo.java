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
    
}
