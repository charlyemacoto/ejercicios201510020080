/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author MAKOTO
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner datos = new Scanner ( System.in); 
   
     int numero1=0;
     int numero2=0;
     
     int total=0;
     
         System.out.println(" que operacion desea realizar?" );
      
       System.out.println(" 1) suma ");
       System.out.println(" 2) resta ");
       System.out.println(" 3) multiplicacion ");
       System.out.println(" 4) division");
       System.out.println(" 5) mod");
       
       int menu = datos.nextInt();
       
       System.out.println(" ingrese un numero1 : ");
        
      numero1= datos.nextInt();
       
        System.out.println(" ingrese un numero2 : ");
        
      numero2= datos.nextInt();
       
      switch(menu){
          
          case 1: 
              total = numero1+numero2; 
              
              System.out.println ("la suma de los dos numeros es : " + total );
              break;
              
         case 2: 
              total = numero1- numero2; 
              
              System.out.println ("la resta de los dos numeros es : " + total );  
              break;
              case 3: 
              total = numero1 * numero2; 
              
              System.out.println ("la multiplicacion  de los dos numeros es : " + total );
              break;
              case 4: 
              total = numero1  / numero2; 
              
              System.out.println ("la division  de los dos numeros es : " + total );
    break;
      }
    
}
}
