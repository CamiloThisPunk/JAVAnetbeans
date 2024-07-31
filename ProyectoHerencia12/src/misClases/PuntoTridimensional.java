
package misClases;

/**
 *
 * @author RYZEN
 */
public class PuntoTridimensional extends PuntoBidimensional{
    private double coordz;

    public PuntoTridimensional(double coordx, double coordy,double coordz) {
        super(coordx, coordy);
        this.coordz = coordz;
    }

    public double getCoordz() {
        return coordz;
    }

    public void setCoordz(double coordz) {
        this.coordz = coordz;
    }
    
    public String toString(){
        return "soy punto tridimensional y mis coordenadas son: " + getCoordx() + " "+ getCoordy()+" " + coordz; 
    }
}
