
package principal;

import clases.Empleado;
import clases.EmpleadoComision;


public class Proyectoherencia1 {

    public static void main(String[] args) {
        //objetos
        Empleado empleado = new Empleado("Camilo", 958.5);
         
        //enviando mensaje al empleado
        String nameempleado = empleado.getNombre();
        double salarioempleado = empleado.getSalarioBase();
        System.out.println("datos del empleado");
        
        System.out.println("nombre del empleado: " + nameempleado);
        System.out.println("su salario es: " + salarioempleado);
      
        System.out.println("Aplicando el metodo set");
        empleado.setSalarioBase(2000.5);
        System.out.println("Nuevo salario base " + empleado.getSalarioBase());
        
        //modificando con la clase hija EmpleadoComision
        EmpleadoComision oEC = new EmpleadoComision("condesito", 872.2);
        System.out.println("probando la magia de la herencia");
        
        System.out.println("nombre del empleado por comision: " + oEC.getNombre());
        System.out.println("Salario base del empleado por comision " + oEC.getSalarioBase());
        
        oEC.setSalarioBase(5000.8);
        System.out.println("Salario base modificada " + oEC.getSalarioBase());
     
    }
}
