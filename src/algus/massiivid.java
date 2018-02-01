
package algus;

/**
 *
 * @author ketuo
 */
public class massiivid {
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
     }
    
    }

