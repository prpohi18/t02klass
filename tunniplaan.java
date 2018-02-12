class Päev{
	public String nimi;
		public String tunnid;
		public String päev;
		public int tundidearv;
		public int tundidearvnädalas;
}
	

public class tunniplaan{
		
		
		
		
		public static void main(String[] args){
			
			Päev esmaspäev = new Päev();
			
			esmaspäev.nimi = "Mari Maasikas";
			esmaspäev.tunnid = "Matemaatika, Eesti keel, Loodusõpetus";
			esmaspäev.päev = "Esmaspäev";
			esmaspäev.tundidearv = 5;
			
			Päev teisipäev = new Päev();
			
			teisipäev.nimi = "Mari Maasikas";
			teisipäev.tunnid = "Kunstiõpetus, Kirjandus, Ajalugu";
			teisipäev.päev = "Teisipäev";
			teisipäev.tundidearv = 3;
			
			Päev kolmapäev = new Päev();
			
			kolmapäev.nimi = "Mari Maasikas";
			kolmapäev.tunnid = "Eesti keel, Matemaatika, Vene keel";
			kolmapäev.päev = "Kolmapäev";
			kolmapäev.tundidearv = 4;
			
			Päev neljapäev = new Päev();
			
			neljapäev.nimi = "Mari Maasikas";
			neljapäev.tunnid = "Matemaatika";
			neljapäev.päev = "Neljapäev";
			neljapäev.tundidearv = 2;
			
			Päev reede = new Päev();
			
			reede.nimi = "Mari Maasikas";
			reede.tunnid = "Vene keel, Eesti keel";
			reede.päev = "Reede";
			reede.tundidearv = 3;
			
			int tundidearvnädalas;
			int tundidearvsemestris;
			int semestrinädalad;
			tundidearvnädalas = esmaspäev.tundidearv + teisipäev.tundidearv + kolmapäev.tundidearv + neljapäev.tundidearv + reede.tundidearv;
			semestrinädalad = 16;
			tundidearvsemestris = tundidearvnädalas * semestrinädalad;
			
			System.out.println("Päev:" +esmaspäev.päev+ "           Nimi:" +esmaspäev.nimi+ "           Tunnid: " +esmaspäev.tunnid+ "           Tundide arv: " +esmaspäev.tundidearv);
			System.out.println("Päev:" +teisipäev.päev+ "           Nimi:" +teisipäev.nimi+ "           Tunnid: " +teisipäev.tunnid+ "           Tundide arv: " +teisipäev.tundidearv);
			System.out.println("Päev:" +kolmapäev.päev+ "           Nimi:" +kolmapäev.nimi+ "           Tunnid: " +kolmapäev.tunnid+ "           Tundide arv: " +kolmapäev.tundidearv);
			System.out.println("Päev:" +neljapäev.päev+ "           Nimi:" +neljapäev.nimi+ "           Tunnid: " +neljapäev.tunnid+ "           Tundide arv: " +neljapäev.tundidearv);
			System.out.println("Päev:" +reede.päev+ "               Nimi:" +reede.nimi+ "               Tunnid: " +reede.tunnid+ "               Tundide arv: " +reede.tundidearv);
			System.out.println("Tundide arv nädalas on: "+tundidearvnädalas);
			System.out.println("Tundide arv semestris on: "+tundidearvsemestris);

			
			
			
		}

	
	}