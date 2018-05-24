
import java.util.Scanner;

public class t02klass{
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
        
        double kaal = 0.0;
        double pikkus = 0.0;
        double bmi = 0.0;
        double juurdevott = 0;
        double allavott = 0;
        
        System.out.print("Sisestage enda kaal: ");
        kaal = input.nextInt();
        
        System.out.print("Sisestage enda pikkus: ");
        pikkus = input.nextInt();
        
        bmi = ((kaal)/(pikkus/100 * pikkus/100));
        juurdevott = (18.5 - bmi);
        allavott = (bmi - 24.9);
        
        if(bmi < 18.5){
            System.out.printf("Teie kehamassiindeks on: %.1f\n", bmi);
            System.out.printf("Olete alakaalus. \n");
            System.out.printf("Normaalkaalust on puudu: %.1f\n", juurdevott);
        }
        
        else if(bmi >= 18.5 && bmi <= 24.9){
            System.out.printf("Teie kehamassiindeks on: %.1f\n", bmi);
            System.out.printf("Olete normaalkaalus.\n");
        }
        
        else if(bmi >= 25.0 && bmi <= 29.9){
            System.out.printf("Teie kehamassiindeks on: %.1f\n", bmi);
            System.out.printf("Olete ülekaalus. \n");
            System.out.printf("Normaalkaaluks peab kehamassiindeksist kaotama vähemalt: %.1f\n", allavott);
        }
        
        else if(bmi >= 30.0){
            System.out.printf("Teie kehamassiindeks on: %.1f\n", bmi);
            System.out.printf("Olete rasvunud. \n");
            System.out.printf("Normaalkaaluks peab kehamassiindeksist kaotama vähemalt: %.1f\n", allavott);
        }
        
        
    }
}

/*
 Normaalkaal:
 Sisestage enda kaal: 65
 Sisestage enda pikkus: 168
 Teie kehamassiindeks on: 23.0
 Olete normaalkaalus.
 
 Alakaal:
 Sisestage enda kaal: 40
 Sisestage enda pikkus: 168
 Teie kehamassiindeks on: 14.2
 Olete alakaalus.
 Normaalkaalust on puudu: 4.3
 
 Ülekaal:
 Sisestage enda kaal: 75
 Sisestage enda pikkus: 168
 Teie kehamassiindeks on: 26.6
 Olete ülekaalus.
 Normaalkaaluks peab kehamassiindeksist kaotama vähemalt: 1.7
 
 Rasvunud:
 Sisestage enda kaal: 90
 Sisestage enda pikkus: 168
 Teie kehamassiindeks on: 31.9
 Olete rasvunud.
 Normaalkaaluks peab kehamassiindeksist kaotama vähemalt: 7.0
 */

