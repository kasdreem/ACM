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
        Scanner in = new Scanner(System.in);
		int a = in.nextInt();		
		
		for(int i=0; i<a; i++){
			String palabra = in.next();
			if(palabra.length()>=10){
				int largo = palabra.length()-2;
				System.out.print((palabra.charAt(0))+""+largo+""+(palabra.charAt(palabra.length()-1)));
			}else{
				System.out.println(palabra);
			}
				}
       // System.out.println(a);
        
       // for(int i=0;i<n;i++){
         //   System.out.println(palabra.charAt(i));
        //}
        
      /**  
        Scanner sc = new Scanner( System.in); 

     System.out.print( "Ingrese una frase: "); 
     String frase = sc.nextLine(); 
     int cont[] = new int[26]; 

     for(int i = 0; i < frase.length(); i++){ 
          char c = Character.toLowerCase( frase.charAt(i)); 
               if(c >= 'a' && c <= 'z' ) 
                    cont[c - 'a']++; 
     } 

     for(int i = 0; i < 26; i++) {
          if(cont[i] > 0) 
               System.out.println( (char)(i + 'a') ); 
}
    }*/
    
}
}