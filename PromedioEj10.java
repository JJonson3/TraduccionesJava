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
public class PromedioEj10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int suma = 0;

        System.out.println("Ingrese 10 numeros enteros:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Numero " + i + ":");
            numero = teclado.nextInt();
            suma += numero;
        }

        double promedio = suma / 10.0;

        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}

