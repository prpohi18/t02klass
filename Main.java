public class Main{
    public static void main(String[] arg){
        Arvutused esimene = new Arvutused("37605030299");
        Arvutused teine = new Arvutused("24598723478");
        
        System.out.println(esimene.sugu() + ". " +esimene.kontroll());
        System.out.println(teine.sugu() + ". " +teine.kontroll());

    }
}

/*

Viimane number 9
1900-1999 sündinud mees. Isikukood on kehtiv!
Viimane number 4
1800-1899 sündinud naine. Isikukood on vale!

*/