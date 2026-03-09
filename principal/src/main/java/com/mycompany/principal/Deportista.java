/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author Nemesis
 */
public class Deportista {

    private String nombre;
    private int juez1, juez2, juez3;

    public Deportista(String nombre, int juez1, int juez2, int juez3) {
        this.nombre = nombre;
        this.juez1 = juez1;
        this.juez2 = juez2;
        this.juez3 = juez3;
    }

    public double calcularPromedio() {
        return (juez1 + juez2 + juez3) / 3.0;
    }

    public void mostrarDatos() {
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Promedio: " + calcularPromedio());

    }

    public String getNombre() {
        return nombre;
    }
    
}
