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
public class CalcularMayorMenorEj11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int mayor, menor;

        System.out.println("Ingrese 10 numeros:");
        System.out.println("Numero 1:");
        numero = teclado.nextInt();
        
        // Inicializamos el mayor y menor con el primer número ingresado
        mayor = numero;
        menor = numero;

        for (int i = 2; i <= 10; i++) {
            System.out.println("Numero " + i + ":");
            numero = teclado.nextInt();
            
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);
    }
}
