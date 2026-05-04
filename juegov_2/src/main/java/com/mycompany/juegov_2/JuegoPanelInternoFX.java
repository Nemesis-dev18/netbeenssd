package com.mycompany.juegov_2;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.animation.AnimationTimer;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

public class JuegoPanelInternoFX extends Canvas {

    private String nombre;
    private GestorEnemigos gestor;
    private GestorDificultad config;

    private double mouseX = 400;
    private double mouseY = 300;

    private boolean modoPrecision = false;
    private boolean gameOver = false;

    private long tiempoInicio;
    private int tiempoSegundos;

    private AnimationTimer timer;

    public JuegoPanelInternoFX(String nombre, String dificultad, String forma) {

        this.nombre = nombre;

        this.config = new GestorDificultad(dificultad);
        this.gestor = new GestorEnemigos(config, forma);

        tiempoInicio = System.currentTimeMillis();

        setFocusTraversable(true);

        //  IMPORTANTE: NO fijar tamaño aquí
        setWidth(1);
        setHeight(1);

        setOnMouseMoved(e -> {
            mouseX = e.getX();
            mouseY = e.getY();
        });

        setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.SHIFT) modoPrecision = true;
        });

        setOnKeyReleased(e -> {
            if (e.getCode() == KeyCode.SHIFT) modoPrecision = false;
        });

        timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                update();
                draw();
            }
        };

        timer.start();
    }

    private void update() {

        if (gameOver) return;

        gestor.actualizar(mouseX, mouseY);

        tiempoSegundos =
                (int)((System.currentTimeMillis() - tiempoInicio) / 1000);

        if (gestor.getCantidad() >= config.getLimiteEnemigos()) {

            gameOver = true;
            timer.stop();

            Stage stage = (Stage) getScene().getWindow();

            GameOverFX.mostrar(
                    nombre,
                    tiempoSegundos,
                    gestor.getCantidad(),
                    stage
            );
        }
    }

    private void draw() {

        double w = getWidth();
        double h = getHeight();

        //  evita pantalla blanca inicial
        if (w <= 1 || h <= 1) return;

        GraphicsContext g = getGraphicsContext2D();

        // fondo dinámico
        g.setFill(Color.BLACK);
        g.fillRect(0, 0, w, h);

        // jugador
        g.setFill(modoPrecision ? Color.RED : Color.CYAN);
        g.fillOval(mouseX - 5, mouseY - 5, 10, 10);

        // enemigos
        gestor.dibujarFX(g);

        // HUD
        g.setFill(Color.YELLOW);
        g.setFont(Font.font(12));

        g.fillText("Jugador: " + nombre, 20, 40);
        g.fillText("Tiempo: " + tiempoSegundos, 40 , 60);
        g.fillText("Enemigos: " + gestor.getCantidad(), 30, 80);
    }

    @Override
    public boolean isResizable() {
        return true;
    }

    @Override
    public void resize(double w, double h) {
        setWidth(w);
        setHeight(h);
    }
}