/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package team2;

import java.util.Scanner;


/**
 *
 * @author Usuario
 */
public class Team2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int suma=0,x=0;
        int a=0,b=0,c=0;
        Scanner leer =new Scanner (System.in);
        
        //do{
         
        
        int n=leer.nextInt();
         //if(n<0 || n>1001 ){
           //  System.out.println("el numero es menor que uno o mayor que 1000 ingrese nuevamente");
         //}
         //}while(Nproblemas<1 || Nproblemas>100);
        
        for (int i=0;i<n;i++){
        
        a=leer.nextInt();
        
        b=leer.nextInt();
       
        c=leer.nextInt();
            
            suma=a+b+c;
            if(suma>=2){
              x++;
            }
          
         }
        System.out.println(x);
        }
    }
    

