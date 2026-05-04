package com.mycompany.juegov_2;

// Contenedor
import javafx.scene.layout.VBox;

// Área de texto
import javafx.scene.control.TextArea;

// Scroll automático
import javafx.scene.control.ScrollPane;

// Escena
import javafx.scene.Scene;

// Fuente
import javafx.scene.text.Font;

// Lista
import java.util.List;

// Clase RankingPanel (ya no extiende JFrame)
public class RankingPanel {

    // Escena que se mostrará
    private Scene scene;

    // Constructor
    public RankingPanel() {

        // Contenedor principal vertical
        VBox root = new VBox();

        // Área de texto donde se mostrará el ranking
        TextArea area = new TextArea();

        // Evita que el usuario edite el ranking
        area.setEditable(false);

        // Fuente monoespaciada (similar a la que usabas)
        area.setFont(Font.font("Monospaced", 16));

        // Obtiene los datos del ranking
        List<String[]> ranking = GestorRanking.obtenerRanking();

        // Construye el texto a mostrar
        StringBuilder texto = new StringBuilder("TOP 5\n\n");

        // Variable para numerar posiciones
        int posicion = 1;

        // Recorre la lista de jugadores
        for (String[] datos : ranking) {

            texto.append(posicion++)   // número de posición
                 .append(". ")         // separador
                 .append(datos[0])     // nombre
                 .append(" - ")        // guion
                 .append(datos[1])     // puntaje
                 .append("\n");        // salto de línea
        }

        // Coloca el texto en el área
        area.setText(texto.toString());

        // Scroll (por si crece el ranking)
        ScrollPane scroll = new ScrollPane(area);

        // Ajusta el contenido al tamaño
        scroll.setFitToWidth(true);
        scroll.setFitToHeight(true);

        // Agrega el scroll al contenedor
        root.getChildren().add(scroll);

        // Crea la escena con tamaño similar al JFrame
        scene = new Scene(root, 400, 400);
    }

    // Método para devolver la escena
    public Scene getScene() {
        return scene;
    }
}