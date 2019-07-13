/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner; 


        
        
public class Ejercicio4 {

   
    
    
    
    
    public static void main(String[] args) {
        
        String [ ] nombre = new String [10];
        
        Scanner datos = new Scanner(System.in);
        
        for ( int i = 0; i<10 ; i++ ){ 
        
        System.out.println(" ingrese un nombre : ");
        
        String capture = datos.next(); 
        
        nombre [ i ] = capture; 
               
        
        
    }
        
        System.out.println(" la lista de los nombres que usted ingreso son : ");
        
       for ( int i = 0; i<10 ; i++ ){ 
           
           
        
        System.out.println( i +  " ) " + nombre [ i ] );
        
        
        
    
}
    }
}
