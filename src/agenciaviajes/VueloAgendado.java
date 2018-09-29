/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaviajes;

/**
 *
 * @author Valentine Chimezie
 */
public class VueloAgendado {
    private int NoVuelo;
    private String Salida;
    private String Llegada;
    private Aeropuerto desde;
    private  Aeropuerto hacia;

    public VueloAgendado(int NoVuelo, String Salida, String Llegada) {
        this.NoVuelo = NoVuelo;
        this.Salida = Salida;
        this.Llegada = Llegada;
        
    }

    public VueloAgendado() {
    }

    public int getNoVuelo() {
        return NoVuelo;
    }

    public void setNoVuelo(int NoVuelo) {
        this.NoVuelo = NoVuelo;
    }

    public String getSalida() {
        return Salida;
    }

    public void setSalida(String Salida) {
        this.Salida = Salida;
    }

    public String getLlegada() {
        return Llegada;
    }

    public void setLlegada(String Llegada) {
        this.Llegada = Llegada;
    }

    public Aeropuerto getDesde() {
        return desde;
    }

    public void setDesde(Aeropuerto desde) {
        this.desde = desde;
    }

    public Aeropuerto getHacia() {
        return hacia;
    }

    public void setHacia(Aeropuerto hacia) {
        this.hacia = hacia;
    }
    


}
