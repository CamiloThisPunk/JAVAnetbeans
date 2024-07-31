package clases;


public class Empleado {
    private String nombre;
    private double salarioBase;
    
    public Empleado(String nombre0, double salariobase0){
        this.nombre = nombre0;
        this.salarioBase = salariobase0;
    }

    
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public double getSalarioBase() {
        return salarioBase;
    }

    
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    
}
