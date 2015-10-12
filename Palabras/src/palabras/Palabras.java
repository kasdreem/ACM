/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package palabras;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Palabras {

    /**
     * @param args the command line arguments
     */
     
    public static void main(String[] args) {
        int n=0;
        
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();		
        String palabra[]=new String[a];
        for(int i=0; i<a; i++){
            
        palabra[i] = in.next();
        
	
        
	}
        for(int i=0;i<a;i++){
        n=palabra[i].length();
        if(palabra[i].length()>10){
        int largo = palabra[i].length()-2;
	System.out.println((palabra[i].charAt(0))+""+largo+""+(palabra[i].charAt(n-1)));
	}else{
	System.out.println(palabra[i]);
        }
        }
      
    
}
}