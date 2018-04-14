public class andmed {
    
    protected String koht;
    
    public andmed(String koht) {
        this.koht = koht;
    } 
    
    public String arvestus() {
    
        int arvestus = Integer.parseInt(koht);
        
        String tulemus="";
        if (arvestus == 1){
            tulemus = "10 punkti";
        }else if (arvestus == 2){
            tulemus = "8 punkti";
        }else if (arvestus == 3){
            tulemus = "6 punkti";
        }else if (arvestus == 4){
            tulemus = "2 punkti";
        }else if (arvestus == 5){
            tulemus = "1 punkti";
        }
        return tulemus;
    }
}
