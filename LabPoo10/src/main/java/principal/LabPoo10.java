

package principal;

import java.util.*;
public class LabPoo10 {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Scanner in = new Scanner(System.in);
        
        in.useDelimiter(System.getProperty("line.separator"));
        
        String nombre;
        int numeroCaracteres,cantidadVocales = 0;
        char letra;
        System.out.println("what is your name? ");
        nombre = in.next();
        
        numeroCaracteres = nombre.length();
        
        for (int i=0; i<numeroCaracteres;i++){
            letra =  nombre.charAt(i);
            if(letra == 'a' || letra == 'A'||
                    letra == 'e' || letra == 'E'||
                    letra == 'i'||letra == 'I'||
                    letra == 'o'||letra == 'O'||
                    letra == 'u'|| letra == 'U'){
                
                cantidadVocales++; 
                System.out.println("");
        }
                    
            
        }
        System.out.println(nombre +", tu nombre tiene " + cantidadVocales + "vocales");
    }
    
    
    String nombres_sorteo[]=new String[5];
    //sdfd
    
    Scanner src = new Scanner(System.in);
    
   


    
    
    
        
    
    
    
    
    
        
        
        
    }



