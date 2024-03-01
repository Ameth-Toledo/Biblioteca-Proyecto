package com.toledo.proyectobiblioteca.controllers;

import com.toledo.proyectobiblioteca.App;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {
    @FXML
    private Button SiguienteButton;
    Stage callEntrar = new Stage();

    public void OnMouseClickedSiguienteButton(MouseEvent mouseEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("menu-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        callEntrar.setTitle("Biblioteca :" + "\"" + " Menu" + "\"");
        callEntrar.setScene(scene);
        callEntrar.show();
    }
}
