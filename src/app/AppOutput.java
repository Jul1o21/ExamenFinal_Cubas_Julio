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
            System.out.println("LAS SIGUIENTES ACCIONES ESTAN DISPONIBLES PARA LOS DATOS DEL REPOSITORIO");
            System.out.println("\tEscoja una Opción");
            System.out.println("\n1.Reiniciar sistema \n2.-Mostrar Aeropuertos del sistema \n3.-Mostrar los paises del sistema \n4.-Mostrar los pasajeros del sistema"
                    + "\n5.-Mostrar los vuelos del sistema \n6.-Comprar un boleto de avison \n7.-Suspender un aeropuerto con el codigo de la ciudad"
                    + "\n8.-Activar un aeropuerto con el codigo de la ciudad "
                    + "\n9.-Cancelar aciento ");

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
                    String codigo7;

                    System.out.println("Digite el codigod de la ciudad del aeropuerto que desea suspender");
                    teclado.nextLine();
                    codigo7 = teclado.nextLine();

                    Repositorio.aeropuertosistema.obteneraeropuertociudad(codigo7).suspender();

                    break;

                case 8:
                    String codigo8;

                    System.out.println("Digite el codigod de la ciudad del aeropuerto que desea activar");
                    teclado.nextLine();
                    codigo8 = teclado.nextLine();
                    
                    Repositorio.aeropuertosistema.obteneraeropuertociudad(codigo8).activar();
                    break;
                    
                case 9:
                    String codigo9;
                    System.out.println("Digite el codigod del vuelo del que quiere reservar");

                    codigo9 = teclado.nextLine();
                    
                   break;
            }

        } while (op1 != 0);
    }
}
