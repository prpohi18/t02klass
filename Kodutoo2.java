import java.io.*;

public class Kodutoo2{

	public static void main(String[] args) throws IOException{
		BufferedReader sisse=new BufferedReader(new InputStreamReader(System.in));
		
		String maksusysteem="";
		
		while(!maksusysteem.equals("fikseeritud") && !maksusysteem.equals("kombineeritud") 
			&& !maksusysteem.equals("astmeline")){
		System.out.println("Millise maksusysteemi valite (fikseeritud/kombineeritud/astmeline)?");
		maksusysteem=sisse.readLine();
		}
		
		System.out.println("Sisesta t66taja nimi:");
		String nimi=sisse.readLine();
			
		System.out.println("Sisesta t66taja p6hipalk:");
		String P6hipalk=sisse.readLine();
		double p6hipalk=Double.parseDouble(P6hipalk);
			
		System.out.println("Sisesta t66taja lisatasud:");
		String Lisatasud=sisse.readLine();
		double lisatasud=Double.parseDouble(Lisatasud);
			
		System.out.println("Sisesta t66taja preemia:");
		String Preemia=sisse.readLine();
		double preemia=Double.parseDouble(Preemia);
		
		Maksusysteem t66taja = new Maksusysteem();
		
		t66taja.nimi = nimi;
		t66taja.p6hipalk = p6hipalk;
		t66taja.lisatasud = lisatasud;
		t66taja.preemia = preemia;
		
		if(maksusysteem.equals("fikseeritud")){
			System.out.println("Sisesta fikseeritud maksum22r:");
			String Maksum22r=sisse.readLine();
			int maksum22r=Integer.parseInt(Maksum22r);
			
			double palk = t66taja.fikseeritud(maksum22r);
			System.out.printf("T66taja %s sai palka %.2f eurot.", t66taja.nimi, palk);
		}
		
		if(maksusysteem.equals("kombineeritud")){
			System.out.println("Sisesta p6hipalga maksum22r:");
			String P6hi_protsent=sisse.readLine();
			int p6hi_protsent=Integer.parseInt(P6hi_protsent);
			
			System.out.println("Sisesta lisatasude maksum22r:");
			String Lisa_protsent=sisse.readLine();
			int lisa_protsent=Integer.parseInt(Lisa_protsent);
			
			System.out.println("Sisesta preemia maksum22r:");
			String Preemia_protsent=sisse.readLine();
			int preemia_protsent=Integer.parseInt(Preemia_protsent);
			
			double palk = t66taja.kombineeritud(p6hi_protsent, lisa_protsent, preemia_protsent);
			System.out.printf("T66taja %s sai palka %.2f eurot.", t66taja.nimi, palk);
		}
		
		if(maksusysteem.equals("astmeline")){
			System.out.println("Sisesta esimese astme maksum22r:");
			String Aste1=sisse.readLine();
			int aste1=Integer.parseInt(Aste1);
			
			System.out.println("Sisesta teise astme maksum22r:");
			String Aste2=sisse.readLine();
			int aste2=Integer.parseInt(Aste2);
			
			System.out.println("Sisesta kolmanda astme maksum22r:");
			String Aste3=sisse.readLine();
			int aste3=Integer.parseInt(Aste3);
			
			System.out.println("Sisesta neljanda astme maksum22r:");
			String Aste4=sisse.readLine();
			int aste4=Integer.parseInt(Aste4);
			
			double palk = t66taja.astmeline(aste1, aste2, aste3, aste4);
			System.out.printf("T66taja %s sai palka %.2f eurot.", t66taja.nimi, palk);
		}
	}
}