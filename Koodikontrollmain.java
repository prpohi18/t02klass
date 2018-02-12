import java.util.Arrays;
public class Koodikontrollmain{
     public static void main(String[] arg){
		Koodikontroll[] isikukoodid=new Koodikontroll[3];
		isikukoodid[0]=new Koodikontroll("38208114321");
		isikukoodid[1]=new Koodikontroll("89302225714");
		isikukoodid[2]=new Koodikontroll("51408180022");

        for(Koodikontroll kood: isikukoodid){
			System.out.println("Sündinud "+kood.toString()+",\n"+ kood.sugu()+"\n"+ kood.kontroll()+"\n----------");
		} 
 
     }
 }
 
/*
[maisjuli@greeny t02klassid]$ java Koodikontrollmain
Sündinud 11.august 1982,
Mees
Isikukoodis on viga!
----------
Sündinud 22.veebruar 2193,
Esimene number ei sobi soo määramiseks.
Isikukoodis on viga!
----------
Sündinud 18.august 2014,
Mees
Isikukood on kehtiv!
----------
*/