package t02klass;
public class main{  
public static void main(String[] arg){
        Ruumala r1=new Ruumala (4,11,6);
        Ruumala r2=new Ruumala (4,3,9);
        
        System.out.println("Põhja Pindala on "+r1.põhjaPindala()+"\n");
        System.out.println("Põhja Pindala on "+r2.põhjaPindala()+"\n");
        System.out.println("Diagonaal on "+r1.diagonaal()+"\n");
        System.out.println("Diagonaal on "+r2.diagonaal()+"\n");
        System.out.println("Ruumala "+r1.ristRuumala()+"\n");
        System.out.println("Ruumala "+r2.ristRuumala()+"\n");
        System.out.println(r1.KasOnSuurem(r2)+"\n");
       
       
    }
    
}