public class Teisendamine{
	public static void main(String[] args){
		Kodutöö2 rahatäht1=new Kodutöö2(15);
		Kodutöö2 rahatäht2=new Kodutöö2(45);
		System.out.println(rahatäht1);
		System.out.println(rahatäht2);
		System.out.println("Esimese rahatähe väärtus on "+rahatäht1.$()+" dollarit");
		System.out.println("Teise rahatähe väärtus on "+rahatäht2.eestiraha()+" eesti krooni");
		System.out.println("Esimese ja teise rahatähe summa taani kroonides on: "+(rahatäht1.traha()+rahatäht2.traha()));
		System.out.println(rahatäht1.euro(rahaühik.DOLLAR));
		System.out.println(rahatäht1.euro(rahaühik.TKROON));
		System.out.println(rahatäht1.euro(rahaühik.EKROON));
		Kodutöö2 rahatäht3=rahatäht2.eralda(2);
		System.out.println(rahatäht1+" "+rahatäht2+" "+rahatäht3+".");
		rahatäht1.ühenda(rahatäht2.eralda(4));
		System.out.println(rahatäht1+" "+rahatäht2+" "+rahatäht3+".");
		rahatäht1.ühenda(rahatäht2);
		System.out.println("Rahatähtede väärtused: "+rahatäht1.euro(rahaühik.EURO)+" ja "+rahatäht2.euro(rahaühik.EURO)+" eurot");
	}
}