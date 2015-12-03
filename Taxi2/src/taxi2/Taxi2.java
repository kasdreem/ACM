/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package taxi2;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Taxi2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     



    
        Scanner in = new Scanner(System.in);

        int taxis = 0,grup1 = 0,grup2 = 0,grup3 = 0;
        
        int cantgrupos = in.nextInt();
        
        for(int i=0; i<cantgrupos; i++){
            int a = in.nextInt();
            if(a == 1)grup1++;
            if(a == 2)grup2++;
            if(a == 3){
                grup3++;
                taxis++;
            }
            if(a == 4)taxis++;  
        }
        grup1 -= grup3;
        
        if(grup2>1)taxis += grup2/2;
        if(grup2%2 != 0){
            taxis++;
            grup1 -= 2;
        }
        if(grup1 > 0){
            taxis += grup1/4;
        if(grup1%4 != 0){
            taxis++;
        }
        }
        System.out.println(taxis);
    }
}
    

