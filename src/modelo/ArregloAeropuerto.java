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

    public ArregloAeropuerto(int cantidadaeropuertos) {
        this.indice = 0;
        this.AeropuertoA = new Aeropuerto[cantidadaeropuertos];
    }

    public boolean agregaraeropuerto(Aeropuerto aeropuerto) {
        boolean result = false;
        Aeropuerto[] TempAeropuertos;
        TempAeropuertos = new Aeropuerto[this.indice + 1];
        for (int i = 0; i < this.indice; i++) {
            TempAeropuertos[i] = this.AeropuertoA[i];
        }

        this.AeropuertoA = TempAeropuertos;
        this.AeropuertoA[this.indice] = aeropuerto;
        this.indice++;
        System.out.println("Aeropuerto agregado con exito");
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
