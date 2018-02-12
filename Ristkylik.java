public class Ristkylik{
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
	
	public double ymberm66t(){
		double ymberm66t;
		ymberm66t = (pikkus+laius)*2;
		return ymberm66t;
	}
	
	public String say(){
		return "Ristkyliku laius on " +laius+ " ja pikkus on " +pikkus+ "cm. Pindala on "+pindala()+"ruut cm ja ymberm66t on "+ymberm66t()+"cm.";
	}
}