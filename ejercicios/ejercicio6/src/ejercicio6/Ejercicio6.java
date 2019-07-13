/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
     String [][] datos=new String[5][4]; 
     Scanner date=new Scanner(System.in);
     int k=0;
     int contador=0;
        System.out.println("Escriba datos de la persona ");
        for(int i =0;i<=4;i++){
               System.out.println("Nombre");
               String nombre=date.next();
               datos[i][0]=nombre;
               System.out.println("Apellido");
               String apellido=date.next();
               datos[i][1]=apellido;
               System.out.println("Carrera");
               String carrera=date.next();
               datos[i][2]=carrera;
               System.out.println("Trabajo");
               String trabajo =date.next();
               datos[i][3]=trabajo;
               System.out.println(i);
        }
        for( int i=0;i<=4;i++){
            for(int j =0;j<4;j++){
                k=k+1;
                  String mostrar=datos[i][j];
                  System.out.print( " "+mostrar); 
                if(k==4){
                    System.out.println("");
                  k=0;
                }  
            }
        }
        }
    }

    
    

