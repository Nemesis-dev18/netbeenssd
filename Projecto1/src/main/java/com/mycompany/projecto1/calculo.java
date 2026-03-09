/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projecto1;

import java.util.Scanner;

/**
 *
 * @author Nemesis
 */


public class calculo {

    public static void main(String[] args) {

        Scanner pre = new Scanner(System.in);

        System.out.println("INGRESA EL PRECIO DE LA COMPRA A APLICAR EL 10%");
        double precio = pre.nextDouble();

        double total = calcularDescuento(precio);

        System.out.println("El precio total a pagar es: " + total);
    }

    public static double calcularDescuento(double precio) {
        double descuento = precio * 0.10;
        return precio - descuento;
    }
}
