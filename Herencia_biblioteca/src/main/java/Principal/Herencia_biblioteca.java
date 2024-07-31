
package Principal;

import Clases.Bibliotecario;
import Clases.Lector;

/**
 *
 * @author RYZEN
 */
public class Herencia_biblioteca {

    public static void main(String[] args) {
      
        //objetos 
        Bibliotecario bibliotecarione = new Bibliotecario("ricardo palma",15/40/84,'M',"musculoso");
        Lector numero1 = new Lector("camilo", 19/59/18, 'M', "flaco");
        
        //metodo get
        String name_bibliotecario = bibliotecarione.getNombre();
        System.out.println("El nombre del bibbliotecario es: "+name_bibliotecario);
        
        System.out.println("HERENCIA");
        //herencia
        String name_lector = numero1.getNombre();
        System.out.println("El nombre del lector es: " + name_lector);
        
        System.out.println("Hello World!");
    }
}
