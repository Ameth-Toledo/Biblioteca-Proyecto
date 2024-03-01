package com.toledo.proyectobiblioteca.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.toledo.proyectobiblioteca.App;
import com.toledo.proyectobiblioteca.models.CantidadLibros;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class PrestarController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textTitle;

    @FXML
    private Button bttonSave;

    @FXML
    private TextField textReceptor;

    @FXML
    void bttonSave(MouseEvent event) throws IllegalAccessException {
        String titulo =textTitle.getText();
        String names = textReceptor.getText();

        if (titulo.isEmpty() || names.isEmpty()){
            throw new IllegalAccessException("Deben de llenarse los datos");
        }

        CantidadLibros cantidadLibros = new CantidadLibros(titulo, names);
        App.getBiblio().addCant(cantidadLibros);

    }

    @FXML
    void initialize() {
        assert textTitle != null : "fx:id=\"textTitle\" was not injected: check your FXML file 'prestar-view.fxml'.";
        assert bttonSave != null : "fx:id=\"bttonSave\" was not injected: check your FXML file 'prestar-view.fxml'.";
        assert textReceptor != null : "fx:id=\"textReceptor\" was not injected: check your FXML file 'prestar-view.fxml'.";

    }
}