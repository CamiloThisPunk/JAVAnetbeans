
package Principal;

import Clases.Cocinero1;
import Clases.Mozo1;

/**
 *
 * @author RYZEN
 */
public class Herencia_Restaurante {

    public static void main(String[] args) {
        
        //Objetos
        Cocinero1 cocinero1 = new Cocinero1("Chefsito",19/04/2003,"717943612","72d236","9865214",2,"El ceviche");
        Mozo1 mosito = new Mozo1("redkovnikov", 122/50/48,"425632","768d42","97845623");
        
        //HERENCIA
        
        System.out.println("Herencia");
        
        //GET
        String nombre_chef = cocinero1.getNombre();
        
        String chef_especialidad = cocinero1.getEspecialidad();
        
        String nombre_mozo = mosito.getNombre();
        int  edad_mozo = mosito.getFechaNacimiento();
        
        System.out.println("El nombre del cheff es: " + nombre_chef);
        System.out.println("Y su especialidad es: " + chef_especialidad);
        System.out.println("");
        
        System.out.println("El nombre del mozo es: " + nombre_mozo);
        System.out.println("Y su fecha de nacimiento es: "+ edad_mozo);
    }
}
