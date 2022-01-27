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
public class ArregloAeropuerto {

    private int indice;
    private Aeropuerto AeropuertoA[];

    public ArregloAeropuerto(int cantidadaeropuertos, Aeropuerto[] AeropuertoA) {
        this.indice = 0;
        this.AeropuertoA = new Aeropuerto[cantidadaeropuertos];
    }

    public boolean agregaraerop(Aeropuerto aeropuerto) {
        boolean result = false;

        result = true;
        return result;
    }

    public Aeropuerto[] obteneraeropuertospais(Pais pais) {
        Aeropuerto[] aeropuertos = null;

       
        return aeropuertos;
    }
    
    public Aeropuerto obteneraeropuertociudad(Ciudad ciudad) {
        Aeropuerto aeropuerto = null;

       
        return aeropuerto;
    }
    
    
    @Override
    public String toString() {
        return "ArregloAeropuerto{" + "AeropuertoA=" + AeropuertoA + '}';
    }

}
