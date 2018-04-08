public class Tunnused{
	public static void main(String[] arg){
		Kassid esimene=new Kassid("Miisu", 0.3);
		Kassid teine=new Kassid("Simba", 14);
		Kassid kolmas=new Kassid("Gringo", 5.5);

			

System.out.println("Esimese kassi vanus inimeseaastates on " + esimene.kassiaastad() + " aastat.");
System.out.println("Teise kassi vanus inimeseaastates on " + teine.kassiaastad() + " aastat.");
System.out.println("Kolmanda kassi vanus inimeseaastates on " + kolmas.kassiaastad() + " aastat.");

	}
}
