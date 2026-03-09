/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.promedia;

import java.util.Scanner;

/**
 *
 * @author Nemesis
 */
public class Promedia {

        public static double calcularPromedioNotas(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }
    

       public static void verificarAprobacion(double promedio, String nombre) {
        System.out.print("El estudiante " + nombre + " tiene promedio " + promedio + " - ");
        if (promedio >= 3.0) {
            System.out.println("aprobó");
        } else {
            System.out.println("reprobó");
        }
    }

    public static void main(String[] args) {
            Scanner nel = new Scanner(System.in);
        System.out.print(" ingrese la cantidad de ESTUDIANTES  : ");
         int tam = nel.nextInt();
       
        
        for (int i = 0; i < tam; i++) {
            nel.nextLine();
            System.out.print("\ningrese el nombre del estudiante : ");
             String nombre = nel.nextLine();
         
             System.out.print("\n ingrese la primera nota: ");
             double nota1 = nel.nextDouble();
            nel.nextLine();
         
             System.out.print("\n ingrese la primera nota: ");
             double nota2 = nel.nextDouble(); 
             
             System.out.print("\n ingrese la primera nota: ");
             double nota3 = nel.nextDouble();  
             
          double promedio = calcularPromedioNotas(nota1, nota2, nota3);
            verificarAprobacion(promedio, nombre);
        }

        
    }
    }
  


    

