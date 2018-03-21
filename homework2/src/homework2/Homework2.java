package homework2;
import java.util.Scanner;

public class Homework2 {

    
    public static void main (String[] args){
        companiesInfo c1 = new companiesInfo("Nortal", 26767000, 1998, 287);
        companiesInfo c2 = new companiesInfo("Helmes", 24690000, 1998, 157);
        companiesInfo c3 = new companiesInfo("Web Systems", 443000, 2013, 17);
        companiesInfo c4 = new companiesInfo("OKIA,", 433000, 2000, 9);
        companiesInfo c5 = new companiesInfo("Codeborne,", 4111000, 2010, 31);
       
        
        Scanner name = new Scanner(System.in);
        System.out.println("Enter the name of a company (Nortal, Welmes, OKIA, Codeborne)");
        String name1 = name.nextLine();
        System.out.println("Kirjutasid: "+name1);

        if(new String(name1).equals(c1.company)){       // Comparing (name1 == c1.company) gives error. Used the code from: https://stackoverflow.com/questions/513832/how-do-i-compare-strings-in-java
            System.out.println("Company: "+c1.company+". Revenue per employee: "+c1.revenuePerEmployee()+" EUR. Active for: "+c1.activeYears()+" years.");
        } 
        else if(new String(name1).equals(c2.company)){
            System.out.println("Company: "+c2.company+". Revenue per employee: "+c2.revenuePerEmployee()+" EUR. Active for: "+c2.activeYears()+" years.");
        }
        else if(new String(name1).equals(c3.company)){
            System.out.println("Company: "+c3.company+". Revenue per employee: "+c3.revenuePerEmployee()+" EUR. Active for: "+c3.activeYears()+" years.");
        }
        else if(new String(name1).equals(c4.company)){
            System.out.println("Company: "+c4.company+". Revenue per employee: "+c4.revenuePerEmployee()+" EUR. Active for: "+c4.activeYears()+" years.");
        }
        else if(new String(name1).equals(c5.company)){
            System.out.println("Company: "+c5.company+". Revenue per employee: "+c5.revenuePerEmployee()+" EUR. Active for: "+c5.activeYears()+" years.");
        }
    }
    
    
}
