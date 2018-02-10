public class liigaasta {
    
    protected int aasta;
    protected String onLiigaasta;
    
    public liigaasta (String received_data){
        aasta = Integer.parseInt(received_data);
    }
        
    public String liigaastaKontroll() {
        if ((aasta % 4) == 0) {
            if (aasta % 100 == 0) {
                if (aasta % 400 == 0) {
                    onLiigaasta = "on";
                } else {
                    onLiigaasta = "ei ole";
                }
            } else {
                onLiigaasta = "on";
            }
        } else {
            onLiigaasta = "ei ole";
        }
        return onLiigaasta;
    }
}