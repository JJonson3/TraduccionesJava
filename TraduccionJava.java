/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.traduccionjava;

import java.util.Scanner;

/**
 *
 * @author Johan David Aguilar Cardenas
 */
public class TraduccionJava {

    public static void main (String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        String nombre;
        int edad;
        String carrera;
        double estatura;
        System.out.println("Ingrese su nombre:");
        nombre = teclado.next();
        System.out.println("Ingrese su edad:");
        edad =teclado.nextInt();
        System.out.println("Ingrese su carrera:");
        carrera = teclado.next();
        System.out.println("Ingrese su estatura;");
        estatura = teclado.nextDouble();
        
        System.out.println("Su niombre es: "+nombre);
        System.out.println("Su edad es: "+ edad);
        System.out.println("Su carrera es: "+ carrera);
        System.out.println("Su estatura es: "+ estatura);
        
    }
}
