package com.upchiapas.tripadvisor.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class UserController {

    @FXML
    private Button btnSalir;

    @FXML
    void btnSalirOnMouseClicked(MouseEvent event) {
        System.exit(1);
    }

}
