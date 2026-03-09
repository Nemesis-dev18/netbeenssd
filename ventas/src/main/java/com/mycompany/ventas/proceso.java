/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ventas;

/**
 *
 * @author Nemesis
 */
public class proceso {
    private String nombre;
    private double precio ;
    private double ganancia ;
    private int stock ;

    public proceso(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

 
 
    public void verDisponibilidad() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Stock disponible: " + stock);
    }

    public void ingresarStock(int cantidad) {
        stock = stock + cantidad;
        System.out.println("Nuevo stock: " + stock);
    }

    public void retirarStock(int cantidad) {

        if (cantidad > stock) {
            System.out.println("No hay suficiente stock");
        } else {
            stock = stock - cantidad;
            ganancia = cantidad * precio ;
            System.out.println("Nuevo stock: " + stock);
            System.out.println("\n Las ganacia de la venta es : " + ganancia );
        }
    }
}