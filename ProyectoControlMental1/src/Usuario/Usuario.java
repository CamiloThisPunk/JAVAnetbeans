
package Usuario;
import AppControlMental.ControlMental;
import AppControlMental.ControlMentalFree;
import AppControlMental.ControlMentalPremium;

/**
 *
 * @author RYZEN
 */
public class Usuario {
    //Atributos 
            private String nombre;
            private byte edad; 
            private boolean confirmarPago = false; 

            //Contructores
            public Usuario (String nombre, byte edad){
                this.nombre = nombre; 
                this.edad = edad; 
            }

            public Usuario(boolean confirmarPago) {
                this.confirmarPago = confirmarPago;
            }

            //Getters
            public String getNombre() {
                return nombre;
            }

            public boolean getConfirmarPago() {
                return confirmarPago;
            }

            //Metodos especiales
            public void ejecutarVersionPremium(){
                
                System.out.println("\n\t" + "Hola  nuevamente bienvenid@ a la  version Premium");
                ControlMentalPremium.mostrarPremium();

            } //La version Premium muestra todos los ejercicios

            public void ejecutarVersionGratuita(){

                System.out.println("\n" + "Hola nuevamente bienvenid@ a la  version Free");
                ControlMentalFree.mostrarFree(); 

            }//La version gratuita solo muestra tres ejercicios
    
}
