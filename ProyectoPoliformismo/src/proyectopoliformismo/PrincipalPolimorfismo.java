
package proyectopoliformismo;

import myclass.GestorPersonalidad;
import myclass.Personalidad;
import myclass.PersonalidadExtrovertida;
import myclass.PersonalidadIntrovertida;
import myclass.PersonalidadNueva;
import myclass.PersonalidadOptimista;
import myclass.PersonalidadPesimista;

/**
 *
 * @author RYZEN
 */
public class PrincipalPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Personalidad oper = new Personalidad() {
            @Override
            public String hablar() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
      
        PersonalidadExtrovertida oEx = new PersonalidadExtrovertida(); 
        PersonalidadIntrovertida oei = new PersonalidadIntrovertida(); 
        PersonalidadOptimista oPo = new PersonalidadOptimista();
        PersonalidadPesimista ope = new PersonalidadPesimista();
        GestorPersonalidad ogp = new GestorPersonalidad();
        PersonalidadNueva opn = new PersonalidadNueva();
        ope.preguntarFormaHablar();
        oEx.preguntarFormaHablar();
        //llamando al metodo polimorfico hacerhablar() del objeto del ogp
        /*ogp.hacerHablar(oei);
        ogp.hacerHablar(oEx);
        ogp.hacerHablar(ope);
        ogp.hacerHablar(opn);
        */
        /*Personalidad oper = new Personalidad();
        PersonalidadExtrovertida oEx = new PersonalidadExtrovertida(); 
        PersonalidadIntrovertida oei = new PersonalidadIntrovertida(); 
        PersonalidadOptimista oPo = new PersonalidadOptimista();
        PersonalidadPesimista ope = new PersonalidadPesimista();
        
        Personalidad listaPersonalidades[] = new Personalidad[5];
        
        listaPersonalidades[0]= oper;
        listaPersonalidades[1]=oEx;
        listaPersonalidades[2]= oei;
        listaPersonalidades[3]= oPo;
        listaPersonalidades[4]= ope;
        
        System.out.println("La personalidad[0] habla: "+listaPersonalidades[0].hablar());
        System.out.println("La personalidad[1] habla: "+listaPersonalidades[1].hablar());
        System.out.println("La personalidad[2] habla: "+listaPersonalidades[2].hablar());
        System.out.println("La personalidad[3] habla: "+listaPersonalidades[3].hablar());
        System.out.println("La personalidad[4] habla: "+listaPersonalidades[4].hablar());
        */
    }
    
}
