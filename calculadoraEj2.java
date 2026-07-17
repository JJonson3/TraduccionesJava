/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.traduccionjava;

import java.util.Scanner;

/**
 *
 * @author Johan David Auilar Cardenas
 */
public class calculadoraEj2 {
    public static void main (String [] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2;

        System.out.println("Ingrese numero 1");
        num1 = teclado.nextInt();
        System.out.println("Ingrese numero 2");
        num2 = teclado.nextInt();

        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicacion: " + (num1 * num2));
        
        if (num2 != 0) {
            System.out.println("Division: " + (num1 / num2));
            System.out.println("Residuo: " + (num1 % num2));
        } else {
            System.out.println("No se puede dividir entre cero.");
        }


    }

}
