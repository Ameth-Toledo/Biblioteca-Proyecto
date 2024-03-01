package com.toledo.proyectobiblioteca.controllers;

import com.toledo.proyectobiblioteca.App;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class GerenteController {
    Stage callEntrar = new Stage();
    @FXML
    public void ButtonEntrar(MouseEvent mouseEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("menu-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        callEntrar.setTitle("Biblioteca"+"\"EST SOFTWARE\"");
        callEntrar.setScene(scene);
        callEntrar.show();
    }
}
