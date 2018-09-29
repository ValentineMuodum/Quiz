
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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    AgenciaViajes prueba=new AgenciaViajes("Aviatur",1,1);
    prueba.getHoteles(0).setNombre("Fontanar");
    prueba.getHoteles(0).setDireccion("Cra. 21a #159a-28");
    prueba.getViajes(0).setInicio("22/03/2017");
    prueba.getViajes(0).setDuracion("30 minutos");
    
    prueba.getViajes(0).getSalida().setNoVuelo(1345);
    prueba.getViajes(0).getSalida().setDesde(prueba.getAeropuertos(0));
    prueba.getViajes(0).getSalida().setHacia(prueba.getAeropuertos(1));
    prueba.getViajes(0).getSalida().getDesde().setDescripcion("José María Córdoba");
    prueba.getViajes(0).getSalida().getHacia().setDescripcion("Aeropuerto el dorado");
    
    prueba.getViajes(0).getSalida().setSalida("22/03/2017");
    prueba.getViajes(0).getSalida().setLlegada("22/03/2017");
    
    prueba.getViajes(0).getRetorno().setHacia(prueba.getAeropuertos(0));
    prueba.getViajes(0).getRetorno().setDesde(prueba.getAeropuertos(1));
    
     
    prueba.getViajes(0).getRetorno().getDesde().setDescripcion("Aeropuerto el dorado");
    prueba.getViajes(0).getRetorno().getHacia().setDescripcion("José María Córdoba");
    prueba.Listar();
    }
    
}
