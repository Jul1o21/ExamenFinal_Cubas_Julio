/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import java.util.Scanner;
import modelo.*;
import repositorio.*;
/**
 *
 * @author cubas
 */
public class AppOutput {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         
        int op1;
        
        
        
        do {

            System.out.println("\tEscoja una Opción");
            System.out.println(" 1.- Acceder como Alumno\n 2.- Acceder como Operario\n0.- Salir del Sistema");

            op1 = teclado.nextInt();

            switch (op1) {

                case 1:
                    
                    break;


                case 2: 
               
                  

                    break;

            }

        } while (op1 != 0);
    }
}
