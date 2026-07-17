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
public class ContraseniaEj8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String contrasenia;

        do {
            System.out.println("Ingrese la contrasenia:");
            contrasenia = teclado.next();
        } while (!contrasenia.equals("java2026"));

        System.out.println("Acceso concedido.");
    }
}
