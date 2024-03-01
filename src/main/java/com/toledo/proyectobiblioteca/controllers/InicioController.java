package com.toledo.proyectobiblioteca.controllers;

import com.toledo.proyectobiblioteca.App;
import com.toledo.proyectobiblioteca.models.Biblioteca;
import com.toledo.proyectobiblioteca.models.Usuario;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class InicioController {
    Usuario admin = new Usuario();
    @FXML
    private TextField UsuarioText;
    @FXML
    private PasswordField PassworText;
    Stage callMenu = new Stage();
    @FXML
    private ImageView closeWindow;
    private static Biblioteca biblio = new Biblioteca();
    private static Stage stageView;
    private static Stage stageRoot;
    public static Biblioteca getBiblio(){return biblio;}
    public static void setBiblio(Biblioteca newBiblio){ biblio = newBiblio;}


    @FXML
    void onMouseClickedCloseWindow(MouseEvent event) {
        Stage stage = (Stage) closeWindow.getScene().getWindow();
        stage.close();
    }

    // ...
    public void OnMouseClickIngresarButton(MouseEvent mouseEvent) {
        String nombreUsuario = PassworText.getText();
        String contraseniaaa = UsuarioText.getText();
        if (nombreUsuario.equals(admin.getUsuario()) && contraseniaaa.equals(admin.getContrasenia())) {

            try {
                FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("inicio-view.fxml"));
                Scene scene = null;
                scene = new Scene(fxmlLoader.load());
                callMenu.initStyle(StageStyle.TRANSPARENT);
                callMenu.setTitle("Cinema Flex / Menu");
                callMenu.setScene(scene);
                callMenu.show();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void init(Stage stageRoot) {
    }
}