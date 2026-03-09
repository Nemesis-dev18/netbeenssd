/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projecto1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Nemesis
 */
public class NewClass5 {
      public static void main(String[] args) {

        Scanner pre = new Scanner(System.in);

        try {

            System.out.println("INGRESA EL PRECIO DE LA COMPRA A APLICAR EL 10%");
            double precio = pre.nextDouble();

            double total = calcularDescuento(precio);

            System.out.println("El precio total a pagar es: " + total);

        } catch (InputMismatchException e) {

            System.out.println("Error: Debes ingresar un número válido.");

        } 
    }

    public static double calcularDescuento(double precio) {
        double descuento = precio * 0.10;
        return precio - descuento;
    }
    
}
