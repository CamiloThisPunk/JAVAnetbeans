

package principal;

import clases.Animal;
import clases.Visitante;

/**
 *
 * @author RYZEN
 */
public class ProyectoZoologico {

    public static void main(String[] args) {
        
        Visitante tourista001;
        tourista001 = new Visitante("romanickonsky",40,'M',"japon","reconocimiento","desarrollador de software");
        Animal leon = new Animal("leoncio",15,80,"ataque","M"); 
        
        //metodo get
        String nombre1 = leon.getName0();
        System.out.println("El nombre del leon es: " + nombre1);
        
        String habilidad = leon.getHabilidad();
        System.out.println("La habilidad que tiene es de :"+ habilidad);
        
        String name_visitante = tourista001.getNombre();
        System.out.println("El nombre del visitante es :"+name_visitante);
        System.out.println("");
        
        String habilidad_visitante = tourista001.getHabilidad();
        System.out.println("Y la habilidad que tiene es: "+ habilidad_visitante);
        
        
        
        
        /*Animal animalin001;
        animalin001 = new Animal("chimpance",20,30,"colgarse","pan");
        System.out.println("TOURISTA001");
        System.out.println(tourista001);
        
        System.out.println("");
        
        System.out.println("CHIMPANCE");
        System.out.println(animalin001);*/
    }
}
