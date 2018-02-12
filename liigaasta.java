public class liigaasta {
    
    protected int aasta;
    protected String onLiigaasta;
    
    public liigaasta(String received_data) {
        try {
            aasta = Integer.parseInt(received_data);
        } catch (Exception e) {
            System.out.println("Programmis tekkis järgmine viga:\n" + e + "\n");
            System.exit(0);
        }
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
    
    @Override
    public String toString() {
        return "" + aasta;
    }
}