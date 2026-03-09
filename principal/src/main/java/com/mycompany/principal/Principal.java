/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal;

/**
 *
 * @author Nemesis
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Ingrese la cantidad de deportistas:");
            int cantidad = sc.nextInt();
            sc.nextLine();

            if (cantidad <= 0) {
                System.out.println("No hay deportistas registrados.");
                return;
            }

            Deportista[] lista = new Deportista[cantidad];

            for (int i = 0; i < lista.length; i++) {

                System.out.println("\nIngrese el nombre del deportista " + (i + 1) + ": ");
                String nombre = sc.nextLine();

                System.out.print("Ingrese el puntaje del juez 1: ");
                int p1 = sc.nextInt();

                System.out.print("Ingrese el puntaje del juez 2: ");
                int p2 = sc.nextInt();

                System.out.print("Ingrese el puntaje del juez 3: ");
                int p3 = sc.nextInt();
                sc.nextLine();

                lista[i] = new Deportista(nombre, p1, p2, p3);
            }

            // Inicializamos mejor y peor
            Deportista mejor = lista[0];
            Deportista peor = lista[0];

            double mejorProm = mejor.calcularPromedio();
            double peorProm = peor.calcularPromedio();

            // Un solo recorrido
            for (int i = 1; i < lista.length; i++) {

                double promActual = lista[i].calcularPromedio();

                if (promActual > mejorProm) {
                    mejor = lista[i];
                    mejorProm = promActual;
                }

                if (promActual < peorProm) {
                    peor = lista[i];
                    peorProm = promActual;
                }
            }

            // Mostrar todos
            System.out.println("\n===== RESULTADOS =====");

            for (Deportista d : lista) {
                d.mostrarDatos();
                System.out.println("-----------------");
            }

            // Mostrar mejor y peor
            System.out.println("\n EL MEJOR DEPORTISTA ES:");
            System.out.println("Nombre: " + mejor.getNombre());
            System.out.println("Promedio: " + mejorProm);

            System.out.println("\n EL PEOR DEPORTISTA ES:");
            System.out.println("Nombre: " + peor.getNombre());
            System.out.println("Promedio: " + peorProm);

        } catch (InputMismatchException e) {
            System.out.println("Ingrese valores numéricos válidos.");
        }

        
    }
}