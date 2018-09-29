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
public class AgenciaViajes {
  private String nombre;
  private Aeropuerto[] aeropuertos;
  private Hotel[]hoteles;
  private Viaje[]viajes;

public AgenciaViajes(String nombre,int noHoteles,int noViajes){
    this.nombre=nombre;
    this.hoteles=new Hotel[noHoteles];
    this.viajes=new Viaje[noViajes];
    this.aeropuertos=new Aeropuerto[4];
}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Aeropuerto[] getAeropuertos() {
        return aeropuertos;
    }

    public Hotel getHoteles(int i) {
        return hoteles[i];
    }

    public Viaje getViajes(int i) {
        return viajes[i];
    }

void Listar(Viaje[] viajes){
    
    for(int i=0;i<viajes.length;i++){
        if(viajes[i]!=null){
        System.out.println("PLAN ");
        System.out.println(i);
        System.out.println("Numero de Vuelo de Salida");
        System.out.println(viajes[i].getSalida().getNoVuelo());
        System.out.println("Descripcion Aeropuerto de Salida");
        System.out.println(viajes[i].getSalida().getDesde()); 
        System.out.println("No de Vuelo de la Reserva de Retorno");
        System.out.println(viajes[i].getRetorno().getNoVuelo());
        System.out.println("Descripcion Aeropuerto de Retorno");
        System.out.println(viajes[i].getRetorno().getDesde());
    }
}}
}

