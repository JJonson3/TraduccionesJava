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
public class DiasDeLaSemanaEj6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia;

        System.out.println("Ingrese un numero entre 1 y 7:");
        dia = teclado.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6: 
                System.out.println("Sabado");
                break;
            case 7: 
                System.out.println("Doming");
                break;
            default:
                System.out.println("Numero invalido.");
        }
    }
    
}
