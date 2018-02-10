public class input {
    public static void main(String[] arg) {
        liigaasta aasta = new liigaasta (arg[0]);
        System.out.println("See " + aasta.liigaastaKontroll() + " liigaasta.");
    }
}

/*

>java input 2000
See on liigaasta.


> java input 2002
See ei ole liigaasta.

>java input 2004
See on liigaasta.

*/