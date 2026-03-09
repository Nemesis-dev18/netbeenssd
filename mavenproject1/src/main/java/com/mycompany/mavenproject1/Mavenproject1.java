/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Nemesis
 */
public class Mavenproject1 {
    public static double sumar(double n1, double n2, double n3, double n4) {
        return n1 + n2 + n3 + n4;
    }
    public static void mostrarmensaje() {
        System.out.println("error no se puede");
      
        
    }
    public static int obtenernumero() {
        return 10;
    
    }
    public static int cuadrado(int nx) {
        int rest =nx *nx;
        return rest;
        
    }
    public static void mostraredad(int edad) {
        System.out.println("edad es : "+edad);
        
    }
    public static int parnose(int numero1) {
        if (numero1 % 2==0 ){
            System.out.println("el numero : "+ numero1+ " si es par ");
        }
        else{
            System.out.println("el numero"+numero1+" no es par ");
        }
            return numero1  ;
        
    }
    public static double promedio(double nota1, double nota2, double nota3 ) {
         return (nota1+nota2+nota3)/3;
        
        
    }
    public static int xd(int a,int b) {
        int resultado =a*b;
        return resultado;
    }
    public static void main(String[] args) {

    Scanner axd = new Scanner(System.in);

    double n1 = 0 , n2 = 0, n3 = 0, n4 = 0, ab=0 , bb=0,cc=0;
    int a = 0, b = 0,edad = 0, cuadrado= 0, par=0;

    try {
        System.out.print("Ingrese numero 1: ");
        n1 = axd.nextDouble();

        System.out.print("Ingrese numero 2: ");
        n2 = axd.nextDouble();

        System.out.print("Ingrese numero 3: ");
        n3 = axd.nextDouble();

        System.out.print("Ingrese numero 4: ");
        n4 = axd.nextDouble();

        System.out.print("Ingrese la altura: ");
        a = axd.nextInt();

        System.out.print("Ingrese la base: ");
        
        b = axd.nextInt();
        System.out.print("ingrese el numero para sacar el cuadrado : ");
        cuadrado=axd.nextInt();
        System.out.println("ingrese el numero para saber si es par: ");
        par= axd.nextInt();
        System.out.println("ingrese la nota 1 : " );
        ab=axd.nextDouble();
        System.out.println("ingrese la nota 2 : " );
        bb=axd.nextDouble();
        System.out.println("ingrese la nota 3 : " );
        cc=axd.nextDouble();

        double resultado = sumar(n1, n2, n3, n4);
         System.out.println("La suma es: " + resultado);
         System.out.println("el cuadrado del numero es: "+cuadrado(cuadrado));        
         System.out.println("el numero es : "+obtenernumero());
         System.out.println("la base es : "+xd(a, b));
         mostraredad(27);
         parnose(par);
        

    } catch (InputMismatchException e) {
        mostrarmensaje();
    } finally {
        axd.close();
    }

        

}

   
   
}
