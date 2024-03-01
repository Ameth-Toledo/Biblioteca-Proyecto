package com.toledo.proyectobiblioteca.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.toledo.proyectobiblioteca.App;
import com.toledo.proyectobiblioteca.models.Biblioteca;
import com.toledo.proyectobiblioteca.models.CantidadLibros;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

public class PrestadosController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ListView<String> listPrestado;

    @FXML
    private Button bttonVer;

    @FXML
    void bttonVer(MouseEvent event) {
        Biblioteca mis = App.getBiblio();
        for (CantidadLibros imprimirs : mis.getListCantLibros()){
            listPrestado.getItems().add(imprimirs.toString());
        }

    }

    @FXML
    void initialize() {
        assert listPrestado != null : "fx:id=\"listPrestado\" was not injected: check your FXML file 'prestados-view.fxml'.";
        assert bttonVer != null : "fx:id=\"bttonVer\" was not injected: check your FXML file 'prestados-view.fxml'.";

    }
}
