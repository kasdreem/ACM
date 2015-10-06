/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package telefono;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Telefono {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Npantallas=0, resto=0, acciones=0, posicion=0;
        
        Scanner leer =new Scanner (System.in);
        System.out.println("numero de aplicaciones");
        int n=leer.nextInt();
        System.out.println("numero de aplicaciones que se pondran en marcha");
        int m=leer.nextInt();
        System.out.println("numero de iconos que se encuentra en la misma pantalla");
        int k=leer.nextInt();
        
        ArrayList <Integer> aplicaciones= new ArrayList<Integer>();
        
        //ingresar las aplicaciones
        for(int i=0;i<n;i++){
        aplicaciones.add(leer.nextInt());
        }
        
        //numero de pantallas
        Npantallas=n/k;
        resto=n%k;
        if(resto!=0){
            Npantallas++;
        }
        //aplicaiones que se usaran
        for(int i=0;i<m;i++){
        System.out.println("aplicaciones a usar");
        int Ausar=leer.nextInt();
        acciones=Ausar/k;
        acciones++;
        posicion=Ausar-1;
       // aplicaciones.set(Ausar, posicion);
        }
        
        System.out.println(Npantallas);
        
        Iterator<Integer> it= aplicaciones.iterator();
           
        while(it.hasNext()){
        Integer elemento=it.next();
           System.out.println(elemento+"/");
    }
           
    
    }

    
    
}
