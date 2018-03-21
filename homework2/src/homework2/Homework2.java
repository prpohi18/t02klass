//  THIS IS HOMEWORK 2 & 3

package homework2;
import java.util.Scanner;

public class Homework2 {

    //  creating new Objects for my database
    public static void main (String[] args){
        companiesInfo c1 = new companiesInfo("Nortal", 26767000, 1998, 287);
        companiesInfo c2 = new companiesInfo("Helmes", 24690000, 1998, 157);
        companiesInfo c3 = new companiesInfo("Web Systems", 443000, 2013, 17);
        companiesInfo c4 = new companiesInfo("OKIA", 433000, 2000, 9);
        companiesInfo c5 = new companiesInfo("Codeborne", 4111000, 2010, 31);
        companiesInfo c6 = new companiesInfo("Lavii", 122000, 2009, 2);
        companiesInfo c7 = new companiesInfo("Knowbase", 8000, 2017, 1);
        companiesInfo c8 = new companiesInfo("Zone", 3863000, 1999, 28);
        companiesInfo c9 = new companiesInfo("Proekspert", 10692000, 1997, 140);
        companiesInfo c10 = new companiesInfo("Tieto", 18851000, 1996, 286);
        
        clients cl1 = new clients("Swedbank AB", "Sweden", 1000000, 21, 50, 1000000);
        clients cl2 = new clients("Ministry of Foreign Relations", "Estonia", 660000, 11, 20, 100000);
        clients cl3 = new clients("Tallinn University", "Estonia", 20000, 1, 1, 1000);
        clients cl4 = new clients("Department of Financial Affairs", "Oman", 25000000, 93, 100, 10000000);
        clients cl5 = new clients("Ministry of Defence", "Israel", 13000000, 18, 80, 5000000);
        clients cl6 = new clients("Road Administration", "Finland", 250000, 7, 2, 100000);
        
        
        
       
        // scanner for user input
        Scanner name = new Scanner(System.in);
        System.out.println("Enter the name of a company: \n Nortal - Helmes - OKIA - Codeborne - Web Systems - Lavii - Knowbase - Zone - Proekspert - Tieto");
        String name1 = name.nextLine();
            //  System.out.println("Test: "+name1);

        //  comparing user input and my Objects (probably it would be better to do a cycle here instead of if x10)
        if(name1.equals(c1.company)){                   //https://stackoverflow.com/questions/513832/how-do-i-compare-strings-in-java
            System.out.println("Company: "+c1.company+". Revenue per employee: "+c1.revenuePerEmployee()+" EUR. Active for: "+c1.activeYears()+" years.");
        } 
        else if(name1.equals(c2.company)){
            System.out.println("Company: "+c2.company+". Revenue per employee: "+c2.revenuePerEmployee()+" EUR. Active for: "+c2.activeYears()+" years.");
        }
        else if(name1.equals(c3.company)){
            System.out.println("Company: "+c3.company+". Revenue per employee: "+c3.revenuePerEmployee()+" EUR. Active for: "+c3.activeYears()+" years.");
        }
        else if(name1.equals(c4.company)){
            System.out.println("Company: "+c4.company+". Revenue per employee: "+c4.revenuePerEmployee()+" EUR. Active for: "+c4.activeYears()+" years.");
        }
        else if(name1.equals(c5.company)){
            System.out.println("Company: "+c5.company+". Revenue per employee: "+c5.revenuePerEmployee()+" EUR. Active for: "+c5.activeYears()+" years.");
        }
        else if(name1.equals(c6.company)){
            System.out.println("Company: "+c6.company+". Revenue per employee: "+c6.revenuePerEmployee()+" EUR. Active for: "+c5.activeYears()+" years.");
        }
        else if(name1.equals(c7.company)){
            System.out.println("Company: "+c7.company+". Revenue per employee: "+c7.revenuePerEmployee()+" EUR. Active for: "+c5.activeYears()+" years.");
        }
        else if(name1.equals(c8.company)){
            System.out.println("Company: "+c8.company+". Revenue per employee: "+c8.revenuePerEmployee()+" EUR. Active for: "+c5.activeYears()+" years.");
        }
        else if(name1.equals(c9.company)){
            System.out.println("Company: "+c9.company+". Revenue per employee: "+c9.revenuePerEmployee()+" EUR. Active for: "+c5.activeYears()+" years.");
        }
        else if(name1.equals(c10.company)){
            System.out.println("Company: "+c10.company+". Revenue per employee: "+c10.revenuePerEmployee()+" EUR. Active for: "+c5.activeYears()+" years.");
        }
        else{
            System.out.println("Sorry, there is no such company ("+name1+") in our database!");
        }
    }
    
    
}
