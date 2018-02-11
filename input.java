public class input {
    public static void main(String[] arg) {
        if (arg.length != 0) {
            
            liigaasta[] aasta = new liigaasta[arg.length];
            
            for (int i=0; i<arg.length; i++) {
                aasta[i] = new liigaasta(arg[i]);
                System.out.println(aasta[i] + " " + aasta[i].liigaastaKontroll() + " liigaasta.");
            }
            
        } else {
            System.out.println("Argumendid puuduvad.\n");
        }
    }
}