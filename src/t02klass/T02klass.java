package t02klass;

class drivers{
    public String positsioon, nimi;
    public int esikolmikus, vanus, rallys, keskminevanus, keskminekiirus;
    
}

public class T02klass{
    public static void main(String[] args){
        
        drivers Ott = new drivers();
        Ott.positsioon = "Sõitja";
        Ott.vanus = 30;
        Ott.rallys = 158;
        Ott.esikolmikus = 45;
        Ott.keskminekiirus = 76;
        Ott.nimi = "Ott Tänak";
        
        drivers Petter = new drivers();
        Petter.positsioon = "Sõitja";
        Petter.vanus = 43;
        Petter.rallys = 259;
        Petter.esikolmikus = 84;
        Petter.keskminekiirus = 64;
        Petter.nimi = "Petter Solberg";
        
        
        int keskminevanus;
        int esikolmikuskokku;
        int rallyskokku;
        int keskminekiirus;
        keskminevanus = (Ott.vanus + Petter.vanus) / 2;
        esikolmikuskokku = Ott.rallys + Petter.rallys; 
        rallyskokku = Ott.esikolmikus + Petter.esikolmikus;
        keskminekiirus = (Ott.keskminekiirus + Petter.keskminekiirus) / 2;
        
        System.out.println("Sõitja: " +Ott.nimi);
        System.out.println("Vanus: " +Ott.vanus);
        System.out.println("Rallys: " +Ott.rallys);
        System.out.println("Esikolmikus: " +Ott.esikolmikus);
        System.out.println("Keskmine Kiirus: " +Ott.keskminekiirus);
        System.out.println(" ");
        System.out.println("Sõitja: " +Petter.nimi);
        System.out.println("Vanus: " +Petter.vanus);
        System.out.println("Rallys: " +Petter.rallys);
        System.out.println("Esikolmikus: " +Petter.esikolmikus);
        System.out.println("Keskmine Kiirus: " +Petter.keskminekiirus);
        System.out.println(" ");
        System.out.println("Sõitjate keskmine vanus: "+keskminevanus);
        System.out.println("Esikolmikus kokku: "+esikolmikuskokku);
        System.out.println("Sõitjate keskmine kiirus: "+keskminekiirus);
    }
}

/*
Sõitja: Ott Tänak
Vanus: 30
Rallys: 158
Esikolmikus: 45
Keskmine Kiirus: 76
 
Sõitja: Petter Solberg
Vanus: 43
Rallys: 259
Esikolmikus: 84
Keskmine Kiirus: 64
 
Sõitjate keskmine vanus: 36
Esikolmikus kokku: 417
Sõitjate keskmine kiirus: 70
*/