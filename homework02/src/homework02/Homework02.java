/* According to user choice the program will output the following details about the country:
country´s name as name, area code as code, national language as language, location as location 
population as population and unemployment as unemployment. */

package homework02;
import java.util.Scanner;
public class Homework02 {

    public static void main(String[] args) {
        
        Data country1 = new Data();
        Data country2 = new Data();
        Data country3 = new Data();
        
        country1.name = "Soome";
        country1.code = "+358";
        country1.language = "soome keel";
        country1.location = "Euroopa";
        country1.population = 5.5;
        country1.unemployment = 8.8;
        
        country2.name = "USA";
        country2.code = "+001";
        country2.language = "inglise keel";
        country2.location = "Põhja-Ameerika";
        country2.population = 323.1;
        country2.unemployment = 4.1;
        
        country3.name = "Jaapan";
        country3.code = "+81";
        country3.language = "jaapani keel";
        country3.location = "Aasia";
        country3.population = 127;
        country3.unemployment = 2.4;
        

        Scanner input = new Scanner(System.in);
        System.out.println("Millise riigi kohta soovid rohkem infot saada: 1 Soome 2 USA 3 Jaapan: ");
        int choice = input.nextInt();
        
        //System.out.println(country1.calculateUnemployment());
        
        if(choice == 1) {
            System.out.println(country1.name + " andmed on: \nSuunakood: " + country1.code + "\nRiigikeel on: " 
                    + country1.language + "\nRiik asub maailmajaos: " + country1.location + "\nRahvaarv: " +
                    country1.population + " miljonit inimest" + "\nTöötuid: " + country1.calculateUnemployment());
        }
        else if(choice == 2) {
            System.out.println(country2.name + " andmed on: \nSuunakood: " + country2.code + "\nRiigikeel on: " 
                    + country2.language + "\nRiik asub maailmajaos: " + country2.location + "\nRahvaarv: " +
                    country2.population + " miljonit inimest" + "\nTöötuid: " + country2.calculateUnemployment());
        }
        else if(choice == 3) {
            System.out.println(country3.name + " andmed on: \nSuunakood: " + country3.code + "\nRiigikeel on: " 
                    + country3.language + "\nRiik asub maailmajaos: " + country3.location + "\nRahvaarv: " +
                    country3.population + " miljonit inimest" + "\nTöötuid: " + country3.calculateUnemployment());
            
        }
        else if() {
            System.out.println("Palun valige number");
        }

    }
    
}
/*run:
Millise riigi kohta soovid rohkem infot saada: 1 Soome 2 USA 3 Jaapan: 
2
USA andmed on: 
Suunakood: +001
Riigikeel on: inglise keel
Riik asub maailmajaos: Põhja-Ameerika
Rahvaarv: 323.1 miljonit inimest
Töötuid: 1.32471E7
BUILD SUCCESSFUL (total time: 2 seconds)*/
    
