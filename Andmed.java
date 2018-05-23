public class Andmed {
    public static void main(String[] args){
    Meeskond tiim1=new Meeskond("Atletico Madrid", 23, 5, 58, 22);
    Meeskond tiim2=new Meeskond("FC Barcelona", 28, 1, 99, 29);
    Meeskond tiim3=new Meeskond("Real Madrid", 22, 6, 94, 44);
    Meeskond tiim4=new Meeskond("Valencia", 18, 13, 57, 50);
    Meeskond tiim5=new Meeskond("Malaga", 5, 28, 24, 61);
	
	
System.out.println("Meeskonna "+ tiim1.meeskonnanimi+ " võiduprotsent on "+tiim1.voiduprotsent()+" ning siiani on löödud " + tiim1.varavad + " väravat " + "ja oma väravasse on lastud " + tiim1.omale + " väravat."  + " Väravatevahe on: " + tiim1.varavatevahe() + " väravat.");
System.out.println("Meeskonna "+ tiim2.meeskonnanimi+ " võiduprotsent on "+tiim2.voiduprotsent()+" ning siiani on löödud " + tiim2.varavad + " väravat " + "ja oma väravasse on lastud " + tiim2.omale + " väravat."  + " Väravatevahe on: " + tiim2.varavatevahe() + " väravat.");
System.out.println("Meeskonna "+ tiim3.meeskonnanimi+ " võiduprotsent on "+tiim3.voiduprotsent()+" ning siiani on löödud " + tiim3.varavad + " väravat " + "ja oma väravasse on lastud " + tiim3.omale + " väravat."  + "V äravatevahe on: " + tiim3.varavatevahe() + " väravat.");
System.out.println("Meeskonna "+ tiim4.meeskonnanimi+ " võiduprotsent on "+tiim4.voiduprotsent()+" ning siiani on löödud " + tiim4.varavad + " väravat " + " ja oma väravasse on lastud " + tiim4.omale + " väravat."  + "Väravatevahe on: " + tiim4.varavatevahe() + " väravat.");
System.out.println("Meeskonna "+ tiim5.meeskonnanimi+ " võiduprotsent on "+tiim5.voiduprotsent()+" ning siiani on löödud " + tiim5.varavad + " väravat " + " ja oma väravasse on lastud " + tiim5.omale + " väravat." + " Väravatevahe on: " + tiim5.varavatevahe() + " väravat.");
    }

}