
package Principal;

import Clases.Doctor1;
import Clases.Enfermera1;
import Clases.Personal1;

/**
 *
 * @author RYZEN
 */
public class Herencia_Clinica {

    public static void main(String[] args) {
        
        
        
        Doctor1 doctorOne;
        doctorOne = new Doctor1("camilo",15/23/1201 ,8,'M',"7524564","odontologo");
        Enfermera1 numero1 = new Enfermera1("Carolina", 32/15/2140,7,'F', "752155", "AMABLE");
        Personal1 numero900 = new Personal1("Angelina", 19/15/2321,7,'F', "7545557", "Atencion");
        
        
        //herencia
        System.out.println("Herencia");
        //metodo get
        String name_doctor = doctorOne.getNombre();
        String nameEnfermera = numero1.getNombre();
        String valorEnfermera = numero1.getValor();
        String name_personal = numero900.getNombre();
        
        System.out.println("El nombre del doctor es: " + name_doctor);
        System.out.println("Nombre de la enfermera: " + nameEnfermera);
        System.out.println("el valor de la enfermera es: " + valorEnfermera);
        System.out.println("El nombre del personal es: " + name_personal);
        
        
    }
}
