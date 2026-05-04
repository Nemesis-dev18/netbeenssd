package com.mycompany.juegov_2;

// Importa Rectangle2D (equivalente a Rectangle en JavaFX)
import javafx.geometry.Rectangle2D;

// Clase que maneja las colisiones
public class SistemaColision {

    // Método estático que verifica si hay colisión entre dos objetos
    public static boolean hayColision(Rectangle2D a, Rectangle2D b) {

        // intersects() devuelve true si los rectángulos se tocan o se superponen
        return a.intersects(b);
    }
}