
package misClases;

/**
 *
 * @author RYZEN
 */
public class Linea {
    PuntoBidimensional p1;
    PuntoBidimensional p2;

    public Linea(PuntoBidimensional p1, PuntoBidimensional p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    public PuntoBidimensional getPuntoInicial(){
        return p1;
    }
    public PuntoBidimensional getPuntoFinal(){
        return p2;
    }
    public double getDistancia(){
        double x = Math.pow((p2.getCoordx()-p1.getCoordx()), 2);
        double y = Math.pow((p2.getCoordy()-p1.getCoordy()), 2);
        double distancia = Math.sqrt(x+y);
        return distancia;
    }
    public PuntoBidimensional getPuntoCentral(){
        double coordxPC = (p1.getCoordx()+p2.getCoordx())/2;
        double coordyPC = (p1.getCoordy()+p2.getCoordy())/2;
        PuntoBidimensional oPC = new PuntoBidimensional(coordxPC,coordyPC);
        return oPC;
    }
    
}
