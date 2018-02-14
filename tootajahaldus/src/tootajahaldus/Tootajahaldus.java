/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tootajahaldus;

/**
 *
 * @author erike
 */

public class Tootajahaldus {
    
    public static void main(String[] args) {
        String firstname, lastname, title, dataname, cont;
        double wage;
        
        
        tootaja Mari_Mets = new tootaja ();
        Mari_Mets.eesnimi = "Mari";
        Mari_Mets.perenimi = "Mets";
        Mari_Mets.ametinimi = "laohaldur";
        Mari_Mets.palk = 2000.00;
        
        tootaja Jaan_Org = new tootaja ();
        Jaan_Org.eesnimi = "Jaan";
        Jaan_Org.perenimi = "Org";
        Jaan_Org.ametinimi = "laotööline";
        Jaan_Org.palk = 1000.00;
        
        System.out.println("| " + "Eesnimi" + " | " + "Perenimi" + " | " + "Amet" + " | " + "Palk" + " |");
        System.out.println("| " + Mari_Mets.eesnimi + " | " + Mari_Mets.perenimi + " | " +  Mari_Mets.ametinimi  +  " | " + Mari_Mets.palk + " |");
        System.out.println("| " + Jaan_Org.eesnimi + " | " + Jaan_Org.perenimi + " | " +  Jaan_Org.ametinimi  +  " | " + Jaan_Org.palk + " |");
    }   
}

