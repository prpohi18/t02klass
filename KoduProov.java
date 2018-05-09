public class KoduProov {
    public static void main(String[] args) {
        Pikkus esimene_tekst = new Pikkus("Siin on mingi lause, mille pikkust on vaja teada saada");
        Pikkus teine_tekst = new Pikkus("Veidi lühem tekst");

        System.out.printf("Esimese lause pikkus on %s %n", esimene_tekst.teksti_pikkus());
        System.out.printf("Teise lause pikkus on %s %n", teine_tekst.teksti_pikkus());
    }
    
}