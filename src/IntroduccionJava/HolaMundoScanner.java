/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroduccionJava;

import java.util.Scanner;

/**
 *
 * @author usand
 */
public class HolaMundoScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        
        String nombre= leer.next();
        
        System.out.println("Aca esta " +nombre+ " haciendo su primer programa en Java");
    }
    
}
