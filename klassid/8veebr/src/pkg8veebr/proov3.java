/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8veebr;


import java.util.*;

/**
 *
 * @author ketuo
 */
public class proov3 {
    public static void main(String[] arg){
        List<pall> pallid = new ArrayList<pall>();
        pallid.add(new pall(3,5));
        pallid.add(new pall(3,8));
        pallid.add(new pall(2,5,2));
        pallid.add(new pall(-3,5));
        //kuva suurima raadiusega pall
        pall max=pallid.get(0);
       
        for(pall p:pallid){
           if(p.getZ()>max.getZ()){
               max=p;
           }
            
           
        }System.out.println("suurim: "+max);
    }
}
