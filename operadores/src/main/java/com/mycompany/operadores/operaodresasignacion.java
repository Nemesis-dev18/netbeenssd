/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.operadores;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class operaodresasignacion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float n1,n2,n3,def;
        System.out.println("Digita las notas a calcular: ");
        n1 = entrada.nextFloat();
        n2 = entrada.nextFloat();
        n3 = entrada.nextFloat();
        System.out.println("Calculando suma d elas calificaciones "); 
        def =  n1+n2+n3;
        System.out.println("la suma total es  "+def );
    }
}
