public class Hinded{
	protected double kood;
	protected double aine1eap;
	protected double aine1hinne;
	protected double aine2eap;
	protected double aine2hinne;
	protected double aine3eap;
	protected double aine3hinne;
	
	public double kkh(int aine1hinne, int aine2hinne, int aine3hinne){
		double KKH=aine1hinne+aine2hinne+aine3hinne;
		return KKH;	
	}
		
	public double eapsum(int aine1eap, int aine2eap, int aine3eap){
		double EAP=aine1eap+aine2eap+aine3eap;
		return EAP;			
		
	}
	
}