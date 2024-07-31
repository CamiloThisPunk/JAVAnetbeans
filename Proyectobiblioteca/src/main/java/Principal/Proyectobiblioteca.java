

package Principal;

import Clases.Bibliotecario;
import Clases.Lector;
import Clases.Libro;


public class Proyectobiblioteca {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        //creacion de objetos
        
        Bibliotecario bibliotecarione = new Bibliotecario("ricardo palma", 45, 'M',"lectura rapida",8);
        Lector lectorone  = new Lector("camilo", 19, 'M',"estudiante", 1.80);
        Libro libroone = new Libro("la programacion",15,"algoritmo","mgtcx","codigos entrelazados");
        
        //llamamos al metodo get y mostramos en pantalla
        String name_bibliotecario = bibliotecarione.getNombre();
        System.out.println("El nombre del bibbliotecario es: "+name_bibliotecario);
        
        String name_lector = lectorone.getNombre();
        System.out.println("El nombre del lector es: "+ name_lector);
        
        String libro1 = libroone.getNombre();
        System.out.println("El libro que se lee es: "+ libro1);
        
        
        //metodo set
        System.out.println("nuevo genero");
        bibliotecarione.setSexo('F');
        System.out.println("El bibliotecario se cambio de genero: " + bibliotecarione.getSexo());
        
        
         
        
    }
}
