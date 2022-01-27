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
public class Asiento {
    private int numeroasient;
    private char fila;
    private String estado;
    private Pasajero pasajero;

    public Asiento(int numeroasient, char fila, String estado, Pasajero pasajero) {
        this.numeroasient = numeroasient;
        this.fila = fila;
        this.estado = estado;
        this.pasajero = pasajero;
    }
   

    public int getNumeroasient() {
        return numeroasient;
    }

    public void setNumeroasient(int numeroasient) {
        this.numeroasient = numeroasient;
    }

    public char getFila() {
        return fila;
    }

    public void setFila(char fila) {
        this.fila = fila;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    
    
    
    public boolean reservarAsient(){
        boolean result;
        this.estado="reservado";
        result=true;
        return result;
    }
    public boolean cancelarAsient(){
        boolean result;
        this.estado="cancelado";
        result=true;
        return result;
    }
    
    
    public boolean venderAsient(){
        boolean result;
        this.estado="vendido";
        result=true;
        return result;
    }

    @Override
    public String toString() {
        return "\nAsiento{" + "numeroasient=" + numeroasient + ", fila=" + fila + ", estado=" + estado + ", pasajero=" + pasajero + '}';
    }
    
   
}
