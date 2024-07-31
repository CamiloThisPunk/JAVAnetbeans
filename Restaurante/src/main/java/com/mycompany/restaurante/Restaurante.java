
package com.mycompany.restaurante;


public class Restaurante {
    //atributos
    String nombre, ingrediente, dni, tipo;
    int edad, aforo, cantidad;
    String mueble, plato, vaso, cuchara;
    double estatura;

    public static void main(String[] args) {
        //5 objetos vacios
        Restaurante cocinero = new Restaurante();
        Restaurante cliente = new Restaurante();
        Restaurante mozo = new Restaurante();
        Restaurante local = new Restaurante();
        Restaurante infraestructura = new Restaurante();
        Restaurante comida = new Restaurante();
        Restaurante utensilio = new Restaurante();
        Restaurante menu = new Restaurante();
       
        //objetos con valor definido
        cocinero.nombre = "gaston";
        cocinero.edad = 22;
        cocinero.dni = "confidencial";
        cocinero.estatura = 1.35;
        
        cliente.nombre = "roberto";
        cliente.edad = 17;
        cliente.dni = "confidencial";
        cliente.cantidad = 100;
        
        mozo.nombre = "ozuna";
        mozo.edad = 21;
        mozo.dni = "confidencial";
        mozo.estatura = 1.58;
        
        local.nombre = "El chefsito";
        local.edad = 8;
        local.aforo = 20;
        
        infraestructura.mueble = "sillas y mesas";
        
        comida.nombre = "ceviche";
        comida.ingrediente = "buen ingrediente";
        
        utensilio.plato = "porcelana";
        utensilio.vaso = "madera ";
        utensilio.cuchara = "metal";
        
        menu.tipo = "variedad de comidas";
        
        System.out.println("El local se llama: " + local.nombre);
        System.out.println("tiene buena infraestructura como: " + infraestructura.mueble);
        System.out.println("Tiene como menu: "+ menu.tipo);
        System.out.println("El cocinero se llama: "+ cocinero.nombre );
        System.out.println("tiene la edad de: "+ cocinero.edad);
        System.out.println("El mozo se llama: "+ mozo.nombre);
        System.out.println("las comidas tienen: "+ comida.ingrediente);
        System.out.println("Los utensilios son de: " + utensilio.plato);
        System.out.println("El restaurante tiene: " + cliente.cantidad + " clientes");
    }
}
