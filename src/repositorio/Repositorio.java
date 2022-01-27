/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import java.util.Date;
import modelo.*;

/**
 *
 * @author cubas
 */
public class Repositorio {

    public static ArregloPais paisesessta;
    public static Aerolinea vuelossistema;
    public static ArregloPasajero pasajerossistema;
    public static ArregloAeropuerto aeropuertosistema;

    public static  void reiniciarsistema() {
        paisespordefecto();
        aerolineaspordefecto();
        listapasajerospordefecto();
        aerolineaspordefecto();
    }

    public static  void paisespordefecto() {

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

    public static  void aerolineaspordefecto() {
        Aerolinea aerolinepordefect;

        Vuelo vueloadd;
        Aeropuerto aeropuertosalidaAdd;
        Aeropuerto aeropuertollegadaAdd;
        Ciudad ciudadadd;
        Asiento asientoadd;

        Pasajero pasajeroadd;
        Date fechanaci;
        fechanaci = new Date();

        aerolinepordefect = new Aerolinea("aeroname1", "1111", 2);
        
        
        ciudadadd = new Ciudad("ciudadCod1", "ciudadName1");
        aeropuertosalidaAdd = new Aeropuerto("aeropuertName1", "aeropuertDirecc1", true, ciudadadd);
        ciudadadd = new Ciudad("ciudadCod2", "ciudadName2");
        aeropuertollegadaAdd = new Aeropuerto("aeropuertName2", "aeropuertDirecc2", true, ciudadadd);

        vueloadd = new Vuelo("vuelocod1", "vuelofech1", "vuelohor1", 1, true, aeropuertosalidaAdd, aeropuertollegadaAdd, 6);

        pasajeroadd = new Pasajero("pasajeroTDoc1", "pasajeroNumDoc1", "pasajeroNames1", "pasajeroApellid1", fechanaci);
        asientoadd = new Asiento(1, '1', "reservado", pasajeroadd);
        vueloadd.agregarasiento(asientoadd);
        pasajeroadd = new Pasajero("pasajeroTDoc2", "pasajeroNumDoc2", "pasajeroNames2", "pasajeroApellid2", fechanaci);
        asientoadd = new Asiento(2, '1', "vacio", null);
        vueloadd.agregarasiento(asientoadd);
        pasajeroadd = new Pasajero("pasajeroTDoc3", "pasajeroNumDoc3", "pasajeroNames3", "pasajeroApellid3", fechanaci);
        asientoadd = new Asiento(3, '1', "vacio", null);
        vueloadd.agregarasiento(asientoadd);
        pasajeroadd = new Pasajero("pasajeroTDoc4", "pasajeroNumDoc4", "pasajeroNames4", "pasajeroApellid4", fechanaci);
        asientoadd = new Asiento(4, '2', "vacio", null);
        vueloadd.agregarasiento(asientoadd);
        pasajeroadd = new Pasajero("pasajeroTDoc5", "pasajeroNumDoc5", "pasajeroNames5", "pasajeroApellid5", fechanaci);
        asientoadd = new Asiento(5, '2', "vacio", null);
        vueloadd.agregarasiento(asientoadd);
        pasajeroadd = new Pasajero("pasajeroTDoc6", "pasajeroNumDoc6", "pasajeroNames6", "pasajeroApellid6", fechanaci);
        asientoadd = new Asiento(6, '2', "reservado", pasajeroadd);
        vueloadd.agregarasiento(asientoadd);

        //
        
         ciudadadd = new Ciudad("ciudadCod3", "ciudadName3");
        aeropuertosalidaAdd = new Aeropuerto("aeropuertName3", "aeropuertDirecc3", true,ciudadadd);
         ciudadadd = new Ciudad("ciudadCod4", "ciudadName4");
        aeropuertollegadaAdd = new Aeropuerto("aeropuertName4", "aeropuertDirecc4", true,ciudadadd);

        vueloadd = new Vuelo("vuelocod2", "vuelofech2", "vuelohor2", 1, true, aeropuertosalidaAdd, aeropuertollegadaAdd, 6);

        pasajeroadd = new Pasajero("pasajeroTDoc11", "pasajeroNumDoc11", "pasajeroNames11", "pasajeroApellid11", fechanaci);
        asientoadd = new Asiento(1, '1', "reservado", pasajeroadd);
        vueloadd.agregarasiento(asientoadd);
        pasajeroadd = new Pasajero("pasajeroTDoc12", "pasajeroNumDoc12", "pasajeroNames12", "pasajeroApellid12", fechanaci);
        asientoadd = new Asiento(2, '1', "vacio", null);
        vueloadd.agregarasiento(asientoadd);
        pasajeroadd = new Pasajero("pasajeroTDoc13", "pasajeroNumDoc13", "pasajeroNames13", "pasajeroApellid13", fechanaci);
        asientoadd = new Asiento(3, '1', "vacio", null);
        vueloadd.agregarasiento(asientoadd);
        pasajeroadd = new Pasajero("pasajeroTDoc14", "pasajeroNumDoc14", "pasajeroNames14", "pasajeroApellid14", fechanaci);
        asientoadd = new Asiento(4, '2', "vacio", null);
        vueloadd.agregarasiento(asientoadd);
        pasajeroadd = new Pasajero("pasajeroTDoc15", "pasajeroNumDoc15", "pasajeroNames15", "pasajeroApellid15", fechanaci);
        asientoadd = new Asiento(5, '2', "vacio", null);
        vueloadd.agregarasiento(asientoadd);
        pasajeroadd = new Pasajero("pasajeroTDoc16", "pasajeroNumDoc16", "pasajeroNames16", "pasajeroApellid16", fechanaci);
        asientoadd = new Asiento(6, '2', "reservado", pasajeroadd);
        vueloadd.agregarasiento(asientoadd);
        
        
        vuelossistema = aerolinepordefect;
    }

    public static  void listapasajerospordefecto() {
        ArregloPasajero pasajerospordefect;
        Pasajero pasajeroadd;
        Date fechanaci;
        fechanaci = new Date();

        pasajerospordefect = new ArregloPasajero(6);

        pasajeroadd = new Pasajero("pasajeroTDoc1", "pasajeroNumDoc1", "pasajeroNames1", "pasajeroApellid1", fechanaci);
        pasajerospordefect.agregar(pasajeroadd);
        pasajeroadd = new Pasajero("pasajeroTDoc2", "pasajeroNumDoc2", "pasajeroNames2", "pasajeroApellid2", fechanaci);
        pasajerospordefect.agregar(pasajeroadd);
        pasajeroadd = new Pasajero("pasajeroTDoc3", "pasajeroNumDoc3", "pasajeroNames3", "pasajeroApellid3", fechanaci);
        pasajerospordefect.agregar(pasajeroadd);
        pasajeroadd = new Pasajero("pasajeroTDoc4", "pasajeroNumDoc4", "pasajeroNames4", "pasajeroApellid4", fechanaci);
        pasajerospordefect.agregar(pasajeroadd);
        pasajeroadd = new Pasajero("pasajeroTDoc5", "pasajeroNumDoc5", "pasajeroNames5", "pasajeroApellid5", fechanaci);
        pasajerospordefect.agregar(pasajeroadd);
        pasajeroadd = new Pasajero("pasajeroTDoc6", "pasajeroNumDoc6", "pasajeroNames6", "pasajeroApellid6", fechanaci);
        pasajerospordefect.agregar(pasajeroadd);
        
        
        pasajerossistema = pasajerospordefect;
    }

    public static void aeropuertospordefecto() {
        ArregloAeropuerto aerpuertospordefecto;
        Aeropuerto aeropuertoadd;
        aerpuertospordefecto = new ArregloAeropuerto(4);
        Ciudad ciudadadd;
        
        ciudadadd = new Ciudad("ciudadCod1", "ciudadName1");
        aeropuertoadd = new Aeropuerto("aeropuertName1", "aeropuertDirecc1", true,ciudadadd);
        aerpuertospordefecto.agregaraeropuerto(aeropuertoadd);
         ciudadadd = new Ciudad("ciudadCod2", "ciudadName2");
        aeropuertoadd = new Aeropuerto("aeropuertName2", "aeropuertDirecc2", true,ciudadadd);
        aerpuertospordefecto.agregaraeropuerto(aeropuertoadd);
         ciudadadd = new Ciudad("ciudadCod3", "ciudadName3");
        aeropuertoadd = new Aeropuerto("aeropuertName3", "aeropuertDirecc3", true,ciudadadd);
        aerpuertospordefecto.agregaraeropuerto(aeropuertoadd);
         ciudadadd = new Ciudad("ciudadCod4", "ciudadName4");
        aeropuertoadd = new Aeropuerto("aeropuertName4", "aeropuertDirecc4", true,ciudadadd);
        aerpuertospordefecto.agregaraeropuerto(aeropuertoadd);

        
        aeropuertosistema = aerpuertospordefecto;
    }
}
