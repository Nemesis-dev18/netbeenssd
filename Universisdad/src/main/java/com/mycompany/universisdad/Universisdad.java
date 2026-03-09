/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.universisdad;

import java.util.Scanner;

/**
 *
 * @author Nemesis
 */
public class Universisdad {

    public static void main(String[] args) {
      
        Scanner nel = new Scanner(System.in);
        System.out.print(" ingrese la cantidad de ESTUDIANTES  : ");
         int tam = nel.nextInt();
         nel.nextLine();
        notas[] array = new notas[tam];
        
        for (int i = 0; i < array.length; i++) {
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
             
            array[i] = new notas(nombre,nota1,nota2,nota3);
        }

        System.out.println("\nRESULTADOS");

        for (int i = 0; i < array.length; i++) {
            array[i].total(i);
        
    }
  }
}
