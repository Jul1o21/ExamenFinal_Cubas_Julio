/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import modelo.*;

/**
 *
 * @author cubas
 */
public class Repositorio {
    public static ArregloPais paisesessta;
    public static Aerolinea vuelossistema;
    public static ArregloPasajero listapasajerossistema;
    public static ArregloAeropuerto aeropuertosistema;

    public void reiniciarsistema(){
        paisespordefecto();
        aerolineaspordefecto();
    }
    
    public void paisespordefecto(){
         
         ArregloPais paisesdefect;
         Pais paisadd;
         Ciudad ciudadadd;
         paisesdefect = new ArregloPais(3);
         
         paisadd = new Pais("paiscod1", "nombrep1", 5);
         
         
         ciudadadd = new Ciudad("ciudadcod1", "ciudadnombre1");
         paisadd.agregarciudad(ciudadadd);
         ciudadadd = new Ciudad("ciudadcod2", "ciudadnombre2");
         paisadd.agregarciudad(ciudadadd);
         ciudadadd = new Ciudad("ciudadcod3", "ciudadnombre3");
         paisadd.agregarciudad(ciudadadd);
         ciudadadd = new Ciudad("ciudadcod4", "ciudadnombre4");
         paisadd.agregarciudad(ciudadadd);
         ciudadadd = new Ciudad("ciudadcod5", "ciudadnombre5");
         paisadd.agregarciudad(ciudadadd);
         paisesdefect.agregarpais(paisadd);
         
         
         paisadd = new Pais("paiscod2", "nombrep2", 5);
         ciudadadd = new Ciudad("ciudadcod6", "ciudadnombre6");
         paisadd.agregarciudad(ciudadadd);
         ciudadadd = new Ciudad("ciudadcod7", "ciudadnombre7");
         paisadd.agregarciudad(ciudadadd);
         ciudadadd = new Ciudad("ciudadcod8", "ciudadnombre8");
         paisadd.agregarciudad(ciudadadd);
         ciudadadd = new Ciudad("ciudadcod9", "ciudadnombre9");
         paisadd.agregarciudad(ciudadadd);
         ciudadadd = new Ciudad("ciudadcod10", "ciudadnombre10");
         paisadd.agregarciudad(ciudadadd);
         paisesdefect.agregarpais(paisadd);
         
         paisadd = new Pais("paiscod3", "nombrep3", 5);
         ciudadadd = new Ciudad("ciudadcod11", "ciudadnombre11");
         paisadd.agregarciudad(ciudadadd);
         ciudadadd = new Ciudad("ciudadcod12", "ciudadnombre12");
         paisadd.agregarciudad(ciudadadd);
         ciudadadd = new Ciudad("ciudadcod13", "ciudadnombre13");
         paisadd.agregarciudad(ciudadadd);
         ciudadadd = new Ciudad("ciudadcod14", "ciudadnombre14");
         paisadd.agregarciudad(ciudadadd);
         ciudadadd = new Ciudad("ciudadcod15", "ciudadnombre15");
         paisadd.agregarciudad(ciudadadd);
         paisesdefect.agregarpais(paisadd);
         
         
        paisesessta = paisesdefect;
      //  return paisesessta;
        
        
    }
    
    public void aerolineaspordefecto(){
        Aerolinea aerolinepordefect;
        
        Vuelo vueloadd;
        Aeropuerto aeropuertosalidaAdd;
        Aeropuerto aeropuertollegadaAdd;
        Asiento asientoadd;
        
        aerolinepordefect = new Aerolinea("aeroname1", "1111", 2);
        
        aeropuertosalidaAdd = new Aeropuerto("aerosalidaName1", "aerosalidaDirecc1", true);
        aeropuertollegadaAdd = new Aeropuerto("aerollegadaName1", "aerollegadaDirecc1", true);
        
        vueloadd = new Vuelo("vuelocod1", "vuelofech1", "vuelohor1", 1, true, aeropuertosalidaAdd, aeropuertollegadaAdd,10);
        
        asientoadd = new Asiento(1, '1', "vacio");
        vueloadd.agregarasiento(asientoadd);
        asientoadd = new Asiento(2, '1', "vacio");
        vueloadd.agregarasiento(asientoadd);
        asientoadd = new Asiento(3, '1', "vacio");
        vueloadd.agregarasiento(asientoadd);
        asientoadd = new Asiento(4, '1', "vacio");
        vueloadd.agregarasiento(asientoadd);
        asientoadd = new Asiento(5, '1', "vacio");
        vueloadd.agregarasiento(asientoadd);
        asientoadd = new Asiento(6, '2', "vacio");
        vueloadd.agregarasiento(asientoadd);
        asientoadd = new Asiento(7, '2', "vacio");
        vueloadd.agregarasiento(asientoadd);
        asientoadd = new Asiento(8, '2', "vacio");
        vueloadd.agregarasiento(asientoadd);
        asientoadd = new Asiento(9, '2', "vacio");
        vueloadd.agregarasiento(asientoadd);
        asientoadd = new Asiento(10, '2', "vacio");
        vueloadd.agregarasiento(asientoadd);
        
        
        //
        
        aeropuertosalidaAdd = new Aeropuerto("aerosalidaName2", "aerosalidaDirecc2", true);
        aeropuertollegadaAdd = new Aeropuerto("aerollegadaName2", "aerollegadaDirecc2", true);
        
        vueloadd = new Vuelo("vuelocod2", "vuelofech2", "vuelohor2", 1, true, aeropuertosalidaAdd, aeropuertollegadaAdd,10);

        
        asientoadd = new Asiento(1, '1', "vacio");
        vueloadd.agregarasiento(asientoadd);
        asientoadd = new Asiento(2, '1', "vacio");
        vueloadd.agregarasiento(asientoadd);
        asientoadd = new Asiento(3, '1', "vacio");
        vueloadd.agregarasiento(asientoadd);
        asientoadd = new Asiento(4, '1', "vacio");
        vueloadd.agregarasiento(asientoadd);
        asientoadd = new Asiento(5, '1', "vacio");
        vueloadd.agregarasiento(asientoadd);
        asientoadd = new Asiento(6, '2', "vacio");
        vueloadd.agregarasiento(asientoadd);
        asientoadd = new Asiento(7, '2', "vacio");
        vueloadd.agregarasiento(asientoadd);
        asientoadd = new Asiento(8, '2', "vacio");
        vueloadd.agregarasiento(asientoadd);
        asientoadd = new Asiento(9, '2', "vacio");
        vueloadd.agregarasiento(asientoadd);
        asientoadd = new Asiento(10, '2', "vacio");
        vueloadd.agregarasiento(asientoadd);
        
        
    }
    
    public void listapasajerospordefecto(){
        ArregloPasajero pasajerospordefect;
        Pasajero pasajeroadd;
        
        
        
    }
}
