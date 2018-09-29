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
public class Viaje {
    private String Inicio;
    private String Duracion;
    private VueloAgendado salida;
    private VueloAgendado retorno;
    private Hotel[] hoteles;

    public Viaje(String Inicio, String Duracion) {
        this.Inicio = Inicio;
        this.Duracion = Duracion;
        this.retorno=new VueloAgendado();
        this.salida=new VueloAgendado();
    }

    public String getInicio() {
        return Inicio;
    }

    public void setInicio(String Inicio) {
        this.Inicio = Inicio;
    }

    public String getDuracion() {
        return Duracion;
    }

    public void setDuracion(String Duracion) {
        this.Duracion = Duracion;
    }

    public VueloAgendado getSalida() {
        return salida;
    }

    public void setSalida(VueloAgendado salida) {
        this.salida = salida;
    }

    public VueloAgendado getRetorno() {
        return retorno;
    }

    public void setRetorno(VueloAgendado retorno) {
        this.retorno = retorno;
    }

    public Hotel[] getHoteles() {
        return hoteles;
    }

    public void setHoteles(Hotel[] hoteles) {
        this.hoteles = hoteles;
    }


}
