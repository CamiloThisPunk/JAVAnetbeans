
package principal;


import clases.Maquina;
public class PrincipalEjecution {

    
    public static void main(String[] args) {

        
        
        Maquina computadoraNueva = new Maquina("rojo","mediano",1,"vigente");
        
        
      
        System.out.println("Las computadoras que utilizo actualmente es de color " + computadoraNueva.getColor() );
        
        
        
    }
    
}
