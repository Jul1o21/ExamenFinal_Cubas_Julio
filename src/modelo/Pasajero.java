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
public class Pasajero {
    private String tipodocumento;
    private String numerodocumento;
    private String nombres;
    private String apellidos;
    private Date fechanacim;

    public Pasajero(String tipodocumento, String numerodocumento, String nombres, String apellidos, Date fechanacim) {
        this.tipodocumento = tipodocumento;
        this.numerodocumento = numerodocumento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechanacim = fechanacim;
    }
    
    
    
    public boolean comprar(Vuelo vuelo,char fila,int nroAsiento, Pasajero pasajero){
        boolean resultado = false;
        
        vuelo.venderAsiento(pasajero, nroAsiento, fila);
        
        return resultado;
    }

    public String getTipodocumento() {
        return tipodocumento;
    }

    public String getNumerodocumento() {
        return numerodocumento;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Date getFechanacim() {
        return fechanacim;
    }

    public void setTipodocumento(String tipodocumento) {
        this.tipodocumento = tipodocumento;
    }

    public void setNumerodocumento(String numerodocumento) {
        this.numerodocumento = numerodocumento;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    
    

   
    @Override
    public String toString() {
        return "\n\nPasajero{" + "tipodocumento=" + tipodocumento + ", numerodocumento=" + numerodocumento + ", nombres=" + nombres + ", apellidos=" + apellidos + ", fechanacim=" + fechanacim + '}';
    }
    
    
}
