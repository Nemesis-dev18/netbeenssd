/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javacurso;

import javax.swing.JFrame;

/**
 *
 * @author User
 */



public class MiVentanaa extends JFrame {
    public MiVentanaa() {
        setTitle("Mi Primera GUI");
        setSize(300, 200);                    // Tamaño de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);                     // Mostrar ventana
    }

    public static void main(String[] args) {
        MiVentana miVentana = new MiVentana();
    }
}
