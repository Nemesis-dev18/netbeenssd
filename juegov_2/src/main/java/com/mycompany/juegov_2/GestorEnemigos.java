package com.mycompany.juegov_2;

import java.util.ArrayList;
import javafx.geometry.Rectangle2D;
import javafx.scene.canvas.GraphicsContext;

public class GestorEnemigos {

    private ArrayList<Enemigo> enemigos = new ArrayList<>();
    private GestorDificultad config;
    private String forma;

    public GestorEnemigos(GestorDificultad config, String forma) {
        this.config = config;
        this.forma = forma;

        for (int i = 0; i < 10; i++) {
            enemigos.add(crear());
        }
    }

    private Enemigo crear() {

        Enemigo.TipoMovimiento[] tipos = Enemigo.TipoMovimiento.values();

        return new Enemigo(
                Math.random() * 1280,
                Math.random() * 720,
                config.getVelocidad(),
                tipos[(int)(Math.random() * tipos.length)],
                forma
        );
    }

    public void actualizar(double mx, double my) {

        ArrayList<Enemigo> nuevos = new ArrayList<>();

        Rectangle2D jugador = new Rectangle2D(mx - 5, my - 5, 10, 10);

        for (Enemigo e : enemigos) {

            e.mover(mx, my);

            if (e.getBounds().intersects(jugador)) {

                if (enemigos.size() < config.getLimiteEnemigos()) {
                    nuevos.add(crear());
                    nuevos.add(crear());
                }
            }
        }

        enemigos.addAll(nuevos);

        separarEnemigos();
    }

    //  evita que se monten
    private void separarEnemigos() {

        int min = 25;

        for (int i = 0; i < enemigos.size(); i++) {

            Enemigo a = enemigos.get(i);

            for (int j = i + 1; j < enemigos.size(); j++) {

                Enemigo b = enemigos.get(j);

                double dx = b.getX() - a.getX();
                double dy = b.getY() - a.getY();

                double dist = Math.sqrt(dx * dx + dy * dy);

                if (dist > 0 && dist < min) {

                    double push = (min - dist) * 0.5;

                    double nx = dx / dist;
                    double ny = dy / dist;

                    a.setPosicion(a.getX() - nx * push, a.getY() - ny * push);
                    b.setPosicion(b.getX() + nx * push, b.getY() + ny * push);
                }
            }
        }
    }

    public void dibujarFX(GraphicsContext g) {
        for (Enemigo e : enemigos) {
            e.dibujar(g);
        }
    }

    public int getCantidad() {
        return enemigos.size();
    }
}