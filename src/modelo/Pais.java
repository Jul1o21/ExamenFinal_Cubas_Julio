/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Arrays;

/**
 *
 * @author cubas
 */
public class Pais {
    private String codigo;
    private String nombre;
    private Ciudad CiudadA[];
    private int indice;
    
    public Pais(String codigo, String nombre, Ciudad ciudad, int cantidadciudades) {  
        this.codigo = codigo;
        this.nombre = nombre;
        this.indice = 0;
        this.CiudadA = new Ciudad[cantidadciudades];
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ciudad[] getCiudadA() {
        return CiudadA;
    }

    public void setCiudadA(Ciudad[] CiudadA) {
        this.CiudadA = CiudadA;
    }

    @Override
    public String toString() {
        return "Pais(" + "codigo:" + codigo + ", nombre: " + nombre + " Ciudades: " + Arrays.toString(CiudadA) +  ')';
    }

   
}
