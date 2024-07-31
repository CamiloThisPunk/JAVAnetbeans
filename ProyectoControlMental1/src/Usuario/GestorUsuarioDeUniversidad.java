
package Usuario;

/**
 *
 * @author RYZEN
 */
public class GestorUsuarioDeUniversidad extends GestorDeUsuario {
    private String nombreUniversidad; 

    public GestorUsuarioDeUniversidad(String nombreUniversidad, String nombre, byte edad, boolean confirmarPago) {
        super(nombre, edad, confirmarPago);
        this.nombreUniversidad = nombreUniversidad;
    }
    
}
