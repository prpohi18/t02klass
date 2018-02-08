/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8veebr;

import java.io.*;

/**
 *
 * @author ketuo
 */
public class proov4 {
    public static void main(String [] arg) throws Exception {
        PrintWriter pw=new PrintWriter(new FileWriter("f1.txt"));
        pw.println(new pall(3,5,2));
        pw.close();
        
    }
}
