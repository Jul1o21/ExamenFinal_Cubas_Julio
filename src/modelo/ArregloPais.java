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
public class ArregloPais {
    private int indice;
    private Pais PaisA[];

    public ArregloPais(int cantidadpaises) {
        this.indice = 0;
        this.PaisA = new Pais[cantidadpaises];
        
    }

    public Pais[] getPaisA() {
        return PaisA;
    }

    public void setPaisA(Pais[] PaisA) {
        this.PaisA = PaisA;
    }
    
    public boolean agregarpais(Pais pais){
        boolean result=false;
        
        result=true;
        return result;
        
    }
    public boolean eliminarpais(String codigo){
        boolean result=false;
        
        result=true;
        return result;
        
    }
    
    public Pais getpais(String codigo){
        Pais paisdevuelto=null;
        
        return paisdevuelto;
    }
    @Override
    public String toString() {
        return "\nArregloPais(" + "ConjuntoPaises:" + Arrays.toString(PaisA) + "\n\n"+')';
    }
    
    
    
}
