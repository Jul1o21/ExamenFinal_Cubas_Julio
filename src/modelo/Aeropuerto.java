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
    private Ciudad ciudad;

    public Aeropuerto(String nombre, String direccion, boolean estado, Ciudad ciudad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.estado = estado;
        this.ciudad = ciudad;
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

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
    

    public void activar() {
        this.estado = true;
    }
    public void suspender() {
        this.estado = false;
    }

    
    
    @Override
    public String toString() {
        return "Aeropuerto{" + "nombre=" + nombre + ", direccion=" + direccion + ", estado=" + estado + ", ciudad=" + ciudad + '}';
    }

    
    
    
  
    
    
}
