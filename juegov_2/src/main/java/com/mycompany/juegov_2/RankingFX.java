package com.mycompany.juegov_2;

import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;

import java.util.List;

public class RankingFX {

    public void mostrar() {

        Stage stage = new Stage();

        stage.setTitle("RANKING");

        TextArea area = new TextArea();
        area.setEditable(false);

        List<String[]> ranking = GestorRanking.obtenerRanking();

        StringBuilder texto = new StringBuilder("TOP 5\n\n");

        int pos = 1;
        for (String[] datos : ranking) {
            texto.append(pos++)
                 .append(". ")
                 .append(datos[0])
                 .append(" - ")
                 .append(datos[1])
                 .append("\n");
        }

        area.setText(texto.toString());

        VBox root = new VBox(area);
        root.setPadding(new Insets(10));

        Scene scene = new Scene(root, 300, 400);

        stage.setScene(scene);
        stage.show();
    }
}