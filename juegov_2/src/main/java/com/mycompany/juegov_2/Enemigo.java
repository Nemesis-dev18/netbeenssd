package com.mycompany.juegov_2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.geometry.Rectangle2D;

public class Enemigo {

    public enum TipoMovimiento {
        PERSEGUIDOR, LINEAL, SENO, ESPIRAL, CIRCULAR
    }

    private double x, y;
    private double velocidad;
    private double angulo;
    private double rotacion;

    private TipoMovimiento tipo;
    private String forma;

    private final int size = 12;

    // límites de pantalla (puedes ajustarlos luego dinámico)
    private final double ancho = 1280;
    private final double alto = 720;

    public Enemigo(double x, double y, double velocidad, TipoMovimiento tipo, String forma) {
        this.x = x;
        this.y = y;
        this.velocidad = velocidad;
        this.tipo = tipo;
        this.forma = forma.toLowerCase();
        this.angulo = Math.random() * Math.PI * 2;
        this.rotacion = 0;
    }

    public void mover(double px, double py) {

        switch (tipo) {

            case PERSEGUIDOR:
                double dx = px - x;
                double dy = py - y;
                double dist = Math.sqrt(dx * dx + dy * dy);

                if (dist != 0) {
                    x += velocidad * dx / dist;
                    y += velocidad * dy / dist;
                }
                break;

            case LINEAL:
                x += Math.cos(angulo) * velocidad;
                y += Math.sin(angulo) * velocidad;
                break;

            case SENO:
                x += velocidad;
                y += Math.sin(x * 0.05) * 4;
                break;

            case ESPIRAL:
                angulo += 0.05;
                x += Math.cos(angulo) * velocidad;
                y += Math.sin(angulo) * velocidad;
                break;

            case CIRCULAR:
                angulo += 0.03;
                x += Math.cos(angulo) * velocidad;
                y += Math.sin(angulo) * velocidad;
                break;
        }

        // rotación de la estrella
        rotacion += 4;

        // límites pantalla (wrap)
        if (x < 0) x = ancho;
        if (x > ancho) x = 0;
        if (y < 0) y = alto;
        if (y > alto) y = 0;
    }

    public void dibujar(GraphicsContext g) {

        g.setFill(Color.MAGENTA);

        switch (forma) {

            case "cuadrado":
                g.fillRect(x, y, size, size);
                break;

            case "triangulo":
                double[] xsTri = {x, x + size, x + size / 2};
                double[] ysTri = {y + size, y + size, y};
                g.fillPolygon(xsTri, ysTri, 3);
                break;

            case "estrella":

                double cx = x + size / 2;
                double cy = y + size / 2;

                double rOuter = size / 2;
                double rInner = size / 4;

                double[] xsStar = new double[10];
                double[] ysStar = new double[10];

                for (int i = 0; i < 10; i++) {

                    double angle = Math.PI / 5 * i;
                    double radius = (i % 2 == 0) ? rOuter : rInner;

                    xsStar[i] = cx + Math.cos(angle) * radius;
                    ysStar[i] = cy + Math.sin(angle) * radius;
                }

                g.save();

                g.translate(cx, cy);
                g.rotate(rotacion);
                g.translate(-cx, -cy);

                g.fillPolygon(xsStar, ysStar, 10);

                g.restore();

                break;

            default:
                g.fillOval(x, y, size, size);
        }
    }

    public Rectangle2D getBounds() {
        return new Rectangle2D(x, y, size, size);
    }

    public double getX() { return x; }
    public double getY() { return y; }

    public void setPosicion(double x, double y) {
        this.x = x;
        this.y = y;
    }
}