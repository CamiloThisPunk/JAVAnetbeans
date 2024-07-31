
package misClases;

/**
 *
 * @author RYZEN
 */
public class PuntoBidimensional {
    // atributos 
    private double coordx;
    private double coordy;

    public PuntoBidimensional(double coordx, double coordy) {
        this.coordx = coordx;
        this.coordy = coordy;
    }

   
    public double getCoordx() {
        return coordx;
    }

    
    public void setCoordx(double coordx) {
        this.coordx = coordx;
    }

    
    public double getCoordy() {
        return coordy;
    }

    
    public void setCoordy(double coordy) {
        this.coordy = coordy;
    }
    
    public String toString(){
        return "soy punto bidimensional y mis coordenadas son: " + getCoordx() + " y " + getCoordy();
    }
}
