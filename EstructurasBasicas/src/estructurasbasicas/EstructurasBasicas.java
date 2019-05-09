/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasbasicas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class EstructurasBasicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada =  new Scanner (System.in);
        String mensajeFinal = "";
        String nombre = "";
        String apellido = "";
        String profesion = "";
       
        int contador = 1;
        
        mensajeFinal = String.format("%s%s", mensajeFinal, "Informe de la ciudad de Loja\n");
        mensajeFinal = String.format("%s%s", mensajeFinal, "Listado de peronas\n\n");
        
        
        while (contador < 5 ){
            System.out.println("Ingrese su nombre");
            nombre = entrada.nextLine();
            System.out.println("Ingrese su apellido");
            apellido = entrada.nextLine();
            System.out.println("Ingrese su profesión");
            profesion = entrada.nextLine();
     
            mensajeFinal = String.format("%sPersona %d: %s %s - %s\n", mensajeFinal,
                    contador, nombre, apellido, profesion);
            contador = contador + 1; // Para que el contador se incremente
            
            
            /*
            System.out.printf("Persona %d: %s %s - %s\n", contador, nombre,
                    apellido, profesion);
            */
            
                    
        }
        System.out.printf("%s", mensajeFinal);
    }
    
}
