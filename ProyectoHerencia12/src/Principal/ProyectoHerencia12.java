
package Principal;

import misClases.PuntoBidimensional;
import misClases.PuntoTridimensional;

/**
 *
 * @author RYZEN
 */
public class ProyectoHerencia12 {


    public static void main(String[] args) {
        // TODO code application logic here
        PuntoBidimensional oBi = new PuntoBidimensional(1,2);
        PuntoTridimensional oTi = new PuntoTridimensional(1,2,3);
        
        System.out.println(oBi.toString());
        System.out.println(oTi.toString());
        //Probando un metodo reutilizado de punto bidimensional en punto tridimensional
        
        oTi.setCoordx(100);
        System.out.println(oTi.toString());
    }
    
}
