

package principal;

import Clases.Articulo;


public class ProyectoTiendaComercial {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //crear objetos a partir de las clases
        //hacer que los objetos interacturen entre ellos
        //a traves de mensajes
        //para que el objeto realice una funcion(ejecute un metodo)
        
        Articulo ojetoArticulo_01;
        
        //primer paso para crear objetos
        Articulo objetoArticulo_leche;
        objetoArticulo_leche = new Articulo("leche evaporada cremosita", 12.5);
        
        Articulo articulo_dos = new Articulo("matequilla", 1.5);
        
        //NUEVO OBJETO CARNE
        Articulo objeto_carne;
        objeto_carne = new Articulo(20.7,0.1,13,"carne especial procesada","c0001x");
        
        //comunicandome con el objeto carne
        //nos comunicamos a travez del envio de mensajes
        String variable = objeto_carne.getId();
        System.out.println("codigo del obejto carne es: " + variable);
        
        String descripcionobjeto = objeto_carne.getDescripcion();
        System.out.println("la informacion que nos brinda el producto es: "+ descripcionobjeto);
        
        double puobjeto = objeto_carne.getPreciounitario();
        System.out.println("el precio unitario del producto es: " + puobjeto);
        
        //SET
        //enviando mensajes a los objetos para modificar los valores de los atributos
        objeto_carne.setId("ADF-45D");
        
        System.out.println("nuevo id" + objeto_carne.getId());
        objeto_carne.setDescuento(0.2);
        //double nuevodescuento = objeto_carne.getDescuento();
        System.out.println("El nuevo descuento es: "+ objeto_carne.getDescuento());
        
        //probando un atributo que no esta encapsulado
        /*double descuentopublico = objeto_carne.descuento;
        System.out.println("Descuento publico= " + descuentopublico);*/
        
        //Dañando (dejarlo en un estado no valido)un atributo publico del objeto
        //lo modifican aprovechandose de la tienda
        
        
        
        
        
        System.out.println("objeto 1");
        System.out.println(objetoArticulo_leche);
    }
}
