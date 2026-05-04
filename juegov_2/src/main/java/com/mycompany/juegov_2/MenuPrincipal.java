package com.mycompany.juegov_2;

import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class MenuPrincipal {

    private TextField campoNombre;
    private ComboBox<String> dificultad;
    private ComboBox<String> formaEnemigo;
    private Scene scene;

    public MenuPrincipal() {

        VBox root = new VBox(25);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(40));

        root.setStyle("-fx-background-color: linear-gradient(to bottom, #0f2027, #203a43, #2c5364);");

        Label titulo = new Label(" JUEGO DEL RATÓN");
        titulo.setFont(Font.font("Arial", 40));
        titulo.setTextFill(Color.WHITE);

        // INPUT NOMBRE

        Label lblNombre = new Label("Nombre:");
        lblNombre.setTextFill(Color.WHITE);

        campoNombre = new TextField();
        campoNombre.setPromptText("Jugador");
        campoNombre.setPrefWidth(180);

        HBox filaNombre = new HBox(10, lblNombre, campoNombre);
        filaNombre.setAlignment(Pos.CENTER);

   
        // DIFICULTAD
  
        Label cajitaxd = new Label("Dificultad:");
        cajitaxd.setTextFill(Color.WHITE);

        dificultad = new ComboBox<>();
        dificultad.getItems().addAll("Facil", "Normal", "Dificil", "Locura");
        dificultad.setValue("Normal");

        HBox filaDif = new HBox(10, cajitaxd, dificultad);
        filaDif.setAlignment(Pos.CENTER);


        // FORMA ENEMIGO
 
        Label cajitadelaformadelenemigo = new Label("Forma:");
        cajitadelaformadelenemigo.setTextFill(Color.WHITE);

        formaEnemigo = new ComboBox<>();
        formaEnemigo.getItems().addAll("Circulo", "Cuadrado", "Triangulo","Estrella");
        formaEnemigo.setValue("Circulo");

        HBox filaForma = new HBox(10, cajitadelaformadelenemigo, formaEnemigo);
        filaForma.setAlignment(Pos.CENTER);

        // BOTONES
      
        Button botondejugar = new Button(" JUGAR");
        Button botondelranking = new Button(" RANKING");
        Button botondalir=  new Button(" SALIR");

        String styleBtn =
                "-fx-background-color: #00c6ff;" +
                "-fx-text-fill: white;" +
                "-fx-font-size: 14px;" +
                "-fx-padding: 10 20;" +
                "-fx-background-radius: 12;";

        botondejugar.setStyle(styleBtn);
        botondelranking.setStyle(styleBtn);
        botondalir.setStyle(styleBtn);

        botondejugar.setOnAction(e -> iniciarJuego());

        botondelranking.setOnAction(e -> {
            RankingFX r = new RankingFX();
            r.mostrar();
        });

        botondalir.setOnAction(e -> System.exit(0));

        HBox filaBotones = new HBox(15, botondejugar, botondelranking, botondalir);
        filaBotones.setAlignment(Pos.CENTER);

     
        // PANEL CENTRAL
       
        VBox panel = new VBox(15,
                filaNombre,
                filaDif,
                filaForma,
                filaBotones
        );

        panel.setAlignment(Pos.CENTER);
        panel.setPadding(new Insets(25));
        panel.setStyle(
                "-fx-background-color: rgba(255,255,255,0.08);" +
                "-fx-background-radius: 20;" +
                "-fx-padding: 25;"
        );

        root.getChildren().addAll(titulo, panel);

        scene = new Scene(root, 600, 500);
    }

    public Scene getScene() {
        return scene;
    }

    private void iniciarJuego() {

        String nombre = campoNombre.getText();
        String dif = dificultad.getValue();
        String forma = formaEnemigo.getValue();

        if (nombre.isEmpty()) return;

        JuegoPanelInternoFX juego = new JuegoPanelInternoFX(nombre, dif, forma);

        StackPane rootJuego = new StackPane();
        rootJuego.getChildren().add(juego);

        Scene escenaJuego = new Scene(rootJuego, 1280, 720);

        juego.widthProperty().bind(rootJuego.widthProperty());
        juego.heightProperty().bind(rootJuego.heightProperty());

        var stage = (javafx.stage.Stage) scene.getWindow();
        stage.setScene(escenaJuego);

        juego.requestFocus();
    }
}