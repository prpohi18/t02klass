package kodut662;


/* Järgneva programmi eesmärk on selgitada välja hind ning säilivus erinevate tomatisortimentide seas */
public class kodut662 {
    public static void main(String[] args){
        poolatomat tomat1 = new poolatomat(30, 0.5, 3, "Shelkin", 5);
        poolatomat tomat2 = new poolatomat(60, 0.1, 2, "Shelkin", 5);
        poolatomat tomat3 = new poolatomat(50, 0.2, 1, "Shelkin", 1);

        eestitomat tomat8 = new eestitomat(0.5, 3, "Tavaline", 5);
        eestitomat tomat9 = new eestitomat(0.1, 4, "Tavaline", 5.1);
        eestitomat tomat10 = new eestitomat(0.3, 7, "Tavaline", 1.1);

        System.out.println("Esimese tomati hinnaks tuleb " + tomat1.arvutaHind());
        System.out.println("Teise tomati säilivus on " + tomat9.arvutaS2ilivus());

        /*Esimese tomati hinnaks tuleb 0.75
          Teise tomati säilivus on 6 */

    }
}
