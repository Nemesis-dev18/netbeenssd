/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Mavenproject2 {

    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);

        // Pedimos el índice de la raíz
        System.out.print("Ingrese el índice de la raíz (por ejemplo, 2 para raíz cuadrada, 3 para cúbica): ");
        int indice = sc.nextInt();

        // Pedimos el número al que se le aplicará la raíz
        System.out.print("Ingrese el número al que se le va a aplicar la raíz: ");
        double numero = sc.nextDouble();

        // Calculamos la raíz enésima usando Math.pow
        double resultado = Math.pow(numero, 1.0 / indice);

        // Mostramos el resultado
        System.out.println("La raíz " + indice + " de " + numero + " es: " + resultado);
    }
}

