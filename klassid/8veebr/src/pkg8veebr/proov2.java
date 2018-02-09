/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8veebr;

/**
 *
 * @author ketuo
 */
public class proov2 {
    public static void main(String[] arg){
        pall[] pallid = new pall[3];
        pallid[0]=new pall(3,5);
        pallid[1]= new pall(4,6);
        pallid[2]=new pall(-10, 8, 2);
        int kaugeim = 0;
       for(int i=0; i<pallid.length; i++){
           System.out.println(pallid[i]);
           if(pallid[i].kaugusNullist()>pallid[kaugeim].kaugusNullist()){
               kaugeim = i;
           }
//alguspunktist kaugeim pall
   
      
      
       
       
       
       
       } 
       System.out.println("Kaugeim: "+pallid[kaugeim]);
       pall kaugeimpall = pallid[0];
       for (pall p: pallid){
           if(p.kaugusNullist()>kaugeimpall.kaugusNullist()){
               kaugeimpall = p;
           }
       }
       System.out.println("Kaubeim pall: "+kaugeimpall);
    }
   
}
