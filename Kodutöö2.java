//Omaloodud klass konkreetse objekti või nähtuse mudelina. Saab küsida objekti kohta mitmesuguseid andmeid 
//Näitprogrammid kahe eraldi objekti kasutamise kohta ning arvutused objektide andmekogumi kohta
public class Kodutöö2{
	protected double eraha;
	public Kodutöö2(double euro){
		eraha=euro;
	}
	public String toString(){
		return "Rahatäht väärtusega "+eraha+" eurot";
	}
	public double $(){
		return eraha*1.23;
	}
	public double traha(){
		return eraha*7.4489;
	}
	public double eestiraha(){
		return eraha*15.6466;
	}
	public double euro(rahaühik ühik){
		if(ühik==rahaühik.EURO){return eraha;}
		if(ühik==rahaühik.DOLLAR){return eraha*1.23;}
		if(ühik==rahaühik.TKROON){return eraha*7.4489;}
		if(ühik==rahaühik.EKROON){return eraha*15.6466;}
		if(ühik==null){
			throw new RuntimeException("Ühik puudub");
		}
		throw new RuntimeException("Tundmatu ühik " + ühik);
	}
	public Kodutöö2 ühenda(Kodutöö2 lisatav){
		eraha+=lisatav.eraha;
		lisatav.eraha=0;
		return this;
	}
	public Kodutöö2 eralda(double eurod){
		if(eurod>eraha){
			throw new RuntimeException("Ei jagu piisavalt");
		}
		Kodutöö2 uus=new Kodutöö2(eurod);
		eraha-=eurod;
		return uus;
	}
}
//Rahatäht väärtusega 15.0 eurot
//Rahatäht väärtusega 45.0 eurot
//Esimese rahatähe väärtus on 18.45 dollarit
//Teise rahatähe väärtus on 704.097 eesti krooni
//Esimese ja teise rahatähe summa taani kroonides on: 446.93399999999997
//18.45
//111.7335
//234.69899999999998
//Rahatäht väärtusega 15.0 eurot Rahatäht väärtusega 43.0 eurot Rahatäht väärtusega 2.0 eurot.
//Rahatäht väärtusega 19.0 eurot Rahatäht väärtusega 39.0 eurot Rahatäht väärtusega 2.0 eurot.
//Rahatähtede väärtused: 58.0 ja 0.0 eurot


