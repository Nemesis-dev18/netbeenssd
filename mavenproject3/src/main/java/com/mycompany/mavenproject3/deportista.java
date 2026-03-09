/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author Nemesis
 */
import java.util.Scanner;

/**
 *
 * @author Nemesis
 */
public class deportista {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("ingrese la cantidad de deportistas: " );
        int cantidad = sc.nextInt();
sc.nextLine(); 
       
        deportista[] lista = new deportista[cantidad];
        
        for (int i = 0; i < lista.length; i++) {
            System.out.println("ingrese el nombre del deportista "+(i+1)+": ");
            String nombre = sc.nextLine();
            System.out.println("ingrese el puntaje del juez_1: ");
            int puntuacion1 = sc.nextInt();
            System.out.println("ingrese el puntaje del juez_2: ");
            int puntuacion2 = sc.nextInt();
            System.out.println("ingrese el puntaje del juez_3: ");
            int puntuacion3 = sc.nextInt();
            
            lista[i] = new NewClass1(nombre, puntuacion1, puntuacion2, puntuacion3);

            
            
        }
        
        
        
    }
}
