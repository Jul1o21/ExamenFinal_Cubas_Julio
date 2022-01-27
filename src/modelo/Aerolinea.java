/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author cubas
 */
public class Aerolinea {

    private String nombre;
    private String RUC;
    private int indice;
    private Vuelo VueloA[];

    public Aerolinea(String nombre, String RUC, int cantvuelos, Vuelo[] VueloA) {
        this.nombre = nombre;
        this.RUC = RUC;
        this.indice = 0;
        this.VueloA = new Vuelo[cantvuelos];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public Vuelo[] getVueloATotales() {
        return VueloA;
    }

    public void setVueloA(Vuelo[] VueloA) {
        this.VueloA = VueloA;
    }

    public Vuelo[] getVueloActivos() {
        Vuelo[] vuelosactivos = null;
        return vuelosactivos;
    }

    public Pasajero[] getPasajerosenelvuelo(Vuelo vueloelegido) {
        Pasajero[] pasajerosdelvuelo = null;
        return pasajerosdelvuelo;
    }
    
    public Vuelo[] getVuelosdeunaciudad(Ciudad ciudadelegida,Date fecha) {
        Vuelo[] vuelosciudad = null;
        
        return vuelosciudad;
    }
    
    
    
}
