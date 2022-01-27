/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Date;
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
                    + "\n5.-Mostrar los vuelos del sistema \n6.-Comprar un boleto de avison ");

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
                case 6:
                    Pasajero pasajerotest = new Pasajero("DNI", "1111", "Nombretest", "ApellidosTest", new Date());

                    int numeroaciento;

                    System.out.println("Digite el numero de asiento y el codigo del vuelom, se le asignara la fila 1 ");
                    String codigo;

                    numeroaciento = teclado.nextInt();
                    teclado.nextLine();
                    codigo = teclado.nextLine();

                    Repositorio.pasajerotest.comprar(Repositorio.vuelossistema.encontrarvuelo(codigo), '1', 1, Repositorio.pasajerotest);

                    System.out.println(Repositorio.vuelossistema);

                    break;

                case 7:
                    
                    
                    System.out.println("Digite el codigod de la ciudad del aeropuerto que desea");
                    
                    
                    break;

                case 8:
                    break;
            }

        } while (op1 != 0);
    }
}
