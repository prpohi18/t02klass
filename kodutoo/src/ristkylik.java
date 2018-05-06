public class ristkylik{
	double pikkus, laius;
	public ristkylik(double a, double b){
		
		if(a <= 0 && b <= 0){
			throw new RuntimeException("Pikkus peab olema nullist suurem");
		}
		
		pikkus = a;
		laius = b;	
	}
	
	public double pindala(){
		double pindala;
		pindala = pikkus*laius;
		return pindala;
	}
	
	public double ymbermoot(){
		double ymbermoot;
		ymbermoot = (pikkus+laius)*2;
		return ymbermoot;
	}
	
	public String say(){
		return "Ristkyliku pikkus on " +pikkus+ "cm ja laius on " +laius+ "cm. Pindala on "+pindala()+"cm2 ja ymbermoot on "+ymbermoot()+"cm.";
	}
}