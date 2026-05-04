package com.mycompany.juegov_2;

// Importa el contexto gráfico de JavaFX (reemplaza Graphics)
import javafx.scene.canvas.GraphicsContext;

// Importa color de JavaFX (NO es el mismo de AWT)
import javafx.scene.paint.Color;

// Importa Rectangle para colisiones
import javafx.geometry.Rectangle2D;

// Clase Jugador (no necesita heredar nada)
public class Jugador {

    // Coordenada X del jugador
    private double x;

    // Coordenada Y del jugador
    private double y;

    // Tamaño del jugador (ancho y alto del cuadrado)
    private double tamaño = 5;

     
    // ACTUALIZAR POSICIÓN
     
    public void actualizarPosicion(double mouseX, double mouseY) {

        // Guarda la posición del mouse en X
        this.x = mouseX;

        // Guarda la posición del mouse en Y
        this.y = mouseY;
    }

     
    // DIBUJAR JUGADOR
     
    public void dibujar(GraphicsContext g) {

        // Establece el color blanco
        g.setFill(Color.WHITE);

        // Dibuja un rectángulo centrado en el mouse
        // (restamos tamaño/2 para que el centro coincida con el cursor)
        g.fillRect(x - tamaño / 2, y - tamaño / 2, tamaño, tamaño);
    }

     
    // COLISIONES
     
    public Rectangle2D getBounds() {

        // Retorna un rectángulo de colisión del jugador
        // JavaFX usa Rectangle2D en lugar de Rectangle
        return new Rectangle2D(
                x - tamaño / 2, // posición X ajustada
                y - tamaño / 2, // posición Y ajustada
                tamaño,         // ancho
                tamaño          // alto
        );
    }

    
    // GETTERS
 
    // Retorna posición X
    public double getX() {
        return x;
    }

    // Retorna posición Y
    public double getY() {
        return y;
    }
}