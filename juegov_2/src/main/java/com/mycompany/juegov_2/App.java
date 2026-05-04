package com.mycompany.juegov_2;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {

        MenuPrincipal menu = new MenuPrincipal();

        stage.setTitle("-------------------JUEGO DE ESQUIVE WAZAAA --------------------- ");
        stage.setScene(menu.getScene());
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}