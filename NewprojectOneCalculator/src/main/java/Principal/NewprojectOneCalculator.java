

package Principal;
import Class.Operando;
import java.util.Scanner;

public class NewprojectOneCalculator {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //atributos
        int one,two;
        String select;
        //String resta, multiplicacion, division;
        //String suma = "suma";
        //String resta = "resta";
         int counter = 0;
        //scanner
        Operando operando = new Operando();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\t BIENVENIDO A ESTA MARAVILLOSA CALCULADORA");
        
        System.out.println("\n 1. suma \n 2. resta \n 3.multiplicacion \n 4.division");
        
        System.out.println("Que operacion desea: ");
        select = sc.nextLine();
                
        System.out.println("Digite el primer valor: ");
        
        one = sc.nextInt();
        
        System.out.println("Digite el segundo valor: ");
        two = sc.nextInt();
        
        operando.setOperando1(one);
        operando.setOperando2(two);
        
        /*System.out.println(operando.getOperando1()+ " ," + operando.getOperando2()
                );*/
        //if (operando.suma == select ) System.out.print(operando.suma());else System.out.println("escriba de nuevo");
        while(counter <= 3){
            counter++;
        if(select.equals(operando.suma)){
            System.out.print("La suma es: ");
            System.out.println(operando.suma());
            break;
        }
        else if (select.equals(operando.resta)){
            System.out.println("La resta es: ");
            System.out.println(operando.resta());
            break;
        }
        else if(select.equals(operando.multiplicacion)){
            System.out.println("La multiplicacion es: ");
            System.out.println(operando.multiplicacion());
            break;
        }
        else if (select.equals(operando.division)){
            System.out.println("La division es: ");
            System.out.println(operando.division());
            break;
        } else System.out.println(" Incorrecto.Escriba una opcion de la que se muestra"); 
        
        
         
           
        } 
        
        
        
    }
    
    
}
