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
    
    
    

    private boolean comprar(Vuelo vuelo, char fila, int numeroasiento){
        boolean result=false;
        
        
        
        result=true;
        return result;
    }
    
    @Override
    public String toString() {
        return "Pasajero{" + "tipodocumento=" + tipodocumento + ", numerodocumento=" + numerodocumento + ", nombres=" + nombres + ", apellidos=" + apellidos + ", fechanacim=" + fechanacim + '}';
    }
    
    
}
