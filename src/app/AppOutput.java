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

        Repositorio.reiniciarsistema();

        Scanner teclado = new Scanner(System.in);

        int op1;

        do {

            System.out.println("\tEscoja una Opción");
            System.out.println("\n1.Reiniciar sistema \n2.-Mostrar Aeropuertos del sistema \n3.-Mostrar los paises del sistema \n4.-Mostrar los pasajeros del sistema"
                    + "\n5.-Mostrar los vuelos del sistema");

            op1 = teclado.nextInt();

            switch (op1) {

                case 1:
                    Repositorio.reiniciarsistema();
                    break;

                case 2:
                    System.out.println(Repositorio.aeropuertosistema);
                    break;

                case 3:
                    System.out.println(Repositorio.paisesessta);
                    break;
                case 4:
                    System.out.println(Repositorio.pasajerossistema);
                    break;

                case 5:
                    System.out.println(Repositorio.vuelossistema);
                    break;
            }

        } while (op1 != 0);
    }
}
