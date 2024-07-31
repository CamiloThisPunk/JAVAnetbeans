

package com.mycompany.zoologico;

//clase zoologico
public class Zoologico {
    //Atributos de los objetos
    String nombre;
    String habilidad;
    int edad, peso;
    String material;
   
    
    //metodo principal
    public static void main(String[] args) {
        //Estos son 5 objetos
        Zoologico animal_felino = new Zoologico();
        Zoologico trabajador = new Zoologico();
        Zoologico recepcionista = new Zoologico();
        Zoologico visitante = new Zoologico();
        Zoologico jaula = new Zoologico();
        
        animal_felino.nombre = "jaimito";
        animal_felino.habilidad = "cazar";
        animal_felino.edad = 3;
        animal_felino.peso = 30;
        
        trabajador.nombre = "pepito";
        trabajador.habilidad = "limpiar";
        trabajador.edad = 36;
        trabajador.peso = 60;
        
        recepcionista.nombre = "luisa";
        recepcionista.habilidad = "contar";
        recepcionista.edad = 25;
        recepcionista.peso = 50;
        
        visitante.nombre = "teodoro";
        visitante.habilidad = "reconocimiento";
        visitante.edad = 45;
        visitante.peso = 56;
        
        jaula.material = "acero puro";
        jaula.edad = 15;
        jaula.peso = 30;
        
        System.out.print("El animal es un leon y se llama: " + animal_felino.nombre);
        System.out.print("\ntiene la habilidad de: "+animal_felino.habilidad);
        System.out.print("\ntiene la edad de: "+ animal_felino.edad +" años");
        System.out.print("\ntiene un peso aproximado de: "+ animal_felino.peso+ " kg");
    }
}
