public class Hinded{
	protected double kood;
	protected double aine1eap;
	protected double aine1hinne;
	protected double aine2eap;
	protected double aine2hinne;
	protected double aine3eap;
	protected double aine3hinne;
	
	public double hinnesum(int aine1hinne, int aine2hinne, int aine3hinne){
		double HIN=aine1hinne+aine2hinne+aine3hinne;
		return HIN;	
	}
		
	public double eapsum(int aine1eap, int aine2eap, int aine3eap){
		double EAP=aine1eap+aine2eap+aine3eap;
		return EAP;	
	
		
	}
	
	public double kkh(int aine1eap, int aine1hinne, int aine2eap, int aine2hinne, int aine3eap, int aine3hinne){
		
		double KKH=((aine1eap*aine1hinne)+(aine2eap*aine2hinne)+(aine3eap*aine3hinne)/(aine1eap+aine2eap+aine3eap));
		return KKH;			
		
	}
		
	
	
}


/*
Keskmine kaalutud hinne (KKH) teatava õppeperioodi kohta arvutatakse kõigi antud perioodil sooritatud õppeainete hinnete ja Euroopa ainepunkti süsteemi ainepunktide (EAP) korrutiste summa jagamisel antud perioodil sooritatud vastavate õppeainete EAP kogusummaga. KKH arvutatakse järgmise valemi alusel:

EAP1xH1 + EAP2xH2 ... + ... EAPnxHn
---------------------------------
EAP1 + EAP2 ... + ... EAPn
*/