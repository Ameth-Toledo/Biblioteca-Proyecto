module com.toledo.proyectobiblioteca {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.bootstrapfx.core;
    requires com.gluonhq.charm.glisten;
    requires com.gluonhq.attach.display;



    opens com.toledo.proyectobiblioteca to javafx.fxml;
    exports com.toledo.proyectobiblioteca;
    exports com.toledo.proyectobiblioteca.controllers;
    opens com.toledo.proyectobiblioteca.controllers to javafx.fxml;
}