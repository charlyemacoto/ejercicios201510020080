/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author MAKOTO
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
      String  nombre ; 
      int nota = 0;
      String respuesta; 
        
        Scanner datos = new Scanner(System.in);
        
        System.out.println(" ingrese el nonmbre del alumno");
        
             nombre = datos.next(); 
        
        System.out.println(" ingrese la notal del alumno");
        
        
              nota = datos.nextInt();
              
              
              if ( nota > 70 ){
        
                respuesta = " estudiante aprovado " ;
               
              
              }
            
              else {
                  
                  respuesta = " estudiante reprobada ";
                  
              }
              
              
              System.out.println(" el estudiante : " + nombre );
              
              System.out.println(" tiene una nota de :" + nota );
              
              System.out.println(" esta : " + respuesta );
    }
    
}
