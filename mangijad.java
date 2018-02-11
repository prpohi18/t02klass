import java.lang.Math;
public class mangijad {
	protected String nimi;
	protected double pikkus;
	protected double kaal;
	protected String positsioon;
	protected double punktid;
    public mangijad(String name, double height, double weight, String position, double points){
		nimi = name;
		pikkus = height;
		kaal = weight;
		positsioon = position;
		punktid = points;
    }
	
	public double bmi() {
		double indeks = Math.round(kaal/(pikkus*pikkus)*100) / 100.0;
		return indeks;
	}
	
	public String nimi() {
		return nimi;
	}
	
	public double punkteperbmi() {
		double tere = Math.round(punktid/bmi()*100) / 100.0;
		return tere;
		
	}
}