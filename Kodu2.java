public class Kodu2 {
	public static void main(String[] arg){
		mangijad mangija1 = new mangijad("James Harden", 1.96, 99.8, "SG", 31.5);
		mangijad mangija2 = new mangijad("Kevin Durant", 2.06, 109, "SF", 26.0);
		mangijad mangija3 = new mangijad("Lebron James", 2.03, 113, "SF", 26.5);
		mangijad mangija4 = new mangijad("Stephen Curry", 1.9, 86, "PG", 27.2);
		mangijad mangija5 = new mangijad("Russell Westbrook", 1.91, 91, "PG", 25.5);
		System.out.println(mangija1.nimi() + " kehamassi indeks on: " + mangija1.bmi() + " Ja ta viskas " + mangija1.punkteperbmi() +" punkti kehamassiindeksi kohta");
		System.out.println(mangija2.nimi() + " kehamassi indeks on: " + mangija2.bmi() + " Ja ta viskas " + mangija2.punkteperbmi() +" punkti kehamassiindeksi kohta");
		System.out.println(mangija3.nimi() + " kehamassi indeks on: " + mangija3.bmi() + " Ja ta viskas " + mangija3.punkteperbmi() +" punkti kehamassiindeksi kohta");
		System.out.println(mangija4.nimi() + " kehamassi indeks on: " + mangija4.bmi() + " Ja ta viskas " + mangija4.punkteperbmi() +" punkti kehamassiindeksi kohta");
		System.out.println(mangija5.nimi() + " kehamassi indeks on: " + mangija5.bmi() + " Ja ta viskas " + mangija5.punkteperbmi() +" punkti kehamassiindeksi kohta");

	}
	
}