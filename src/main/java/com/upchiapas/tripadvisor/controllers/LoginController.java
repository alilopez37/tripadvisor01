package com.upchiapas.tripadvisor.controllers;

import com.upchiapas.tripadvisor.models.ValidateUser;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class LoginController {

    @FXML
    private Button btnIniciarSesion;

    @FXML
    private Button btnSalir;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUsername;

    @FXML
    void btnIniciarSesionOnMouseClicked(MouseEvent event) {
        ValidateUser user = new ValidateUser();

        if (user.autenticarUser(txtUsername.getText(), txtPassword.getText())){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Login - Info");
            alert.setContentText("Bienvenido al sistema");
            alert.showAndWait();
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

}
