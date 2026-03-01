/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operadores;

import java.util.Scanner;
public class Operadores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero1,numero2,suma,resta,division,multiplicacion,resto;
        System.out.println("digita 2 numeros = ");
         numero1 = entrada.nextFloat();
         numero2 = entrada.nextFloat();
     
    suma = numero1+numero2;
    resta = numero1-numero2; 
    division = numero1/numero2; 
    multiplicacion = numero1*numero2; 
    resto = numero1%numero2;
    
 
        System.out.println("el resultado de la suma es: "+suma);
        System.out.println("el resultado de la resta es: " + resta);
        System.out.println("el resultado de la division es: " +division);
        System.out.println("el resultado de la multiplicacion es: " +multiplicacion);
        System.out.println("el resultado de resto es  = " + resto);
}
}