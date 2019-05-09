/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejosswitch;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class UsoSwitch5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner entrada =  new Scanner (System.in);

        String placa;
        
        System.out.println("Ingrese la placa de su vehículo");
        placa = entrada.nextLine();
        
        
        char valor = placa.charAt(0);
                
        switch(valor){
            case'E':
                System.out.printf("Su placa con inicial %s pertenece a "
                        + "la provincia de Esmeraldas %s\n", 
                        valor, placa.toUpperCase());
                break;
            
            case 'O':
                System.out.printf("Su placa con inicial %s pertenece a "
                        + "la provincia de El Oro %s\n", 
                        valor, placa.toLowerCase());
                break;    
            
            case 'G':
                System.out.printf("Su placa con inicial %s pertenece a "
                        + "la provincia del Guayas %s\n", 
                        valor, placa.toLowerCase());
                break;
                
            case 'M':
                    System.out.printf("Su placa con inicial %s pertenece a "
                        + "la provincia de Manabí %s\n", 
                        valor, placa.toLowerCase());
                    break;
                    
            case 'R':
                System.out.printf("Su placa con inicial %s pertenece a "
                        + "la provincia de Los Rios %s\n", 
                        valor, placa.toLowerCase());
                break;
                
            case 'Y':
                System.out.printf("Su placa con inicial %s pertenece a "
                        + "la provincia de Santo Domingo de los Tsáchilas %s\n", 
                        valor, placa.toLowerCase());
                break;
                
            case 'J':
                System.out.printf("Su placa con inicial %s pertenece a "
                        + "la provincia de El Oro %s\n", 
                        valor, placa.toLowerCase());
                    
                
               
            default:
                System.out.println("Ingrese una placa de vehículo "
                        + "perteneciente a la Costa");
                
        }
        
    }
}
 // Desarrollar una aplicacion que me permita ingresar placas de carros, 
// se asumme que las placas ingresadas a la region costa del ecuador
// en base a la placa nuestro programa determinará y presentará la placa con la 
// provincia a la que pertenece
