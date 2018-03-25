public class Koer{
    private String nimi;
    private int vanus;

    public Koer (String nimi, int vanus){
        this.nimi = nimi;
        this.vanus = vanus;
    }

    public String getNimi(){
        return nimi;
    }

    public int getVanus(){
        return vanus;
    }

    public int koeraVanusInimesteAastates(){
        return getVanus() * 7;
    }

    public String toString(){
        return "Koera nimi on: " + getNimi() + "\nKoera vanus on: " + getVanus() + "\nKoera vanus inimese vanuses: " + koeraVanusInimesteAastates();
    }
}