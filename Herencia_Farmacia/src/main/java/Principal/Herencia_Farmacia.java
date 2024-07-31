package Principal;

import Clases.Producto_Aseo;
import Clases.Producto_Belleza;






/**
 *
 * @author RYZEN
 */
public class Herencia_Farmacia {

    public static void main(String[] args) {
        
        
        //ATRIBUTOS
        Producto_Aseo neko = new Producto_Aseo("neko","05/06/2022","05/09/2023",1000,5.20,"savila",15.80,"cara","200ml");
        
        Producto_Belleza pantene = new Producto_Belleza("pantene","01/03/21","19/04/22",3000,10.50,"cacao",15.98,"cabello","30 min");
                
        String nombrejabon = neko.getNombre();
        System.out.println("El nombre del jabon: " + nombrejabon);
        System.out.println("el nombre del shampoo es: " + pantene.getNombre());
        
        System.out.println("EL METODO MODIFICADOR SET ");
        System.out.println("");
        neko.setNombre("anepsia");
        System.out.println("El nuevo jabon es: "+neko.getNombre());
           
        // OTRA MANERA DE MOSTRAR LOS DATOS, CREANDO EN LA CLASE HIJA UN METODO CONCATENADO SU VALOR
        System.out.println("OTRA MANERA DE MOSTRAR TODOS LOS VALORES DEL OBJETO A LA VEZ");
        System.out.println("");
        pantene.mostrarpantalla();
        
    
        
    }
}
