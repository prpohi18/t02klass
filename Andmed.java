public class Andmed {
    public static void main(String[] args){
    Meeskond tiim1=new Meeskond("Borussia Dortmund", 6, 2, 11);
    Meeskond tiim2=new Meeskond("FC Barcelona", 8, 0, 13);
    Meeskond tiim3=new Meeskond("Chelsea", 5, 3, 8);
    Meeskond tiim4=new Meeskond("Juventus", 4, 4, 5);
    Meeskond tiim5=new Meeskond("Levadia", 2, 6, 3);
System.out.println("Meeskonna "+ tiim1.meeskonnanimi+ " võiduprotsent on "+tiim1.voiduprotsent()+" ja hooaja esimesel poolel löödi " + tiim1.varavad + " väravat.");
System.out.println("Meeskonna "+ tiim2.meeskonnanimi+ " võiduprotsent on "+tiim2.voiduprotsent()+" ja hooaja esimesel poolel löödi " + tiim2.varavad + " väravat.");
System.out.println("Meeskonna "+ tiim3.meeskonnanimi+ " võiduprotsent on "+tiim3.voiduprotsent()+" ja hooaja esimesel poolel löödi " + tiim3.varavad + " väravat.");
System.out.println("Meeskonna "+ tiim4.meeskonnanimi+ " võiduprotsent on "+tiim4.voiduprotsent()+" ja hooaja esimesel poolel löödi " + tiim4.varavad + " väravat.");
System.out.println("Meeskonna "+ tiim5.meeskonnanimi+ " võiduprotsent on "+tiim5.voiduprotsent()+" ja hooaja esimesel poolel löödi " + tiim5.varavad + " väravat.");
    }

}
