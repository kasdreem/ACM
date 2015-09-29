/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domino;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Domino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int x=0,y=0,area=0,Ndomino=0;
        Scanner leer =new Scanner (System.in);
     
        System.out.println("n");
        int n=leer.nextInt();
        System.out.println("m");
        int m=leer.nextInt();
        
        area=n*m;
        Ndomino=area/2;
        
        System.out.println(Ndomino);
    }
    
}
