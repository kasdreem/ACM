/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teatro;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Teatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x=0,y=0,rx=0,ry=0;
        
        Scanner leer =new Scanner (System.in);
     
        System.out.println("n");
        int n=leer.nextInt();
        System.out.println("m");
        int m=leer.nextInt();
        System.out.println("a");
        int a=leer.nextInt();
        x=m/a;
        rx=m%a;
        y=n/a;
        ry=n%a;
        if(rx>0){
            x++;
        }
        if(ry>0){
            y++;
        }
        n=x*y;
        System.out.println(n);
    }
    
}
