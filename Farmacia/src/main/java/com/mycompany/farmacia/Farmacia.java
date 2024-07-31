
package com.mycompany.farmacia;

public class Farmacia {
    //atributos
    String nombre, genero, especialidad, tipos, material, medicacion, direccion;
    String pago;
    int edad, tratamiento;
    double altura;
    
    //metodo main constructor
    public static void main(String[] args) {
        //objetos 5
        Farmacia farmaceutico = new Farmacia();
        Farmacia paciente = new Farmacia();
        Farmacia  receta_medica = new Farmacia();
        Farmacia producto = new Farmacia();
        Farmacia cajero = new Farmacia();
        Farmacia enfermedad = new Farmacia();
        
        farmaceutico.nombre = "jesus";
        farmaceutico.edad = 35;
        farmaceutico.especialidad = "doctor";
        farmaceutico.altura = 1.32;
        
        
        paciente.nombre = "rosita";
        paciente.edad = 86;
        paciente.especialidad = "profesora";
        paciente.altura =1.15;
        
        enfermedad.nombre = "neumonia";
        enfermedad.especialidad = "infeccion respiratoria";
        enfermedad.tratamiento = 3;
        
        producto.tipos = "producto para el cabello";
        producto.tipos = "productos de higiene";
        producto.tipos = "productos para la salud";
        
        cajero.material= "acero inoxidable";
        cajero.altura = 9 * 6;
        cajero.pago = "efectivo soles";
        
        receta_medica.medicacion = "azitromicina";
        receta_medica.nombre = "nombre del doctor";
        receta_medica.direccion = "direccion del chequeo";
        
        System.out.println("El nombre del farmaceutico es: " + farmaceutico.nombre);
        System.out.println("El nombre del paciente es: " + paciente.nombre);
        System.out.println("La enfermedad diagnosticada es: "+ enfermedad.nombre);
        System.out.println("Tipos de productos: "+ producto.tipos);
        System.out.println("Nombre del medicamento recomendado es: "+ receta_medica.medicacion);
        System.out.println("El pago es en: " + cajero.pago);
        
    }
}
