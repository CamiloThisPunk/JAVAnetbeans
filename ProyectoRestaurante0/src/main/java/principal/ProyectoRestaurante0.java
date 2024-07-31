
package principal;

import clases.Cocinero;
import clases.Comida;
import clases.Mozo;


public class ProyectoRestaurante0 {

    public static void main(String[] args) {
        
        Cocinero chefsito001;
        chefsito001 = new Cocinero("chefsito", 'M',19,1.02,"blanca nieve","ceviche");
        
        Mozo roberto001;
        roberto001 = new Mozo("robotin",'M', 48,1.65,"veloz");
        
        Comida aleatorio = new Comida("lomo fino", "arroz, carne, papa, condimentos y mas","comida reciente hecha","dulce","caliente");
        
        //get
        String name = chefsito001.getName();
        System.out.println("El nombre del cocinero es: "+ name);
        
        String name1 = roberto001.getName1();
        System.out.println("El nombre del mesero es: " + name1 );
        
        String comidita = aleatorio.getNombre();
        System.out.println("El nombre de la comida :" + comidita);
        
        
        /*System.out.println("chefsiton");
        System.out.println(chefsito001);
        System.out.println("");
        
        
        System.out.println("robotin001");
        System.out.println(roberto001);*/
    }
}
