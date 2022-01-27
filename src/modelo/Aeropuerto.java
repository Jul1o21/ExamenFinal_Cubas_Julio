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
public class Aeropuerto {
    private String nombre;
    private String direccion;
    private boolean estado;

    public Aeropuerto(String nombre, String direccion, boolean estado) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void activar() {
        this.estado = true;
    }
    public void suspender() {
        this.estado = false;
    }

    
    
    
    @Override
    public String toString() {
        return "Aeropuerto(" + "nombre:" + nombre + " direccion:" + direccion + " estado:" + estado + ')';
    }
    
    
}
