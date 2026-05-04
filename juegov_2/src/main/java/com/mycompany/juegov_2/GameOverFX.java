package com.mycompany.juegov_2;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class GameOverFX { 

    public static void mostrar(String nombre, int tiempo, int enemigos, Stage juegoStage) {

        GestorRanking.guardarPuntaje(nombre, tiempo);

        Stage s = new Stage();

        Label titulo = new Label("GAME OVER");

        Label info = new Label(
                "Jugador: " + nombre +
                "\nTiempo: " + tiempo +
                "\nEnemigos: " + enemigos
        );

        Button reintentar = new Button("Reintentar");
        Button ranking = new Button("Ranking");
        Button salir = new Button("Salir");

        reintentar.setOnAction(e -> {
            s.close();
            juegoStage.close();

            Stage nuevo = new Stage();
            nuevo.setScene(new MenuPrincipal().getScene());
            nuevo.show();
        });

        ranking.setOnAction(e -> new RankingFX().mostrar());

        salir.setOnAction(e -> {
            s.close();
            juegoStage.close();
            System.exit(0);
        });

        VBox v = new VBox(10, titulo, info, reintentar, ranking, salir);
        v.setStyle("-fx-alignment: center; -fx-padding: 20;");

        s.setScene(new Scene(v, 300, 250));
        s.show();
    }
}