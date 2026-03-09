/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

public class estudiante {

    private String nombre;
    private double nota1;
    private double nota2;

    public estudiante(String nombre, double nota1, double nota2) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double promedio() {
        return (nota1 + nota2) / 2;
    }

    public boolean aprobo() {
        return promedio() >= 3.0;
    }

    public void mostrarresultado() {
        System.out.println("El nombre es: " + nombre);
        System.out.println("El promedio de " + nombre + " es: " + promedio());

        if (aprobo()) {
            System.out.println("El estudiante " + nombre + " aprobó");
        } else {
            System.out.println("El estudiante " + nombre + " no aprobó");
        }
    }
}