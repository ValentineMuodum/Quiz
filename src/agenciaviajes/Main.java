
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
    AgenciaViajes prueba=new AgenciaViajes("Aviatur", 1, 1);
    prueba.getHoteles(0).setNombre("Fontanar");
    prueba.getHoteles(0).setDireccion("Cra. 21a #159a-28");
    prueba.getViajes(0).setInicio("22/03/2017");
    prueba.getViajes(0).setDuracion("30 minutos");
    prueba.getViajes(0).getSalida().setNoVuelo(1345);
    
    }
    
}
