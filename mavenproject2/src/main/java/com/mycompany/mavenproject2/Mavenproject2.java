/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

import java.util.Scanner;

public class Mavenproject2 {

    public static void main(String[] args) {

        int cantidad;
        Scanner M = new Scanner(System.in);

        System.out.println("Cuántos estudiantes son");
        cantidad = M.nextInt();
        M.nextLine(); 

        estudiante lista[] = new estudiante[cantidad];

        for (int i = 0; i < lista.length; i++) {

            System.out.println("Estudiante #" + (i + 1));

            System.out.print("Nombre: ");
            String nombre = M.nextLine();

            System.out.print("Nota 1: ");
            double nota1 = M.nextDouble();

            System.out.print("Nota 2: ");
            double nota2 = M.nextDouble();
            M.nextLine(); 

           
            lista[i] = new estudiante(nombre, nota1, nota2);
        }

        System.out.println("\nRESULTADOS ");

        for (int i = 0; i < lista.length; i++) {
            lista[i].mostrarresultado();
            System.out.println("           ");
        }
    }
}