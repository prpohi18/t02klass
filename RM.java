class RealMadrid{
		public String positsioon, nimi;
		public int vanus, mänge, väravaid, keskminevanus;
		
}
	
public class RM{
		public static void main(String[] args){
			
			RealMadrid Ronaldo = new RealMadrid();
			Ronaldo.positsioon = "Ründaja";
			Ronaldo.vanus = 33;
			Ronaldo.mänge = 286;
			Ronaldo.väravaid = 300;
			Ronaldo.nimi = "Cristiano Ronaldo";
			
			RealMadrid Bale = new RealMadrid();
			Bale.positsioon = "Keskpoolik";
			Bale.vanus = 28;
			Bale.mänge = 112;
			Bale.väravaid = 60;
			Bale.nimi = "Gareth Bale";
			
			
			int keskminevanus;
			int väravaidkokku;
			int mängekokku;
			keskminevanus = (Ronaldo.vanus + Bale.vanus) / 2;
			väravaidkokku = Ronaldo.mänge + Bale.mänge;
			mängekokku = Ronaldo.väravaid + Bale.väravaid;
			
			System.out.println("Mängija: " +Ronaldo.nimi);
			System.out.println("Vanus: " +Ronaldo.vanus);
			System.out.println("Mänge: " +Ronaldo.mänge);
			System.out.println("Väravaid: " +Ronaldo.väravaid);
			System.out.println(" ");
			System.out.println("Mängija: " +Bale.nimi);
			System.out.println("Vanus: " +Bale.vanus);
			System.out.println("Mänge: " +Bale.mänge);
			System.out.println("Väravaid: " +Bale.väravaid);
 			System.out.println("Mängijate keskmine vanus: "+keskminevanus);
			System.out.println("Väravaid kokku: "+väravaidkokku);
		}
	} java 
	
	/*
	
	
[aljarand@greeny kodutoo]$ java RM
Mängija: Cristiano Ronaldo
Vanus: 33
Mänge: 286
Väravaid: 300

Mängija: Gareth Bale
Vanus: 28
Mänge: 112
Väravaid: 60
Mängijate keskmine vanus: 30
Väravaid kokku: 398
[aljarand@greeny kodutoo]$


*/