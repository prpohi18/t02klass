public class Ristkulik{
	double pikkus, laius;
	public Ristkulik(double a, double b){
		
		if(a <= 0 && b <= 0){
			throw new RuntimeException("Pikkus/Laius ei tohi olla null voi vaiksem");
		}
		pikkus = a;
		laius = b;	
	}
	
	public double pindala(){
		double pindala;
		pindala = pikkus*laius;
		return pindala;
	}
	
	public double umbermoot(){
		double umbermoot;
		umbermoot = (pikkus+laius)*2;
		return umbermoot;
	}
	
	public String say(){
		return "Ristkuliku laius on " +laius+ "pikkus on " +pikkus+ "cm. Pindala on "+pindala()+" ja umbermoot on "+umbermoot()+".";
	}
} 