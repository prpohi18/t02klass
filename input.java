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

/*

>java input 1999 2000 2001 2002 2003 2004 2005
1999 ei ole liigaasta.
2000 on liigaasta.
2001 ei ole liigaasta.
2002 ei ole liigaasta.
2003 ei ole liigaasta.
2004 on liigaasta.
2005 ei ole liigaasta.

>java input
Argumendid puuduvad.

>java input tere
Programmis tekkis järgmine viga:
java.lang.NumberFormatException: For input string: "tere"

*/