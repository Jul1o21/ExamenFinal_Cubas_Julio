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
                    ArregloPasajero pasajerospordefect;
        Pasajero pasajeroadd;
        Date fechanaci;
        fechanaci = new Date();

        pasajerospordefect = new ArregloPasajero(6);

        pasajeroadd = new Pasajero("pasajeroTDoc1", "pasajeroNumDoc1", "pasajeroNames1", "pasajeroApellid1", fechanaci);
        pasajerospordefect.agregar(pasajeroadd);
        pasajeroadd = new Pasajero("pasajeroTDoc2", "pasajeroNumDoc2", "pasajeroNames2", "pasajeroApellid2", fechanaci);
        pasajerospordefect.agregar(pasajeroadd);
        pasajeroadd = new Pasajero("pasajeroTDoc3", "pasajeroNumDoc3", "pasajeroNames3", "pasajeroApellid3", fechanaci);
        pasajerospordefect.agregar(pasajeroadd);
        pasajeroadd = new Pasajero("pasajeroTDoc4", "pasajeroNumDoc4", "pasajeroNames4", "pasajeroApellid4", fechanaci);
        pasajerospordefect.agregar(pasajeroadd);
        pasajeroadd = new Pasajero("pasajeroTDoc5", "pasajeroNumDoc5", "pasajeroNames5", "pasajeroApellid5", fechanaci);
        pasajerospordefect.agregar(pasajeroadd);
        pasajeroadd = new Pasajero("pasajeroTDoc6", "pasajeroNumDoc6", "pasajeroNames6", "pasajeroApellid6", fechanaci);
        pasajerospordefect.agregar(pasajeroadd);
        
                    System.out.println(pasajerospordefect);
                    break;

                case 5:
                    System.out.println(Repositorio.vuelossistema);
                    break;
            }

        } while (op1 != 0);
    }
}
