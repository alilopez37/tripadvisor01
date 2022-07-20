package com.upchiapas.tripadvisor.controllers;

import com.upchiapas.tripadvisor.HelloApplication;
import com.upchiapas.tripadvisor.models.ValidateUser;
import javafx.application.Application;
import javafx.application.HostServices;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class LoginController {

    HostServices hostServices;


    @FXML
    private Hyperlink link;

    @FXML
    private Button btnIniciarSesion;

    @FXML
    private Button btnSalir;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUsername;

    @FXML
    void btnIniciarSesionOnMouseClicked(MouseEvent event) throws IOException {
        ValidateUser user = new ValidateUser();

        if (user.autenticarUser(txtUsername.getText(), txtPassword.getText())){
            HelloApplication.setFXML("root-view", "Home - TripAdvisor");
            /*Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Login - Info");
            alert.setContentText("Bienvenido al sistema");
            alert.showAndWait(); */
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Login - Error");
            alert.setContentText("El usuario no existe");
            alert.showAndWait();
        }

    }

    @FXML
    void btnSalirOnMouseClicked(MouseEvent event) {
        System.exit(1);
    }

    @FXML
    void linkOnMouseLinked(MouseEvent event) throws URISyntaxException, IOException {
        hostServices.showDocument(link.getText());
    }
    public void setHostServices(HostServices hostServices){
        this.hostServices = hostServices;
    }

}
