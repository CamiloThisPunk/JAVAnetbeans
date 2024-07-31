
package misClases;

/**
 *
 * @author RYZEN
 */
public class AlquilerVehiculo {
    //Atributos 
    private String añoContrata;
    
    public AlquilerVehiculo(String añoContrata){
        this.añoContrata = añoContrata;
    }
    //METODO GET
    public String getAñoContrata(){
        return añoContrata;
    }
    //METODO SET
    public void setAñoContrata(String añoContrata){
        this.añoContrata =añoContrata;
    }
    
}
