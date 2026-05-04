package com.mycompany.juegov_2;

public class GestorDificultad {

    private double velocidad;
    private int limiteEnemigos;

    public GestorDificultad(String dificultad) {

        switch (dificultad) {

            case "Facil":
                velocidad = 1.5;
                limiteEnemigos = 130;
                break;

            case "Normal":
                velocidad = 2.2;
                limiteEnemigos = 170;
                break;

            case "Dificil":
                velocidad = 3.5;
                limiteEnemigos = 200;
                break;

            default:
                velocidad = 4.5;
                limiteEnemigos = 300;
        }
    }

    public double getVelocidad() {
        return velocidad;
    }

    public int getLimiteEnemigos() {
        return limiteEnemigos;
    }
}