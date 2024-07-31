
package Principal;

import misClases.Linea;
import misClases.PuntoBidimensional;
import misClases.PuntoTridimensional;

/**
 *
 * @author RYZEN
 */
public class PruebaHerenciaPorSustitucion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         PuntoBidimensional oBi = new PuntoBidimensional(1,2);
        PuntoTridimensional oTi = new PuntoTridimensional(1,2,3);
        
        //Utilizando la herencia por sustitucion de tipos
        
        Linea oLinea = new Linea(oBi,oTi);
        PuntoBidimensional PcL = oLinea.getPuntoCentral();
        System.out.println("Linea: Mi punto central es = " + PcL.getCoordx() + " ," + PcL.getCoordy());
        System.out.println("Linea: La distancia entre puntos  = " + oLinea.getDistancia());
        
    }
    
}
