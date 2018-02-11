import java.io.*;

public class Opilased{

	public static void main(String[] args)throws IOException{
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\nSisesta õpilase nimi:");
		String opilasenimi=buffer.readLine();
		
		System.out.println("Sisesta õpilase "+opilasenimi+" kood:");
		String kood=buffer.readLine();
//aine 1 kasutaja poolsed sisestused
		System.out.println("Sisesta aine nimetus:");
		String aine1nimi=buffer.readLine();
		
		System.out.println("Sisesta aine "+aine1nimi+" kood:");
		String aine1kood=buffer.readLine();
			
		System.out.println("Sisesta aine "+aine1nimi+" ("+aine1kood+")"+" EAP maht:");
		String Aine1EAP=buffer.readLine();
		int aine1eap=Integer.parseInt(Aine1EAP);

		System.out.println("Sisesta õpilase "+opilasenimi+" aine "+aine1nimi+" ("+aine1kood+")"+" hinne:");
		String Aine1HINNE=buffer.readLine();
		int aine1hinne=Integer.parseInt(Aine1HINNE);
//aine 2 kasutaja poolsed sisestused	
		System.out.println("Sisesta aine nimetus:");
		String aine2nimi=buffer.readLine();
		
		System.out.println("Sisesta aine "+aine2nimi+" kood:");
		String aine2kood=buffer.readLine();
		
		System.out.println("Sisesta aine "+aine2nimi+" ("+aine2kood+")"+" EAP maht:");
		String Aine2EAP=buffer.readLine();
		int aine2eap=Integer.parseInt(Aine2EAP);

		System.out.println("Sisesta õpilase "+opilasenimi+" aine "+aine2nimi+" ("+aine2kood+")"+" hinne:");
		String Aine2HINNE=buffer.readLine();
		int aine2hinne=Integer.parseInt(Aine2HINNE);
//aine 3 kasutaja poolsed sisestused				
		System.out.println("Sisesta aine nimetus:");
		String aine3nimi=buffer.readLine();
		
		System.out.println("Sisesta aine "+aine3nimi+" kood:");
		String aine3kood=buffer.readLine();
		
		System.out.println("Sisesta aine "+aine3nimi+" ("+aine3kood+")"+" EAP maht:");
		String Aine3EAP=buffer.readLine();
		int aine3eap=Integer.parseInt(Aine3EAP);

		System.out.println("Sisesta õpilase "+opilasenimi+" aine "+aine3nimi+" ("+aine3kood+")"+" hinne:");
		String Aine3HINNE=buffer.readLine();
		int aine3hinne=Integer.parseInt(Aine3HINNE);
//aine 4 kasutaja poolsed sisestused		
		System.out.println("Sisesta aine nimetus:");
		String aine4nimi=buffer.readLine();
		
		System.out.println("Sisesta aine "+aine4nimi+" kood:");
		String aine4kood=buffer.readLine();
		
		System.out.println("Sisesta aine "+aine4nimi+" ("+aine4kood+")"+" EAP maht:");
		String Aine4EAP=buffer.readLine();
		int aine4eap=Integer.parseInt(Aine4EAP);

		System.out.println("Sisesta õpilase "+opilasenimi+" aine "+aine4nimi+" ("+aine4kood+")"+" hinne:");
		String Aine4HINNE=buffer.readLine();
		int aine4hinne=Integer.parseInt(Aine4HINNE);
//aine 5 kasutaja poolsed sisestused				
		System.out.println("Sisesta aine nimetus:");
		String aine5nimi=buffer.readLine();
		
		System.out.println("Sisesta aine "+aine5nimi+" kood:");
		String aine5kood=buffer.readLine();
		
		System.out.println("Sisesta aine "+aine5nimi+" ("+aine5kood+")"+" EAP maht:");
		String Aine5EAP=buffer.readLine();
		int aine5eap=Integer.parseInt(Aine5EAP);

		System.out.println("Sisesta õpilase "+opilasenimi+" aine "+aine5nimi+" ("+aine5kood+")"+" hinne:");
		String Aine5HINNE=buffer.readLine();
		int aine5hinne=Integer.parseInt(Aine5HINNE);
		
		Hinded opilane  = new Hinded();
		
		opilane.opilasenimi = opilasenimi;
		opilane.kood = kood;
		opilane.aine1nimi = aine1nimi;
		opilane.aine1kood = aine1kood;
		opilane.aine1eap = aine1eap;
		opilane.aine1hinne = aine1hinne;
		opilane.aine2nimi = aine2nimi;
		opilane.aine2kood = aine2kood;
		opilane.aine2eap = aine2eap;
		opilane.aine2hinne = aine2hinne;
		opilane.aine3nimi = aine3nimi;
		opilane.aine3kood = aine3kood;
		opilane.aine3eap = aine3eap;
		opilane.aine3hinne = aine3hinne;	
		opilane.aine4nimi = aine4nimi;
		opilane.aine4kood = aine4kood;
		opilane.aine4eap = aine4eap;
		opilane.aine4hinne = aine4hinne;
		opilane.aine5nimi = aine5nimi;
		opilane.aine5kood = aine5kood;
		opilane.aine5eap = aine5eap;
		opilane.aine5hinne = aine5hinne;
	
		double hinnesum = opilane.hinnesum(aine1hinne, aine2hinne, aine3hinne, aine4hinne, aine5hinne);	
		double eapsum = opilane.eapsum(aine1eap, aine2eap, aine3eap, aine4eap, aine5eap);	
		double kkh = opilane.kkh(aine1eap, aine1hinne, aine2eap, aine2hinne, aine3eap, aine3hinne, aine4eap, aine4hinne, aine5eap, aine5hinne);	
		System.out.printf("\nÕpilase nimi: %s \nÕpilase kood: %s \nÕppekava täidetud maht: %.0fEAP \nHinnete summa: %.2f \nKKH: %.2f\n", opilane.opilasenimi, opilane.kood, eapsum, hinnesum, kkh);
		System.out.printf("\nÕpilase õppekava tulemused:\n%s (%s) [%.0f EAP / HINNE %.0f]\n%s (%s) [%.0f EAP / HINNE %.0f]\n%s (%s) [%.0f EAP / HINNE %.0f]\n%s (%s) [%.0f EAP / HINNE %.0f]\n%s (%s) [%.0f EAP / HINNE %.0f]\n\n", 
				opilane.aine1nimi, opilane.aine1kood, opilane.aine1eap, opilane.aine1hinne, 
				opilane.aine2nimi, opilane.aine2kood, opilane.aine2eap, opilane.aine2hinne,
				opilane.aine3nimi, opilane.aine3kood, opilane.aine3eap, opilane.aine3hinne,
				opilane.aine4nimi, opilane.aine4kood, opilane.aine4eap, opilane.aine4hinne,
				opilane.aine5nimi, opilane.aine5kood, opilane.aine5eap, opilane.aine5hinne);		
	}
}

/*
[tammkert@greeny t02klass]$ javac Opilased.java
[tammkert@greeny t02klass]$ javac Hinded.java
[tammkert@greeny t02klass]$ java Opilased

Sisesta õpilase nimi:
Miki Hiir
Sisesta õpilase Miki Hiir kood:
1790483IFIFB.DT
Sisesta aine nimetus:
Andmebaaside projekteerimine
Sisesta aine Andmebaaside projekteerimine kood:
IFI6013.DT
Sisesta aine Andmebaaside projekteerimine (IFI6013.DT) EAP maht:
3
Sisesta õpilase Miki Hiir aine Andmebaaside projekteerimine (IFI6013.DT) hinne:
5
Sisesta aine nimetus:
Programmeerimise alused
Sisesta aine Programmeerimise alused kood:
IFI6074.DT
Sisesta aine Programmeerimise alused (IFI6074.DT) EAP maht:
4
Sisesta õpilase Miki Hiir aine Programmeerimise alused (IFI6074.DT) hinne:
4
Sisesta aine nimetus:
Veebiprogrammeerimine
Sisesta aine Veebiprogrammeerimine kood:
IFI6076.DT
Sisesta aine Veebiprogrammeerimine (IFI6076.DT) EAP maht:
4
Sisesta õpilase Miki Hiir aine Veebiprogrammeerimine (IFI6076.DT) hinne:
5
Sisesta aine nimetus:
Digipädevuste baaskursus
Sisesta aine Digipädevuste baaskursus kood:
IFI6206.DT
Sisesta aine Digipädevuste baaskursus (IFI6206.DT) EAP maht:
3
Sisesta õpilase Miki Hiir aine Digipädevuste baaskursus (IFI6206.DT) hinne:
4
Sisesta aine nimetus:
Operatsioonisüsteemide alused ja haldamine
Sisesta aine Operatsioonisüsteemide alused ja haldamine kood:
IFI6209.DT
Sisesta aine Operatsioonisüsteemide alused ja haldamine (IFI6209.DT) EAP maht:
6
Sisesta õpilase Miki Hiir aine Operatsioonisüsteemide alused ja haldamine (IFI6209.DT) hinne:
5

Õpilase nimi: Miki Hiir
Õpilase kood: 1790483IFIFB.DT
Õppekava täidetud maht: 20EAP
Hinnete summa: 23.00
KKH: 4.65

Õpilase õppekava tulemused:
Andmebaaside projekteerimine (IFI6013.DT) [3 EAP / HINNE 5]
Programmeerimise alused (IFI6074.DT) [4 EAP / HINNE 4]
Veebiprogrammeerimine (IFI6076.DT) [4 EAP / HINNE 5]
Digipädevuste baaskursus (IFI6206.DT) [3 EAP / HINNE 4]
Operatsioonisüsteemide alused ja haldamine (IFI6209.DT) [6 EAP / HINNE 5]

[tammkert@greeny t02klass]$
*/