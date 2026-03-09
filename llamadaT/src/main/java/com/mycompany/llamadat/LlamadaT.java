/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.llamadat;

import java.util.Scanner;

/**
 *
 * @author Nemesis
 */
public class LlamadaT {

     public static void main(String[] args) {
        Scanner nel = new Scanner(System.in);
        System.out.print(" ingrese la cantidad de llamadas a echas : ");
         int tam = nel.nextInt();
         nel.nextLine();
        MINUTOS[] array = new MINUTOS[tam];
        
        for (int i = 0; i < array.length; i++) {
            nel.nextLine();
            System.out.print("\ningrese el telefono a llamar : ");
             int numero = nel.nextInt();
             System.out.println(" cada minuto vale 200 no? ");
             System.out.print("\n ingrese en cuanto tiempo duro la llamada al   "+numero +": ");
             double minutos = nel.nextDouble();
            nel.nextLine();
          
            array[i] = new MINUTOS(numero,minutos);
        }

        System.out.println("\nRESULTADOS");

        for (int i = 0; i < array.length; i++) {
            array[i].calculo(i);
        
    }
  }
}
