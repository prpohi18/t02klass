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
public class warrior {
    protected double health;
    protected double attack;
    protected double defense;
    
    public warrior(double health, double attack, double defense) {
        this.health=health;
        this.attack=attack;
        this.defense=defense;
    }
    
    public double getHealth() {
        return health;
    }
    
    public double getAttack() {
        return attack;
    }
    
    public double getDefense() {
        return defense;
    }
    
    public boolean fight(warrior teine) {
        double w1Hp = getHealth();
        double w1Att = getAttack();
        double w1Def = getDefense();
        double w2Hp = teine.getHealth();
        double w2Att = teine.getAttack();
        double w2Def = teine.getDefense();
        
        while(true) {
            if(w2Def >= w1Att) {
                System.out.println("Sõdalane üks lõi teist sõdalast, kuid löök ei mõjunud. sõdalasel elusid jäänud "+w2Hp+"/"+teine.getHealth());
            } else {
                w2Hp = w2Hp-(w1Att-w2Def);
                System.out.println("Sõdalane üks lõi teist sõdalast "+(w1Att-w2Def)+" võrra, sõdalasel elusid jäänud "+w2Hp+"/"+teine.getHealth());
            }
            
            if(w2Hp <= 0) {
                System.out.println("Sõdalane üks võitis");
                return true;
            }
            if(w1Def >= w2Att) {
                System.out.println("Sõdalane kaks lõi esimest sõdalast, kuid löök ei mõjunud. sõdalasel elusid jäänud "+w1Hp+"/"+getHealth());
            } else {
                w1Hp = w1Hp-(w2Att-w1Def);
            System.out.println("Sõdalane kaks lõi esimest sõdalast "+(w2Att-w1Def)+" võrra, sõdalasel elusid jäänud "+w1Hp+"/"+getHealth());
            }
          
            if(w1Hp <= 0) {
                System.out.println("Sõdalane kaks võitis");
                return false;
            }
        }

    }
    
    @Override
    public String toString(){
        return "Sõdalane eludega: "+health+", ründega: "+attack+", kaitsega: "+defense;
    }
}
