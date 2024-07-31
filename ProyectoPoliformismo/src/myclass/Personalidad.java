
package myclass;

/**
 *
 * @author RYZEN
 */
/*public abstract class Personalidad {
    
    public abstract String hablar(){
        return " soy una personalidad";
    }
    
    
}
*/
/*
animal (clase padre: concepto abstracto) ..> clases abstractas
leon (clase hija)
tigre(clase hija)
oso
*/

public abstract class Personalidad{
    
    public abstract String hablar();
    
    public void preguntarFormaHablar(){
        System.out.println("yo hablo de esta forma: "+ hablar());
    
    }
}
