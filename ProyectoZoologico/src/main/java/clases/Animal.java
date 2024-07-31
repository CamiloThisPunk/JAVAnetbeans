
package clases;


public class Animal {
    //Encapsulamiento de atributos
    private String nombre;
    private String habilidad;
    private int peso;
    private int edad;
    private String genero;
    
    //Metodo constructor
    public Animal(String nombre0,int edad0,int peso0,String habilidad0,String genero0){
        
        nombre = nombre0;
        edad = edad0;
        peso = peso0;
        habilidad = habilidad0;
        genero = genero0;
        
    }
    //metodo get
    public String getName0(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public int getPeso(){
        return peso;
    }
    public String getHabilidad(){
        return this.habilidad;
    }
    public String getGenero(){
        return genero;
    }
    //metodo modificador set
    public void setNombre(String newname){
        nombre = newname;
    }
    public void setEdad(int newedad){
        edad = newedad;
    }
    public void setPeso(int newpeso){
        peso = newpeso;
    }
    public void setHabilidad(String newhabilidad){
        habilidad = newhabilidad;
    }
    public void setGenero(String newgenero){
        genero = newgenero;
    }

    
    
    
    
    public String toString(){
        return "nombre: "+nombre+"\n"+"edad: "+edad+" años"+"\n"+"peso: "+peso+" kg"+"\n"+"habilidad: "+" de "+habilidad +"  por todos lados"+"\n"+"genero: "+"pertenece al genero "+genero;
    }
}
