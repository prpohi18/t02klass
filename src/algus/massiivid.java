
package algus;

import java.util.Arrays;
/**
 *
 * @author ketuo
 */
public class massiivid {
    public static int summa(int[] arvud){
     int summa=0;

      for(int i=0; i<arvud.length; i++){

         summa+=arvud[i];

      } 
      return summa;
        
        
    }
    public static void main(String[] arg){
     int[] pikkused={176, 163, 158, 171, 169}; 
     System.out.println("Kokku: "+pikkused.length);
     System.out.println(pikkused[0]+" "+pikkused[pikkused.length-1]);
     int sum;
     sum = 0;
     for(int i=0; i<pikkused.length; i++){
        System.out.println(pikkused[i]);
        sum = sum + pikkused[i];
     }
     System.out.println("summa on: "+sum);
     
     
     
     int summa=0;

      for(int i=0; i<pikkused.length; i++){

         summa+=pikkused[i];

      }

      System.out.println(summa);

      summa=0;

      for(int pikkus: pikkused){summa+=pikkus;}

      System.out.println(summa);

      System.out.println(Arrays.stream(pikkused).sum());
     }
    
    }

