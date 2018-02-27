public class Riigid{
	public static void main(String[] args) {
		riik Eesti = new riik();
		Eesti.nimi = "Eesti Vabariik";
		Eesti.pindala = 45339 + "ruutkilomeetrit";
		Eesti.elanikud = 1318705;
		Eesti.tihedus = elanikud / pindala + "inimest ruutkilomeetri kohta";
		System.out.println(Eesti.nimi + Eesti.pindala + Eesti.elanikud + Eesti.tihedus);
	}
}