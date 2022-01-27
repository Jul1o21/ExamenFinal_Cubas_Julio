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
public class Vuelo {

    private String codigo;
    private String fecha;
    private String hora;
    private int puertaembarque;
    private boolean estaactivo;
    private Aeropuerto aeropuertoSalida;
    private Aeropuerto aeropuertoLlegada;
    private int indiceAsientos;
    private Asiento AsientosVuelo[];

    public Vuelo(String codigo, String fecha, String hora, int puertaembarque, boolean estaactivo, Aeropuerto aeropuertoSalida, Aeropuerto aeropuertoLlegada, int cantacientos) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.hora = hora;
        this.puertaembarque = puertaembarque;
        this.estaactivo = estaactivo;
        this.aeropuertoSalida = aeropuertoSalida;
        this.aeropuertoLlegada = aeropuertoLlegada;
        this.indiceAsientos = 0;
        this.AsientosVuelo = new Asiento[cantacientos];

    }

    public String getCodigo() {
        return codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public int getPuertaembarque() {
        return puertaembarque;
    }

    public boolean isEstaactivo() {
        return estaactivo;
    }

    public Aeropuerto getAeropuertoSalida() {
        return aeropuertoSalida;
    }

    public Aeropuerto getAeropuertoLlegada() {
        return aeropuertoLlegada;
    }

    public Asiento[] getAsientosVuelo() {
        return AsientosVuelo;
    }

    public void setEstaactivo(boolean estaactivo) {
        this.estaactivo = estaactivo;
    }

    public boolean venderAsiento(Pasajero pasajerovender, int numeroasiento, char fila) {
        boolean result = false;
        numeroasiento--;
        
        if(this.AsientosVuelo[numeroasiento].getFila()=='1'&&this.AsientosVuelo[numeroasiento].getPasajero()==null){
            
            this.AsientosVuelo[numeroasiento].setPasajero(pasajerovender);
            this.AsientosVuelo[numeroasiento].setEstado("reservado");
        }
        
        if(this.AsientosVuelo[numeroasiento].getFila()=='2'&&this.AsientosVuelo[numeroasiento].getPasajero()==null){
            this.AsientosVuelo[numeroasiento].setPasajero(pasajerovender);
            this.AsientosVuelo[numeroasiento].setEstado("reservado");
        }
        
        
        
        
        
        result = true;
        return result;
    }

    public Asiento[] asientosdisponibles() {
        Asiento[] asientosdisponibles = null;

        return asientosdisponibles;
    }

    public boolean reservarasiento(int numeroasiento, char fila) {
        boolean result = false;
        
        result = true;
        return result;
    }

    public boolean cancelarasiento(int numeroasiento, char fila) {
        boolean result = false;
        
        
        numeroasiento--;
        if(this.AsientosVuelo[numeroasiento].getFila()=='1'&&this.AsientosVuelo[numeroasiento].getEstado().equals("reservado")){
            System.out.println("El pasajero a eliminar es: "+ this.AsientosVuelo[numeroasiento].getPasajero());
            
            this.AsientosVuelo[numeroasiento].setPasajero(null);
            this.AsientosVuelo[numeroasiento].setEstado("disponible");
        }
        
        if(this.AsientosVuelo[numeroasiento].getFila()=='2'&&this.AsientosVuelo[numeroasiento].getEstado().equals("reservado")){
            this.AsientosVuelo[numeroasiento].setPasajero(null);
            this.AsientosVuelo[numeroasiento].setEstado("disponible");
        }
        result = true;
        return result;
    }

    public Pasajero[] obetenerlistapasajeros() {
        Pasajero[] listapasajeros = null;

        return listapasajeros;
    }

    public boolean agregarasiento(Asiento asiento) {
        boolean result = false;
        Asiento TempAsientos[];
        TempAsientos = new Asiento[this.indiceAsientos + 1];
        for (int i = 0; i < this.indiceAsientos; i++) {
            TempAsientos[i] = this.AsientosVuelo[i];
        }

        this.AsientosVuelo = TempAsientos;
        this.AsientosVuelo[this.indiceAsientos] = asiento;
        this.indiceAsientos++;
        System.out.println("Asiento agregado con exito");
        result = true;
        return result;

    }

    @Override
    public String toString() {
        return "\n\nVuelo{" + "codigo=" + codigo + ", fecha=" + fecha + ", hora=" + hora + ", \npuertaembarque=" + puertaembarque + ", \nestaactivo=" + estaactivo + ", \naeropuertoSalida=" + aeropuertoSalida + ", \naeropuertoLlegada=" + aeropuertoLlegada + ", \n\nAsientosVuelo=" + Arrays.toString(AsientosVuelo) + '}';
    }

   
}
