/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodutöö;
import java.io.*;
import java.util.Arrays;
/**
 *
 * @author student
 */
public class Proov {
    public static void main(String[] arg) throws IOException{
        String[] jalgpallurid = new String[3];
       
        for (int i = 0; i < jalgpallurid.length; i++) {
            
//            Scanner scanner = new Scanner(System.in);
            System.out.println("Sisesta jalgpalluri nimi ja perekonnanimi");
//            String nimi = scanner.next();
//            String perekonnanimi = scanner.next();
//            jalgpallurid[i] = nimi + " " + perekonnanimi;
//            System.out.println(Arrays.toString(jalgpallurid));
//            scanner.close();
         try
           {

           BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
           String nimi=buffer.readLine();
           String perekonnanimi=buffer.readLine();
           System.out.println("Jalgpalluri nimi ja perekonnanimi on salvestatud: '" + nimi + " " + perekonnanimi + "'");
           jalgpallurid[i] = nimi + " " + perekonnanimi;
            }
            catch(Exception e){}
             
        }
        
//        System.out.println("Võistkond on: " + Arrays.toString(jalgpallurid));
        System.out.println("Sisesta võistkonna nimi: ");
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        String vnimi=buffer.readLine();
        System.out.println("Voistkond nimega '" + vnimi + "' on salvestatud.\n võistkonna liikmed: " + Arrays.toString(jalgpallurid));
    }
}



/*

Output:

Sisesta jalgpalluri nimi ja perekonnanimi
Sergei
Frolov
Jalgpalluri nimi ja perekonnanimi on salvestatud: 'Sergei Frolov'
Sisesta jalgpalluri nimi ja perekonnanimi
Lol
Wut
Jalgpalluri nimi ja perekonnanimi on salvestatud: 'Lol Wut'
Sisesta jalgpalluri nimi ja perekonnanimi
Lel
Ljl
Jalgpalluri nimi ja perekonnanimi on salvestatud: 'Lel Ljl'
Sisesta võistkonna nimi: 
Fc FC
Voistkond nimega 'Fc FC' on salvestatud.
 võistkonna liikmed: [Sergei Frolov, Lol Wut, Lel Ljl]

*/