/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.



lisan pallile raadiuse, kas 2 palli puutuvad kokku
 */
package pkg8veebr;

/**
 *
 * @author ketuo
 */
public class proov {
 public static void main(String [] arg){
   pall p1=new pall(3,5, 0.3);
   pall p2= new pall(4,6, 0.5);
   pall p3=new pall(-10, 8, 2);
   System.out.println(p1);
   System.out.println(p2);
   System.out.println(p3);
   System.out.println(p1+ "Kaugus nullist: "+p1.kaugusNullist());
   System.out.println(p2+ "Kaugus nullist: "+p2.kaugusNullist());
   System.out.println("omavaheline kaugus: "+p1.kaugusPallist(p2));
   System.out.println(p1.kokkupuude(p2));
   if(p1.kasPuutub(p2)){System.out.println("1 ja 2 puutuvad");}

       if(p1.kasPuutub(p3)){System.out.println("1 ja 3 puutuvad");}

       else{System.out.println("1 ja 3 ei puutu");}
 }
 }   

