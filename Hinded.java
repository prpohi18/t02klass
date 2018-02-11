public class Hinded{
	protected String opilasenimi;
	protected String kood;
	protected String aine1nimi;
	protected String aine1kood;
	protected double aine1eap;
	protected double aine1hinne;
	protected String aine2nimi;
	protected String aine2kood;
	protected double aine2eap;
	protected double aine2hinne;
	protected String aine3nimi;
	protected String aine3kood;
	protected double aine3eap;
	protected double aine3hinne;
	protected String aine4nimi;
	protected String aine4kood;
	protected double aine4eap;
	protected double aine4hinne;
	protected String aine5nimi;
	protected String aine5kood;
	protected double aine5eap;
	protected double aine5hinne;
	
	public double hinnesum(int aine1hinne, int aine2hinne, int aine3hinne, int aine4hinne, int aine5hinne){
		double HIN=aine1hinne+aine2hinne+aine3hinne+aine4hinne+aine5hinne;
		return HIN;	
	}
		
	public double eapsum(int aine1eap, int aine2eap, int aine3eap, int aine4eap, int aine5eap){
		double EAP=aine1eap+aine2eap+aine3eap+aine4eap+aine5eap;
		return EAP;				
	}
	
	public double kkh(int aine1eap, int aine1hinne, int aine2eap, int aine2hinne, int aine3eap, int aine3hinne, int aine4eap, int aine4hinne, int aine5eap, int aine5hinne){		
		double A=(aine1eap*aine1hinne)+(aine2eap*aine2hinne)+(aine3eap*aine3hinne)+(aine4eap*aine4hinne)+(aine5eap*aine5hinne);
		double KKH = A/(aine1eap+aine2eap+aine3eap+aine4eap+aine5eap);
		return KKH;			
		
	}	
}


/*
Keskmine kaalutud hinne (KKH) teatava õppeperioodi kohta arvutatakse kõigi antud perioodil 
sooritatud õppeainete hinnete ja Euroopa ainepunkti süsteemi ainepunktide (EAP) korrutiste 
summa jagamisel antud perioodil sooritatud vastavate õppeainete EAP kogusummaga. 

KKH arvutatakse järgmise valemi alusel:

EAP1xH1 + EAP2xH2 ... + ... EAPnxHn
---------------------------------
EAP1 + EAP2 ... + ... EAPn
*/