/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teatro;

import java.util.Scanner;


/**
 *
 * @author Usuario
 */
public class Teatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long x=0,y=0,rx=0,ry=0;
        long resultado=0;
        Scanner leer =new Scanner (System.in);
     
       
        long n=leer.nextInt();
       
        long m=leer.nextInt();
        
        long
                a=leer.nextInt();
        
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
        resultado=(y*x);
        
        System.out.println(resultado);
       
    }
    
}
