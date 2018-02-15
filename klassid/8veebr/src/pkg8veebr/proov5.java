/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8veebr;
import java.io.*;
import java.util.*;
/**
 *
 * @author ketuo
 */
public class proov5 {
     public static void main(String[] args)throws Exception{
         BufferedReader br=new BufferedReader(new FileReader("sisend.txt"));
         String rida=br.readLine();
         List<pall> pallid=new ArrayList<pall>();
         while(rida!=null){
             System.out.println(rida);
             String[] tykid=rida.split(" ");
             pallid.add(new pall(Double.parseDouble(tykid[0]),Double.parseDouble(tykid[1]),Double.parseDouble(tykid[2])));
             rida=br.readLine();
             
         }
         br.close();
         System.out.println(pallid);
     }
}
