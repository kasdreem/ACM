/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sandia;


import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Sandia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       int resto=0, peso=0;
       //String n1=JOptionPane.showInputDialog("ingresar peso"); 
       //peso=Integer.parseInt(n1);
       Scanner leer =new Scanner (System.in);
       peso=leer.nextInt();
      // peso=(int) (Math.random()*100+1);
        
        
        if (peso % 2 == 0 && peso > 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    
        // System.out.println(peso);
    }
    
}
