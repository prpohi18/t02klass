
package algus;

import java.util.Arrays;
/**
 *
 * @author ketuo
 */
public class massiivid {
    //funktsioon mis tagastab kaheelemendilise massiivi, mille esimeseks elemendiks on etteantud arvudest suurim ja teiseks vähim
    public static int summa(int[] arvud){
     int summa=0;

      for(int i=0; i<arvud.length; i++){

         summa+=arvud[i];

      } 
      return summa;
    }   
    public static double keskmine(int[] arvud){
      return summa(arvud)*0.1/arvud.length;
    
    }
    public static int[] piirid(int[] arvud){
    int[] vastus=new int[2];
    if(arvud==null){
        throw new RuntimeException("parameetri väärtus null");
        
    }
    if(arvud.length==0){
        throw new RuntimeException("parameetriks tühi massiiv");
        
        
    }
    int max=0;
    int min=100000;
        for(int i=0;i<arvud.length; i++){
        if(arvud[i]>max){
            max=arvud[i];
        }
        if(arvud[i]<min){
            min=arvud[i];
        }
    vastus[0]=min;
    vastus[1]=max;
        }return vastus;
    
        }
    public static void main(String[] arg){
     int[] pikkused={176, 163, 158, 171, 169}; 
     int[] t = piirid(pikkused);
     System.out.println(summa(pikkused));
     System.out.println(keskmine(pikkused));
     System.out.println(t[0]+" "+t[1]);
     
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

/* 837
16.740000000000002
158 176
Kokku: 5
176 169
176
163
158
171
169
summa on: 837
837
837
837 */