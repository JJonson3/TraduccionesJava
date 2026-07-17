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
public class NumeroPositivoEj7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int cantidad = 0;
        int sumaTotal = 0;

        System.out.println("Ingrese numeros positivos (escriba un negativo para terminar):");
        numero = teclado.nextInt();

        while (numero >= 0) {
            sumaTotal = sumaTotal + numero;
            cantidad++;
            numero = teclado.nextInt();
        }

        System.out.println("Cantidad de numeros ingresados: " + cantidad);
        System.out.println("Suma total: " + sumaTotal);
    }
    
}
