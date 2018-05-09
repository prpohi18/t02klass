public class Pikkus {
    protected String andmed;
    public Pikkus(String tekst){
        andmed = tekst;
    }
    public int teksti_pikkus(){
        return andmed.length();
    }
    
}