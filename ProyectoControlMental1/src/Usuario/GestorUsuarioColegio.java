
package Usuario;

/**
 *
 * @author RYZEN
 */
public class GestorUsuarioColegio extends GestorDeUsuario {
    private String nombreColegio; 

    public GestorUsuarioColegio(String nombreColegio, String nombre, byte edad, boolean confirmarPago) {
        super(nombre, edad, confirmarPago);
        this.nombreColegio = nombreColegio;
    }
    
}
