/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.laboratorioone;

 /**
 *
 * @author RYZEN
 */
import javax.swing.JOptionPane;
import java.util.Scanner;
public class LABORATORIOONE {

    public static void main(String[] args) {
        String nombre;
        String saludo;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Hello World!");
        System.out.println("como se llama: ");
        nombre = in.nextLine();
        
        System.out.println("Hola "+ nombre );
        saludo = JOptionPane.showInputDialog("BIENVENIDO PEQUEÑO PROGRAMADOR");
    }
}
