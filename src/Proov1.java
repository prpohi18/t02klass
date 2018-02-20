
public class Proov1 {
	public static void main(String[] args) {
		Hoim sample1=new Hoim("UkuBuku", 14932, "ILCE");
		Hoim sample2=new Hoim("ChakaLaka", 5433, "CL");
		
		System.out.println(sample1.name+" "+sample1.qnt+" "+sample1.locale+
				" "+sample1.dangerTotal());
		System.out.println(sample2.name+" "+sample2.qnt+" "+sample2.locale+
				" "+sample2.dangerTotal());
	}

}
