/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author cubas
 */
public class ArregloPasajero {

    private int indice;
    private Pasajero PasajeroA[];

    public ArregloPasajero(int cantidadpasajeros) {
        this.indice = 0;
        this.PasajeroA = new Pasajero[cantidadpasajeros];

    }

    public Pasajero[] getPasajeroA() {
        return PasajeroA;
    }

    public boolean eliminar(String tipodoc, String numerDoc) {
        boolean result = false;

        result = true;
        return result;
    }

    public Pasajero getpasajero(String tipodoc, String numerDoc) {
        Pasajero resultPasa = null;

        return resultPasa;
    }

  

    public boolean agregarpasajero(Pasajero pasajero) {
        boolean result = false;
        Pasajero[] TempPasajeros;
        
        
        TempPasajeros = new Pasajero[this.indice + 1];
        for (int i = 0; i < this.indice; i++) {
            TempPasajeros[i] = this.PasajeroA[i];
        }

        this.PasajeroA = TempPasajeros;
        System.out.println(pasajero);
        this.PasajeroA[this.indice] = pasajero;
        this.indice++;
        System.out.println("Pasajero agregado con exito");
        result = true;
        return result;

    }

    @Override
    public String toString() {
        return "ArregloPasajero{" + "PasajeroA=" + PasajeroA + '}';
    }

}
