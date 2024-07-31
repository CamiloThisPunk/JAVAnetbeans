
package Principal;

import Clases.Personal1;
import Clases.Recepcionista1;

/**
 *
 * @author RYZEN
 */
public class Herencia_Zoologico {

    public static void main(String[] args) {
        //HERENCIA
        System.out.println("Herencia");
        //objetos
        Personal1 trabajador = new Personal1("robotina", 32, 'F',"Aseo", "escoba", "mameluco");
        Recepcionista1 numero100 = new Recepcionista1("lucho", 45, 'M',"cobrar","caja", "Sport");
        
        //GET
        String namePersonal = trabajador.getNombre();
        String nameRecepcionista = numero100.getNombre();
        
        System.out.println("El nombre del personal es: " + namePersonal);
        System.out.println("El nombre del recepcionista es: " + nameRecepcionista);
        
        
    }
}
