import java.io.*;

public class Opilased{

	public static void main(String[] args)throws IOException{
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Sisesta õpilase kood:");
		String Kood=buffer.readLine();
		int kood=Integer.parseInt(Kood);		
			
		System.out.println("Sisesta aine1 EAP:");
		String Aine1EAP=buffer.readLine();
		int aine1eap=Integer.parseInt(Aine1EAP);

		System.out.println("Sisesta aine1 hinne:");
		String Aine1HINNE=buffer.readLine();
		int aine1hinne=Integer.parseInt(Aine1HINNE);
		
		System.out.println("Sisesta aine2 EAP:");
		String Aine2EAP=buffer.readLine();
		int aine2eap=Integer.parseInt(Aine2EAP);

		System.out.println("Sisesta aine2 hinne:");
		String Aine2HINNE=buffer.readLine();
		int aine2hinne=Integer.parseInt(Aine2HINNE);
		
		System.out.println("Sisesta aine3 EAP:");
		String Aine3EAP=buffer.readLine();
		int aine3eap=Integer.parseInt(Aine3EAP);

		System.out.println("Sisesta aine3 hinne:");
		String Aine3HINNE=buffer.readLine();
		int aine3hinne=Integer.parseInt(Aine3HINNE);
		
		Hinded opilane  = new Hinded();
		
		opilane.kood = kood;
		opilane.aine1eap = aine1eap;
		opilane.aine1hinne = aine1hinne;
		opilane.aine2eap = aine2eap;
		opilane.aine2hinne = aine2hinne;
		opilane.aine3eap = aine3eap;
		opilane.aine3hinne = aine3hinne;	
	
		double kkh = opilane.kkh(aine1hinne, aine2hinne, aine3hinne);	
		double eapsum = opilane.kkh(aine1eap, aine2eap, aine3eap);	
		System.out.printf("Õpilane %.1f õppekava maht on %.1f ja KKH on %.2f", opilane.kood, eapsum, kkh);	
	}
}

		