/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t02klass;

/**
 *
 * @author Taavi Meinberg
 */
public class Testing {
    public static void main(String[] args) {
        Cars car1 = new Cars("Volvo", 58.34, 299000.00);
        Cars car2 = new Cars("Moskvich", 85.00, 65000.00);
        Cars car3 = new Cars("BMW", 80.32, 402230.00);
        System.out.println(car1.compareTwoCarSpeeds(car2));
        System.out.println(car2.compareTwoCarDistance(car3));
    }
    
    
}

/* 

System.out.println(car1.compareTwoCarSpeeds(car2));
System.out.println(car2.compareTwoCarDistance(car3));

Moskvich on kiirem kui Volvo
BMW on sõitnud: 337230.0 km rohkem kui Moskvich

*/
