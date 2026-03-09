/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.entre_primo_y_primo_mas_me_arrimo;

import java.util.Scanner;

/**
 *
 * @author Nemesis
 */
public class Entre_primo_y_primo_mas_me_arrimo {
public static boolean esPrimo(int numero) {
    if (numero <= 1) {
        return false; 
    }

    for (int i = 2; i <= Math.sqrt(numero); i++) {
        if (numero % i == 0) {
            return false; 
        }
    }

    return true; 
}
    public static void resultado ( int numero) {
        if (esPrimo(numero)) {
    System.out.println("El número " + numero + " es primo.");
}   else {
    System.out.println("El número " + numero + " no es primo.");
}
    }
    public static void main(String[] args) {
     Scanner nel = new Scanner(System.in);
        System.out.print(" ingrese la cantidad de numeros a comprobar  : ");
         int tam = nel.nextInt();
       
        
        for (int i = 0; i < tam; i++) {
            nel.nextLine();
             System.out.print("\n ingrese el numero : ");
             int numero1 = nel.nextInt();
            nel.nextLine();
           resultado(numero1);
          
             
        
       
        }

        
    }
    }