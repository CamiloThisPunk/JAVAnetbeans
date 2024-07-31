

package principal;

import Clases.Farmaceutico;
import Clases.Paciente;


public class ProyectoFarmacia {

    public static void main(String[] args) {
        //objeto
        Farmaceutico farmaceutico;
        farmaceutico = new Farmaceutico("Mi nombre es jacinto y tengo: ", 18,1.25,'F',"medicamentos",8);
        
        Paciente valiente01 ;
        valiente01 = new Paciente("goku",54,'M',1.32,"profesor","confidencial");
        
        //get
        String farmaceutico0 = farmaceutico.getNombre();
        System.out.println("FARMACEUTICO: "+ farmaceutico0);
        
        int edad0 = farmaceutico.getEdad();
        System.out.println(edad0);
        
        String paciente0 = valiente01.getNombre();
        System.out.println("El nombre del paciente es: " + paciente0);
        /*//
        System.out.println("farmaceutico001");
        System.out.println(farmaceutico);
        System.out.println("");
        
        System.out.println("paciente001");             
        System.out.println(valiente01);*/
      
    }
    
}
