/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package taxi2;

import java.util.ArrayList;
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
      int Ngrupos=0;
      int a = 0,b=0,c=0,d=0;

    //1<=n<=10^5
        String n =JOptionPane.showInputDialog("ingrese numero de grupos") ;
        Ngrupos=Integer.parseInt(n);
        int arr[]=new int[Ngrupos];
   //1<=s<=4 numeros entre 1y4
        for(int i=0;i<arr.length;i++){
    
        String n1 =JOptionPane.showInputDialog("ingrese cantida de alumnos en el grupo");
        int x=Integer.parseInt(n1);
        arr[i]=x;

        }
        int arr1[]=new int[Ngrupos];
        int arr2[]=new int[Ngrupos];
        int arr3[]=new int[Ngrupos];
        int arr4[]=new int[Ngrupos];
        
        //grupo de 4 personas
        for(int i=0;i<arr.length;i++){
        if(arr[i]==4){
            arr4[i]=arr[i];
            d++;
        }
        }
        
        //grupo de 3 personas
        for(int i=0;i<arr.length;i++){
        if(arr[i]==3){
            arr3[i]=arr[i];
            c++;
        }
        }
        //grupo de 2 personas
        for(int i=0;i<arr.length;i++){
        if(arr[i]==2){
            arr2[i]=arr[i];
            b++;
        }
        }
        //grupo de 1 personas
        for(int i=0;i<arr.length;i++){
        if(arr[i]==1){
            arr1[i]=arr[i];
            a++;
        }
        }
        
        //numero de taxis
            a=a-c; 
        if(d<0){
           a=0;
        c++;
        }
        
        a=a-2;
        if(b%2==1 && a<0){
            b++;
        }
        b=b/2;
        
        if (a>0){
        a=a%4;
        if (a>0){
            a++;
        }
        }else{
            a=0;
        }
        
        
            System.out.println(d);
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
            
            int suma= (int) (a+b+c+d);
           System.out.println("el numero dde taxis es: "+suma);
            
    }
}
    

