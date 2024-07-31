
package Usuario;

/**
 *
 * @author RYZEN
 */
public class GestorUsuarioComun extends GestorDeUsuario{
    String ocupacion; 

    public GestorUsuarioComun(String ocupacion, String nombre, byte edad, boolean confirmarPago) {
        super(nombre, edad, confirmarPago);
        this.ocupacion = ocupacion;
    }
    
    
}
