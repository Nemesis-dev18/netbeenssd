package com.mycompany.projecto1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class NewClass2 {

    public static double sumar(double n1, double n2, double n3, double n4) {
        return n1 + n2 + n3 + n4;
    }

    public static void main(String[] args) {

        Scanner axd = new Scanner(System.in);
        double n1, n2, n3, n4;

        try {
            System.out.print("Ingrese numero 1: ");
            n1 = axd.nextDouble();

            System.out.print("Ingrese numero 2: ");
            n2 = axd.nextDouble();

            System.out.print("Ingrese numero 3: ");
            n3 = axd.nextDouble();

            System.out.print("Ingrese numero 4: ");
            n4 = axd.nextDouble();

            double resultado = sumar(n1, n2, n3, n4);

            System.out.println("La suma es: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println("Error: No puede ingresar letras, solo numeros.");
        } finally {
            axd.close(); // Buena práctica
        }
    }
}
