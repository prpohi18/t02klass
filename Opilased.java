import java.io.*;

public class Opilased{

	public static void main(String[] args)throws IOException{
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Sisesta õpilase nimi:");
		String opilasenimi=buffer.readLine();
		
		System.out.println("Sisesta õpilase kood:");
		String kood=buffer.readLine();
		
		System.out.println("Sisesta 1. aine nimetus:");
		String aine1nimi=buffer.readLine();
			
		System.out.println("Sisesta aine1 EAP:");
		String Aine1EAP=buffer.readLine();
		int aine1eap=Integer.parseInt(Aine1EAP);

		System.out.println("Sisesta aine1 hinne:");
		String Aine1HINNE=buffer.readLine();
		int aine1hinne=Integer.parseInt(Aine1HINNE);
		
		System.out.println("Sisesta 2. aine nimetus:");
		String aine2nimi=buffer.readLine();
		
		System.out.println("Sisesta aine2 EAP:");
		String Aine2EAP=buffer.readLine();
		int aine2eap=Integer.parseInt(Aine2EAP);

		System.out.println("Sisesta aine2 hinne:");
		String Aine2HINNE=buffer.readLine();
		int aine2hinne=Integer.parseInt(Aine2HINNE);
		
		System.out.println("Sisesta 3. aine nimetus:");
		String aine3nimi=buffer.readLine();
		
		System.out.println("Sisesta aine3 EAP:");
		String Aine3EAP=buffer.readLine();
		int aine3eap=Integer.parseInt(Aine3EAP);

		System.out.println("Sisesta aine3 hinne:");
		String Aine3HINNE=buffer.readLine();
		int aine3hinne=Integer.parseInt(Aine3HINNE);
		
		System.out.println("Sisesta 4. aine nimetus:");
		String aine4nimi=buffer.readLine();
		
		System.out.println("Sisesta aine4 EAP:");
		String Aine4EAP=buffer.readLine();
		int aine4eap=Integer.parseInt(Aine4EAP);

		System.out.println("Sisesta aine4 hinne:");
		String Aine4HINNE=buffer.readLine();
		int aine4hinne=Integer.parseInt(Aine4HINNE);
		
		System.out.println("Sisesta 5. aine nimetus:");
		String aine5nimi=buffer.readLine();
		
		System.out.println("Sisesta aine5 EAP:");
		String Aine5EAP=buffer.readLine();
		int aine5eap=Integer.parseInt(Aine5EAP);

		System.out.println("Sisesta aine5 hinne:");
		String Aine5HINNE=buffer.readLine();
		int aine5hinne=Integer.parseInt(Aine5HINNE);
		
		Hinded opilane  = new Hinded();
		
		opilane.opilasenimi = opilasenimi;
		opilane.kood = kood;
		opilane.aine1nimi = aine1nimi;
		opilane.aine1eap = aine1eap;
		opilane.aine1hinne = aine1hinne;
		opilane.aine2nimi = aine2nimi;
		opilane.aine2eap = aine2eap;
		opilane.aine2hinne = aine2hinne;
		opilane.aine3nimi = aine3nimi;
		opilane.aine3eap = aine3eap;
		opilane.aine3hinne = aine3hinne;	
		opilane.aine4nimi = aine4nimi;
		opilane.aine4eap = aine4eap;
		opilane.aine4hinne = aine4hinne;
		opilane.aine5nimi = aine5nimi;
		opilane.aine5eap = aine5eap;
		opilane.aine5hinne = aine5hinne;
	
		double hinnesum = opilane.hinnesum(aine1hinne, aine2hinne, aine3hinne, aine4hinne, aine5hinne);	
		double eapsum = opilane.eapsum(aine1eap, aine2eap, aine3eap, aine4eap, aine5eap);	
		double kkh = opilane.kkh(aine1eap, aine1hinne, aine2eap, aine2hinne, aine3eap, aine3hinne, aine4eap, aine4hinne, aine5eap, aine5hinne);	
		System.out.printf("\nÕpilase nimi: %s \nÕpilase kood: %s \nÕppekava maht: %.0fEAP \nHinnete summa: %.2f \nKKH: %.2f", opilane.opilasenimi, opilane.kood, eapsum, hinnesum, kkh);
		System.out.printf("\nAine: %s (%.0fEAP HINNE: %.0f)\nAine: %s (%.0fEAP HINNE: %.0f)\nAine: %s (%.0fEAP HINNE: %.0f)\nAine: %s (%.0fEAP HINNE: %.0f)\nAine: %s (%.0fEAP HINNE: %.0f)", 
				opilane.aine1nimi, opilane.aine1eap, opilane.aine1hinne, 
				opilane.aine2nimi, opilane.aine2eap, opilane.aine2hinne,
				opilane.aine3nimi, opilane.aine3eap, opilane.aine3hinne,
				opilane.aine4nimi, opilane.aine4eap, opilane.aine4hinne,
				opilane.aine5nimi, opilane.aine5eap, opilane.aine5hinne);		

	}
}

		