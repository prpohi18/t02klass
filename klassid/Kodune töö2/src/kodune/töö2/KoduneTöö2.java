
package kodune.töö2;

import static java.lang.Math.round;


public class KoduneTöö2 {

    
   public static void main(String[] arg) {
   indeks p1=new indeks(65, 168);
   indeks p2= new indeks(70, 150);
   System.out.println(p1);
   System.out.println(p2); 
   System.out.println("esimese persooni kehamassiindeks on: "+round(p1.KMI())+" ja "+p1.seisund());
   System.out.println("teise persooni kehamassiindeks on: "+round(p2.KMI())+" ja "+p2.seisund());
   System.out.println(p1.Suurem(p2));
  
    }
    
   
}
/*Persoon  (65.0 kg, 168.0cm)
Persoon (70.0 kg, 150.0cm)
esimese persooni kehamassiindeks on: 23 ja Persoon on ideaalkaalus
teise persooni kehamassiindeks on: 31 ja Persoon on rasvunud
Teise persooni KMI on suurem*/
