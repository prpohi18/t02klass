package ladu;

public class ladu1 {

	public static void main(String[] args) {
		toode makaronid = new toode ();
		makaronid.Id = 48;
		makaronid.nimi = "Makaronid";
		makaronid.hind = 0.99;
		makaronid.kogus = 15;
		System.out.println("Toote id: "+makaronid.Id+ ", toode: "+makaronid.nimi+", toote hind: "+makaronid.hind+", toote kogus: "+makaronid.kogus+ ".");
		
		toode kartulid = new toode ();
		kartulid.Id = 39;
		kartulid.nimi = "Kartulid";
		kartulid.hind = 0.28;
		kartulid.kogus = 30;
		System.out.println("Toote id: "+kartulid.Id+ ", toode: "+kartulid.nimi+", toote hind: "+kartulid.hind+", toote kogus: "+kartulid.kogus+ ".");

		
		toode kohupiim = new toode ();
		kohupiim.Id = 15;
		kohupiim.nimi = "Kohupiim";
		kohupiim.hind = 1.09;
		kohupiim.kogus = 7;
		System.out.println("Toote id: "+kohupiim.Id+ ", toode: "+kohupiim.nimi+", toote hind: "+kohupiim.hind+", toote kogus: "+kohupiim.kogus+ ".");

		
		toode juust = new toode ();
		juust.Id = 42;
		juust.nimi = "Juust";
		juust.hind = 1.20;
		juust.kogus = 27;
		System.out.println("Toote id: "+juust.Id+ ", toode: "+juust.nimi+", toote hind: "+juust.hind+", toote kogus: "+juust.kogus+ ".");
		
		toode keeduvorst = new toode ();
		keeduvorst.Id = 44;
		keeduvorst.nimi = "Keeduvorst";
		keeduvorst.hind = 1.23;
		keeduvorst.kogus = 20;
//		System.out.println("Toote id: "+keeduvorst.Id+ ", toode: "+keeduvorst.nimi+", toote hind: "+keeduvorst.hind+", toote kogus: "+keeduvorst.kogus+ ".");

		
		toode sibul = new toode ();
		sibul.Id = 56;
		sibul.nimi = "Sibul";
		sibul.hind = 0.36;
		sibul.kogus = 32;
		System.out.println("Toote id: "+sibul.Id+ ", toode: "+sibul.nimi+", toote hind: "+sibul.hind+", toote kogus: "+sibul.kogus+ ".");

	}

}
