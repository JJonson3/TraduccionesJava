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
public class AprobadoReprobadoEj4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota;

        System.out.println("Ingrese la nota del estudiante:");
        nota = teclado.nextDouble();

        if (nota >= 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
            
        }
    }
}
