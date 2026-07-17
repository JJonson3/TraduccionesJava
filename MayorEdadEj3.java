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
public class MayorEdadEj3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;

        System.out.println("Ingrese su edad:");
        edad = teclado.nextInt();

        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        }
    }
}
