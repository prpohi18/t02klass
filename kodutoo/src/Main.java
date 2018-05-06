public class Main{
	public static void main(String[] args){
		
		ristkylik kujund1 = new ristkylik(6, 3);
		ristkylik kujund2 = new ristkylik(8, 5);
		
		System.out.println(kujund1.pindala());
		System.out.println(kujund1.say());
		
		System.out.println(kujund2.pindala());
		System.out.println(kujund2.say());
		
		
	}
}

/*
18.0
Ristkyliku pikkus on 6.0cm ja laius on 3.0cm. Pindala on 18.0cm2 ja ymbermoot on 18.0cm.
40.0
Ristkyliku pikkus on 8.0cm ja laius on 5.0cm. Pindala on 40.0cm2 ja ymbermoot on 26.0cm.
*/