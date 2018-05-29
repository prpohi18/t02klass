package klass;

public class Klass {

    
    public static void main(String[] args) {
        
        soogid sai = new soogid();
        sai.hind = (float) 0.59;
        sai.kogus = 1;
        
        soogid leib = new soogid();
        leib.hind = (float) 0.69;
        leib.kogus = 2;
         
        soogid liha_konserv = new soogid();
        liha_konserv.hind = (float) 3.3;
        liha_konserv.kogus = 4;
        
        soogid kala_konserv = new soogid();
        kala_konserv.hind = (float) 3.1;
        kala_konserv.kogus = 2;       
        
        float kogusumma;
        float kogu_kogus;
        float keskmine;
        int kokku = 4;
        

         
         
        kogusumma = sai.hind + leib.hind + liha_konserv.hind + kala_konserv.hind;
        keskmine = (sai.hind + leib.hind + liha_konserv.hind + kala_konserv.hind)/kokku;
        kogu_kogus = sai.kogus + leib.kogus + liha_konserv.kogus + kala_konserv.kogus; 
        
        
        
        
        System.out.println("Kogusumma: "+kogusumma);
        System.out.println("Kogu kogus: "+kogu_kogus);
        System.out.println("Keskmine hind: "+keskmine);
        
        
        
    }    
}
    

/*
Kogusumma: 5.88
kogu kogus: 9.0
keskmine hind: 1.47

*/