package com.toledo.proyectobiblioteca.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.toledo.proyectobiblioteca.App;
import com.toledo.proyectobiblioteca.models.Periodico;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class AddController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textConten;

    @FXML
    private TextField NameAutorButton;

    @FXML
    private TextField EditorialButton;

    @FXML
    private TextField PagButton;

    @FXML
    private Button guardarButon;

    @FXML
    void OnMouseClicked(MouseEvent event) {

    }

    @FXML
    void OnMouseClickedNameAutorButton(MouseEvent event) {

    }

    @FXML
    void OnMouseClickedNameBookButton(MouseEvent event) {

    }

    @FXML
    void guardarbuton(MouseEvent event) {
        String nombre = NameAutorButton.getText();
        String editorial = EditorialButton.getText();
        String contenido = textConten.getText();
        int numPag = Integer.parseInt(PagButton.getText());
        Periodico periodico = new Periodico(nombre, editorial,numPag, contenido);
        App.getBiblio().addLibros(periodico);
    }

    @FXML
    void pagButton(MouseEvent event) {

    }

    @FXML
    void initialize() {

    }
}