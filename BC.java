/*/
Mängija: Rajon Rondo
Vanus: 26
Mänge: 2500
Punkte: 13000

Mängija: Micheal Jordan
Vanus: 28
Mänge: 2600
Punkte: 14000
Mängijate keskmine vanus: 27
Punkte kokku: 27000
/*/

class Boston{
		public String positsioon, nimi;
		public int vanus, mänge, punkte, keskminevanus, punktekokku, mängekokku;
		
}
	
	public class BC{
		public static void main(String[] args){
			
			Boston Rondo = new Boston();
			Rondo.positsioon = "PG";
			Rondo.vanus = 26;
			Rondo.mänge = 2500;
			Rondo.punkte = 13000;
			Rondo.nimi = "Rajon Rondo";
			
			Boston Jordan= new Boston();
			Jordan.positsioon = "SG";
			Jordan.vanus = 28;
			Jordan.mänge = 2600;
			Jordan.punkte = 14000;
			Jordan.nimi = "Micheal Jordan";
			
			
			int keskminevanus;
			int punktekokku;
			int mängekokku;
			keskminevanus = (Rondo.vanus + Jordan.vanus) / 2;
			punktekokku = Rondo.punkte + Jordan.punkte;
			mängekokku = Rondo.mänge + Jordan.mänge;
			
			System.out.println("Mängija: " +Rondo.nimi);
			System.out.println("Vanus: " +Rondo.vanus);
			System.out.println("Mänge: " +Rondo.mänge);
			System.out.println("Punkte: " +Rondo.punkte);
			System.out.println(" ");
			System.out.println("Mängija: " +Jordan.nimi);
			System.out.println("Vanus: " +Jordan.vanus);
			System.out.println("Mänge: " +Jordan.mänge);
			System.out.println("Punkte: " +Jordan.punkte);
 			System.out.println("Mängijate keskmine vanus: "+keskminevanus);
			System.out.println("Punkte kokku: "+punktekokku);
		}
	} 